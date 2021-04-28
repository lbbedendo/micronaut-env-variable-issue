package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.util.Toggleable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ConfigurationProperties(HermesManagementSettings.PREFIX)
public class HermesManagementConfiguration implements Toggleable {

    private boolean enabled;
    private String url;
    private List<TopicConfiguration> topics;

    public List<TopicConfiguration> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicConfiguration> topics) {
        this.topics = topics;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
