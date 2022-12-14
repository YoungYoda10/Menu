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
import com.menu.practicaltest.auth.AuthManager;
import com.menu.practicaltest.repository.retrofit.RetrofitClient;
import com.menu.practicaltest.repository.retrofit.body.login.UserData;
import com.menu.practicaltest.repository.retrofit.response.login.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginFragmentViewModel extends AndroidViewModel {

    private final RetrofitClient retrofitClient;
    private final AuthManager authManager;

    private final MutableLiveData<Boolean> isLoading = new MutableLiveData<>(false);

    public LoginFragmentViewModel(@NonNull Application application) {
        super(application);
        retrofitClient = RetrofitClient.getInstance();
        authManager = AuthManager.getInstance(application);
    }

    public void loginUser(UserData userData) {
        isLoading.setValue(true);
        Call<LoginResponse> call = retrofitClient.getMyApi().loginUser(userData);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponse> call,
                                   @NonNull Response<LoginResponse> response) {
                LoginResponse loginResponse = response.body();
                if (response.isSuccessful() &&
                        (loginResponse != null &&
                                loginResponse.getData() != null &&
                                loginResponse.getData().getToken() != null)) {
                    authManager.loginUser(loginResponse.getData().getToken().getValue());
                    isLoading.setValue(false);
                    Log.i("loginResponse", new Gson().toJson(loginResponse));
                } else {
                    isLoading.setValue(false);
                    Toast.makeText(getApplication(),
                            getApplication().getString(R.string.error1),
                            Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(@NonNull Call<LoginResponse> call, @NonNull Throwable t) {
                isLoading.setValue(false);
                Toast.makeText(getApplication(), getApplication().getString(R.string.error1), Toast.LENGTH_LONG).show();
            }
        });
    }

    public LiveData<Boolean> getIsLoading() {
        return isLoading;
    }
}
