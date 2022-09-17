package com.menu.practicaltest.repository.retrofit.response.venues;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeliveryAreaMap {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("area_id")
    @Expose
    private Integer areaId;
    @SerializedName("delivery_fee_id")
    @Expose
    private Integer deliveryFeeId;
    @SerializedName("minimal_order_amount")
    @Expose
    private Object minimalOrderAmount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("coordinate_polygon")
    @Expose
    private List<List<List<Float>>> coordinatePolygon = null;
    @SerializedName("radius")
    @Expose
    private Object radius;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getDeliveryFeeId() {
        return deliveryFeeId;
    }

    public void setDeliveryFeeId(Integer deliveryFeeId) {
        this.deliveryFeeId = deliveryFeeId;
    }

    public Object getMinimalOrderAmount() {
        return minimalOrderAmount;
    }

    public void setMinimalOrderAmount(Object minimalOrderAmount) {
        this.minimalOrderAmount = minimalOrderAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<List<List<Float>>> getCoordinatePolygon() {
        return coordinatePolygon;
    }

    public void setCoordinatePolygon(List<List<List<Float>>> coordinatePolygon) {
        this.coordinatePolygon = coordinatePolygon;
    }

    public Object getRadius() {
        return radius;
    }

    public void setRadius(Object radius) {
        this.radius = radius;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
