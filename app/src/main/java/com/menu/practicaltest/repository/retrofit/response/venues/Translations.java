package com.menu.practicaltest.repository.retrofit.response.venues;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Translations {

    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("kiosk_receipt_footer")
    @Expose
    private Object kioskReceiptFooter;
    @SerializedName("welcome_message")
    @Expose
    private Object welcomeMessage;

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getKioskReceiptFooter() {
        return kioskReceiptFooter;
    }

    public void setKioskReceiptFooter(Object kioskReceiptFooter) {
        this.kioskReceiptFooter = kioskReceiptFooter;
    }

    public Object getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(Object welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

}
