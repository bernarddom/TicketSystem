package com.deceptiveb.ticket.repo;

import com.deceptiveb.ticket.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Integer> {
}
