package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;

import javax.inject.Inject;

@EachProperty(value = HermesManagementSettings.TOPIC, list = true)
public class TopicConfiguration {

    private static final Ack DEFAULT_ACK = Ack.LEADER;
    private static final ContentType DEFAULT_CONTENT_TYPE = ContentType.JSON;
    private static final Integer DEFAULT_RETENTION_TIME_1_DAY = 1;

    private String name;
    private String description;
    private String schema;
    private Ack ack = DEFAULT_ACK;
    private ContentType contentType = DEFAULT_CONTENT_TYPE;
    private Integer maxMessageSize;
    private Integer retentionTime = DEFAULT_RETENTION_TIME_1_DAY;
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

    public Boolean getTrackingEnabled() {
        return trackingEnabled;
    }

    public void setTrackingEnabled(Boolean trackingEnabled) {
        this.trackingEnabled = trackingEnabled;
    }

    public SubscriptionConfiguration getSubscription() {
        return subscription;
    }

    @Inject
    public void setSubscription(SubscriptionConfiguration subscription) {
        this.subscription = subscription;
    }

    @ConfigurationProperties(HermesManagementSettings.SUBSCRIPTION)
    public static class SubscriptionConfiguration {

        private String endpoint;
        private String name;
        private String description;
        private String secret;

        public String getEndpoint() {
            return endpoint;
        }

        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }

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

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }
    }
}

