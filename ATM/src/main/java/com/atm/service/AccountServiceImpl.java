package com.atm.service;

import com.atm.dao.AccountDAO;
import com.atm.entity.Account;
import com.atm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    private AccountDAO accountDAO;

    @Autowired
    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account save(Account account) {
        return accountDAO.save(account);
    }

    @Override
    public Account findById(int id) {
        return accountDAO.findById(id).orElseThrow(() -> new RuntimeException("Account with id not found" + id));
    }

    @Override
    public List<Account> findAll() {
        return accountDAO.findAll();
    }

    @Override
    public void deleteById(int id) {
        accountDAO.deleteById(id);
    }

    @Override
    public List<Account> findByCustomer(Customer customer) {
        return accountDAO.findByCustomer(customer);
    }
}
