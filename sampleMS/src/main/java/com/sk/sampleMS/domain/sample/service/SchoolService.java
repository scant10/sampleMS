package com.sk.sampleMS.domain.sample.service;

import java.util.*;

import com.sk.sampleMS.domain.sample.model.oneToMany.*;

public interface SchoolService {
    public List<School> findAll();
    public School findById(long id);
    public void save(School school);
}
