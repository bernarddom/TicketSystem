package com.deceptiveb.ticket.repo;

import com.deceptiveb.ticket.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepo extends JpaRepository<Venue, Integer> {
}
