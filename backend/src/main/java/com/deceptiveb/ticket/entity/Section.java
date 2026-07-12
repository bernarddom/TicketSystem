package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

import java.util.Set;

public class Section {
    @Id
    @SequenceGenerator(
            name = "section_id_sequence",
            sequenceName = "section_id_sequence"
    )
    @GeneratedValue(
            generator = "section_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    @OneToMany(mappedBy="section")
    private Set<Seat> seats;
}
