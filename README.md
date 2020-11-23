# Android-Splash-Screen
To Show Splash Screen easy to use;

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
