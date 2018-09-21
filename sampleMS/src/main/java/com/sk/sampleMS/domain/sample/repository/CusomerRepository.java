package com.sk.sampleMS.domain.sample.repository;

import java.util.*;

import org.springframework.data.repository.*;
import org.springframework.data.rest.core.annotation.*;

import com.sk.sampleMS.domain.sample.model.*;

@RepositoryRestResource
public interface CusomerRepository extends PagingAndSortingRepository<Customer, Long> {

	Optional<Customer> findByEmailContaining(String email);
}