package com.menu.practicaltest.repository.retrofit.response.venues;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("currency_id")
    @Expose
    private Integer currencyId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("code_alpha3")
    @Expose
    private String codeAlpha3;
    @SerializedName("code_numeric")
    @Expose
    private String codeNumeric;
    @SerializedName("calling_code")
    @Expose
    private String callingCode;
    @SerializedName("distance_unit")
    @Expose
    private String distanceUnit;
    @SerializedName("is_address_number_first")
    @Expose
    private Boolean isAddressNumberFirst;
    @SerializedName("currency_settings")
    @Expose
    private CurrencySettings currencySettings;
    @SerializedName("supported_travel_modes")
    @Expose
    private List<String> supportedTravelModes = null;
    @SerializedName("available_payment_methods")
    @Expose
    private List<AvailablePaymentMethod__1> availablePaymentMethods = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeAlpha3() {
        return codeAlpha3;
    }

    public void setCodeAlpha3(String codeAlpha3) {
        this.codeAlpha3 = codeAlpha3;
    }

    public String getCodeNumeric() {
        return codeNumeric;
    }

    public void setCodeNumeric(String codeNumeric) {
        this.codeNumeric = codeNumeric;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public String getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(String distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public Boolean getIsAddressNumberFirst() {
        return isAddressNumberFirst;
    }

    public void setIsAddressNumberFirst(Boolean isAddressNumberFirst) {
        this.isAddressNumberFirst = isAddressNumberFirst;
    }

    public CurrencySettings getCurrencySettings() {
        return currencySettings;
    }

    public void setCurrencySettings(CurrencySettings currencySettings) {
        this.currencySettings = currencySettings;
    }

    public List<String> getSupportedTravelModes() {
        return supportedTravelModes;
    }

    public void setSupportedTravelModes(List<String> supportedTravelModes) {
        this.supportedTravelModes = supportedTravelModes;
    }

    public List<AvailablePaymentMethod__1> getAvailablePaymentMethods() {
        return availablePaymentMethods;
    }

    public void setAvailablePaymentMethods(List<AvailablePaymentMethod__1> availablePaymentMethods) {
        this.availablePaymentMethods = availablePaymentMethods;
    }

}
