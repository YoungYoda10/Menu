package com.menu.practicaltest.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, LoginFragment.class, null)
                .addToBackStack(null)
                .commit();
    }
}