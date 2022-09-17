package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("thumbnail_small")
    @Expose
    private String thumbnailSmall;
    @SerializedName("thumbnail_medium")
    @Expose
    private String thumbnailMedium;
    @SerializedName("fullsize")
    @Expose
    private String fullsize;

    public String getThumbnailSmall() {
        return thumbnailSmall;
    }

    public void setThumbnailSmall(String thumbnailSmall) {
        this.thumbnailSmall = thumbnailSmall;
    }

    public String getThumbnailMedium() {
        return thumbnailMedium;
    }

    public void setThumbnailMedium(String thumbnailMedium) {
        this.thumbnailMedium = thumbnailMedium;
    }

    public String getFullsize() {
        return fullsize;
    }

    public void setFullsize(String fullsize) {
        this.fullsize = fullsize;
    }

}
