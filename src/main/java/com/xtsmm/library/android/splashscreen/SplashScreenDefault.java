package com.xtsmm.library.android.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class SplashScreenDefault {

    Activity activity;
    Dialog dialog;

    public SplashScreenDefault(Activity activity) {
        this.activity = activity;
    }

    public void create(){
        dialog= new Dialog(activity, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.splash_dialog_default);
    }
    public void setLogo(int SplashLogo){
        ImageView imageView=dialog.findViewById(R.id.splash_logo);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(SplashLogo);
    }

    public void setBackgroundImage(int BackgroundImage){
        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        Drawable myIcon = activity.getResources().getDrawable(BackgroundImage);
        constraintLayout.setBackground(myIcon);
    }

    public void setBackgroundColor(String BackgroundClolorCode){
        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        constraintLayout.setBackgroundColor(Color.parseColor(BackgroundClolorCode));
    }

    public void show(){
        dialog.show();

    }


    public void hide(){


        dialog.dismiss();

    }
}

