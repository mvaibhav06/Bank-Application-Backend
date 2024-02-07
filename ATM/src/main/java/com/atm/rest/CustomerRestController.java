package com.atm.rest;

import com.atm.entity.Customer;
import com.atm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {

    @Autowired
    public CustomerService customerService;

    @GetMapping
    public List<Customer> findAll(){
       return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable int id){
        return customerService.findById(id);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        customer.setId(0);
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id){
        customerService.deleteById(id);
        return "Customer deleted successfully";
    }
}
