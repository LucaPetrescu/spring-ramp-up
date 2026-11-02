package com.carrer_prep.spring_ramp_up.controllers;

import com.carrer_prep.spring_ramp_up.config.ConfigProperties;
import com.carrer_prep.spring_ramp_up.dtos.ThingRequest;
import com.carrer_prep.spring_ramp_up.dtos.ThingResponse;
import com.carrer_prep.spring_ramp_up.services.ThingService;
import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("${app.things.base-path}")
public class ThingsController {

    private final ThingService thingService;
    private final ConfigProperties config;

    public ThingsController(ThingService thingService, ConfigProperties config) {
        this.thingService = thingService;
        this.config = config;
    }


    @PostMapping
    public ResponseEntity<ThingResponse> createThing(@Valid @RequestBody ThingRequest thingRequest) {
        ThingResponse createdThing = thingService.create(thingRequest);
        URI location = URI.create("/api/v1/things" + createdThing.id());
        return ResponseEntity.created(location).body(createdThing);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ThingResponse> getThing(@PathVariable Long id) {
        return ResponseEntity.ok(thingService.findById(id));
    }

    @GetMapping
    public ResponseEntity<ThingResponse>

}
