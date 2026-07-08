package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Venue {

    @Id
    @SequenceGenerator(
            name = "venue_id_sequence",
            sequenceName = "brand_id_sequence"
    )
    @GeneratedValue(
            generator = "brand_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    @OneToMany(mappedBy = "venue")
    private Set<Event> events;
}
