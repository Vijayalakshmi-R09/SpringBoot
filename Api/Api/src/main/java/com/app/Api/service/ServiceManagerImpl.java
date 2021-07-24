package com.app.Api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.app.Api.vo.Customer;

import org.springframework.stereotype.Service;

@Service
public class ServiceManagerImpl implements ServiceManager{

    List<Customer> myCust=new ArrayList<>();

    @Override
    public List<String> getName() {
        
        return Arrays.asList("Sam","Angela","Mike","Cello","Sara");
    }

    @Override
    public void persitCustomer(Customer cust) {
        myCust.add(cust);
    }

    @Override
    public List<Customer> fetchAllCust() {
       
        return myCust;
    }
    
}
