package com.org.Harsha.controller;

import com.org.Harsha.model.Customer;
import com.org.Harsha.service.CustomerSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class CustomerController {
    @Autowired
    CustomerSrevice customerSrevice;
    @PostMapping ("/create")
    public void createCustomer (@RequestBody Customer customer){
        customerSrevice.createcustomer(customer);
    }
}
