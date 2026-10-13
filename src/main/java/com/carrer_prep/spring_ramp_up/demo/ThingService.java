package com.carrer_prep.spring_ramp_up.demo;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ThingService {

    private final Map<Long, Thing> store = new ConcurrentHashMap<>();
    private final AtomicLong idSequence = new AtomicLong();



}
