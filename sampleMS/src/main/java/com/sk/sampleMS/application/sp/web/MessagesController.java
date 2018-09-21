package com.sk.sampleMS.application.sp.web;

import java.util.*;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.sk.sampleMS.domain.sample.model.manyToOne.*;
import com.sk.sampleMS.domain.sample.repository.*;
import com.sk.sampleMS.domain.sample.service.*;

@RestController
@RequestMapping("/Messages")
public class MessagesController {
    
    @Autowired
    private MessagesService messagesService;
    @Autowired
    private GuestRepository guestRepository;
    
    @RequestMapping(value ="/list", method = RequestMethod.GET)
    public ResponseEntity<?> findMessagesAll() throws Exception{
        List<Messages> list = messagesService.findAll();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public ResponseEntity<?> registMessages(@Validated @RequestBody Messages messages){
        System.out.println("controller check::" + messages.toString() );
        messagesService.save(messages);
        return new ResponseEntity(null, HttpStatus.OK);
    }
    
       
    @PostConstruct
    public void init(){
        
        //Guest guest = new Guest("한정헌","scant@sk.com",21,null);
        Guest guest = new Guest("한정헌","scant@sk.com",21);
        
        guestRepository.save(guest);
        
        Messages msg1 = new Messages("hi","하이",guest); 
        Messages msg2 = new Messages("hello","헬로",guest); 
        Messages msg3 = new Messages("bye","바이",guest); 
        
        messagesService.save(msg1);
        messagesService.save(msg2);
        messagesService.save(msg3);
        
    }
}
