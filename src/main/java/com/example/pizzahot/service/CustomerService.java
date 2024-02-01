package com.example.pizzahot.service;

import com.example.pizzahot.entity.Customer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public interface CustomerService {


    List<Customer> getAllCustomers();


    void createCustomer(Customer customer);

    void updateCustomer(Long customerId, Customer updatedCustomer);

    void deleteCustomer(Long customerId);

    Optional<Customer> getCustomerById(Long customerId);

    /**
     * @param customerId
     * @return
     */
    Customer findCustomerById(Long customerId);
}
