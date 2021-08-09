package com.app.Assessment.service;

import java.util.List;

import com.app.Assessment.Entity.UserInfo;
import com.app.Assessment.Repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userManagerImpl {
    @Autowired
	private UserRepo repo;
	

	
	 public List<UserInfo> getUser() {
	        return repo.findAll();
	    }

    public void saveUser(UserInfo user) {
         repo.save(user);
    	}
}
