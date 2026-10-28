package com.carrer_prep.spring_ramp_up.services;

import com.carrer_prep.spring_ramp_up.dtos.Thing;
import com.carrer_prep.spring_ramp_up.exceptions.NotFoundException;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Primary
public class ThingServiceImpl implements ThingService {

    private final Map<Long, Thing> store = new ConcurrentHashMap<>();
    private final AtomicLong idSequence = new AtomicLong();

    public Thing create(Thing thing) {
        long id = idSequence.incrementAndGet();
        thing.setId(id);
        store.put(id, thing);
        return thing;
    }

    public Thing findById(Long id) {
        Thing thing = store.get(id);

        if(thing == null) {
            throw new NotFoundException("Resource not found");
        }

        return thing;
    }

}
