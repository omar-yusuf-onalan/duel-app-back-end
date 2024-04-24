package com.omaryusufonalan.duelappbackend.service;

import com.omaryusufonalan.duelappbackend.core.enums.Role;
import com.omaryusufonalan.duelappbackend.dto.request.AuthenticationRequest;
import com.omaryusufonalan.duelappbackend.dto.request.UserRequest;
import com.omaryusufonalan.duelappbackend.dto.response.AuthenticationResponse;
import com.omaryusufonalan.duelappbackend.entity.User;
import com.omaryusufonalan.duelappbackend.mapper.UserMapper;
import com.omaryusufonalan.duelappbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(UserRequest userRequest) {
        User userToBeRegistered = userMapper.requestToEntity(userRequest);

        userToBeRegistered.setRole(Role.PLAYER);
        userToBeRegistered.setPassword(passwordEncoder.encode(userToBeRegistered.getPassword()));

        User copyFromDb = userRepository.save(userToBeRegistered);

        return new AuthenticationResponse(jwtService.generateToken(userToBeRegistered));
    }

    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getUsername(),
                        authenticationRequest.getPassword()
                )
        );

        User userToBeRetrieved = userRepository.findByUsername(authenticationRequest.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        return new AuthenticationResponse(jwtService.generateToken(userToBeRetrieved));
    }
}
