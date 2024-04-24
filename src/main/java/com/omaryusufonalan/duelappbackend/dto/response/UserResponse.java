package com.omaryusufonalan.duelappbackend.dto.response;

import com.omaryusufonalan.duelappbackend.core.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {
    private Long id;

    private String username;

    private Role role;

    private String profilePicture;
}
