package com.carrer_prep.spring_ramp_up.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class ConfigProperties {
    private int port;
}
