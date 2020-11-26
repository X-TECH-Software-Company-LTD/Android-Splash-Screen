package com.xtsmm.library.android.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;

public class SplashScreenWithVideo {

    Activity activity;
    Dialog dialog;
    TextView tv_splashTitle;
    TextView tv_splashSubTitle;
    TextView tv_splashVersion;

    public SplashScreenWithVideo(Activity activity) {
        this.activity = activity;
    }

    public void create(){
        dialog= new Dialog(activity, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.splash_dialog_video);
        dialog.setCancelable(false);
    }


    public void setView(View view){
        RelativeLayout relativeLayout=dialog.findViewById(R.id.splash_rl);
        relativeLayout.addView(view);

    }

    public void show(){
        dialog.show();

    }

    public void dismiss(){

        dialog.dismiss();

    }
}
