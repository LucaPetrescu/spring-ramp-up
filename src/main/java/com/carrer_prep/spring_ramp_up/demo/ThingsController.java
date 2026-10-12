package com.carrer_prep.spring_ramp_up.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/things")
public class ThingsController {

    @PostMapping
    public Thing createThing(@RequestBody Thing thing) {

    }
}
