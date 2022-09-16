package com.menu.practicaltest.repository.retrofit.repository;

import com.menu.practicaltest.repository.retrofit.body.UserData;
import com.menu.practicaltest.repository.retrofit.response.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface VenuesRepository {
    String BASE_URL = "https://api-playground.menu.app/api/";

    @Headers({
            "application: mobile-application",
            "Content-Type: application/json",
            "Device-UUID: 123456",
            "Api-Version: 3.7.0"
    })
    @POST("customers/login")
    Call<LoginResponse> loginUser(@Body UserData userData);
}
