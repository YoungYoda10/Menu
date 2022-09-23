package com.menu.practicaltest.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.menu.practicaltest.R;
import com.menu.practicaltest.databinding.FragmentVenueBinding;
import com.menu.practicaltest.repository.retrofit.response.venues.Venue;
import com.menu.practicaltest.ui.viewmodel.VenueFragmentViewModel;

public class VenueFragment extends Fragment {

    public static final String TAG = VenueFragment.class.getSimpleName();

    private FragmentVenueBinding binding;
    private VenueFragmentViewModel viewModel;

    private Venue venue;

    public VenueFragment() {
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(VenueFragmentViewModel.class);
        if (venue!=null){
            viewModel.setVenue(venue);
        }
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_venue, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String name = viewModel.getVenue().getVenue().getName();
        String distance = viewModel.getVenue().getDistanceInMiles() + "miles";
        String address = viewModel.getVenue().getVenue().getAddress();
        String isOpen = viewModel.getVenue().getVenue().getIsOpen() ? "Open" : "Closed";

        if (viewModel.getVenue().getVenue().getImage() != null) {
            RequestOptions options = new RequestOptions().centerCrop().error(R.drawable.error);
            Glide.with(this)
                    .load(viewModel.getVenue().getVenue().getImage().getThumbnailMedium())
                    .apply(options)
                    .into(binding.imageView);
        } else if (getContext() != null) {
            binding.imageView.setImageDrawable(
                    ContextCompat.getDrawable(getContext(), R.drawable.no_image));
        }

        binding.clWholeView.tvTitle.setText(!name.isEmpty() ? name : "No name");
        binding.clWholeView.tvInfo.setText(distance);
        binding.clWholeView.tvDescription1.setText(!address.isEmpty() ? name : "No address");
        binding.clWholeView.tvDescription2.setText(isOpen);

        binding.btnLogout.setOnClickListener(v -> viewModel.logoutUser());
    }
}