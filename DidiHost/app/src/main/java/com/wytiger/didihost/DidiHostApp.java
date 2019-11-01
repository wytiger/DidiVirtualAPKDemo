package com.wytiger.didihost;

import android.app.Application;
import android.content.Context;

import com.didi.virtualapk.PluginManager;

/**
 * description ：
 * author : wuyong_cd
 * date : 2019/10/31 0031
 */
public class DidiHostApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        PluginManager.getInstance(base).init();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
