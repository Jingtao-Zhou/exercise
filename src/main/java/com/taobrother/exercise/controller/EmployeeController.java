package com.taobrother.exercise.controller;

import com.taobrother.exercise.entity.Employee;
import com.taobrother.exercise.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/api/list")
    ResponseEntity getAllEmployees(){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return ResponseEntity.status(200).body(allEmployees);
    }

    @GetMapping("/")
    ResponseEntity testEndPoint(){
        return ResponseEntity.status(200).body("test success");
    }
}
