package com.carrer_prep.spring_ramp_up.services;

import com.carrer_prep.spring_ramp_up.dtos.ThingRequest;
import com.carrer_prep.spring_ramp_up.dtos.ThingResponse;
import org.springframework.stereotype.Service;

@Service
public interface ThingService {

    ThingResponse create(ThingRequest request);
    ThingResponse findById(Long id);

}
