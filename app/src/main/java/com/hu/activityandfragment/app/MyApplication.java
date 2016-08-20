package com.hu.activityandfragment.app;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

/**
 * Created by q623407474 on 2016/8/20.
 */
public class MyApplication extends Application {
    private static final String TAG = "Android4MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "-----onCreate----");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.i(TAG, "-----onTerminate----");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.i(TAG, "-----onLowMemory----");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i(TAG, "-----onConfigurationChanged----");
    }
}
