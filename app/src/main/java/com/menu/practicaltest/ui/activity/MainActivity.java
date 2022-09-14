package com.menu.practicaltest.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.menu.practicaltest.R;
import com.menu.practicaltest.ui.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, LoginFragment.class, null)
                .addToBackStack(null)
                .commit();
    }
}