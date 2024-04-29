package com.omaryusufonalan.duelappbackend.service;

import com.omaryusufonalan.duelappbackend.core.base.BaseService;
import com.omaryusufonalan.duelappbackend.dto.request.DeckRequest;
import com.omaryusufonalan.duelappbackend.dto.response.DeckResponse;
import com.omaryusufonalan.duelappbackend.entity.Deck;
import com.omaryusufonalan.duelappbackend.mapper.DeckMapper;
import com.omaryusufonalan.duelappbackend.repository.DeckRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeckService implements BaseService<Deck, DeckRequest, DeckResponse> {
    private final DeckRepository deckRepository;
    private final DeckMapper deckMapper;
    
    @Override
    public Deck getById(Long id) {
        return deckRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Deck with ID " + id + " not found"));
    }

    @Override
    public DeckResponse getResponseById(Long id) {
        return deckMapper.entityToResponse(getById(id));
    }

    @Override
    public DeckResponse create(DeckRequest deckRequest) {
        Deck deckToBeCreated = deckMapper.requestToEntity(deckRequest);

        return deckMapper.entityToResponse(deckRepository.save(deckToBeCreated));
    }

    @Override
    public DeckResponse update(Long id, DeckRequest deckRequest) {
        Deck deckToBeUpdated = getById(id);

        deckMapper.update(deckToBeUpdated, deckRequest);

        return deckMapper.entityToResponse(deckRepository.save(deckToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        deckRepository.delete(getById(id));
    }
}
