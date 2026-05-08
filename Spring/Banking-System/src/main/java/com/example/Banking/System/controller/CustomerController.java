package com.example.Banking.System.controller;

import com.example.Banking.System.dto.CustomersResponseDTO;
import com.example.Banking.System.entity.Customers;
import com.example.Banking.System.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/customers")
public class CustomerController {
    @Autowired
    CustomersService customerService;

    @GetMapping("/list")
    public ResponseEntity<List<CustomersResponseDTO>>getAllCustomers(){
        try{
            return ResponseEntity.ok(this.customerService.getAllCustomers());
        }
        catch (Exception var2){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<CustomersResponseDTO> getCustomerById(@PathVariable("id") Long id){
        try{
            return ResponseEntity.ok(this.customerService.findById(id));
        }
        catch (Exception var3){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping({"/"})
    public ResponseEntity<CustomersResponseDTO> saveCustomer(@RequestBody Customers customer){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(this.customerService.saveCustomer(customer));
        }
        catch (Exception var3){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping({"/"})
    public ResponseEntity<CustomersResponseDTO> updateCustomer(@RequestBody Customers customer){
        try{
            return ResponseEntity.ok(this.customerService.updateCustomer(customer));
        }
        catch(Exception var3){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping({"/"})
    public ResponseEntity<Void> deleteCustomer(@RequestBody Customers customer){
        try{
            this.customerService.deleteCustomer(customer);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        catch (Exception var3){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

//    @GetMapping({"/byName"})
//    public ResponseEntity<List<CustomersResponseDTO>> getCustomeresByName(@RequestParam(name="name") long number){
//        try {
//            return ResponseEntity.ok(this.customerService.getAllCustomersByAccNumber(number));
//        } catch (Exception var3) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
    @GetMapping("/byAccNumber")
    public ResponseEntity<List<CustomersResponseDTO>> getAllCustomersByAccNumber(@RequestParam(name="number") long number){
        try{
            return ResponseEntity.ok(this.customerService.getAllCustomersByAccNumber(number));
        }
        catch (Exception var3){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

//    @GetMapping("/naming/byAccName")
//    public ResponseEntity<List<CustomersResponseDTO>> getAllCustomersByAccName(@RequestParam(name="name") String name1){
//        try{
//            return ResponseEntity.ok(this.customerService.getAllCustomersByName(name1));
//        }
//        catch(Exception var3){
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }

    @GetMapping("/byAccName")
    public ResponseEntity<List<CustomersResponseDTO>> getAllCustomersByAccName(@RequestParam(name="name1") String name1){
        try{
            return ResponseEntity.ok(this.customerService.getAllCustomersByAccNames(name1));
        }
        catch (Exception var3){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
