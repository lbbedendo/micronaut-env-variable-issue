package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.EachProperty;

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
    private TopicOwner owner;

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

    public void setSubscription(SubscriptionConfiguration subscription) {
        this.subscription = subscription;
    }

    public TopicOwner getOwner() {
        return owner;
    }

    public void setOwner(TopicOwner owner) {
        this.owner = owner;
    }

    @ConfigurationProperties(HermesManagementSettings.SUBSCRIPTION)
    public static class SubscriptionConfiguration {

        private String endpoint;
        private String name;
        private String description;
        private String secret;
        private Policy policy;
        private SubscriptionOwner owner;

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

        public Policy getPolicy() {
            return policy;
        }

        public void setPolicy(Policy policy) {
            this.policy = policy;
        }

        public SubscriptionOwner getOwner() {
            return owner;
        }

        public void setOwner(SubscriptionOwner owner) {
            this.owner = owner;
        }

        @ConfigurationProperties(HermesManagementSettings.POLICY)
        public static class Policy {

            private Integer rate;
            private Integer messageTtl;
            private Integer messageBackoff;
            private Boolean retryClientErrors;
            private Integer requestTimeout;
            private Integer socketTimeout;
            private Integer inflightSize;
            private Double backoffMultiplier;
            private Integer backoffMaxIntervalInSec;

            public Integer getRate() {
                return rate;
            }

            public void setRate(Integer rate) {
                this.rate = rate;
            }

            public Integer getMessageTtl() {
                return messageTtl;
            }

            public void setMessageTtl(Integer messageTtl) {
                this.messageTtl = messageTtl;
            }

            public Integer getMessageBackoff() {
                return messageBackoff;
            }

            public void setMessageBackoff(Integer messageBackoff) {
                this.messageBackoff = messageBackoff;
            }

            public Boolean getRetryClientErrors() {
                return retryClientErrors;
            }

            public void setRetryClientErrors(Boolean retryClientErrors) {
                this.retryClientErrors = retryClientErrors;
            }

            public Integer getRequestTimeout() {
                return requestTimeout;
            }

            public void setRequestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
            }

            public Integer getSocketTimeout() {
                return socketTimeout;
            }

            public void setSocketTimeout(Integer socketTimeout) {
                this.socketTimeout = socketTimeout;
            }

            public Integer getInflightSize() {
                return inflightSize;
            }

            public void setInflightSize(Integer inflightSize) {
                this.inflightSize = inflightSize;
            }

            public Double getBackoffMultiplier() {
                return backoffMultiplier;
            }

            public void setBackoffMultiplier(Double backoffMultiplier) {
                this.backoffMultiplier = backoffMultiplier;
            }

            public Integer getBackoffMaxIntervalInSec() {
                return backoffMaxIntervalInSec;
            }

            public void setBackoffMaxIntervalInSec(Integer backoffMaxIntervalInSec) {
                this.backoffMaxIntervalInSec = backoffMaxIntervalInSec;
            }

            @Override
            public String toString() {
                return "Policy{" +
                        "rate=" + rate +
                        ", messageTtl=" + messageTtl +
                        ", messageBackoff=" + messageBackoff +
                        ", retryClientErrors=" + retryClientErrors +
                        ", requestTimeout=" + requestTimeout +
                        ", socketTimeout=" + socketTimeout +
                        ", inflightSize=" + inflightSize +
                        ", backoffMultiplier=" + backoffMultiplier +
                        ", backoffMaxIntervalInSec=" + backoffMaxIntervalInSec +
                        '}';
            }
        }

        @ConfigurationProperties(HermesManagementSettings.OWNER)
        public static class SubscriptionOwner extends Owner {

            @Override
            public String toString() {
                return "TopicOwner{" +
                        "source='" + source + '\'' +
                        ", id='" + id + '\'' +
                        '}';
            }
        }
    }

    @ConfigurationProperties(HermesManagementSettings.OWNER)
    public static class TopicOwner extends Owner {

        @Override
        public String toString() {
            return "TopicOwner{" +
                    "source='" + source + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }
    }
}

