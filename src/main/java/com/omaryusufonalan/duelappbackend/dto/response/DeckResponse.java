package com.omaryusufonalan.duelappbackend.dto.response;

import com.omaryusufonalan.duelappbackend.dto.only.OnlyUserDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeckResponse {
    private Long id;

    private String name;

    private OnlyUserDTO user;
}
