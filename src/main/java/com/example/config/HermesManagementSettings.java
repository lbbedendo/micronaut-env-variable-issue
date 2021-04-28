package com.example.config;

public interface HermesManagementSettings {
    String PREFIX = "hermes.management";

    String TOPIC = PREFIX + ".topics";

    String SUBSCRIPTION = TOPIC + ".subscription";

    String SUBSCRIPTION_POLICY = SUBSCRIPTION + ".subscriptionPolicy";

    String OWNER = SUBSCRIPTION + ".owner";
}
