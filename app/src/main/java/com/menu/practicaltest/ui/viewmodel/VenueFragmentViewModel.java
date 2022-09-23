package com.menu.practicaltest.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.menu.practicaltest.auth.AuthManager;
import com.menu.practicaltest.repository.retrofit.response.venues.Venue;

public class VenueFragmentViewModel extends AndroidViewModel {
    private final AuthManager authManager;

    private Venue venue;

    public VenueFragmentViewModel(@NonNull Application application) {
        super(application);
        authManager = AuthManager.getInstance(application);
    }

    public void logoutUser() {
        authManager.logoutUser();
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Venue getVenue() {
        return venue;
    }
}
