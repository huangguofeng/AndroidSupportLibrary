package com.test.library;

import android.support.v4.content.FileProvider;
import android.util.Log;

public class BaseFileProvider extends FileProvider {
    @Override
    public boolean onCreate() {
        Log.e("Demo","Android Support ：BaseFileProvider onCreate");
        return super.onCreate();
    }
}
