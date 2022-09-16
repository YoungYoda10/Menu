package com.menu.practicaltest.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.gson.Gson;
import com.menu.practicaltest.databinding.FragmentLoginBinding;
import com.menu.practicaltest.repository.retrofit.RetrofitClient;
import com.menu.practicaltest.repository.retrofit.body.UserData;
import com.menu.practicaltest.repository.retrofit.response.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;

    public LoginFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnSignIn.setOnClickListener(v -> {
            String email = binding.etEmail.getText().toString().trim();
            String password = binding.etPassword.getText().toString().trim();

            if (!email.isEmpty() && !password.isEmpty()) {
//                loginUser(new UserData(email, password));
                loginUser(new UserData("test@testmenu.app", "test1234"));
            } else {
                Toast.makeText(getContext(),
                        "Email or Password is Empty",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void loginUser(UserData userData) {
        Call<LoginResponse> call = RetrofitClient.getInstance().getMyApi().loginUser(userData);
        call.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponse> call,
                                   @NonNull Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                    Toast.makeText(getContext(),
                            "Logged In",
                            Toast.LENGTH_LONG).show();
                    Log.i("loginResponse", new Gson().toJson(loginResponse));
                } else {
                    Toast.makeText(getContext(),
                            "An error has occurred",
                            Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(@NonNull Call<LoginResponse> call,
                                  @NonNull Throwable t) {
                Toast.makeText(getContext(),
                        "An error has occurred",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}