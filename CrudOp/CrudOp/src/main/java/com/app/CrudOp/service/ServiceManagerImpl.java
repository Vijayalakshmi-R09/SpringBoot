package com.app.CrudOp.service;

import java.util.List;

import com.app.CrudOp.entity.User;
import com.app.CrudOp.entity.UserType;
import com.app.CrudOp.Repository.UserRepo;
import com.app.CrudOp.Repository.UserTypeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceManagerImpl implements ServiceManager
{
    @Autowired
    private UserRepo udetails;

    @Autowired
    private UserTypeRepo utrepo;
    
    @Override
    public void getDetails(User user) {
        
        udetails.save(user);
    }

    @Override
    public List<User> fetchAllUser() {
        
       return udetails.findAll();
    }

    @Override
    public void deleteUser(int id) {
       udetails.deleteById(id);
    }

    @Override
    public void gettype(UserType uType) {
       
        utrepo.save(uType);
    }

    @Override
    public List<UserType> fetchAllUserType() {
        
        return utrepo.findAll();
    }
    
}
