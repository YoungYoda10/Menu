package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailablePaymentMethod__1 {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("payment_method_id")
    @Expose
    private Integer paymentMethodId;
    @SerializedName("payment_method_type_id")
    @Expose
    private Integer paymentMethodTypeId;
    @SerializedName("payment_method_brand")
    @Expose
    private String paymentMethodBrand;
    @SerializedName("payment_processor_type_id")
    @Expose
    private Integer paymentProcessorTypeId;
    @SerializedName("payment_processor_id")
    @Expose
    private Integer paymentProcessorId;
    @SerializedName("properties")
    @Expose
    private Object properties;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Integer getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(Integer paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public String getPaymentMethodBrand() {
        return paymentMethodBrand;
    }

    public void setPaymentMethodBrand(String paymentMethodBrand) {
        this.paymentMethodBrand = paymentMethodBrand;
    }

    public Integer getPaymentProcessorTypeId() {
        return paymentProcessorTypeId;
    }

    public void setPaymentProcessorTypeId(Integer paymentProcessorTypeId) {
        this.paymentProcessorTypeId = paymentProcessorTypeId;
    }

    public Integer getPaymentProcessorId() {
        return paymentProcessorId;
    }

    public void setPaymentProcessorId(Integer paymentProcessorId) {
        this.paymentProcessorId = paymentProcessorId;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

}
