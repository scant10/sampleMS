package com.sk.sampleMS.domain.sample.service;

import java.util.*;

import com.sk.sampleMS.domain.sample.model.manyToOnePair.*;

public interface TeamService {

    public Team addTeam(Team team);
    public void addMember(Member member, Long teamId);
    public List<Team> findAll();
    public void save(Team team);
}
