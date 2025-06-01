package org.example.mapper;

import lombok.experimental.UtilityClass;
import org.example.dto.UserDto;
import org.example.model.User;

@UtilityClass
public class UserMapper {

    public UserDto toUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .registrationDate(user.getRegistrationDate())
                .state(user.getState())
                .build();
    }

    public User toUser(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .registrationDate(userDto.getRegistrationDate())
                .state(userDto.getState())
                .build();
    }

}
