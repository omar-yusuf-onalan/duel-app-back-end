package com.omaryusufonalan.duelappbackend.mapper;

import com.omaryusufonalan.duelappbackend.core.base.BaseMapper;
import com.omaryusufonalan.duelappbackend.dto.request.DeckRequest;
import com.omaryusufonalan.duelappbackend.dto.response.DeckResponse;
import com.omaryusufonalan.duelappbackend.entity.Deck;
import org.mapstruct.Mapper;

@Mapper
public interface DeckMapper extends BaseMapper<Deck, DeckRequest, DeckResponse> {
}
