package com.carrer_prep.spring_ramp_up.dtos;

import lombok.Data;

@Data
public class Thing {
    private Long id;
    private String name;
    private String category;
    private boolean active;
}
