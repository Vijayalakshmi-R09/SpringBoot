package com.app.Composite.service;

import java.util.List;
import java.util.Optional;

import com.app.Composite.Repository.UserInfoRepo;
import com.app.Composite.entity.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoManagerImpl {
    @Autowired
    private UserInfoRepo udetails;

    public void getDetails(UserInfo user) 
    {
        udetails.save(user);
    }
    
    public Optional<UserInfo> fetchUser(Integer id) {
         
        return udetails.findById(id);
    }

    public List<UserInfo> fetchAllUser() {
  
        return udetails.findAll();
    } 
}
