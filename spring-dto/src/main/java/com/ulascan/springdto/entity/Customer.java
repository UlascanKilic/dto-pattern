package com.ulascan.springdto.entity;

import com.ulascan.springdto.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;

    private Integer age;

    private Gender gender;

    @OneToMany(mappedBy = "customer", orphanRemoval = true)
    private Set<RoleEntity> roles = new LinkedHashSet<>();

}
