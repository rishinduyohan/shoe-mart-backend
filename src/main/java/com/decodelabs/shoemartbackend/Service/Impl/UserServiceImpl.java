package com.decodelabs.shoemartbackend.Service.Impl;

import com.decodelabs.shoemartbackend.Repository.UserRepository;
import com.decodelabs.shoemartbackend.Service.UserService;
import com.decodelabs.shoemartbackend.mapper.UserMapper;
import com.decodelabs.shoemartbackend.model.dto.LoginRequestDTO;
import com.decodelabs.shoemartbackend.model.dto.UserDTO;
import com.decodelabs.shoemartbackend.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        return userMapper.toDto(userRepository.save(user));
    }

    @Override
    public UserDTO login(LoginRequestDTO loginRequestDTO) {
        User user = userRepository.findByEmail(loginRequestDTO.getEmail());
        if (user != null && user.getPassword().equals(loginRequestDTO.getPassword())) {
            return userMapper.toDto(user);
        }
        return null;
    }

    @Override
    public UserDTO adminLogin(LoginRequestDTO loginRequestDTO) {
        User user = userRepository.findByEmail(loginRequestDTO.getEmail());
        if (user != null && user.getPassword().equals(loginRequestDTO.getPassword()) && "ADMIN".equals(user.getRole())) {
            return userMapper.toDto(user);
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
