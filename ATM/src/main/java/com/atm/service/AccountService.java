package com.atm.service;

import com.atm.entity.Account;
import com.atm.entity.Customer;

import java.util.List;

public interface AccountService {

    Account save(Account account);
    Account findById(int id);
    List<Account> findAll();
    void deleteById(int id);
    List<Account> findByCustomer(Customer customer);
}
