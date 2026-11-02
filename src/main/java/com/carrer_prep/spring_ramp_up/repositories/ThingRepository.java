package com.carrer_prep.spring_ramp_up.repositories;

import com.carrer_prep.spring_ramp_up.entities.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepository extends JpaRepository<Thing, Long> {

}
