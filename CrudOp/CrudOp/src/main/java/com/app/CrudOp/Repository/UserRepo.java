package com.app.CrudOp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.CrudOp.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    
}
