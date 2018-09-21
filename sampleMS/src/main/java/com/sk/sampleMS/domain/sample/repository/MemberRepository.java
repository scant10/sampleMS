package com.sk.sampleMS.domain.sample.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.rest.core.annotation.*;

import com.sk.sampleMS.domain.sample.model.*;
import com.sk.sampleMS.domain.sample.model.manyToOnePair.*;

@RepositoryRestResource
public interface MemberRepository extends JpaRepository<Member, Long> {

}
