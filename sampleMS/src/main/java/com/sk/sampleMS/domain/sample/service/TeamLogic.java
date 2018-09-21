package com.sk.sampleMS.domain.sample.service;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import com.sk.sampleMS.domain.sample.model.manyToOnePair.*;
import com.sk.sampleMS.domain.sample.repository.*;

@Transactional
@Service
public class TeamLogic implements TeamService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

	@Override
        public List<Team> findAll() {
           
            return teamRepository.findAll();
        }
	
	@Override
	public Team addTeam(Team team) {
	    return teamRepository.save(team);
	}
	
	@Override
	public void addMember(Member member, Long teamId) {
	    Team team = teamRepository.findOne(teamId);
	    team.addMember(member);
	    teamRepository.save(team);
	}      

            
        @Override
        public void save(Team team) {
            teamRepository.save(team);
            
        }
}
