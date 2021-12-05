package com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        //Todo: changing the UI bar
//        Window window = this.getWindow();
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//       window.setNavigationBarColor(getResources().getColor(R.color.white));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                binding.progressBar.setProgress(10);
                binding.progressValue.setText(10+"%");
                binding.progressBar.getProgressDrawable().setColorFilter(
                        getResources().getColor(R.color.cherry), android.graphics.PorterDuff.Mode.SRC_IN);
                binding.progressValue.setTextColor(getResources().getColor(R.color.cherry));
                binding.myLove.setTextColor(getResources().getColor(R.color.cherry));

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        binding.progressBar.setProgress(50);
                        binding.progressValue.setText(50+"%");
                        binding.progressBar.getProgressDrawable().setColorFilter(
                                getResources().getColor(R.color.snackbar), PorterDuff.Mode.SRC_IN
                        );
                        binding.progressValue.setTextColor(getResources().getColor(R.color.snackbar));
                        binding.myLove.setTextColor(getResources().getColor(R.color.snackbar));

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run()
                            {
                                binding.progressBar.setProgress(90);
                                binding.progressValue.setText(90+"%");
                                binding.progressBar.getProgressDrawable().setColorFilter(
                                        getResources().getColor(R.color.purple_700), PorterDuff.Mode.SRC_IN
                                );
                                binding.progressValue.setTextColor(getResources().getColor(R.color.purple_700));
                                binding.myLove.setTextColor(getResources().getColor(R.color.purple_700));

                               new Handler().postDelayed(new Runnable() {
                                   @Override
                                   public void run()
                                   {
                                       startActivity(new Intent(MainActivity.this, HomeActivity.class).addFlags(
                                               Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK
                                       ));
                                       finish();
                                   }
                               },12);
                            }
                        },15);
                    }
                },20);
            }
        }, 100);
    }
}