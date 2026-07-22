package com.deceptiveb.ticket.repo;

import com.deceptiveb.ticket.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepo extends JpaRepository<Seat, Integer> {
    List<Seat> findAllBySectionVenueId(Integer venueId);
}
