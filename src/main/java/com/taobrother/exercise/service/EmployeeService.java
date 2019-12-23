package com.taobrother.exercise.service;

import com.taobrother.exercise.entity.Employee;
import com.taobrother.exercise.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private Employee employeeAdmin;

    @Autowired
    public void setEmployeeAdmin(Employee employeeAdmin){
        this.employeeAdmin = employeeAdmin;
    }

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeAdmin(){
        return employeeAdmin;
    }
}
