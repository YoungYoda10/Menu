package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderType__1 {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;
    @SerializedName("reference_type")
    @Expose
    private String referenceType;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("is_table_supported")
    @Expose
    private Boolean isTableSupported;
    @SerializedName("external_channel_only")
    @Expose
    private Boolean externalChannelOnly;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Boolean getIsTableSupported() {
        return isTableSupported;
    }

    public void setIsTableSupported(Boolean isTableSupported) {
        this.isTableSupported = isTableSupported;
    }

    public Boolean getExternalChannelOnly() {
        return externalChannelOnly;
    }

    public void setExternalChannelOnly(Boolean externalChannelOnly) {
        this.externalChannelOnly = externalChannelOnly;
    }

}
