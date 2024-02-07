package com.atm.service;

import com.atm.dao.CustomerDAO;
import com.atm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public Customer findById(int id) {
        return customerDAO.findById(id).orElseThrow(() -> new RuntimeException("Customer with id: " + id + " not found"));
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public void deleteById(int id) {
        customerDAO.deleteById(id);
    }
}
