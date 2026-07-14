package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table
@Entity
public class EventSeat {
    @Id
    @SequenceGenerator(
            name = "event_seat_id_sequence",
            sequenceName = "event_seat_id_sequence"
    )
    @GeneratedValue(
            generator = "evebt_seat_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    private SeatStatus seatStatus;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;

    private LocalDateTime holdExpiresAt;
}
