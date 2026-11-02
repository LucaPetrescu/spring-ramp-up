package com.carrer_prep.spring_ramp_up.dtos;

import com.carrer_prep.spring_ramp_up.entities.Thing;

public record ThingResponse(
        Long id,
        String name,
        String category,
        boolean active,
        int weight
) {
    public static ThingResponse from(Thing thing) {
        return new ThingResponse(thing.getId(), thing.getName(), thing.getCategory(), thing.isActive(), thing.getWeight());
    }
}