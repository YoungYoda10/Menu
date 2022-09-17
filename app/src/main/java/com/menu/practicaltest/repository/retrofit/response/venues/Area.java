package com.menu.practicaltest.repository.retrofit.response.venues;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Area {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;
    @SerializedName("reference_type")
    @Expose
    private String referenceType;
    @SerializedName("venue_id")
    @Expose
    private Integer venueId;
    @SerializedName("menu_id")
    @Expose
    private Integer menuId;
    @SerializedName("singular_point_id")
    @Expose
    private Integer singularPointId;
    @SerializedName("pos_id")
    @Expose
    private Object posId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("use_tablet")
    @Expose
    private Boolean useTablet;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("is_table_supported")
    @Expose
    private Integer isTableSupported;
    @SerializedName("properties")
    @Expose
    private Object properties;
    @SerializedName("order_types")
    @Expose
    private List<OrderType__2> orderTypes = null;
    @SerializedName("table_pos_id")
    @Expose
    private Object tablePosId;
    @SerializedName("tablet")
    @Expose
    private Tablet tablet;
    @SerializedName("delivery_area_maps")
    @Expose
    private List<DeliveryAreaMap> deliveryAreaMaps = null;
    @SerializedName("delivery_times")
    @Expose
    private List<DeliveryTime> deliveryTimes = null;

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

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getSingularPointId() {
        return singularPointId;
    }

    public void setSingularPointId(Integer singularPointId) {
        this.singularPointId = singularPointId;
    }

    public Object getPosId() {
        return posId;
    }

    public void setPosId(Object posId) {
        this.posId = posId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUseTablet() {
        return useTablet;
    }

    public void setUseTablet(Boolean useTablet) {
        this.useTablet = useTablet;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsTableSupported() {
        return isTableSupported;
    }

    public void setIsTableSupported(Integer isTableSupported) {
        this.isTableSupported = isTableSupported;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public List<OrderType__2> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<OrderType__2> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public Object getTablePosId() {
        return tablePosId;
    }

    public void setTablePosId(Object tablePosId) {
        this.tablePosId = tablePosId;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    public List<DeliveryAreaMap> getDeliveryAreaMaps() {
        return deliveryAreaMaps;
    }

    public void setDeliveryAreaMaps(List<DeliveryAreaMap> deliveryAreaMaps) {
        this.deliveryAreaMaps = deliveryAreaMaps;
    }

    public List<DeliveryTime> getDeliveryTimes() {
        return deliveryTimes;
    }

    public void setDeliveryTimes(List<DeliveryTime> deliveryTimes) {
        this.deliveryTimes = deliveryTimes;
    }

}
