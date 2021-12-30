package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("gu6mNaxsjJ3AxMkLtIznXx7QdMHM3JjjhE9Uf7X7")
                .clientKey("gDuz0ffTReOoODAhopMpbFGYxgOESAzwQ73wrieN")
                .server("https://parseapi.back4app.com")
                .build()

        );
    }
}
