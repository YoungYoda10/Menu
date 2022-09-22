package com.menu.practicaltest.ui.viewmodel;

import android.app.Application;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.menu.practicaltest.auth.AuthManager;

public class MainActivityViewModel extends AndroidViewModel {

    private final AuthManager authManager;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        authManager = AuthManager.getInstance(application);
    }

    public void registerSharedPreferencesListener(OnSharedPreferenceChangeListener listener) {
        authManager.registerSharedPreferencesListener(listener);
    }

    public void unregisterSharedPreferencesListener(OnSharedPreferenceChangeListener listener) {
        authManager.unregisterSharedPreferencesListener(listener);
    }

    public String getAuthToken() {
        return authManager.getAuthToken();
    }
}
