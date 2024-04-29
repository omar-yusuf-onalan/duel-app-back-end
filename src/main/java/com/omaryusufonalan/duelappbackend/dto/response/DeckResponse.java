package com.omaryusufonalan.duelappbackend.dto.response;

import com.omaryusufonalan.duelappbackend.dto.only.OnlyCardDTO;
import com.omaryusufonalan.duelappbackend.dto.only.OnlyUserDTO;
import com.omaryusufonalan.duelappbackend.entity.Card;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeckResponse {
    private Long id;
    private String name;

    private OnlyUserDTO user;
    private List<OnlyCardDTO> mainDeck;
    private List<OnlyCardDTO> extraDeck;
    private List<OnlyCardDTO> sideDeck;
}
