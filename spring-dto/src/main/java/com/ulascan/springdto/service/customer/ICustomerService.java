package com.ulascan.springdto.service.customer;

import com.ulascan.springdto.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    List<CustomerDTO> getAllCustomers();
    void addCustomer(CustomerDTO customerDTO);
}
