package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

@Table
@Entity
public class Destination {

    @Id
    @SequenceGenerator(
            name = "destination_id_sequence",
            sequenceName = "destination_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "destination_id_sequence"
    )
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    public Destination() {
    }

    public Destination(String name, Country country) {
        this.name = name;
        this.country = country;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
