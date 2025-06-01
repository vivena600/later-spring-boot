package org.example.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.example.enums.UserState;

import java.time.Instant;

@Builder
@Getter
@Setter
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private Instant registrationDate = Instant.now();
    private UserState state;
    private String email;
}
