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

    private String row;

    private Integer number;

    @OneToMany(mappedBy = "seat")
    private Set<EventSeat> eventSeats;

    public Seat() {
    }

    public Seat(String row, Integer number, Section section) {
        this.row = row;
        this.number = number;
        this.section = section;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<EventSeat> getEventSeats() {
        return eventSeats;
    }

    public void setEventSeats(Set<EventSeat> eventSeats) {
        this.eventSeats = eventSeats;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false)
    private Section section;
}
