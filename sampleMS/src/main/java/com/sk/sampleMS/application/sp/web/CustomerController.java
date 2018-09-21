package com.sk.sampleMS.application.sp.web;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.sk.sampleMS.domain.sample.model.*;
import com.sk.sampleMS.domain.sample.model.manyToOne.*;
import com.sk.sampleMS.domain.sample.repository.*;
import com.sk.sampleMS.domain.sample.service.*;

@Controller
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    CusomerRepository cusomerRepository;
    
    MessagesLogic dao;
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView ListAll(@ModelAttribute("formModel") Customer customer, ModelAndView mav, Errors errors) {
           
   
            mav.setViewName("index");
            mav.addObject("msg","this is sample content.");
            mav.addObject("formModel",customer);
          
            Iterable<Customer> list = cusomerRepository.findAll();
            mav.addObject("datalist",list);
            return mav;
    }

    @RequestMapping(value = "/msg", method = RequestMethod.GET)
    public ModelAndView msg(ModelAndView mav) {
            mav.setViewName("showMsgData");
            mav.addObject("title","Sample");
            mav.addObject("msg","MsgData의 예제입니다.");
            
            
            Messages msgdata = new Messages();
            
            mav.addObject("formModel", msgdata);
            
            return mav;
           
    }
    

   /* @PostConstruct
    public void init(){
        
        Customer user = new Customer();
        Address add = new Address();
        
        add.setCity("sunnam si");
        add.setDong("sunaedong");
        add.setGu("bundanggu");
        add.setDetial("y building");
        
        user.setAddress(add);
        user.setEmail("scant@sk.com");
        user.setFirstName("jeongheon");
        user.setLastName("han");
        user.setRoleType(RoleType.MANGER);
        
        cusomerRepository.save(user);
       
    }*/
}
