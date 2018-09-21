package com.sk.sampleMS.application.sp.config;


import javax.persistence.*;
import javax.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.dao.annotation.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.*;
import org.springframework.transaction.*;
import org.springframework.transaction.annotation.*;
/*
@Configuration
@EnableTransactionManagement
//@ConfigurationProperties(prefix="datasource")
@EnableJpaRepositories("com.sk.sampleMS.domain.sample.repository")
public class JpaConfig {
    
    @Autowired
    private DataSource datasource;
    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource){
//        Properties props = new Properties();
//        props.setProperty("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
        
        LocalContainerEntityManagerFactoryBean factory =  new LocalContainerEntityManagerFactoryBean();
        //factory.setJpaProperties(props);
        factory.setDataSource(dataSource);
        factory.setPackagesToScan("com.sk.sampleMS.domain.sample.model");
        factory.setJpaVendorAdapter(jpaVendorAdapter());
        return factory;
    }
    
    @Bean
    public JpaVendorAdapter jpaVendorAdapter()
    {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setShowSql(true);
        adapter.setDatabase(Database.MYSQL);
        return adapter;
    }
    
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
    
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslator() {
        return new PersistenceExceptionTranslationPostProcessor();
    }
    

}
*/