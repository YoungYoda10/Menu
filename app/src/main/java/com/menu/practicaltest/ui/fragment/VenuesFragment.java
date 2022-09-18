package com.menu.practicaltest.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.menu.practicaltest.R;
import com.menu.practicaltest.databinding.FragmentVenuesBinding;
import com.menu.practicaltest.repository.retrofit.body.venues.Location;
import com.menu.practicaltest.ui.viewmodel.VenuesFragmentViewModel;

public class VenuesFragment extends Fragment {

    public static final String TAG = VenuesFragment.class.getSimpleName();

    private FragmentVenuesBinding binding;
    private VenuesFragmentViewModel viewModel;

    public VenuesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(VenuesFragmentViewModel.class);

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_venues, container, false);
        binding.setLifecycleOwner(getViewLifecycleOwner());
        binding.setViewModel(viewModel);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel.getVenues(new Location("44.001783","21.26907"));
    }
}