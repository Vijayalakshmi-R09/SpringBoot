package com.app.AssociationMapping.Repository;

import com.app.AssociationMapping.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    
}
