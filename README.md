# Android-Splash-Screen
To Show Splash Screen.

## Import Library to Gradle

1 - Download SplashScreen.zip and place inside "projectName/" folder .

https://cdn.xtsmm.com/android/libraries/SplashScreen.zip

2 - Import Module

```
File -> New -> Import Module -> select Downloaded "Android JSON" Folder
```

3 - Add Library at App gradle

```
dependencies {
    implementation project(path: ':SplashScreen')
}
```

## Usage

###### 1. For SplashScreenDefault
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

<img src="https://cdn.xtsmm.com/android/images/1.jpg" width="300">

###### 2. For SplashScreenWithTitle
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

<img src="https://cdn.xtsmm.com/android/images/2.jpg" width="300">

###### 3. For SplashScreenWithGif

 1.Use defaultCreate
 
 ```
 new SplashScreenWithGif(this).defaultCreate("https://1.bp.blogspot.com/-r5Aj9YbCQQk/UF80dyv17SI/AAAAAAAAEZU/aXoSQPybltI/s1600/Beautiful+3D+hd+nature+wallpaper+mobile+phones++Download++animated+gif+pictures+and+wallpapers++smartphone+phone+wallpapers+backgrounds+images+photos+gif+pictures++moon+water+reflexive.gif",
                null,
                "https://images.squarespace-cdn.com/content/v1/5d57c81ebfd83300010c568e/1568881657624-64DAIKETTWGNJM5OXURM/ke17ZwdGBToddI8pDm48kNiEM88mrzHRsd1mQ3bxVct7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z4YTzHvnKhyp6Da-NYroOW3ZGjoBKy3azqku80C789l0uyjK65ACIS1Ro5Gtg_5NxawvmiEeEPz-p1PBnM1Qfd0YvLs_GGCwkX6Y6WN_obWbw/VI_LOGO_SYMBOL_VARIATION.gif",
                "Myanamr Application","#ff00ff","present","#ffffff",
                "Version 1.1.0","#ffffff");
 ```

above code will get a return of webview

###### null background Image will got default Background.

```
 setContentView(new SplashScreenWithGif(this).defaultCreate("https://1.bp.blogspot.com/-r5Aj9YbCQQk/UF80dyv17SI/AAAAAAAAEZU/aXoSQPybltI/s1600/Beautiful+3D+hd+nature+wallpaper+mobile+phones++Download++animated+gif+pictures+and+wallpapers++smartphone+phone+wallpapers+backgrounds+images+photos+gif+pictures++moon+water+reflexive.gif",
                null,
                "https://images.squarespace-cdn.com/content/v1/5d57c81ebfd83300010c568e/1568881657624-64DAIKETTWGNJM5OXURM/ke17ZwdGBToddI8pDm48kNiEM88mrzHRsd1mQ3bxVct7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z4YTzHvnKhyp6Da-NYroOW3ZGjoBKy3azqku80C789l0uyjK65ACIS1Ro5Gtg_5NxawvmiEeEPz-p1PBnM1Qfd0YvLs_GGCwkX6Y6WN_obWbw/VI_LOGO_SYMBOL_VARIATION.gif",
                "Myanamr Application","#ff00ff","present","#ffffff",
                "Version 1.1.0","#ffffff"));
 ```

2.Use noLogoCreate
 
 ```
 new SplashScreenWithGif(this).noLogoCreate("https://1.bp.blogspot.com/-r5Aj9YbCQQk/UF80dyv17SI/AAAAAAAAEZU/aXoSQPybltI/s1600/Beautiful+3D+hd+nature+wallpaper+mobile+phones++Download++animated+gif+pictures+and+wallpapers++smartphone+phone+wallpapers+backgrounds+images+photos+gif+pictures++moon+water+reflexive.gif",
                null,
                "Myanamr Application","#ff00ff","present","#ffffff",
                "Version 1.1.0","#ffffff");
 ```

above code will get a return of webview

###### null background Image will got default Background.

```
 setContentView( new SplashScreenWithGif(this).noLogoCreate("https://1.bp.blogspot.com/-r5Aj9YbCQQk/UF80dyv17SI/AAAAAAAAEZU/aXoSQPybltI/s1600/Beautiful+3D+hd+nature+wallpaper+mobile+phones++Download++animated+gif+pictures+and+wallpapers++smartphone+phone+wallpapers+backgrounds+images+photos+gif+pictures++moon+water+reflexive.gif",
                null,
                "Myanamr Application","#ff00ff","present","#ffffff",
                "Version 1.1.0","#ffffff"));
 ```
