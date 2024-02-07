package com.atm.service;

import com.atm.entity.Customer;

import java.util.List;

public interface CustomerService {

    Customer findById(int id);
    List<Customer> findAll();
    Customer save(Customer customer);
    void deleteById(int id);
}
