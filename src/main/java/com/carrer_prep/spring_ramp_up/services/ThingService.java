package com.carrer_prep.spring_ramp_up.services;

import com.carrer_prep.spring_ramp_up.dtos.ThingRequest;
import com.carrer_prep.spring_ramp_up.dtos.ThingResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ThingService {

    ThingResponse create(ThingRequest request);
    ThingResponse findById(Long id);
    List<ThingResponse> findAll(String category);

}
