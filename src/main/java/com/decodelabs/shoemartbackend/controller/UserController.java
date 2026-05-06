package com.decodelabs.shoemartbackend.controller;

import com.decodelabs.shoemartbackend.Service.UserService;
import com.decodelabs.shoemartbackend.model.dto.LoginRequestDTO;
import com.decodelabs.shoemartbackend.model.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody LoginRequestDTO loginRequestDTO) {
        UserDTO userDTO = userService.login(loginRequestDTO);
        if (userDTO != null) {
            return ResponseEntity.ok(userDTO);
        }
        return ResponseEntity.status(401).build();
    }

    @PostMapping("/admin-login")
    public ResponseEntity<UserDTO> adminLogin(@RequestBody LoginRequestDTO loginRequestDTO) {
        UserDTO userDTO = userService.adminLogin(loginRequestDTO);
        if (userDTO != null) {
            return ResponseEntity.ok(userDTO);
        }
        return ResponseEntity.status(401).build();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
