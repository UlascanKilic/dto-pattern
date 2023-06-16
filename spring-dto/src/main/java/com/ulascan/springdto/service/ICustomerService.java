package com.ulascan.springdto.service;

import com.ulascan.springdto.dto.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    List<CustomerDTO> getAllCustomers();
}
