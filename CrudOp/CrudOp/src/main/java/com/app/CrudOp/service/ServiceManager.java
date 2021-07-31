package com.app.CrudOp.service;

import java.util.List;
import com.app.CrudOp.entity.User;
import com.app.CrudOp.entity.UserType;

public interface ServiceManager 
{
    public void getDetails(User user);

    public List<User> fetchAllUser() ;

    public void deleteUser(int id);

    public void gettype(UserType uType);

    public List<UserType> fetchAllUserType() ;

}
