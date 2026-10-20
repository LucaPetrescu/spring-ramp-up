package com.carrer_prep.spring_ramp_up.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Thing {
    @NotBlank
    Long id;
    @NotBlank
    @Size(min = 5, max = 20)
    private String name;
    @NotBlank
    private String category;
    @NotBlank
    private boolean active;
    @Positive
    private int weight;
}
