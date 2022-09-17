package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderType {

    @SerializedName("type_id")
    @Expose
    private Integer typeId;
    @SerializedName("price_configuration")
    @Expose
    private Integer priceConfiguration;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getPriceConfiguration() {
        return priceConfiguration;
    }

    public void setPriceConfiguration(Integer priceConfiguration) {
        this.priceConfiguration = priceConfiguration;
    }

}
