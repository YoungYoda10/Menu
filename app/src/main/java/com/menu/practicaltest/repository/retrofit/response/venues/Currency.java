package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("code_numeric")
    @Expose
    private String codeNumeric;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("rounding_unit")
    @Expose
    private Float roundingUnit;
    @SerializedName("rounding_unit_tip")
    @Expose
    private Float roundingUnitTip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeNumeric() {
        return codeNumeric;
    }

    public void setCodeNumeric(String codeNumeric) {
        this.codeNumeric = codeNumeric;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Float getRoundingUnit() {
        return roundingUnit;
    }

    public void setRoundingUnit(Float roundingUnit) {
        this.roundingUnit = roundingUnit;
    }

    public Float getRoundingUnitTip() {
        return roundingUnitTip;
    }

    public void setRoundingUnitTip(Float roundingUnitTip) {
        this.roundingUnitTip = roundingUnitTip;
    }

}
