package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Event {

    @Id
    @SequenceGenerator(
            name = "event_id_sequence",
            sequenceName = "event_id_sequence"
    )
    @GeneratedValue(
            generator = "event_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Venue venue;

    @OneToMany
    private Set<EventSeat> eventSeats;
}
