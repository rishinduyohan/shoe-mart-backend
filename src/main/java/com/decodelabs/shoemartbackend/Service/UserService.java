package com.decodelabs.shoemartbackend.Service;

import com.decodelabs.shoemartbackend.model.dto.LoginRequestDTO;
import com.decodelabs.shoemartbackend.model.dto.UserDTO;
import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO saveUser(UserDTO userDTO);
    UserDTO login(LoginRequestDTO loginRequestDTO);
    UserDTO adminLogin(LoginRequestDTO loginRequestDTO);
    void deleteUser(Long id);
}
