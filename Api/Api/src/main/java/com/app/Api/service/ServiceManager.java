package com.app.Api.service;

import java.util.List;

import com.app.Api.vo.Customer;

public interface ServiceManager {
    public List<String> getName();

    public void persitCustomer(Customer cust);

    public List<Customer> fetchAllCust();
}
