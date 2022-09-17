package com.menu.practicaltest.repository.retrofit.response.venues;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Venue__1 {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("parent_type")
    @Expose
    private String parentType;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("company_id")
    @Expose
    private Integer companyId;
    @SerializedName("chain_id")
    @Expose
    private Object chainId;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("currency_id")
    @Expose
    private Integer currencyId;
    @SerializedName("language_id")
    @Expose
    private Integer languageId;
    @SerializedName("store_group_id")
    @Expose
    private Object storeGroupId;
    @SerializedName("brand_id")
    @Expose
    private Integer brandId;
    @SerializedName("timezone")
    @Expose
    private Timezone timezone;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("kiosk_receipt_footer")
    @Expose
    private String kioskReceiptFooter;
    @SerializedName("imprint")
    @Expose
    private String imprint;
    @SerializedName("welcome_message")
    @Expose
    private String welcomeMessage;
    @SerializedName("translations")
    @Expose
    private Translations translations;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("state")
    @Expose
    private Integer state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zip")
    @Expose
    private String zip;
    @SerializedName("latitude")
    @Expose
    private Float latitude;
    @SerializedName("longitude")
    @Expose
    private Float longitude;
    @SerializedName("tax_number")
    @Expose
    private String taxNumber;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("price_configuration")
    @Expose
    private PriceConfiguration priceConfiguration;
    @SerializedName("used_price_configurations")
    @Expose
    private List<Integer> usedPriceConfigurations = null;
    @SerializedName("cuisine")
    @Expose
    private String cuisine;
    @SerializedName("store_url")
    @Expose
    private String storeUrl;
    @SerializedName("is_shown_in_directory")
    @Expose
    private Boolean isShownInDirectory;
    @SerializedName("allow_item_comments")
    @Expose
    private Boolean allowItemComments;
    @SerializedName("tip_default")
    @Expose
    private Integer tipDefault;
    @SerializedName("tip_max")
    @Expose
    private Integer tipMax;
    @SerializedName("service_charge")
    @Expose
    private Integer serviceCharge;
    @SerializedName("pickup_time")
    @Expose
    private Integer pickupTime;
    @SerializedName("is_pickup_on_open_allowed")
    @Expose
    private Boolean isPickupOnOpenAllowed;
    @SerializedName("calculation_method")
    @Expose
    private String calculationMethod;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("available_payment_methods")
    @Expose
    private List<AvailablePaymentMethod> availablePaymentMethods = null;
    @SerializedName("country")
    @Expose
    private Country country;
    @SerializedName("currency")
    @Expose
    private Currency currency;
    @SerializedName("order_types")
    @Expose
    private List<OrderType__1> orderTypes = null;
    @SerializedName("temporary_updated_entities")
    @Expose
    private List<Object> temporaryUpdatedEntities = null;
    @SerializedName("serving_times")
    @Expose
    private List<Object> servingTimes = null;
    @SerializedName("is_open")
    @Expose
    private Boolean isOpen;
    @SerializedName("will_open")
    @Expose
    private Boolean willOpen;
    @SerializedName("has_discounts")
    @Expose
    private Boolean hasDiscounts;
    @SerializedName("has_loyalty")
    @Expose
    private Boolean hasLoyalty;
    @SerializedName("has_promotions")
    @Expose
    private Boolean hasPromotions;
    @SerializedName("has_delivery_integration")
    @Expose
    private Boolean hasDeliveryIntegration;
    @SerializedName("delivery_integration_properties")
    @Expose
    private Object deliveryIntegrationProperties;
    @SerializedName("delivery_travel_type")
    @Expose
    private String deliveryTravelType;
    @SerializedName("is_calculated_delivery_buffer_used")
    @Expose
    private Boolean isCalculatedDeliveryBufferUsed;
    @SerializedName("is_monitoring_enabled")
    @Expose
    private Boolean isMonitoringEnabled;
    @SerializedName("is_threeds_enabled")
    @Expose
    private Boolean isThreedsEnabled;
    @SerializedName("is_fraud_detection_enabled")
    @Expose
    private Boolean isFraudDetectionEnabled;
    @SerializedName("is_smart_orders_enabled")
    @Expose
    private Boolean isSmartOrdersEnabled;
    @SerializedName("use_pos_order_number")
    @Expose
    private Boolean usePosOrderNumber;
    @SerializedName("is_order_regret_enabled")
    @Expose
    private Boolean isOrderRegretEnabled;
    @SerializedName("is_billable")
    @Expose
    private Boolean isBillable;
    @SerializedName("default_delivery_buffer")
    @Expose
    private Integer defaultDeliveryBuffer;
    @SerializedName("integration")
    @Expose
    private Integration integration;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("areas")
    @Expose
    private List<Area> areas = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Object getChainId() {
        return chainId;
    }

    public void setChainId(Object chainId) {
        this.chainId = chainId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Object getStoreGroupId() {
        return storeGroupId;
    }

    public void setStoreGroupId(Object storeGroupId) {
        this.storeGroupId = storeGroupId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKioskReceiptFooter() {
        return kioskReceiptFooter;
    }

    public void setKioskReceiptFooter(String kioskReceiptFooter) {
        this.kioskReceiptFooter = kioskReceiptFooter;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PriceConfiguration getPriceConfiguration() {
        return priceConfiguration;
    }

    public void setPriceConfiguration(PriceConfiguration priceConfiguration) {
        this.priceConfiguration = priceConfiguration;
    }

    public List<Integer> getUsedPriceConfigurations() {
        return usedPriceConfigurations;
    }

    public void setUsedPriceConfigurations(List<Integer> usedPriceConfigurations) {
        this.usedPriceConfigurations = usedPriceConfigurations;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getStoreUrl() {
        return storeUrl;
    }

    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }

    public Boolean getIsShownInDirectory() {
        return isShownInDirectory;
    }

    public void setIsShownInDirectory(Boolean isShownInDirectory) {
        this.isShownInDirectory = isShownInDirectory;
    }

    public Boolean getAllowItemComments() {
        return allowItemComments;
    }

    public void setAllowItemComments(Boolean allowItemComments) {
        this.allowItemComments = allowItemComments;
    }

    public Integer getTipDefault() {
        return tipDefault;
    }

    public void setTipDefault(Integer tipDefault) {
        this.tipDefault = tipDefault;
    }

    public Integer getTipMax() {
        return tipMax;
    }

    public void setTipMax(Integer tipMax) {
        this.tipMax = tipMax;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Integer getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Integer pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Boolean getIsPickupOnOpenAllowed() {
        return isPickupOnOpenAllowed;
    }

    public void setIsPickupOnOpenAllowed(Boolean isPickupOnOpenAllowed) {
        this.isPickupOnOpenAllowed = isPickupOnOpenAllowed;
    }

    public String getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<AvailablePaymentMethod> getAvailablePaymentMethods() {
        return availablePaymentMethods;
    }

    public void setAvailablePaymentMethods(List<AvailablePaymentMethod> availablePaymentMethods) {
        this.availablePaymentMethods = availablePaymentMethods;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public List<OrderType__1> getOrderTypes() {
        return orderTypes;
    }

    public void setOrderTypes(List<OrderType__1> orderTypes) {
        this.orderTypes = orderTypes;
    }

    public List<Object> getTemporaryUpdatedEntities() {
        return temporaryUpdatedEntities;
    }

    public void setTemporaryUpdatedEntities(List<Object> temporaryUpdatedEntities) {
        this.temporaryUpdatedEntities = temporaryUpdatedEntities;
    }

    public List<Object> getServingTimes() {
        return servingTimes;
    }

    public void setServingTimes(List<Object> servingTimes) {
        this.servingTimes = servingTimes;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Boolean getWillOpen() {
        return willOpen;
    }

    public void setWillOpen(Boolean willOpen) {
        this.willOpen = willOpen;
    }

    public Boolean getHasDiscounts() {
        return hasDiscounts;
    }

    public void setHasDiscounts(Boolean hasDiscounts) {
        this.hasDiscounts = hasDiscounts;
    }

    public Boolean getHasLoyalty() {
        return hasLoyalty;
    }

    public void setHasLoyalty(Boolean hasLoyalty) {
        this.hasLoyalty = hasLoyalty;
    }

    public Boolean getHasPromotions() {
        return hasPromotions;
    }

    public void setHasPromotions(Boolean hasPromotions) {
        this.hasPromotions = hasPromotions;
    }

    public Boolean getHasDeliveryIntegration() {
        return hasDeliveryIntegration;
    }

    public void setHasDeliveryIntegration(Boolean hasDeliveryIntegration) {
        this.hasDeliveryIntegration = hasDeliveryIntegration;
    }

    public Object getDeliveryIntegrationProperties() {
        return deliveryIntegrationProperties;
    }

    public void setDeliveryIntegrationProperties(Object deliveryIntegrationProperties) {
        this.deliveryIntegrationProperties = deliveryIntegrationProperties;
    }

    public String getDeliveryTravelType() {
        return deliveryTravelType;
    }

    public void setDeliveryTravelType(String deliveryTravelType) {
        this.deliveryTravelType = deliveryTravelType;
    }

    public Boolean getIsCalculatedDeliveryBufferUsed() {
        return isCalculatedDeliveryBufferUsed;
    }

    public void setIsCalculatedDeliveryBufferUsed(Boolean isCalculatedDeliveryBufferUsed) {
        this.isCalculatedDeliveryBufferUsed = isCalculatedDeliveryBufferUsed;
    }

    public Boolean getIsMonitoringEnabled() {
        return isMonitoringEnabled;
    }

    public void setIsMonitoringEnabled(Boolean isMonitoringEnabled) {
        this.isMonitoringEnabled = isMonitoringEnabled;
    }

    public Boolean getIsThreedsEnabled() {
        return isThreedsEnabled;
    }

    public void setIsThreedsEnabled(Boolean isThreedsEnabled) {
        this.isThreedsEnabled = isThreedsEnabled;
    }

    public Boolean getIsFraudDetectionEnabled() {
        return isFraudDetectionEnabled;
    }

    public void setIsFraudDetectionEnabled(Boolean isFraudDetectionEnabled) {
        this.isFraudDetectionEnabled = isFraudDetectionEnabled;
    }

    public Boolean getIsSmartOrdersEnabled() {
        return isSmartOrdersEnabled;
    }

    public void setIsSmartOrdersEnabled(Boolean isSmartOrdersEnabled) {
        this.isSmartOrdersEnabled = isSmartOrdersEnabled;
    }

    public Boolean getUsePosOrderNumber() {
        return usePosOrderNumber;
    }

    public void setUsePosOrderNumber(Boolean usePosOrderNumber) {
        this.usePosOrderNumber = usePosOrderNumber;
    }

    public Boolean getIsOrderRegretEnabled() {
        return isOrderRegretEnabled;
    }

    public void setIsOrderRegretEnabled(Boolean isOrderRegretEnabled) {
        this.isOrderRegretEnabled = isOrderRegretEnabled;
    }

    public Boolean getIsBillable() {
        return isBillable;
    }

    public void setIsBillable(Boolean isBillable) {
        this.isBillable = isBillable;
    }

    public Integer getDefaultDeliveryBuffer() {
        return defaultDeliveryBuffer;
    }

    public void setDefaultDeliveryBuffer(Integer defaultDeliveryBuffer) {
        this.defaultDeliveryBuffer = defaultDeliveryBuffer;
    }

    public Integration getIntegration() {
        return integration;
    }

    public void setIntegration(Integration integration) {
        this.integration = integration;
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

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

}
