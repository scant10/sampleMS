package com.sk.sampleMS.application.sp.web;

import java.util.*;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.sk.sampleMS.application.sp.web.Exception.*;
import com.sk.sampleMS.application.sp.web.message.*;
import com.sk.sampleMS.domain.sample.model.manyToOnePair.*;
import com.sk.sampleMS.domain.sample.service.*;

@RestController
@RequestMapping("/Team")
public class TeamController {

    @Autowired
    private TeamService teamService;
        
    @RequestMapping(value ="/list", method = RequestMethod.GET)
    public ResponseEntity<?> findTeamAll() throws Exception{
        List<Team> list = teamService.findAll();
        
        if(list == null){
            throw new NotFoundException("not found");
        }
        ApiResponseMessage message = new ApiResponseMessage();
        message.setStatus("Success");
        
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public ResponseEntity<?> registTeam(@Validated @RequestBody Member member,Long teamId){
        System.out.println("controller vo check::" + member.toString() );
        teamService.addMember(member, teamId);
        return new ResponseEntity(null, HttpStatus.OK);
    }
    
    @RequestMapping(value="/ExceptionTest", method = RequestMethod.GET)
    public void ExecuteException(){
            throw new NotFoundException("TEST");
    }
    
    @PostConstruct
    public void init(){
        
        Team team = new Team();
        team.setTeamName("통품");
        team.setTeamDesc("통합품질혁신팀");
       
        Member m1 = new Member();
        m1.setAge("21");
        m1.setName("홍길동");
        m1.setTeam(team); // 양방향 1:m이기 때문에 약쪽에 참조되게 해야 함
        
        
        Member m2 = new Member();
        m2.setAge("20");
        m2.setName("이순");
        m2.setTeam(team);
                
        team.addMember(m1);
        team.addMember(m2);
       
        teamService.save(team);
    
    }

}
