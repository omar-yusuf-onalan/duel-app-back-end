package com.omaryusufonalan.duelappbackend.controller;

import com.omaryusufonalan.duelappbackend.dto.request.DeckRequest;
import com.omaryusufonalan.duelappbackend.service.DeckService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.omaryusufonalan.duelappbackend.config.WebConfig.BASE_URL;

@RestController
@RequestMapping(BASE_URL + "decks")
@RequiredArgsConstructor
public class DeckController {
    private final DeckService deckService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(deckService.getResponseById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody DeckRequest deckRequest) {
        return new ResponseEntity<>(deckService.create(deckRequest), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @Valid @RequestBody DeckRequest deckRequest) {
        return new ResponseEntity<>(deckService.update(id, deckRequest), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        deckService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
