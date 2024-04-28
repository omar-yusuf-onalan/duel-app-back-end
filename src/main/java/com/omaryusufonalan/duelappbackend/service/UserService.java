package com.omaryusufonalan.duelappbackend.service;

import com.omaryusufonalan.duelappbackend.dto.request.UserRequest;
import com.omaryusufonalan.duelappbackend.dto.response.UserResponse;
import com.omaryusufonalan.duelappbackend.entity.User;
import com.omaryusufonalan.duelappbackend.mapper.UserMapper;
import com.omaryusufonalan.duelappbackend.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User with ID " + id + " not found"));
    }

    public UserResponse getResponseById(Long id) {
        return userMapper.entityToResponse(getById(id));
    }

    // create functionality is present in AuthenticationService

    public UserResponse update(Long id, UserRequest userRequest) {
        User userToBeUpdated = getById(id);

        userMapper.update(userToBeUpdated, userRequest);

        return userMapper.entityToResponse(userRepository.save(userToBeUpdated));
    }

    public void delete(Long id) {
        userRepository.delete(getById(id));
    }
}
