package com.menu.practicaltest.ui.activity;

import static com.menu.practicaltest.auth.AuthManager.TOKEN;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;

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

public class MainActivity extends AppCompatActivity implements OnSharedPreferenceChangeListener {

    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        viewModel.registerSharedPreferencesListener(this);

        showFirstFragment();
    }

    private void showLoginFragment() {
        getSupportFragmentManager()
                .popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new LoginFragment(), LoginFragment.TAG)
                .commit();
    }

    private void showVenuesFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new VenuesFragment(this::showVenueFragment), VenuesFragment.TAG)
                .commit();
    }

    private void showVenueFragment(Venue venue) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new VenueFragment(venue), VenueFragment.TAG)
                .addToBackStack(null)
                .commit();
    }

    @Override
    protected void onStop() {
        super.onStop();
        viewModel.unregisterSharedPreferencesListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPref, String key) {
        if (key.equals(TOKEN)) {
            showFirstFragment();
        }
    }

    private void showFirstFragment() {
        String token = viewModel.getAuthToken();
        if (token == null) showLoginFragment();
        else showVenuesFragment();
    }
}
