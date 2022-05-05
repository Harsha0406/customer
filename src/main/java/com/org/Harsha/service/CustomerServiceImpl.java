package com.org.Harsha.service;

import com.org.Harsha.model.Customer;
import com.org.Harsha.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerSrevice{
@Autowired
    CustomerRepo customerRepo;
    @Override
    public void createcustomer(Customer customer) {

    }
}
