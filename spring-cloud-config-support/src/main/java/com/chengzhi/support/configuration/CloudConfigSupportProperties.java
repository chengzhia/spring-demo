package com.chengzhi.support.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(CloudConfigSupportProperties.CONFIG_PREFIX)
public class CloudConfigSupportProperties {

    public static final String CONFIG_PREFIX = "spring.cloud.config.backup";

    private boolean enable = false;

    private String file = "backup.properties";

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
