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
import androidx.core.content.res.ResourcesCompat;

public class SplashScreenDefault {

    Activity activity;
    Dialog dialog;
    TextView tv_splashVersion;

    public SplashScreenDefault(Activity activity) {
        this.activity = activity;
    }

    public void create(){
        dialog= new Dialog(activity, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.splash_dialog_default);
        dialog.setCancelable(false);
    }

    public void setLogo(int splashLogoImage){
        ImageView imageView=dialog.findViewById(R.id.splash_logo);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(splashLogoImage);
    }

    public void setBackgroundImage(int backgroundImageResID){
        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        Drawable myIcon = activity.getResources().getDrawable(backgroundImageResID);
        constraintLayout.setBackground(myIcon);
    }

    public void setBackgroundColor(String clolorCode){
        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        constraintLayout.setBackgroundColor(Color.parseColor(clolorCode));
    }

    public void setBackgroundColor(int clolor){
        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        constraintLayout.setBackgroundColor(clolor);
    }

    public void setVersionNameCreate(){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setVisibility(View.VISIBLE);


    }

    public void setVersionNameText(String text){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setText(text);

    }

    public void setVersionNameTextSize(int size){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setTextSize(size);
    }

    public void setVersionNameTextColor(String colorCode){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setTextColor(Color.parseColor(colorCode));
    }

    public void setVersionNameTextColor(int color){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setTextColor(color);
    }

    public void setVersionNameTextFontFromAssetAndStyle(String assetFontPath,int style){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        tv_splashVersion.setTypeface(font,style);
    }

    public void setVersionNameTextFontAndStyle(int fonts,int style){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        Typeface font = ResourcesCompat.getFont(activity,fonts);
        tv_splashVersion.setTypeface(font,style);
    }

    public void setVersionNameTextFontFromAsset(String assetFontPath){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        Typeface font = Typeface.createFromAsset(
                activity.getAssets(),
                assetFontPath);
        tv_splashVersion.setTypeface(font);
    }

    public void setVersionNameTextFont(int fonts){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        Typeface font = ResourcesCompat.getFont(activity,fonts);
        tv_splashVersion.setTypeface(font);
    }

    public void setVersionNameTextStyle(int style){
        tv_splashVersion=dialog.findViewById(R.id.splash_version);
        tv_splashVersion.setTypeface(null,style);
    }

    public void show(){
        dialog.show();

    }


    public void dismiss(){

        dialog.dismiss();

    }
}

