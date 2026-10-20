package com.carrer_prep.spring_ramp_up;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringRampUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRampUpApplication.class, args);
	}

}
