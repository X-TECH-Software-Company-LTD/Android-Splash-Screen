package splachscreen.mmfootballgroup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;

import com.xtsmm.library.android.splashscreen.SplashScreenDefault;
import com.xtsmm.library.android.splashscreen.SplashScreenWithTitle;

public class MainActivity extends AppCompatActivity {

    SplashScreenDefault splashScreen;
    SplashScreenWithTitle splashScreenWithName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*splashScreen=new SplashScreenDefault(this);
        splashScreen.create();
        splashScreen.setBackgroundColor("#00ff00");
        splashScreen.setLogo(R.drawable.slogo);
        splashScreen.setVersionNameCreate();
        splashScreen.setVersionNameText("Version 1.1.0");
        splashScreen.setVersionNameTextStyle(Typeface.NORMAL);
        splashScreen.show();*/


        splashScreenWithName=new SplashScreenWithTitle(this);
        splashScreenWithName.create();
        splashScreenWithName.setLogo(R.drawable.slogo);
        splashScreenWithName.setBackgroundImage(R.drawable.sbg);
        splashScreenWithName.setTitleText("အေ ဘီ စီ ဒီ အီး");
        splashScreenWithName.setTitleTextSize(45);
        splashScreenWithName.setTitleTextColor("#0000ff");
        splashScreenWithName.setSubTitleTextFontFromAssetAndStyle("fonts/Padauk-Regular.ttf",Typeface.BOLD);
        splashScreenWithName.setSubTitleTextColor("#ff0000");
        splashScreenWithName.setSubTitleTextSize(20);
        splashScreenWithName.setSubTitleTextFont(R.font.annie_use_your_telescope);
        splashScreenWithName.setSubTitleCreate();
        splashScreenWithName.setSubTitleText("present");
        splashScreenWithName.setVersionNameCreate();
        splashScreenWithName.setVersionNameText("Version 1.1.0");
        splashScreenWithName.setVersionNameTextStyle(Typeface.NORMAL);
        splashScreenWithName.show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        splashScreen.hide();
    }
}