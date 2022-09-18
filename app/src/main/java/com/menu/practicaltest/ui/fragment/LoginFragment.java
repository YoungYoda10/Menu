package com.menu.practicaltest.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.menu.practicaltest.R;
import com.menu.practicaltest.databinding.FragmentLoginBinding;
import com.menu.practicaltest.repository.retrofit.body.login.UserData;
import com.menu.practicaltest.ui.viewmodel.LoginFragmentViewModel;

public class LoginFragment extends Fragment {

    public static final String TAG = LoginFragment.class.getSimpleName();

    private FragmentLoginBinding binding;
    private LoginFragmentViewModel viewModel;

    public LoginFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        viewModel = new ViewModelProvider(this).get(LoginFragmentViewModel.class);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnSignIn.setOnClickListener(v -> {
            String email = binding.etEmail.getText().toString().trim();
            String password = binding.etPassword.getText().toString().trim();

            if (!email.isEmpty() && !password.isEmpty()) {
                viewModel.loginUser(new UserData(email, password));
            } else {
                Toast.makeText(getContext(),
                        getString(R.string.loginError1),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}