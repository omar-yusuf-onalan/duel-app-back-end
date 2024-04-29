package com.omaryusufonalan.duelappbackend.dto.request;

import com.omaryusufonalan.duelappbackend.dto.only.OnlyCardDTO;
import com.omaryusufonalan.duelappbackend.dto.only.OnlyUserDTO;
import com.omaryusufonalan.duelappbackend.entity.Card;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeckRequest {
    @NotBlank(message = "Deck name cannot be blank!")
    private String name;

    private OnlyUserDTO user;
    private List<OnlyCardDTO> mainDeck;
    private List<OnlyCardDTO> extraDeck;
    private List<OnlyCardDTO> sideDeck;
}
