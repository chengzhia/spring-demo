package com.chengzhi.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ReadLocalProperties.class)
@ConditionalOnProperty()
public class ReadLocalPropertiesConfiguration {

}
