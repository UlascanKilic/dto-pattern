package com.ulascan.springdto.controller;

import com.ulascan.springdto.dto.CustomerDTO;
import com.ulascan.springdto.service.customer.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final ICustomerService customerService;

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers()
    {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @PostMapping
    public void saveCustomer(@RequestBody CustomerDTO customerDTO)
    {
        customerService.addCustomer(customerDTO);

    }

}
