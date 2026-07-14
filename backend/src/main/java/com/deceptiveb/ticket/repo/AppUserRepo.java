package com.deceptiveb.ticket.repo;

import com.deceptiveb.ticket.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser, Integer> {
}
