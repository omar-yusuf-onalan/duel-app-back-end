package com.omaryusufonalan.duelappbackend.controller;

import com.omaryusufonalan.duelappbackend.dto.request.CardRequest;
import com.omaryusufonalan.duelappbackend.service.CardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.omaryusufonalan.duelappbackend.config.WebConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(cardService.getResponseById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody CardRequest cardRequest) {
        return new ResponseEntity<>(cardService.create(cardRequest), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @Valid @RequestBody CardRequest cardRequest) {
        return new ResponseEntity<>(cardService.update(id, cardRequest), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        cardService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
