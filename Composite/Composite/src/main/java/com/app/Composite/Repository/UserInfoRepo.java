package com.app.Composite.Repository;

import com.app.Composite.entity.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepo extends JpaRepository<UserInfo,Integer>{
    
}
