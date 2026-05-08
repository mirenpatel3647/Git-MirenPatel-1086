package com.example.Banking.System.service;

import com.example.Banking.System.dto.CustomersResponseDTO;
import com.example.Banking.System.entity.Customers;

import java.util.List;

public interface CustomersService {
    CustomersResponseDTO findById(long id);
//    CustomersResponseDTO findByAccNumber(String accNumber);
    CustomersResponseDTO saveCustomer(Customers customer);

    CustomersResponseDTO updateCustomer(Customers customer);

    void deleteCustomer(Customers customer);

    List<CustomersResponseDTO> getAllCustomers();

    List<CustomersResponseDTO> getAllCustomersByAccNumber(long accNumber);

    List <CustomersResponseDTO> getAllCustomersByAccNames(String accName);
//    List <CustomersResponseDTO> getAllCustomersByName(String name);

}
