package com.carrer_prep.spring_ramp_up.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record ThingRequest(
        @NotBlank(message = "must not be blank")
        @Size(min = 5, max = 20, message = "must be between 5 and 20 characters")
        String name,

        @NotBlank(message = "must not be blank")
        @Size(max = 64, message = "must be at most 64 characters")
        String category,

        @NotNull(message = "must be present")
        Boolean active,

        @NotNull(message = "must be present")
        @Positive(message = "must be greater than 0")
        Integer weight
) {

}
