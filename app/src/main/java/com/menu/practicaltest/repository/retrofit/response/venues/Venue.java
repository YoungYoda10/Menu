package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue {

    @SerializedName("distance")
    @Expose
    private Float distance;
    @SerializedName("distance_in_miles")
    @Expose
    private Float distanceInMiles;
    @SerializedName("venue")
    @Expose
    private Venue__1 venue;

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Float getDistanceInMiles() {
        return distanceInMiles;
    }

    public void setDistanceInMiles(Float distanceInMiles) {
        this.distanceInMiles = distanceInMiles;
    }

    public Venue__1 getVenue() {
        return venue;
    }

    public void setVenue(Venue__1 venue) {
        this.venue = venue;
    }

}
