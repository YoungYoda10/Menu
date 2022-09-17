package com.menu.practicaltest.repository.retrofit.response.venues;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailablePaymentMethod {

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
    private Object paymentProcessorId;
    @SerializedName("properties")
    @Expose
    private Properties properties;
    @SerializedName("fraud_detection_processor_id")
    @Expose
    private Object fraudDetectionProcessorId;
    @SerializedName("visibility_scopes")
    @Expose
    private List<VisibilityScope> visibilityScopes = null;

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

    public Object getPaymentProcessorId() {
        return paymentProcessorId;
    }

    public void setPaymentProcessorId(Object paymentProcessorId) {
        this.paymentProcessorId = paymentProcessorId;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Object getFraudDetectionProcessorId() {
        return fraudDetectionProcessorId;
    }

    public void setFraudDetectionProcessorId(Object fraudDetectionProcessorId) {
        this.fraudDetectionProcessorId = fraudDetectionProcessorId;
    }

    public List<VisibilityScope> getVisibilityScopes() {
        return visibilityScopes;
    }

    public void setVisibilityScopes(List<VisibilityScope> visibilityScopes) {
        this.visibilityScopes = visibilityScopes;
    }

}
