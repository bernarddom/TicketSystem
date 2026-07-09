package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

public class Ticket {
    @Id
    @SequenceGenerator(
            name = "ticket_id_sequence",
            sequenceName = "ticket_id_sequence"
    )
    @GeneratedValue(
            generator = "ticket_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "event_seat_id", nullable = false)
    private EventSeat eventSeat;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser user;
}
