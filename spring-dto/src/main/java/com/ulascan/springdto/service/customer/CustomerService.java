package com.ulascan.springdto.service.customer;

import com.ulascan.springdto.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return null;
    }

}
