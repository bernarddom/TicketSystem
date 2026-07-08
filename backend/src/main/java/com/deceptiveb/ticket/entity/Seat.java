package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

import java.util.Set;

@Table
@Entity
public class Seat {
    @Id
    @SequenceGenerator(
            name = "seat_id_sequence",
            sequenceName = "seat_id_sequence"
    )
    @GeneratedValue(
            generator = "seat_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    @OneToMany(mappedBy = "seat")
    private Set<EventSeat> eventSeats;
}
