package com.ulascan.springdto.dto;

import com.ulascan.springdto.enums.Gender;
import com.ulascan.springdto.enums.Role;

import java.util.Set;

public record CustomerDTO(
        String name,
        String email,
        Gender gender,
        Integer age,
        Set<Role> roles,
        String userName
) {
}
