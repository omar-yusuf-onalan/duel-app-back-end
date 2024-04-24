package com.omaryusufonalan.duelappbackend.repository;

import com.omaryusufonalan.duelappbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
