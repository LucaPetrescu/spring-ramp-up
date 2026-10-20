package com.carrer_prep.spring_ramp_up.config;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app.things")
public record ConfigProperties(
    @NotBlank String basePath
) {}
