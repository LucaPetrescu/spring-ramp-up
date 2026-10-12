package com.carrer_prep.spring_ramp_up.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class ThingsController {

    @GetMapping("/details/{id}")
    public Message details(@PathVariable long id) {
        return new Message(id, "Thing " + id);
    }

    @GetMapping("/details")
    public List<Message> details(@RequestParam(required = false) String text,
                                 @RequestParam(defaultValue = "10") int limit) {
        return Stream.of(new Message(1, text == null ? "Thing 1" : text),
                         new Message(2, "Thing 2")).limit(limit).toList();
    }

}
