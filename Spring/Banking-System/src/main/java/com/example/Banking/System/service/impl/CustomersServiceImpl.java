package com.example.Banking.System.service.impl;

import com.example.Banking.System.dto.CustomersResponseDTO;
import com.example.Banking.System.entity.Customers;
import com.example.Banking.System.repository.CustomersRepository;
import com.example.Banking.System.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomersServiceImpl implements CustomersService {

    @Autowired
    CustomersRepository customerRepository;

    public CustomersServiceImpl(){

    }

    @Override
    public CustomersResponseDTO findById(long id) {
        Optional<Customers> customer=customerRepository.findById(id);
        return maptoDto(customer.get());
    }

    @Override
    public CustomersResponseDTO saveCustomer(Customers customer) {
        Customers savedCustomer=customerRepository.save(customer);
        return maptoDto(savedCustomer);
    }

    @Override
    public CustomersResponseDTO updateCustomer(Customers customer) {
        Customers updatedCustomer=customerRepository.save(customer);
        return maptoDto(updatedCustomer);
    }

    @Override
    public void deleteCustomer(Customers customer) {
        customerRepository.delete(customer);
    }

    @Override
    public List<CustomersResponseDTO > getAllCustomers() {
        List <Customers> customers=customerRepository.findAll();
        List<CustomersResponseDTO> customerList=new ArrayList<>();
        for(Customers customer:customers){
            customerList.add(maptoDto(customer));
        }
        return customerList;
    }

    @Override
    public List<CustomersResponseDTO> getAllCustomersByAccNumber(long accNumber) {
        List<Customers> customers=customerRepository.findByAccNumber(accNumber);
        List<CustomersResponseDTO> customerList=new ArrayList<>();
        for(Customers customer:customers){
            customerList.add(maptoDto(customer));
        }
        return customerList;
    }

//    @Override
//    public List<CustomersResponseDTO> getAllCustomersByName(String name) {
//        List<Customers> customers=customerRepository.findCustomersByAccName(name);
//        List<CustomersResponseDTO> customerList=new ArrayList<>();
//        for(Customers customer:customers){
//            customerList.add(maptoDto(customer));
//        }
//        return customerList;
//    }

    @Override
    public List <CustomersResponseDTO> getAllCustomersByAccNames(String accName){
        List <Customers> customers=customerRepository.findByAccName(accName);
        List<CustomersResponseDTO> customerList=new ArrayList<>();
        for (Customers customer:customers){
            customerList.add(maptoDto(customer));
        }
        return customerList;
    }

    private CustomersResponseDTO maptoDto(Customers customers) {
        CustomersResponseDTO dto=new CustomersResponseDTO();

        dto.setId(customers.getId());
        dto.setAccNumber(customers.getAccNumber());
        dto.setAccName(customers.getAccName());
        dto.setAccBranch(customers.getAccBranch());

        return dto;
    }
}
