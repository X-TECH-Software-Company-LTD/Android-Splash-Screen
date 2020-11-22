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
        splashScreen.setBackgroundImage(R.drawable.ghost_bg);
        splashScreen.setLogo(R.mipmap.ic_launcher);
        splashScreen.show();*/


        splashScreenWithName=new SplashScreenWithTitle(this);
        splashScreenWithName.create();
        splashScreenWithName.setLogo(R.mipmap.ic_launcher);
        splashScreenWithName.setBackgroundImage(R.drawable.ghost_bg);
        splashScreenWithName.setTitleText("Myanmar Ghost Stories");
        splashScreenWithName.setTitleTextSize(20);
        splashScreenWithName.setSubTitleTextStyle(Typeface.BOLD);
        splashScreenWithName.setSubTitleCreate();
        splashScreenWithName.setSubTitleText("present");
        splashScreenWithName.setVersionNameCreate();
        splashScreenWithName.setVersionNameText("Version 1.1.0");
        splashScreenWithName.show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        splashScreen.hide();
    }
}