package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencySettings {

    @SerializedName("currency_space")
    @Expose
    private Boolean currencySpace;
    @SerializedName("decimal_separator")
    @Expose
    private String decimalSeparator;
    @SerializedName("thousands_separator")
    @Expose
    private String thousandsSeparator;
    @SerializedName("symbol_position")
    @Expose
    private String symbolPosition;

    public Boolean getCurrencySpace() {
        return currencySpace;
    }

    public void setCurrencySpace(Boolean currencySpace) {
        this.currencySpace = currencySpace;
    }

    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }

    public String getThousandsSeparator() {
        return thousandsSeparator;
    }

    public void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }

    public String getSymbolPosition() {
        return symbolPosition;
    }

    public void setSymbolPosition(String symbolPosition) {
        this.symbolPosition = symbolPosition;
    }

}
