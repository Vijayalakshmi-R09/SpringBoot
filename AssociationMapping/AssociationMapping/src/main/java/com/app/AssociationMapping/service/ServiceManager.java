package com.app.AssociationMapping.service;

import java.util.List;

import com.app.AssociationMapping.entity.Account;

public interface ServiceManager 
{
    public void getAcc(Account acc);

    public List<Account> fetchAllAccounts() ;

}
