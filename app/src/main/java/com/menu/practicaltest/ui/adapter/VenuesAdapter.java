package com.menu.practicaltest.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.menu.practicaltest.databinding.ItemViewVenuesBinding;
import com.menu.practicaltest.repository.retrofit.response.venues.Venue;

import java.util.ArrayList;
import java.util.List;

public class VenuesAdapter extends RecyclerView.Adapter<VenuesAdapter.MyViewHolder> {
    private List<Venue> items = new ArrayList<>();
    private final OnClickListener<Venue> callback;

    public VenuesAdapter(OnClickListener<Venue> callback) {
        this.callback = callback;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemViewVenuesBinding binding = ItemViewVenuesBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(binding, callback);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(List<Venue> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private final ItemViewVenuesBinding binding;
        private final OnClickListener<Venue> callback;

        public MyViewHolder(ItemViewVenuesBinding binding, OnClickListener<Venue> callback) {
            super(binding.getRoot());
            this.binding = binding;
            this.callback = callback;
        }

        public void bind(Venue venue) {
            String name = venue.getVenue().getName();
            String distance = venue.getDistanceInMiles() + "miles";
            String address = venue.getVenue().getAddress();
            String isOpen = venue.getVenue().getIsOpen() ? "Open" : "Closed";

            binding.tvTitle.setText(!name.isEmpty() ? name : "No name");
            binding.tvInfo.setText(distance);
            binding.tvDescription1.setText(!address.isEmpty() ? name : "No address");
            binding.tvDescription2.setText(isOpen);

            binding.clWholeView.setOnClickListener(v -> callback.onResult(venue));
        }
    }
}
