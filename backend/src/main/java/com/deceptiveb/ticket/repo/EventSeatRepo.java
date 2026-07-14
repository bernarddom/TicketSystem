package com.deceptiveb.ticket.repo;

import com.deceptiveb.ticket.entity.EventSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventSeatRepo extends JpaRepository<EventSeat, Integer> {
}
