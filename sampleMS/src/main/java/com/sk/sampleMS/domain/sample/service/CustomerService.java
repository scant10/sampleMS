package com.sk.sampleMS.domain.sample.service;

import java.util.*;

import com.sk.sampleMS.domain.sample.model.*;

public interface CustomerService {

    List<Customer> findAll();
    
    Customer save(Customer customer);
}
