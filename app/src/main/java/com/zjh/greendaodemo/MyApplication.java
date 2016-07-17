package com.zjh.greendaodemo;

import android.app.Application;
import android.content.Context;

import com.zjh.greendaodemo.greendao.GreenDaoManager;

/**
 * Created by zjh on 2016/7/17.
 *
 */
public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        GreenDaoManager.getInstance();
    }

    public static Context getContext() {
        return mContext;
    }
}
