package com.example.Banking.System.repository;

import com.example.Banking.System.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {

    List<Customers> findByAccNumber(long accNumber);

    List<Customers> findByAccName(String accName);
//    @Query("select c from Customers c where c.accName=:n")
//    List<Customers> findCustomersByAccName(@Param("n") String accName);
//
//    @Query(value = "select * from Customers where acc_Name=:n", nativeQuery=true)
//    List<Customers> findCustByAccName(@Param("n") String accName);
}
