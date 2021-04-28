package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties(HermesManagementSettings.TOPIC)
public class TopicConfiguration {

    private static final Ack DEFAULT_ACK = Ack.LEADER;
    private static final ContentType DEFAULT_CONTENT_TYPE = ContentType.JSON;
    private static final Integer DEFAULT_RETENTION_TIME_1_DAY = 1;
    private static final OwnerConfiguration DEFAULT_OWNER_CONFIGURATION = new OwnerConfiguration("Plaintext", "micronaut");

    private String name;
    private String description;
    private String schema;
    private Ack ack = DEFAULT_ACK;
    private ContentType contentType = DEFAULT_CONTENT_TYPE;
    private Integer maxMessageSize;
    private Integer retentionTime = DEFAULT_RETENTION_TIME_1_DAY;
    private OwnerConfiguration owner = DEFAULT_OWNER_CONFIGURATION;
    private Boolean trackingEnabled;
    private SubscriptionConfiguration subscription;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Ack getAck() {
        return ack;
    }

    public void setAck(Ack ack) {
        this.ack = ack;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Integer getMaxMessageSize() {
        return maxMessageSize;
    }

    public void setMaxMessageSize(Integer maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
    }

    public Integer getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(Integer retentionTime) {
        this.retentionTime = retentionTime;
    }

    public OwnerConfiguration getOwner() {
        return owner;
    }

    public void setOwner(OwnerConfiguration owner) {
        this.owner = owner;
    }

    public Boolean getTrackingEnabled() {
        return trackingEnabled;
    }

    public void setTrackingEnabled(Boolean trackingEnabled) {
        this.trackingEnabled = trackingEnabled;
    }

    public SubscriptionConfiguration getSubscription() {
        return subscription;
    }

    public void setSubscription(SubscriptionConfiguration subscription) {
        this.subscription = subscription;
    }
}

