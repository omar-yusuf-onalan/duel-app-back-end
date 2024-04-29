package com.omaryusufonalan.duelappbackend.mapper;

import com.omaryusufonalan.duelappbackend.core.base.BaseMapper;
import com.omaryusufonalan.duelappbackend.dto.request.UserRequest;
import com.omaryusufonalan.duelappbackend.dto.response.UserResponse;
import com.omaryusufonalan.duelappbackend.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User, UserRequest, UserResponse> {
}
