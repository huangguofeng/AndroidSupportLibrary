package com.test.library;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.util.Log;

public class BaseApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        Log.e("Demo","Android Support ：BaseApplication  attachBaseContext");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Demo","Android Support ：BaseApplication  onCreate");
    }
}
