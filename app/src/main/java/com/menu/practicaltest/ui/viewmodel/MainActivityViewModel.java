package com.menu.practicaltest.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.menu.practicaltest.auth.AuthManager;

public class MainActivityViewModel extends AndroidViewModel {

    private final AuthManager authManager = AuthManager.getInstance();

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<String> getAuthTokenLiveData() {
        return authManager.getAuthTokenLiveData();
    }
}
