package com.deceptiveb.ticket.repo;

import com.deceptiveb.ticket.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepo extends JpaRepository<Seat, Integer> {
}
