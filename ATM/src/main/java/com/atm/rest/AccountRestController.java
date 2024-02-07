package com.atm.rest;

import com.atm.entity.Account;
import com.atm.entity.Customer;
import com.atm.service.AccountService;
import com.atm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountRestController {

    private AccountService accountService;
    private CustomerService customerService;

    @Autowired
    public AccountRestController(AccountService accountService, CustomerService customerService) {
        this.accountService = accountService;
        this.customerService = customerService;
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account){
        return accountService.save(account);
    }

    @GetMapping
    public List<Account> findAll(){
        return accountService.findAll();
    }

    @GetMapping("/customer/{id}")
    public List<Account> findByCustomer(@PathVariable int id){
        Customer customer = customerService.findById(id);
        return accountService.findByCustomer(customer);
    }
}
