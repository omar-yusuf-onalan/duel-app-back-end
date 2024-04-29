package com.omaryusufonalan.duelappbackend.dto.request;

import com.omaryusufonalan.duelappbackend.dto.only.OnlyUserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeckRequest {
    private String name;

    private OnlyUserDTO user;
}
