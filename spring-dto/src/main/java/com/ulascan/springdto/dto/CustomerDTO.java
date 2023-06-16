package com.ulascan.springdto.dto;

import com.ulascan.springdto.enums.Gender;
import com.ulascan.springdto.enums.Role;

import java.util.List;

public record CustomerDTO(
        Integer id,
        String name,
        String email,
        Gender gender,
        Integer age,
        List<Role> roles,
        String userName
) {
}
