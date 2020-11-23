package splachscreen.mmfootballgroup.app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;

import com.xtsmm.library.android.splashscreen.SplashScreenDefault;
import com.xtsmm.library.android.splashscreen.SplashScreenWithGif;
import com.xtsmm.library.android.splashscreen.SplashScreenWithTitle;

public class MainActivity extends AppCompatActivity {

    SplashScreenDefault splashScreen;
    SplashScreenWithTitle splashScreenWithName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        setContentView(new SplashScreenWithGif(this).defaultCreate("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/405d156a-497c-4d3e-9e1f-1ffc1d7d13a3/db4ewyw-b28ff912-78f6-4283-a562-08ef72b31ad2.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3sicGF0aCI6IlwvZlwvNDA1ZDE1NmEtNDk3Yy00ZDNlLTllMWYtMWZmYzFkN2QxM2EzXC9kYjRld3l3LWIyOGZmOTEyLTc4ZjYtNDI4My1hNTYyLTA4ZWY3MmIzMWFkMi5naWYifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.-odMwG0-kPhfbx242XMZynwrIupnlz2bL39orv2m0B0",
                null,
                "https://media1.tenor.com/images/36d8ee2a8862438f273752d376b99ec3/tenor.gif?itemid=15216980",
                null,null,"present",null,
                null,null));

        /*setContentView(new SplashScreenWithGif(this).noLogoCreate("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/405d156a-497c-4d3e-9e1f-1ffc1d7d13a3/db4ewyw-b28ff912-78f6-4283-a562-08ef72b31ad2.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3sicGF0aCI6IlwvZlwvNDA1ZDE1NmEtNDk3Yy00ZDNlLTllMWYtMWZmYzFkN2QxM2EzXC9kYjRld3l3LWIyOGZmOTEyLTc4ZjYtNDI4My1hNTYyLTA4ZWY3MmIzMWFkMi5naWYifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.-odMwG0-kPhfbx242XMZynwrIupnlz2bL39orv2m0B0",
                null,
                "Myanmar Application","#ae23dc","present",null,
                "Version 1.1.0",null));*/

        /*splashScreen=new SplashScreenDefault(this);
        splashScreen.create();
        splashScreen.setBackgroundColor("#00ff00");
        splashScreen.setLogo(R.drawable.slogo);
        splashScreen.setVersionNameCreate();
        splashScreen.setVersionNameText("Version 1.1.0");
        splashScreen.setVersionNameTextStyle(Typeface.NORMAL);
        splashScreen.show();*/


        /*splashScreenWithName=new SplashScreenWithTitle(this);
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
        splashScreenWithName.show();*/


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //splashScreen.hide();
    }
}