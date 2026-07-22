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

    private SeatStatus seatStatus = SeatStatus.FREE;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;

    private LocalDateTime holdExpiresAt;

    public EventSeat() {
    }

    public EventSeat(Seat seat, Event event) {
        this.seat = seat;
        this.event = event;
    }

    public EventSeat(SeatStatus seatStatus, Event event, Seat seat) {
        this.seatStatus = seatStatus;
        this.event = event;
        this.seat = seat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public LocalDateTime getHoldExpiresAt() {
        return holdExpiresAt;
    }

    public void setHoldExpiresAt(LocalDateTime holdExpiresAt) {
        this.holdExpiresAt = holdExpiresAt;
    }
}
