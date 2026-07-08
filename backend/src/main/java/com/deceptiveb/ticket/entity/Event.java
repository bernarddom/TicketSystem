package com.deceptiveb.ticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Event {

    @Id
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Venue venue;
}
