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

    private String Label;

    @OneToMany(mappedBy = "seat")
    private Set<EventSeat> eventSeats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
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
