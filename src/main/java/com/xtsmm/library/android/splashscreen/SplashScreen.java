package com.xtsmm.library.android.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class SplashScreen {

    Activity activity;
    Dialog dialog;

    public SplashScreen(Activity activity) {
        this.activity = activity;
    }


    public void showDefault(int SplashLogo,int BackgroundImage,String BackgroundClolorCode){
        dialog= new Dialog(activity, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.splash_dialog_default);

        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);

        if(BackgroundImage==0) {
            Drawable myIcon = activity.getResources().getDrawable(BackgroundImage);
            constraintLayout.setBackground(myIcon);
        }
        if(BackgroundClolorCode==null){
            constraintLayout.setBackgroundColor(Color.parseColor(BackgroundClolorCode));
        }

        ImageView imageView=dialog.findViewById(R.id.splash_logo);
        imageView.setImageResource(SplashLogo);
        dialog.show();



    }
    public void showName(int SplashLogo,int BackgroundImage,String BackgroundClolorCode,String Title,
                         String SubTitel,String Version){
        dialog= new Dialog(activity, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.splash_dialog_name);

        ConstraintLayout constraintLayout=dialog.findViewById(R.id.bg);
        TextView title=dialog.findViewById(R.id.splah_title);
        TextView subtitle=dialog.findViewById(R.id.splash_subtitle);
        TextView version=dialog.findViewById(R.id.splash_version);

        if(BackgroundImage!=0) {
            Drawable myIcon = activity.getResources().getDrawable(BackgroundImage);
            constraintLayout.setBackground(myIcon);
        }
        if(BackgroundClolorCode!=null){
            constraintLayout.setBackgroundColor(Color.parseColor(BackgroundClolorCode));
        }
        if(SplashLogo!=0) {
            ImageView imageView = dialog.findViewById(R.id.splash_logo);
            imageView.setImageResource(SplashLogo);
        }
        title.setText(Title);
        subtitle.setText(SubTitel);
        version.setText(Version);



        dialog.show();



    }

    public void hide(){


        dialog.dismiss();

    }
}
