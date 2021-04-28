package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties(HermesManagementSettings.SUBSCRIPTION_POLICY)
public class SubscriptionPolicyConfiguration {

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
}
