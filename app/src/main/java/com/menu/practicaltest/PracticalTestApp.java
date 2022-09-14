package com.menu.practicaltest;

import android.app.Application;

import com.google.firebase.crashlytics.FirebaseCrashlytics;

public class PracticalTestApp extends Application {
    private static PracticalTestApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
    }

    public static PracticalTestApp getInstance() {
        return instance;
    }
}
