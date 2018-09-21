package com.sk.sampleMS.domain.sample.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.sk.sampleMS.domain.sample.model.*;
import com.sk.sampleMS.domain.sample.repository.*;

@Service
public class CustomerLogic implements CustomerService {

    @Autowired
    private CusomerRepository cusomerRepository;

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) cusomerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return cusomerRepository.save(customer);
    }
    
    
}
