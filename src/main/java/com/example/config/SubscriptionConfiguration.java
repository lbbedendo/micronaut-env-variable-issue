package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@ConfigurationProperties(HermesManagementSettings.SUBSCRIPTION)
public class SubscriptionConfiguration {
    private static final OwnerConfiguration DEFAULT_OWNER_CONFIGURATION = new OwnerConfiguration("Plaintext", "platos");

    @NotEmpty
    private String endpoint;
    @NotEmpty
    private String name;
    private String description;
    private SubscriptionPolicyConfiguration subscriptionPolicyConfiguration;
    @Valid
    @NotNull
    private OwnerConfiguration owner = DEFAULT_OWNER_CONFIGURATION;
    @NotEmpty
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
        if (description != null) {
            return description;
        } else {
            return name;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OwnerConfiguration getOwner() {
        return owner;
    }

    public void setOwner(OwnerConfiguration owner) {
        this.owner = owner;
    }

    public SubscriptionPolicyConfiguration getSubscriptionPolicy() {
        return subscriptionPolicyConfiguration;
    }

    public void setSubscriptionPolicy(SubscriptionPolicyConfiguration subscriptionPolicyConfiguration) {
        this.subscriptionPolicyConfiguration = subscriptionPolicyConfiguration;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
