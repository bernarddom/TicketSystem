package com.deceptiveb.ticket.repo;

import com.deceptiveb.ticket.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
