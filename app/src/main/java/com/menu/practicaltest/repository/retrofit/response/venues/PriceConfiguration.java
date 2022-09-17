package com.menu.practicaltest.repository.retrofit.response.venues;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceConfiguration {

    @SerializedName("order_types")
    @Expose
    private List<OrderType> orderTypes = null;
    @SerializedName("external_channels")
    @Expose
    private List<Object> externalChannels = null;

    public List<OrderType> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<OrderType> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public List<Object> getExternalChannels() {
        return externalChannels;
    }

    public void setExternalChannels(List<Object> externalChannels) {
        this.externalChannels = externalChannels;
    }

}
