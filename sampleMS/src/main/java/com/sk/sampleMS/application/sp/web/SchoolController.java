package com.sk.sampleMS.application.sp.web;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.sk.sampleMS.domain.sample.model.oneToMany.*;
import com.sk.sampleMS.domain.sample.service.*;

@RestController
@RequestMapping("/School")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;
   
    
    @RequestMapping(value ="/list", method = RequestMethod.GET)
    public ResponseEntity<?> findSchoolAll() throws Exception{
        return new ResponseEntity(schoolService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public ResponseEntity<?> registSchool(@Validated @RequestBody School school){
        System.out.println("controller check::" + school.toString() );
        schoolService.save(school);
        return new ResponseEntity(null, HttpStatus.OK);
    }
    
       
    @PostConstruct
    public void init(){
        
        Student student1 = new Student("홍길동");
        Student student2 = new Student("임꺽정");
               
        School school1 = new School();
        school1.setName("서현고");
                
        school1.getStudent().add(student1);
        school1.getStudent().add(student2);
        
        schoolService.save(school1);
       
        
    }
}
