package com.xtsmm.library.android.splashscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class SplashScreenWithGif {

    Activity activity;

    public SplashScreenWithGif(Activity activity){
        this.activity=activity;
        activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);

        int currentApiVersion = Build.VERSION.SDK_INT;
        final int flags = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;

        if (currentApiVersion >= Build.VERSION_CODES.KITKAT) {
            activity.getWindow().getDecorView().setSystemUiVisibility(flags);
            final View decorView = activity.getWindow().getDecorView();
            decorView
                    .setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {

                        @Override
                        public void onSystemUiVisibilityChange(int visibility) {
                            if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                                decorView.setSystemUiVisibility(flags);
                            }
                        }
                    });
        }
    }
    @SuppressLint("SetJavaScriptEnabled")
    public WebView defaultCreate(String backgroundImage,String backgroundColor,String logoImage,String titleText,
                                 String titleTextColor,String subtitleText,String subtitleTextColor,String versionText,
                                 String versionTextColor){
        String webdata;
        if(backgroundColor==null){
            backgroundColor="#cccccc";
        }
        if(subtitleText==null){
            subtitleText="";
        }
        if(titleText==null){
            titleText="";
        }
        if(versionText==null){
            versionText="";
        }

        if(backgroundImage==null){



             webdata="<html>\n" +
                     "    <head>\n" +
                     "\t\n" +
                     "        <title>SplashScreen</title>\n" +
                     "        <meta charset=\"utf-8\">\n" +
                     "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                     "        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/css/uikit.min.css\" />\n" +
                     "\t\t<script src=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/js/uikit.min.js\"></script>\n" +
                     "\t\t<script src=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/js/uikit-icons.min.js\"></script>\n" +
                     "\t\t\n" +
                     "\t\t\n" +
                     "\n" +
                     "    </head>\n" +
                     "    <body style=\"background-color: "+backgroundColor+";background-repeat: no-repeat; background-attachment: fixed;background-size: 100% 100%;\" uk-height-viewport>\n" +
                     "\t\n" +
                     "\t\n" +
                     "\t<div class=\"uk-position-center \">\n" +
                     "\t\n" +
                     "\t\n" +
                     "\t<img class=\"uk-margin-large \" style=\"display:block;margin-left:auto;margin-right:auto;\" data-src=\""+logoImage+"\" width=\"120\" height=\"120\" alt=\"\" uk-img>\n" +
                     "\t\n" +
                     "\t<div class=\"uk-margin-medium-left uk-margin-medium-right\" >\n" +
                     "\t<h4 style=\"word-wrap: break-word;color:"+titleTextColor+";text-align:center;\" >"+titleText+"</h4>\n" +
                     "\t</div>\n" +
                     "\t<div class=\"uk-margin-large-left uk-margin-large-right\">\n" +
                     "\t<h5 style=\"word-wrap: break-word;text-align:center;color:"+subtitleTextColor+";\" >"+subtitleText+"</h5>\n" +
                     "\t</div>\n" +
                     "\n" +
                     "\t\n" +
                     "\t</div>\n" +
                     "\t<div class=\"uk-position-bottom-right uk-margin-small-right\" >\n" +
                     "\t<p style=\"word-wrap: break-word;text-align:center;color:"+versionTextColor+";\" >"+versionText+"</p>\n" +
                     "\t</div>\n" +
                     "\t\n" +
                     "\t\n" +
                     "\n" +
                     "    </body>\n" +
                     "</html>\t\n";
        }else {
             webdata = "<html>\n" +
                     "    <head>\n" +
                     "\t\n" +
                     "        <title>SplashScreen</title>\n" +
                     "        <meta charset=\"utf-8\">\n" +
                     "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                     "        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/css/uikit.min.css\" />\n" +
                     "\t\t<script src=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/js/uikit.min.js\"></script>\n" +
                     "\t\t<script src=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/js/uikit-icons.min.js\"></script>\n" +
                     "\t\t\n" +
                     "\t\t\n" +
                     "\n" +
                     "    </head>\n" +
                     "    <body style=\"background-image:url("+backgroundImage+");background-repeat: no-repeat; background-attachment: fixed;background-size: 100% 100%;\" uk-height-viewport>\n" +
                     "\t\n" +
                     "\t\n" +
                     "\t<div class=\"uk-position-center \">\n" +
                     "\t\n" +
                     "\t\n" +
                     "\t<img class=\"uk-margin-large \" style=\"display:block;margin-left:auto;margin-right:auto;\" data-src=\""+logoImage+"\" width=\"120\" height=\"120\" alt=\"\" uk-img>\n" +
                     "\t\n" +
                     "\t<div class=\"uk-margin-medium-left uk-margin-medium-right\" >\n" +
                     "\t<h4 style=\"word-wrap: break-word;color:"+titleTextColor+";text-align:center;\" >"+titleText+"</h4>\n" +
                     "\t</div>\n" +
                     "\t<div class=\"uk-margin-large-left uk-margin-large-right\">\n" +
                     "\t<h5 style=\"word-wrap: break-word;text-align:center;color:"+subtitleTextColor+";\" >"+subtitleText+"</h5>\n" +
                     "\t</div>\n" +
                     "\n" +
                     "\t\n" +
                     "\t</div>\n" +
                     "\t<div class=\"uk-position-bottom-right uk-margin-small-right\" >\n" +
                     "\t<p style=\"word-wrap: break-word;text-align:center;color:"+versionTextColor+";\" >"+versionText+"</p>\n" +
                     "\t</div>\n" +
                     "\t\n" +
                     "\t\n" +
                     "\n" +
                     "    </body>\n" +
                     "</html>\t\n";
        }
        WebView web=new WebView(activity);
        web.setBackgroundColor(Color.BLACK);
        web.setPadding(0,0,0,0);
        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error){
                //Your code to do
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Log.d("WebView",error.getDescription().toString());
                }
            }
        });
        web.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                android.util.Log.d("WebView", consoleMessage.message());
                return true;
            }
        });


        web.loadDataWithBaseURL("file:///android_asset/www/",webdata,"text/html","UTF-8",null);
        //web.loadUrl("https://sample.vodobox.com/skate_phantom_flex_4k/skate_phantom_flex_4k.m3u8");
        return web;
    }


    @SuppressLint("SetJavaScriptEnabled")
    public WebView noLogoCreate(String backgroundImage,String backgroundColor,String titleText,
                                 String titleTextColor,String subtitleText,String subtitleTextColor,String versionText,
                                 String versionTextColor){
        String webdata;
        if(backgroundColor==null){
            backgroundColor="#cccccc";
        }
        if(subtitleText==null){
            subtitleText="";
        }
        if(titleText==null){
            titleText="";
        }
        if(versionText==null){
            versionText="";
        }

        if(backgroundImage==null){



            webdata="<html>\n" +
                    "    <head>\n" +
                    "\t\n" +
                    "        <title>SplashScreen</title>\n" +
                    "        <meta charset=\"utf-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/css/uikit.min.css\" />\n" +
                    "\t\t<script src=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/js/uikit.min.js\"></script>\n" +
                    "\t\t<script src=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/js/uikit-icons.min.js\"></script>\n" +
                    "\t\t\n" +
                    "\t\t\n" +
                    "\n" +
                    "    </head>\n" +
                    "    <body style=\"background-color: "+backgroundColor+";background-repeat: no-repeat; background-attachment: fixed;background-size: 100% 100%;\" uk-height-viewport>\n" +
                    "\t\n" +
                    "\t\n" +
                    "\t<div class=\"uk-position-center \">\n" +
                    "\t\n" +
                    "\t\n" +
                    "\t\n" +
                    "\t<div class=\"uk-margin-medium-left uk-margin-medium-right\" >\n" +
                    "\t<h4 style=\"word-wrap: break-word;color:"+titleTextColor+";text-align:center;\" >"+titleText+"</h4>\n" +
                    "\t</div>\n" +
                    "\t<div class=\"uk-margin-large-left uk-margin-large-right\">\n" +
                    "\t<h5 style=\"word-wrap: break-word;text-align:center;color:"+subtitleTextColor+";\" >"+subtitleText+"</h5>\n" +
                    "\t</div>\n" +
                    "\n" +
                    "\t\n" +
                    "\t</div>\n" +
                    "\t<div class=\"uk-position-bottom-right uk-margin-small-right\" >\n" +
                    "\t<p style=\"word-wrap: break-word;text-align:center;color:"+versionTextColor+";\" >"+versionText+"</p>\n" +
                    "\t</div>\n" +
                    "\t\n" +
                    "\t\n" +
                    "\n" +
                    "    </body>\n" +
                    "</html>\t\n";
        }else {
            webdata = "<html>\n" +
                    "    <head>\n" +
                    "\t\n" +
                    "        <title>SplashScreen</title>\n" +
                    "        <meta charset=\"utf-8\">\n" +
                    "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/css/uikit.min.css\" />\n" +
                    "\t\t<script src=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/js/uikit.min.js\"></script>\n" +
                    "\t\t<script src=\"https://cdn.jsdelivr.net/npm/uikit@3.5.7/dist/js/uikit-icons.min.js\"></script>\n" +
                    "\t\t\n" +
                    "\t\t\n" +
                    "\n" +
                    "    </head>\n" +
                    "    <body style=\"background-image:url("+backgroundImage+");background-repeat: no-repeat; background-attachment: fixed;background-size: 100% 100%;\" uk-height-viewport>\n" +
                    "\t\n" +
                    "\t\n" +
                    "\t<div class=\"uk-position-center \">\n" +
                    "\t\n" +
                    "\t\n" +
                    "\t\n" +
                    "\t<div class=\"uk-margin-medium-left uk-margin-medium-right\" >\n" +
                    "\t<h4 style=\"word-wrap: break-word;color:"+titleTextColor+";text-align:center;\" >"+titleText+"</h4>\n" +
                    "\t</div>\n" +
                    "\t<div class=\"uk-margin-large-left uk-margin-large-right\">\n" +
                    "\t<h5 style=\"word-wrap: break-word;text-align:center;color:"+subtitleTextColor+";\" >"+subtitleText+"</h5>\n" +
                    "\t</div>\n" +
                    "\n" +
                    "\t\n" +
                    "\t</div>\n" +
                    "\t<div class=\"uk-position-bottom-right uk-margin-small-right\" >\n" +
                    "\t<p style=\"word-wrap: break-word;text-align:center;color:"+versionTextColor+";\" >"+versionText+"</p>\n" +
                    "\t</div>\n" +
                    "\t\n" +
                    "\t\n" +
                    "\n" +
                    "    </body>\n" +
                    "</html>\t\n";
        }
        WebView web=new WebView(activity);
        web.setBackgroundColor(Color.BLACK);
        web.setPadding(0,0,0,0);
        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        web.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error){
                //Your code to do
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Log.d("WebView",error.getDescription().toString());
                }
            }
        });
        web.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                android.util.Log.d("WebView", consoleMessage.message());
                return true;
            }
        });


        web.loadDataWithBaseURL("file:///android_asset/www/",webdata,"text/html","UTF-8",null);
        //web.loadUrl("https://sample.vodobox.com/skate_phantom_flex_4k/skate_phantom_flex_4k.m3u8");
        return web;
    }
}
