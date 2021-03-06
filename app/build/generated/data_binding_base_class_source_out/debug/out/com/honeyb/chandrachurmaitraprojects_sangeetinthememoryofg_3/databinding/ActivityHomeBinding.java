// Generated by view binder compiler. Do not edit!
package com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;
import com.honeyb.chandrachurmaitraprojects_sangeetinthememoryofg_3.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.ibrahimsn.lib.SmoothBottomBar;

public final class ActivityHomeBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final SmoothBottomBar bottomNavigationView;

  @NonNull
  public final ConstraintLayout fragmentCatcherListViewSongs;

  @NonNull
  public final DrawerLayout myDrawer;

  @NonNull
  public final NavigationView myNavigation;

  @NonNull
  public final Toolbar myToolbar;

  private ActivityHomeBinding(@NonNull DrawerLayout rootView,
      @NonNull SmoothBottomBar bottomNavigationView,
      @NonNull ConstraintLayout fragmentCatcherListViewSongs, @NonNull DrawerLayout myDrawer,
      @NonNull NavigationView myNavigation, @NonNull Toolbar myToolbar) {
    this.rootView = rootView;
    this.bottomNavigationView = bottomNavigationView;
    this.fragmentCatcherListViewSongs = fragmentCatcherListViewSongs;
    this.myDrawer = myDrawer;
    this.myNavigation = myNavigation;
    this.myToolbar = myToolbar;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigationView;
      SmoothBottomBar bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.fragmentCatcherListViewSongs;
      ConstraintLayout fragmentCatcherListViewSongs = ViewBindings.findChildViewById(rootView, id);
      if (fragmentCatcherListViewSongs == null) {
        break missingId;
      }

      DrawerLayout myDrawer = (DrawerLayout) rootView;

      id = R.id.myNavigation;
      NavigationView myNavigation = ViewBindings.findChildViewById(rootView, id);
      if (myNavigation == null) {
        break missingId;
      }

      id = R.id.myToolbar;
      Toolbar myToolbar = ViewBindings.findChildViewById(rootView, id);
      if (myToolbar == null) {
        break missingId;
      }

      return new ActivityHomeBinding((DrawerLayout) rootView, bottomNavigationView,
          fragmentCatcherListViewSongs, myDrawer, myNavigation, myToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
