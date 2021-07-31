package com.app.AssociationMapping.Repository;

import com.app.AssociationMapping.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,Integer>{
    
}
