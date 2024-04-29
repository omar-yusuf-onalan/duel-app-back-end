package com.omaryusufonalan.duelappbackend.entity;

import com.omaryusufonalan.duelappbackend.core.base.BaseEntity;
import com.omaryusufonalan.duelappbackend.core.enums.Attribute;
import com.omaryusufonalan.duelappbackend.core.enums.CardType;
import com.omaryusufonalan.duelappbackend.core.enums.Property;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Card extends BaseEntity {
    @Column(unique = true, nullable = false, updatable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private CardType cardType;

    private String description;

    private String effect;

    // Fields that only apply to Monsters
    private Attribute attribute;

    private String types;

    private int attack;

    private int defense;

    private int level;

    private int rank;

    // Fields that only apply to Spells and Traps
    private Property property;
}
