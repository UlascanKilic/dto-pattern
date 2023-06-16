package com.ulascan.springdto.service.customer;

import com.ulascan.springdto.dto.CustomerDTO;
import com.ulascan.springdto.entity.Customer;
import com.ulascan.springdto.entity.RoleEntity;
import com.ulascan.springdto.repository.ICustomerRepository;
import com.ulascan.springdto.util.mapper.CustomerDTOMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService{

    private final ICustomerRepository customerRepository;
    private final CustomerDTOMapper customerDTOMapper;

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customerDTOMapper).collect(Collectors.toList());
    }

    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        String username = customerDTO.userName();

        if(customerRepository.existsByUserName(username)){
            /*throw new DuplicateResourceException(
                    "Username already taken"
            );*/
        }

        customerRepository.save(
                Customer.builder()
                        .firstName(customerDTO.name())
                        .lastName("RandomLastName")
                        .age(customerDTO.age())
                        .email(customerDTO.email())
                        .gender(customerDTO.gender())
                        .password(UUID.randomUUID().toString())
                        .roles(customerDTO.roles())
                        .userName(customerDTO.userName())
                        .build()
        );
    }

}
