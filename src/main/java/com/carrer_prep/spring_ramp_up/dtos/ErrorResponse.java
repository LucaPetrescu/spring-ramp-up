package com.carrer_prep.spring_ramp_up.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
public class ErrorResponse {
    private String errorCode;
    private String message;
    private int status;
    private Instant timestamp;
    private String path;
}
