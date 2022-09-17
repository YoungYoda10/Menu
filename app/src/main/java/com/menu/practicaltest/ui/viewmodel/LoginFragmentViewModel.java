package com.menu.practicaltest.ui.viewmodel;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.google.gson.Gson;
import com.menu.practicaltest.R;
import com.menu.practicaltest.repository.retrofit.OnCallResponseType;
import com.menu.practicaltest.repository.retrofit.RetrofitClient;
import com.menu.practicaltest.repository.retrofit.body.login.UserData;
import com.menu.practicaltest.repository.retrofit.response.login.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginFragmentViewModel extends AndroidViewModel {

    private final RetrofitClient retrofitClient = RetrofitClient.getInstance();

    public LoginFragmentViewModel(@NonNull Application application) {
        super(application);
    }

    public void loginUser(UserData userData) {
        Call<LoginResponse> call = retrofitClient.getMyApi().loginUser(userData);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponse> call,
                                   @NonNull Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                    Toast.makeText(getApplication(),
                            "Logged In",
                            Toast.LENGTH_LONG).show();
                    Log.i("loginResponse", new Gson().toJson(loginResponse));
                } else {
                    Toast.makeText(getApplication(),
                            getApplication().getString(R.string.error1),
                            Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(@NonNull Call<LoginResponse> call,
                                  @NonNull Throwable t) {
                Toast.makeText(getApplication(),
                        getApplication().getString(R.string.error1),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
