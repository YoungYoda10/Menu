package com.menu.practicaltest.ui.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;

import com.menu.practicaltest.R;
import com.menu.practicaltest.databinding.ActivityMainBinding;
import com.menu.practicaltest.repository.retrofit.response.venues.Venue;
import com.menu.practicaltest.ui.fragment.LoginFragment;
import com.menu.practicaltest.ui.fragment.VenueFragment;
import com.menu.practicaltest.ui.fragment.VenuesFragment;
import com.menu.practicaltest.ui.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(binding.getRoot());

        MainActivityViewModel viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        viewModel.getAuthTokenLiveData().observe(this, this::observeAuthToken);

        showLoginFragment();
    }

    private void observeAuthToken(String authToken) {
        if (authToken != null) {
            Toast.makeText(getApplication(), "Logged in", Toast.LENGTH_LONG).show();
            showVenuesFragment();
        } else {
            Toast.makeText(getApplication(), "Logged out", Toast.LENGTH_LONG).show();
            showLoginFragment();
        }
    }

    private void showLoginFragment() {
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LoginFragment(), LoginFragment.TAG).commit();
    }

    private void showVenuesFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VenuesFragment(this::showVenueFragment), VenuesFragment.TAG).commit();
    }

    private void showVenueFragment(Venue venue) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new VenueFragment(venue), VenueFragment.TAG).addToBackStack(null).commit();
    }
}