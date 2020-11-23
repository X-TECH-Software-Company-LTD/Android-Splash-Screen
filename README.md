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

Format:(https://cdn.xtsmm.com/android/images/1.jpg)

