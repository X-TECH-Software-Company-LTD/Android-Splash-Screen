package com.xtsmm.library.android.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.constraintlayout.widget.ConstraintLayout;

public class SplashScreen {

    Activity activity;
    Dialog dialog;
    public SplashScreen(Activity activity) {
        this.activity = activity;
    }


    public void show(int SplashLogo,int BackgroundImage){
        dialog= new Dialog(activity, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.splash_dialog);
        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        Drawable myIcon = activity.getResources().getDrawable(BackgroundImage);
        constraintLayout.setBackground(myIcon);
        ImageView imageView=dialog.findViewById(R.id.splash_logo);
        imageView.setImageResource(SplashLogo);
        dialog.show();

    }

    public void hide(){


        dialog.dismiss();

    }
}
