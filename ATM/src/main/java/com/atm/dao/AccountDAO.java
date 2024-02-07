package com.atm.dao;

import com.atm.entity.Account;
import com.atm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDAO extends JpaRepository<Account, Integer> {

    List<Account> findByCustomer(Customer customer);
}
