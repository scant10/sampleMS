package com.sk.sampleMS.domain.sample.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import com.sk.sampleMS.domain.sample.model.oneToMany.*;
import com.sk.sampleMS.domain.sample.repository.*;

@Transactional
@Service
public class SchoolLogic implements SchoolService {

    @Autowired
    private SchoolRopository schoolRopository;
    @Autowired
    private StudentRepository studentRepository;
    
    @Override
    public List<School> findAll() {
        return schoolRopository.findAll();
    }

    @Override
    public School findById(long id) {
        return schoolRopository.findOne(id);
    }

    @Transactional
    @Override
    public void save(School school) {
        schoolRopository.save(school);
        
        List<Student> student = school.getStudent();
        studentRepository.save(student);
       
    }

}
