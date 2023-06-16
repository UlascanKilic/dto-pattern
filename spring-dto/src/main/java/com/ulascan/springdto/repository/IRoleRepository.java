package com.ulascan.springdto.repository;

import com.ulascan.springdto.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity, Integer> {
}
