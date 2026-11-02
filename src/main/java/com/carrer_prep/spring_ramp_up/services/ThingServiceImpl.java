package com.carrer_prep.spring_ramp_up.services;

import com.carrer_prep.spring_ramp_up.dtos.ThingRequest;
import com.carrer_prep.spring_ramp_up.dtos.ThingResponse;
import com.carrer_prep.spring_ramp_up.entities.Thing;
import com.carrer_prep.spring_ramp_up.exceptions.NotFoundException;
import com.carrer_prep.spring_ramp_up.repositories.ThingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Primary
public class ThingServiceImpl implements ThingService {

    private final ThingRepository thingRepository;

    public ThingServiceImpl(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    @Override
    @Transactional
    public ThingResponse create(ThingRequest request) {
        Thing saved = thingRepository.save(new Thing(request.name(), request.category(), request.active(), request.weight()));
        return ThingResponse.from(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public ThingResponse findById(Long id) {
        return thingRepository.findById(id)
                .map(ThingResponse::from)
                .orElseThrow(() -> new NotFoundException("Thing " + id + " does not exist"));
    }
}
