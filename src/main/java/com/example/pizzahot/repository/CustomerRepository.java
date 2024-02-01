package com.example.pizzahot.repository;

import com.example.pizzahot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Поиск клиентов по имени

    default List<Customer> findByUsername(String username) {
        return null;
    }


}
