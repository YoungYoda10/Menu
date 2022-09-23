package com.menu.practicaltest.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.menu.practicaltest.R;
import com.menu.practicaltest.databinding.FragmentVenuesBinding;
import com.menu.practicaltest.repository.retrofit.OnCallResponseType;
import com.menu.practicaltest.repository.retrofit.body.venues.Location;
import com.menu.practicaltest.repository.retrofit.response.venues.Venue;
import com.menu.practicaltest.repository.retrofit.response.venues.VenuesResponse;
import com.menu.practicaltest.ui.adapter.OnClickListener;
import com.menu.practicaltest.ui.adapter.VenuesAdapter;
import com.menu.practicaltest.ui.viewmodel.VenuesFragmentViewModel;

public class VenuesFragment extends Fragment {

    public static final String TAG = VenuesFragment.class.getSimpleName();

    private FragmentVenuesBinding binding;
    private VenuesFragmentViewModel viewModel;

    private VenuesAdapter adapter;

    private OnClickListener<Venue> callback;

    public VenuesFragment() {
    }

    public void setCallback(OnClickListener<Venue> callback){
        this.callback = callback;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(this).get(VenuesFragmentViewModel.class);

        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_venues, container, false);
        binding.setLifecycleOwner(getViewLifecycleOwner());
        binding.setViewModel(viewModel);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.rvVenues.setLayoutManager(
                new LinearLayoutManager(
                        getContext(), LinearLayoutManager.VERTICAL, false));
        adapter = new VenuesAdapter(callback);
        binding.rvVenues.setAdapter(adapter);

        viewModel.getVenues(new Location("44.001783", "21.26907"),
                new OnCallResponseType<VenuesResponse>() {
                    @Override
                    public void onResult(VenuesResponse venuesResponse) {
                        if (isResponseValid(venuesResponse)) {
                            Log.i("venuesResponse",
                                    venuesResponse.getData().getVenues().size() + "");
                            if (isAdded()) {
                                adapter.setItems(venuesResponse.getData().getVenues());
                                Log.i("venuesResponse",
                                        "Adapter Item Count: " + adapter.getItemCount());
                            }
                        }
                    }

                    @Override
                    public void onError(String err) {
                        Toast.makeText(getContext(), err, Toast.LENGTH_LONG).show();
                    }
                });
    }

    private boolean isResponseValid(VenuesResponse venuesResponse) {
        if (venuesResponse != null) {
            if (venuesResponse.getData() != null) {
                if (venuesResponse.getData().getVenues() != null) {
                    return true;
                } else {
                    Log.e("venuesResponse",
                            "venuesResponse.getData().getVenues() == null");
                    return false;
                }
            } else {
                Log.e("venuesResponse", "venuesResponse.getData() == null");
                return false;
            }
        } else {
            Log.e("venuesResponse", "venuesResponse == null");
            return false;
        }
    }
}