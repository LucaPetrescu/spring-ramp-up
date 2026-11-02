package com.carrer_prep.spring_ramp_up.services;

import com.carrer_prep.spring_ramp_up.dtos.ThingRequest;
import com.carrer_prep.spring_ramp_up.dtos.ThingResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class FakeThingServiceImpl implements ThingService {

    private final Map<Long, ThingResponse> store = new ConcurrentHashMap<>();
    private final AtomicLong idSequence = new AtomicLong();

    @Override
    public ThingResponse create(ThingRequest request) {
        long id = idSequence.incrementAndGet();
        ThingResponse created = new ThingResponse(
                id, request.name(), request.category(), request.active(), request.weight());
        store.put(id, created);
        return created;
    }

    public ThingResponse findById(Long id) {
        ThingResponse thing = store.get(id);

        if(thing == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return thing;
    }
}
