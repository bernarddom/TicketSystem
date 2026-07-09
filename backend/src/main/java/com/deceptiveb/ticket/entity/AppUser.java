package com.deceptiveb.ticket.entity;

import jakarta.persistence.*;

import java.util.Set;

public class AppUser {
    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence"
    )
    @GeneratedValue(
            generator = "user_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;

    private String username;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private Set<Ticket> tickets;
}
