package com.menu.practicaltest.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

public class AuthManager {
    private static final String SHARED_PREF_ID = "practical_test_pref";
    public static final String TOKEN = "Token_";

    private final SharedPreferences sharedPref;

    private static AuthManager instance;

    public AuthManager(Context context) {
        sharedPref = context.getSharedPreferences(SHARED_PREF_ID, Context.MODE_PRIVATE);
    }

    private void setAuthToken(String authToken) {
        sharedPref.edit().putString(TOKEN, authToken).apply();
    }

    public String getAuthToken() {
        return sharedPref.getString(TOKEN, null);
    }

    public void loginUser(String authToken) {
        setAuthToken(authToken);
    }

    public void logoutUser() {
        setAuthToken(null);
    }

    public static AuthManager getInstance(Context context) {
        if (instance == null) instance = new AuthManager(context);
        return instance;
    }

    public void registerSharedPreferencesListener(OnSharedPreferenceChangeListener listener) {
        sharedPref.registerOnSharedPreferenceChangeListener(listener);
    }

    public void unregisterSharedPreferencesListener(OnSharedPreferenceChangeListener listener) {
        sharedPref.unregisterOnSharedPreferenceChangeListener(listener);
    }
}
