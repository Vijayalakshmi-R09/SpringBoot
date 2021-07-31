package com.app.CrudOp.Repository;

import com.app.CrudOp.entity.UserType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepo extends JpaRepository<UserType,Integer>{
    
}
