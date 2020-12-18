package com.karpen.hibernate.controller;

import com.karpen.hibernate.model.Account;
import com.karpen.hibernate.model.AccountStatus;
import com.karpen.hibernate.repository.impl.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AccountController {
    private final HibernateAccountRepoImpl hibernateAccountRepo = new HibernateAccountRepoImpl();

    public Account create(String content, AccountStatus accountStatus) throws IOException, SQLException {
        Account account = new Account();
        account.setContent(content);
        account.setAccountStatus(accountStatus);
        return hibernateAccountRepo.create(account);
    }

    public Account update(Long id, String content, String accountStatus) throws IOException, SQLException {
        Account account = new Account();
        account.setContent(content);
        account.setAccountStatus(AccountStatus.valueOf(accountStatus));
        account.setId(id);
        return hibernateAccountRepo.update(account);
    }

/*
    public Account getById(Long id) throws IOException, SQLException {
        return hibernateAccountRepo.getById(id);
    }
 */

    public void deleteById(Long id) throws IOException, SQLException {
        hibernateAccountRepo.deleteById(id);
    }

    public List<Account> getAll() throws IOException, SQLException {
        return hibernateAccountRepo.getAll();
    }
}

