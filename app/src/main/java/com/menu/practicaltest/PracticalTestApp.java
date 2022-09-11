package com.menu.practicaltest;

import android.app.Application;

public class PracticalTestApp extends Application {
    private static PracticalTestApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static PracticalTestApp getInstance() {
        return instance;
    }
}
