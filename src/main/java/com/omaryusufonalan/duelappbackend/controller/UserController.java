package com.omaryusufonalan.duelappbackend.controller;

import com.omaryusufonalan.duelappbackend.dto.request.UserRequest;
import com.omaryusufonalan.duelappbackend.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.omaryusufonalan.duelappbackend.config.WebConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(userService.getResponseById(id), HttpStatus.OK);
    }

    // Create functionality is present in AuthenticationController

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @Valid @RequestBody UserRequest userRequest) {
        return new ResponseEntity<>(userService.update(id, userRequest), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
