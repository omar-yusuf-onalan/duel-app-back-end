package com.omaryusufonalan.duelappbackend.dto.response;

import com.omaryusufonalan.duelappbackend.core.enums.Attribute;
import com.omaryusufonalan.duelappbackend.core.enums.CardType;
import com.omaryusufonalan.duelappbackend.core.enums.Property;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardResponse {
    private Long id;

    private String name;

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
