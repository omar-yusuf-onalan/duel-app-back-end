package com.omaryusufonalan.duelappbackend.mapper;

import com.omaryusufonalan.duelappbackend.core.base.BaseMapper;
import com.omaryusufonalan.duelappbackend.dto.request.CardRequest;
import com.omaryusufonalan.duelappbackend.dto.response.CardResponse;
import com.omaryusufonalan.duelappbackend.entity.Card;
import org.mapstruct.Mapper;

@Mapper
public interface CardMapper extends BaseMapper<Card, CardRequest, CardResponse> {
}
