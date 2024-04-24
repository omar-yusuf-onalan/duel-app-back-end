package com.omaryusufonalan.duelappbackend.controller;

import com.omaryusufonalan.duelappbackend.dto.request.AuthenticationRequest;
import com.omaryusufonalan.duelappbackend.dto.request.UserRequest;
import com.omaryusufonalan.duelappbackend.dto.response.AuthenticationResponse;
import com.omaryusufonalan.duelappbackend.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.omaryusufonalan.duelappbackend.config.WebConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@Valid @RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(authenticationService.register(userRequest));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@Valid @RequestBody AuthenticationRequest authenticationRequest) {
        return ResponseEntity.ok(authenticationService.authenticate(authenticationRequest));
    }
}
