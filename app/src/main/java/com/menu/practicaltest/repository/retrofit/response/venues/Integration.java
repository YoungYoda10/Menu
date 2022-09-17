package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Integration {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type_id")
    @Expose
    private Integer typeId;
    @SerializedName("reference_type")
    @Expose
    private String referenceType;
    @SerializedName("is_windows_pos")
    @Expose
    private Boolean isWindowsPos;
    @SerializedName("pos_modifier_group_type")
    @Expose
    private Integer posModifierGroupType;
    @SerializedName("support_combo_meals")
    @Expose
    private Boolean supportComboMeals;
    @SerializedName("max_comment_limit")
    @Expose
    private Integer maxCommentLimit;

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

    public Boolean getIsWindowsPos() {
        return isWindowsPos;
    }

    public void setIsWindowsPos(Boolean isWindowsPos) {
        this.isWindowsPos = isWindowsPos;
    }

    public Integer getPosModifierGroupType() {
        return posModifierGroupType;
    }

    public void setPosModifierGroupType(Integer posModifierGroupType) {
        this.posModifierGroupType = posModifierGroupType;
    }

    public Boolean getSupportComboMeals() {
        return supportComboMeals;
    }

    public void setSupportComboMeals(Boolean supportComboMeals) {
        this.supportComboMeals = supportComboMeals;
    }

    public Integer getMaxCommentLimit() {
        return maxCommentLimit;
    }

    public void setMaxCommentLimit(Integer maxCommentLimit) {
        this.maxCommentLimit = maxCommentLimit;
    }

}
