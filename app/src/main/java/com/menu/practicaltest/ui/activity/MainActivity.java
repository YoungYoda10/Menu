package com.menu.practicaltest.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.menu.practicaltest.R;
import com.menu.practicaltest.databinding.ActivityMainBinding;
import com.menu.practicaltest.ui.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addLoginFragment();
    }

    private void addLoginFragment() {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new LoginFragment(), null)
                    .commit();
    }
}