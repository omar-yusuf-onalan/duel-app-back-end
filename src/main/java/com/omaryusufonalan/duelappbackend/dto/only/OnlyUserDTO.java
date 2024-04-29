package com.omaryusufonalan.duelappbackend.dto.only;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OnlyUserDTO {
    @Positive(message = "ID must be positive!")
    private Long id;

    @NotBlank(message = "Username cannot be blank!")
    private String username;

    @NotBlank(message = "Profile Picture cannot be blank?")
    private String profilePicture;
}
