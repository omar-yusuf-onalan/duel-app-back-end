package com.omaryusufonalan.duelappbackend.entity;

import com.omaryusufonalan.duelappbackend.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Deck extends BaseEntity {
    @Column(nullable = false)
    private String name;
}
