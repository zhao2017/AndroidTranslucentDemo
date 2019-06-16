package com.lufax.translucentdemo.base;

import android.app.Application;

import com.lufax.translucentdemo.constant.Global;

public class MyApplicaton extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Global.application = this;
    }
}
