package com.omaryusufonalan.duelappbackend.entity;

import com.omaryusufonalan.duelappbackend.core.base.BaseEntity;
import com.omaryusufonalan.duelappbackend.core.enums.Attribute;
import com.omaryusufonalan.duelappbackend.core.enums.CardType;
import com.omaryusufonalan.duelappbackend.core.enums.Property;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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
    @Enumerated(EnumType.STRING)
    private Attribute attribute;

    private String types;

    private int attack;

    private int defense;

    private int level;

    private int rank;

    // Fields that only apply to Spells and Traps
    @Enumerated(EnumType.STRING)
    private Property property;

    @ManyToMany(mappedBy = "mainDeck")
    private List<Deck> mainDecks;

    @ManyToMany(mappedBy = "extraDeck")
    private List<Deck> extraDecks;

    @ManyToMany(mappedBy = "sideDeck")
    private List<Deck> sideDecks;
}
