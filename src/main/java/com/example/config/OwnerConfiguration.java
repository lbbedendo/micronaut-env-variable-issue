package com.example.config;

import io.micronaut.context.annotation.ConfigurationProperties;

import javax.validation.constraints.NotEmpty;

@ConfigurationProperties(HermesManagementSettings.OWNER)
public class OwnerConfiguration {
    @NotEmpty
    private String source;
    @NotEmpty
    private String id;

    public OwnerConfiguration(@NotEmpty String source, @NotEmpty String id) {
        this.source = source;
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
