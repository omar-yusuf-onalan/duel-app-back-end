package com.omaryusufonalan.duelappbackend.repository;

import com.omaryusufonalan.duelappbackend.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
