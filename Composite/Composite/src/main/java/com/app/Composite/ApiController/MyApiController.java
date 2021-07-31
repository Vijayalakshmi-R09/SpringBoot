package com.app.Composite.ApiController;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import com.app.Composite.entity.HouseInfo;
import com.app.Composite.entity.Student;
import com.app.Composite.entity.UserInfo;
import com.app.Composite.service.HouseInfoManagerImpl;
import com.app.Composite.service.ServiceManagerImpl;
import com.app.Composite.service.UserInfoManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyApiController extends BaseApiController
{
    @Autowired
    private ServiceManagerImpl service;

	@Autowired
    private UserInfoManagerImpl uservice;

    @Autowired
    private HouseInfoManagerImpl hservice;

    @GetMapping(value="/students")
 	public ResponseEntity<List<Student>> findAllProducts() 
     {
 		List<Student> stud=service.getStudents();
 		ResponseEntity<List<Student>> response= new ResponseEntity<List<Student>>(stud, HttpStatus.OK);
 		return response;
 	}

     @PostMapping(value="/students/post")
 	    public ResponseEntity<String> addStudent( @RequestBody Student student) {
 		service.saveStudent(student);
         return  new ResponseEntity<String>("Record inserted.",HttpStatus.CREATED);	
 	}

    @PostMapping(value="/userinfo")
    public void saveUser(@RequestBody UserInfo user)
    {    
        uservice.getDetails(user);  
        System.out.println(HttpStatus.OK);
    }

    @GetMapping(value="/userinfo")
    public ResponseEntity<List<UserInfo>>viewUser()
    {
        return new ResponseEntity<List<UserInfo>>(uservice.fetchAllUser(),HttpStatus.OK);
    }

    @GetMapping(value="/userinfo/{id}")
    public ResponseEntity<Optional> getUser(@PathVariable Integer id)
    {
        return new ResponseEntity<Optional>(uservice.fetchUser(id),HttpStatus.OK);
    }

    @PostMapping(value="/houseinfo")
    public void saveHouse(@RequestBody HouseInfo hd)
    {    
        hservice.getHouse(hd);
        System.out.println(HttpStatus.OK);
    }

    @GetMapping(value="/houseinfo")
    public ResponseEntity<List<HouseInfo>> viewHouse()
    {
        return new ResponseEntity<List<HouseInfo>>(hservice.findAll(),HttpStatus.OK);
    }

	
    @GetMapping(value="/houseinfo/{id}")
    public ResponseEntity<Optional> viewhousebyid(@PathVariable Integer id)
    {
        return new ResponseEntity<Optional>(hservice.findHouseById(id),HttpStatus.OK);
    }
}
