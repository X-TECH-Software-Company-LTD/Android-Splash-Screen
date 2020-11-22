package com.xtsmm.library.android.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class SplashScreenWithTitle {

    Activity activity;
    Dialog dialog;
    TextView tv_splashTitle;
    TextView tv_splashSubTitle;
    TextView tv_splashVersion;

    public SplashScreenWithTitle(Activity activity) {
        this.activity = activity;
    }
    public void create(){
        dialog= new Dialog(activity, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.splash_dialog_name);
    }
    public void setLogo(int splashLogo){
        ImageView imageView=dialog.findViewById(R.id.splash_logo);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(splashLogo);
    }

    public void setBackgroundImage(int backgroundImage){
        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        Drawable myIcon = activity.getResources().getDrawable(backgroundImage);
        constraintLayout.setBackground(myIcon);
    }

    public void setBackgroundColor(String backgroundClolorCode){
        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        constraintLayout.setBackgroundColor(Color.parseColor(backgroundClolorCode));
    }

    public void setTitleText(String title){
        tv_splashTitle=dialog.findViewById(R.id.splah_title);
        tv_splashTitle.setText(title);

    }

    public void setTitleTextSize(int size){
        tv_splashTitle=dialog.findViewById(R.id.splah_title);
        tv_splashTitle.setTextSize(size);
    }

    public void setTitleTextColor(String colorCode){
        tv_splashTitle=dialog.findViewById(R.id.splah_title);
        tv_splashTitle.setTextColor(Color.parseColor(colorCode));
    }

    public void setTitleTextFontAndStyle(String assetFontPath,int style){
        tv_splashTitle=dialog.findViewById(R.id.splah_title);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        tv_splashTitle.setTypeface(font,style);
    }

    public void setTitleTextStyle(int style){
        tv_splashTitle=dialog.findViewById(R.id.splah_title);
        tv_splashTitle.setTypeface(null,style);
    }

    public void setSubTitleCreate(){
        tv_splashSubTitle=dialog.findViewById(R.id.splash_subtitle);
        tv_splashSubTitle.setVisibility(View.VISIBLE);

    }

    public void setSubTitleText(String title){
        tv_splashSubTitle=dialog.findViewById(R.id.splash_subtitle);
        tv_splashSubTitle.setText(title);

    }

    public void setSubTitleTextSize(int size){
        tv_splashSubTitle=dialog.findViewById(R.id.splash_subtitle);
        tv_splashSubTitle.setTextSize(size);
    }

    public void setSubTitleTextColor(String colorCode){
        tv_splashSubTitle=dialog.findViewById(R.id.splash_subtitle);
        tv_splashSubTitle.setTextColor(Color.parseColor(colorCode));
    }

    public void setSubTitleTextFontAndStyle(String assetFontPath,int style){
        tv_splashSubTitle=dialog.findViewById(R.id.splash_subtitle);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        tv_splashSubTitle.setTypeface(font,style);
    }

    public void setSubTitleTextStyle(int style){
        tv_splashSubTitle=dialog.findViewById(R.id.splash_subtitle);
        tv_splashSubTitle.setTypeface(null,style);
    }

    public void setVersionNameCreate(){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setVisibility(View.VISIBLE);


    }

    public void setVersionNameText(String title){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setText(title);

    }

    public void setVersionNameTextSize(int size){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setTextSize(size);
    }

    public void setVersionNameTextColor(String colorCode){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setTextColor(Color.parseColor(colorCode));
    }

    public void setVersionNameFontAndStyle(String assetFontPath,int style){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        tv_splashVersion.setTypeface(font,style);
    }

    public void setVersionNameTextStyle(int style){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setTypeface(null,style);
    }


    public void show(){
        dialog.show();

    }
}
