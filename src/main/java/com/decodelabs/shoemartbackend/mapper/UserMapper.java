package com.decodelabs.shoemartbackend.mapper;

import com.decodelabs.shoemartbackend.model.dto.UserDTO;
import com.decodelabs.shoemartbackend.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDto(User user);

    User toEntity(UserDTO userDTO);
}

