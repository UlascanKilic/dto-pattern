package com.ulascan.springdto.repository;

import com.ulascan.springdto.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
