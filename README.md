# Android-Splash-Screen
To Show Splash Screen.

## Import Library to Gradle

1 - Download WebPlayer.arr and place inside "projectName/app/libs" folder .

https://cdn.xtsmm.com/android/libraries/SplashScreen.aar

2 - Update Project gradle

```
flatDir {
  dirs 'libs'
}
```
sample 
```
allprojects {
    repositories {
        google()
        jcenter()
        flatDir {
            dirs 'libs'
        }
    }
}
```

3 - Add Depedency at App gradle

```
dependencies {
    implementation(name:'WebPlayer', ext:'aar')
    //other repositories
}
```

## Usage

For SplashScreenDefault
```
SplashScreenDefault splashScreen=new SplashScreenDefault(this);
        splashScreen.create();
        splashScreen.setBackgroundColor("#00ff00");
        splashScreen.setLogo(R.drawable.slogo);
        splashScreen.setVersionNameCreate();
        splashScreen.setVersionNameText("Version 1.1.0");
        splashScreen.setVersionNameTextStyle(Typeface.NORMAL);
        splashScreen.show();
```
SplashScreen close

```
splashScreen.hide();
```

![Image of SplashScreenDefault](https://cdn.xtsmm.com/android/images/1.jpg)

For SplashScreenWithTitle
```
SplashScreenWithTitle splashScreenWithName=new SplashScreenWithTitle(this);
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
```
SplashScreen close

```
splashScreenWithName.hide();
```

![Image of SplashScreenWithTitle](https://cdn.xtsmm.com/android/images/2.jpg)


