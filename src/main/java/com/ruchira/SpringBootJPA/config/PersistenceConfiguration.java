package com.ruchira.SpringBootJPA.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Ruchira on 5/2/2020.
 */
@Configuration
public class PersistenceConfiguration {
    public PersistenceConfiguration(){}

//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder=DataSourceBuilder.create();
//        builder.url("jdbc:mysql://localhost:3306/conference_demo");
//        System.out.println("My custom data source has been initialized and set.............");
//        return builder.build();
//    }
}
