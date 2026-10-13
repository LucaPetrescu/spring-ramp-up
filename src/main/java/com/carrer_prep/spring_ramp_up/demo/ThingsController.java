package com.carrer_prep.spring_ramp_up.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/things")
@RequiredArgsConstructor
public class ThingsController {

    private final ThingService thingService;

    @PostMapping
    public Thing createThing(@RequestBody Thing thing) {
        Thing createdThing = thingService.create(thing);
        URI location = URI.create("/api/v1/things" + createdThing.getId());
        return ResponseEntity.created(location).body(createdThing).getBody();
    }
}
