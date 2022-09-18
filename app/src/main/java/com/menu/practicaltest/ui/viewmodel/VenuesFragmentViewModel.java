package com.menu.practicaltest.ui.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.menu.practicaltest.R;
import com.menu.practicaltest.repository.retrofit.OnCallResponseType;
import com.menu.practicaltest.repository.retrofit.RetrofitClient;
import com.menu.practicaltest.repository.retrofit.body.venues.Location;
import com.menu.practicaltest.repository.retrofit.response.venues.VenuesResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VenuesFragmentViewModel extends AndroidViewModel {

    private final RetrofitClient retrofitClient = RetrofitClient.getInstance();

    private final MutableLiveData<Boolean> isLoading = new MutableLiveData<>(false);

    public VenuesFragmentViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Boolean> getIsLoading() {
        return isLoading;
    }

    public void getVenues(Location location, OnCallResponseType<VenuesResponse> callback) {
        isLoading.setValue(true);
        Call<VenuesResponse> call = retrofitClient.getMyApi().getVenues(location);
        call.enqueue(new Callback<VenuesResponse>() {
            @Override
            public void onResponse(@NonNull Call<VenuesResponse> call,
                                   @NonNull Response<VenuesResponse> response) {
                VenuesResponse venuesResponse = response.body();
                if (response.isSuccessful()) {
                    isLoading.setValue(false);
                    callback.onResult(venuesResponse);
                } else {
                    isLoading.setValue(false);
                    callback.onError(getApplication().getString(R.string.error1));
                }
            }

            @Override
            public void onFailure(@NonNull Call<VenuesResponse> call,
                                  @NonNull Throwable t) {
                isLoading.setValue(false);
                callback.onError(getApplication().getString(R.string.error1));
            }
        });
    }
}
