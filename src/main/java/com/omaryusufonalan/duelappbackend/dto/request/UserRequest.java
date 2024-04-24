package com.omaryusufonalan.duelappbackend.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequest {
    @NotBlank(message = "Username cannot be blank!")
    private String username;

    @NotBlank(message = "Password cannot be blank!")
    private String password;
}