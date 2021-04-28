package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;

import javax.inject.Inject;
import java.util.List;

@ConfigurationProperties(HermesManagementSettings.PREFIX)
public class HermesManagementConfiguration {

    private Boolean enabled;
    private String url;
    private List<TopicConfiguration> topics;

    public List<TopicConfiguration> getTopics() {
        return topics;
    }

    @Inject
    public void setTopics(List<TopicConfiguration> topics) {
        this.topics = topics;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
