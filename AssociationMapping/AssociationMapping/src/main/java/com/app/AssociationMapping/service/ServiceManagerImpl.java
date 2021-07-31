package com.app.AssociationMapping.service;

import java.util.List;

import com.app.AssociationMapping.Repository.AccountRepo;
import com.app.AssociationMapping.entity.Account;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceManagerImpl implements ServiceManager
{
    @Autowired
    private AccountRepo accrepo;

    @Override
    public void getAcc(Account acc) {
        accrepo.save(acc);   
    }

    @Override
    public List<Account> fetchAllAccounts() {
     
        return accrepo.findAll();
    }
}
