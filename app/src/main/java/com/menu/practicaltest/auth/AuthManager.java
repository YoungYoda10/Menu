package com.menu.practicaltest.auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class AuthManager {
    private final MutableLiveData<String> authTokenLiveData = new MutableLiveData<>();

    private static AuthManager instance;

    public AuthManager() {
    }

    public LiveData<String> getAuthTokenLiveData() {
        return authTokenLiveData;
    }

    public void setAuthToken(String authToken) {
        authTokenLiveData.setValue(authToken);
    }

    public static AuthManager getInstance() {
        if (instance == null)
            instance = new AuthManager();
        return instance;
    }
}
