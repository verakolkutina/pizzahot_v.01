package com.example.pizzahot.service;

import com.example.pizzahot.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {


    List<Customer> getAllCustomers();


    void createCustomer(Customer customer);

    void updateCustomer(Long customerId, Customer updatedCustomer);

    void deleteCustomer(Long customerId);

    default Optional<Customer> getCustomerById(Long customerId) {
        // Реализация по умолчанию с использованием Optional.ofNullable
        return Optional.ofNullable(findCustomerById(customerId));
    }

    // Этот метод должен быть реализован в классе-реализации
    Customer findCustomerById(Long customerId);
}
