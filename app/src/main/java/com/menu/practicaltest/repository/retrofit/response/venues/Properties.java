package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("pos_wait_until_paid")
    @Expose
    private Boolean posWaitUntilPaid;

    public Boolean getPosWaitUntilPaid() {
        return posWaitUntilPaid;
    }

    public void setPosWaitUntilPaid(Boolean posWaitUntilPaid) {
        this.posWaitUntilPaid = posWaitUntilPaid;
    }

}
