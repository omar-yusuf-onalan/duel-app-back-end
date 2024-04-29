package com.omaryusufonalan.duelappbackend.service;

import com.omaryusufonalan.duelappbackend.core.base.BaseService;
import com.omaryusufonalan.duelappbackend.dto.request.CardRequest;
import com.omaryusufonalan.duelappbackend.dto.response.CardResponse;
import com.omaryusufonalan.duelappbackend.entity.Card;
import com.omaryusufonalan.duelappbackend.mapper.CardMapper;
import com.omaryusufonalan.duelappbackend.repository.CardRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService implements BaseService<Card, CardRequest, CardResponse> {
    private final CardRepository cardRepository;
    private final CardMapper cardMapper;

    @Override
    public Card getById(Long id) {
        return cardRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Card with ID " + id + " not found"));
    }

    @Override
    public CardResponse getResponseById(Long id) {
        return cardMapper.entityToResponse(getById(id));
    }

    @Override
    public CardResponse create(CardRequest cardRequest) {
        Card cardToBeCreated = cardMapper.requestToEntity(cardRequest);

        return cardMapper.entityToResponse(cardRepository.save(cardToBeCreated));
    }

    @Override
    public CardResponse update(Long id, CardRequest cardRequest) {
        Card cardToBeUpdated = getById(id);

        cardMapper.update(cardToBeUpdated, cardRequest);

        return cardMapper.entityToResponse(cardRepository.save(cardToBeUpdated));
    }

    @Override
    public void delete(Long id) {
        cardRepository.delete(getById(id));
    }
}
