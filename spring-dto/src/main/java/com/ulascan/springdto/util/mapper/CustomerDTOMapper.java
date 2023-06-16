package com.ulascan.springdto.util.mapper;

import com.ulascan.springdto.dto.CustomerDTO;
import com.ulascan.springdto.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CustomerDTOMapper implements Function<Customer, CustomerDTO> {
    @Override
    public CustomerDTO apply(Customer customer) {
        return new CustomerDTO(
                customer.getFirstName(),
                customer.getEmail(),
                customer.getGender(),
                customer.getAge(),
                customer.getRoles(),
                customer.getUserName());
    }
}
