package com.taobrother.exercise.config;

import com.taobrother.exercise.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean("employeeAdmin")
    public Employee getAdmin(){
        return new Employee("Admin");
    }
}
