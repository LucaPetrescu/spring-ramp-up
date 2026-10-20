package com.carrer_prep.spring_ramp_up.controllers;

import com.carrer_prep.spring_ramp_up.dtos.Thing;
import com.carrer_prep.spring_ramp_up.services.ThingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("${app.things.base-path}")
@RequiredArgsConstructor
public class ThingsController {

    @Autowired
    private final ThingService thingService;

    @PostMapping
    public ResponseEntity<Thing> createThing(@Valid @RequestBody Thing thing) {
        Thing createdThing = thingService.create(thing);
        URI location = URI.create("/api/v1/things" + createdThing.getId());
        return ResponseEntity.created(location).body(createdThing);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Thing> getThing(@PathVariable Long id) {
        return ResponseEntity.ok(thingService.findById(id));
    }

}
