package com.app.CrudOp.ApiController;

import java.util.List;

import javax.validation.Valid;

import com.app.CrudOp.entity.User;
import com.app.CrudOp.entity.UserType;
import com.app.CrudOp.service.ServiceManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyApiController extends BaseApiController
{
    @Autowired
    private ServiceManagerImpl service;

    @PostMapping(value="/user/post")
    public ResponseEntity<String> saveUser(@Valid @RequestBody User user)
    {
        service.getDetails(user);
        return new ResponseEntity<String>("Records Inserted",HttpStatus.OK);
    }

    @PutMapping(value="/user/update")
    public ResponseEntity<String> updateUser(@Valid @RequestBody User user)
    {
        service.getDetails(user);
        return new ResponseEntity<String>("Records Updated",HttpStatus.OK);
    }

    @GetMapping(value="/user")
    public ResponseEntity<List<User>> fetchUser()
    {
        service.fetchAllUser();
        return new ResponseEntity<List<User>>(service.fetchAllUser(),HttpStatus.OK);
    }

    @DeleteMapping(value="/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) 
    {
         service.deleteUser(id);
         return new ResponseEntity<String>("Record deleted ",HttpStatus.OK);
    }

    @PostMapping(value="/usertype/post")
    public ResponseEntity<String> saveUserType(@Valid @RequestBody UserType user)
    {
        service.gettype(user);
        return new ResponseEntity<String>("Records Inserted",HttpStatus.OK);
    }

    @GetMapping(value="/usertype")
    public ResponseEntity<List<UserType>> fetchUserType()
    {
        service.fetchAllUserType();
        return new ResponseEntity<List<UserType>>(service.fetchAllUserType(),HttpStatus.OK);
    }


}