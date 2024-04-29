package com.omaryusufonalan.duelappbackend.dto.request;

import com.omaryusufonalan.duelappbackend.dto.only.OnlyUserDTO;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeckRequest {
    @NotBlank(message = "Deck name cannot be blank!")
    private String name;

    private OnlyUserDTO user;
}
