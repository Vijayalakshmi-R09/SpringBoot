package com.app.Api.ApiController;

import java.util.Arrays;
import java.util.List;

import com.app.Api.service.ServiceManager;
import com.app.Api.vo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ServiceManager service;

    @PutMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> addCustomer(@RequestBody Customer cust)
    {
        System.out.println(cust);
        service.persitCustomer(cust);
        return  new ResponseEntity<List<Customer>>(service.fetchAllCust(),HttpStatus.OK);
    } 
    @PostMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> updateCustomer(@RequestBody Customer cust)
    {
        System.out.println(cust);
        service.persitCustomer(cust);
        return  new ResponseEntity<List<Customer>>(service.fetchAllCust(),HttpStatus.OK);
    } 
    @GetMapping(value = "name",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getName()
    {
        return new ResponseEntity<List<String>>(service.getName(),HttpStatus.OK);
    }
}
