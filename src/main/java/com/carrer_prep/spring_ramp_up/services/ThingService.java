package com.carrer_prep.spring_ramp_up.services;

import com.carrer_prep.spring_ramp_up.dtos.Thing;
import org.springframework.stereotype.Service;

@Service
public interface ThingService {

    Thing create(Thing thing);
    Thing findById(Long id);

}
