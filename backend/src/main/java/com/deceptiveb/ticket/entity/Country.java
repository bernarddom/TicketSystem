package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Country {

    @Id
    @SequenceGenerator(
            name = "country_id_sequence",
            sequenceName = "country_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "country_id_sequence"
    )
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "destination")
    private List<Destination> destinationList;
}
