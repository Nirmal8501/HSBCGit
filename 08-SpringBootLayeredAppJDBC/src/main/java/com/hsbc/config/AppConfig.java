package com.hsbc.config;

import com.hsbc.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.hsbc.service, com.hsbc.dao, com.hsbc.model")
public class AppConfig {
    @Bean
    public List<Student> createStudentList(){
        return new ArrayList<>();
    }
}
