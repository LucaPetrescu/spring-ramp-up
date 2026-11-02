package com.carrer_prep.spring_ramp_up.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "things")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class Thing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 64)
    private String category;

    @Column(nullable = false)
    private boolean active;

    @Column(nullable = false)
    private int weight;

    public Thing(String name, String category, boolean active, int weight) {
        this.name = name;
        this.category = category;
        this.active = active;
        this.weight = weight;
    }
}
