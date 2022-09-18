package com.menu.practicaltest.ui.viewmodel;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.menu.practicaltest.R;
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

    public void getVenues(Location location) {
        isLoading.setValue(true);
        Call<VenuesResponse> call = retrofitClient.getMyApi().getVenues(location);
        call.enqueue(new Callback<VenuesResponse>() {
            @Override
            public void onResponse(@NonNull Call<VenuesResponse> call,
                                   @NonNull Response<VenuesResponse> response) {
                VenuesResponse venuesResponse = response.body();
                if (response.isSuccessful() &&
                        (venuesResponse != null && venuesResponse.getData() != null)) {
                    isLoading.setValue(false);
                    Log.i("venuesResponse", venuesResponse.getData().getVenues().size() + "");
                } else {
                    isLoading.setValue(false);
                    Toast.makeText(getApplication(),
                            getApplication().getString(R.string.error1),
                            Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<VenuesResponse> call,
                                  @NonNull Throwable t) {
                isLoading.setValue(false);
                Toast.makeText(getApplication(),
                        getApplication().getString(R.string.error1),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
