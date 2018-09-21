package com.sk.sampleMS.domain.sample.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.rest.core.annotation.*;

import com.sk.sampleMS.domain.sample.model.oneToMany.*;
@RepositoryRestResource
public interface SchoolRopository extends JpaRepository<School, Long> {

}
