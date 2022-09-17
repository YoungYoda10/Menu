package com.menu.practicaltest.repository.retrofit;

import com.menu.practicaltest.repository.retrofit.repository.VenuesRepository;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance = null;

    private final VenuesRepository venuesApi;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(VenuesRepository.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        venuesApi = retrofit.create(VenuesRepository.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null)
            instance = new RetrofitClient();
        return instance;
    }

    public VenuesRepository getMyApi() {
        return venuesApi;
    }
}
