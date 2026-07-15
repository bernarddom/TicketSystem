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

    private String name;

    @OneToMany(mappedBy = "venue")
    private Set<Event> events;

    @OneToMany(mappedBy = "venue")
    private Set<Section> sections;

    public Venue() {
    }

    public Venue(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public Set<Section> getSections() {
        return sections;
    }

    public void setSections(Set<Section> sections) {
        this.sections = sections;
    }
}
