package com.ulascan.springdto.service.role;

import com.ulascan.springdto.entity.RoleEntity;
import com.ulascan.springdto.enums.Role;
import com.ulascan.springdto.repository.IRoleRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService implements IRoleService{

    private final IRoleRepository roleRepository;

    @PostConstruct
    public void postConstruct()
    {
        for (Role role: Role.values()
             ) {
            roleRepository.save(RoleEntity.builder()
                    .role(role)
                    .build());
        }
    }
}
