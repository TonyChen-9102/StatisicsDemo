package com.demo.ck.statisicsdemo;

import android.app.Application;

import com.yjhealth.libs.yjhealthstatistics.umeng.UmengImpl;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        UmengImpl.getInstance().init(this);
    }
}
