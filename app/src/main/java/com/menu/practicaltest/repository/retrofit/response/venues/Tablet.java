package com.menu.practicaltest.repository.retrofit.response.venues;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tablet {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("venue_id")
    @Expose
    private Integer venueId;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("use_notifications")
    @Expose
    private Integer useNotifications;
    @SerializedName("show_kiosk_orders")
    @Expose
    private Boolean showKioskOrders;
    @SerializedName("kiosk_notification_type")
    @Expose
    private Integer kioskNotificationType;
    @SerializedName("middleware_endpoint")
    @Expose
    private Object middlewareEndpoint;
    @SerializedName("pls_name")
    @Expose
    private Object plsName;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("is_online")
    @Expose
    private Boolean isOnline;
    @SerializedName("last_request_at")
    @Expose
    private String lastRequestAt;
    @SerializedName("failure_reported")
    @Expose
    private Boolean failureReported;
    @SerializedName("is_critical")
    @Expose
    private Boolean isCritical;
    @SerializedName("area_ids")
    @Expose
    private List<Integer> areaIds = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUseNotifications() {
        return useNotifications;
    }

    public void setUseNotifications(Integer useNotifications) {
        this.useNotifications = useNotifications;
    }

    public Boolean getShowKioskOrders() {
        return showKioskOrders;
    }

    public void setShowKioskOrders(Boolean showKioskOrders) {
        this.showKioskOrders = showKioskOrders;
    }

    public Integer getKioskNotificationType() {
        return kioskNotificationType;
    }

    public void setKioskNotificationType(Integer kioskNotificationType) {
        this.kioskNotificationType = kioskNotificationType;
    }

    public Object getMiddlewareEndpoint() {
        return middlewareEndpoint;
    }

    public void setMiddlewareEndpoint(Object middlewareEndpoint) {
        this.middlewareEndpoint = middlewareEndpoint;
    }

    public Object getPlsName() {
        return plsName;
    }

    public void setPlsName(Object plsName) {
        this.plsName = plsName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getLastRequestAt() {
        return lastRequestAt;
    }

    public void setLastRequestAt(String lastRequestAt) {
        this.lastRequestAt = lastRequestAt;
    }

    public Boolean getFailureReported() {
        return failureReported;
    }

    public void setFailureReported(Boolean failureReported) {
        this.failureReported = failureReported;
    }

    public Boolean getIsCritical() {
        return isCritical;
    }

    public void setIsCritical(Boolean isCritical) {
        this.isCritical = isCritical;
    }

    public List<Integer> getAreaIds() {
        return areaIds;
    }

    public void setAreaIds(List<Integer> areaIds) {
        this.areaIds = areaIds;
    }

}
