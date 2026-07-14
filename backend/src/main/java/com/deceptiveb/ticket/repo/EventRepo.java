package com.deceptiveb.ticket.repo;

import com.deceptiveb.ticket.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo  extends JpaRepository<Event, Integer> {
}
