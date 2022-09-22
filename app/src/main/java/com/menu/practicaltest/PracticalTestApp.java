package com.menu.practicaltest;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

public class PracticalTestApp extends Application {

//    private static PracticalTestApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
//        instance = this;

        FirebaseApp.initializeApp(this);
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
    }

//    public static PracticalTestApp getInstance() {
//        return instance;
//    }
}
