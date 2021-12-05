package com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3;

import android.Manifest;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3.databinding.ActivityHomeBinding;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Todo: changing the UI bar
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.defaultThemeColor));
        window.setNavigationBarColor(this.getResources().getColor(R.color.defaultThemeColor));


        //Todo: for the drawer layout
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(HomeActivity.this,
                binding.myDrawer, binding.myToolbar,R.string.open, R.string.close);

        binding.myDrawer.addDrawerListener(toggle);
        toggle.syncState();
        binding.myNavigation.setItemIconTintList(null); //setting all the items default colors
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.snackbar));

        SEEK_STORAGE_PERMISSION();
    }

    public void SEEK_STORAGE_PERMISSION()
    {
        Dexter.withContext(HomeActivity.this).withPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse)
                    {
                        //Todo: setting the DeviceSongsFragment in the HomeActivity by default
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.fragmentCatcherListViewSongs, new DeviceSongsFragment()).commit();

                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse)
                    {
                        //permissionDeniedResponse.notifyAll();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest,
                                                                   PermissionToken permissionToken)
                    {
                        permissionToken.continuePermissionRequest();
                    }
                }).check();
    }
}