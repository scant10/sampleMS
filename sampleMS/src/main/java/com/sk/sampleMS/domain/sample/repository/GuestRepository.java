package com.sk.sampleMS.domain.sample.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.rest.core.annotation.*;

import com.sk.sampleMS.domain.sample.model.manyToOne.*;

@RepositoryRestResource
public interface GuestRepository extends JpaRepository<Guest, Long> {

}
