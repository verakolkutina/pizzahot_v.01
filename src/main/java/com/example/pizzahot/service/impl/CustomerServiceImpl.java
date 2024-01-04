package com.example.pizzahot.service.impl;

import com.example.pizzahot.entity.Customer;
import com.example.pizzahot.repository.CustomerRepository;
import com.example.pizzahot.service.CustomerService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }


    @Override
    public void updateCustomer(Long customerId, Customer updatedCustomer) {
        Customer existingCustomer = customerRepository.findById(customerId).orElse(null);
        if (existingCustomer != null) {
            // Обновляем поля клиента
            existingCustomer.setRole(updatedCustomer.getName());
            existingCustomer.setId(updatedCustomer.getEmail());

            customerRepository.save(existingCustomer);
        }

    }

    @Override
    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

@Override
    public Optional<Customer> getCustomerById(Long customerId) {
        // Используем CustomerRepository для поиска клиента по идентификатору
        return customerRepository.findById(customerId);
    }

    @Override
    public Customer findCustomerById(Long customerId) {
        return null;
    }


}