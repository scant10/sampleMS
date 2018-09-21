package com.sk.sampleMS;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.*;

import springfox.documentation.spring.data.rest.configuration.*;
import springfox.documentation.swagger2.annotations.*;


@EnableJpaAuditing
//@EntityScan(basePackages = {"com.sk.sampleMS.domain.sample.model"}) 
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
@SpringBootApplication
public class SampleMsApplication implements CommandLineRunner {

	
   	
	public static void main(String[] args) {
//	    AnnotationAutoMapper.apply("com.sk.sampleMS.domain.sample");
		SpringApplication.run(SampleMsApplication.class, args);
	}
	
	@Override
	 public void run(String... args) throws Exception {
	    System.out.println("jpa run");
	  
	}
	

}
