package com.example.spring.batch.demo.repository;

import com.example.spring.batch.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
