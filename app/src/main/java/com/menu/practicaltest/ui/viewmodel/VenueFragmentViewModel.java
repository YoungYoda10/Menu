package com.menu.practicaltest.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.menu.practicaltest.auth.AuthManager;

public class VenueFragmentViewModel extends AndroidViewModel {
    private final AuthManager authManager;

    public VenueFragmentViewModel(@NonNull Application application) {
        super(application);
        authManager = AuthManager.getInstance(application);
    }

    public void logoutUser() {
        authManager.logoutUser();
    }
}
