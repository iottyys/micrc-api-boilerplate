package io.ttyys.core.support.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "ttyys.springboot")
public class SpringBootConfigurationProperties {
    private int test;
}
