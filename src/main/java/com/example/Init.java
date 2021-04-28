package com.example;

import com.example.config.HermesManagementConfiguration;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.discovery.event.ServiceReadyEvent;

import javax.inject.Singleton;

@Singleton
public class Init implements ApplicationEventListener<ServiceReadyEvent> {
    private final HermesManagementConfiguration hermesManagementConfiguration;

    public Init(HermesManagementConfiguration hermesManagementConfiguration) {
        this.hermesManagementConfiguration = hermesManagementConfiguration;
    }

    @Override
    public void onApplicationEvent(ServiceReadyEvent event) {
        System.out.println(hermesManagementConfiguration.getUrl());
        hermesManagementConfiguration.getTopics().forEach(topicConfiguration -> {
            System.out.println(topicConfiguration.getName());
            System.out.println(topicConfiguration.getSubscription().getSecret());
        });
    }
}
