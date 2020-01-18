package com.taobrother.exercise.web;

import com.taobrother.exercise.entity.Employee;
import com.taobrother.exercise.service.EmployeeService;
import com.taobrother.exercise.web.annotation.VerifyName;
import com.taobrother.exercise.web.request.SignUpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return ResponseEntity.status(HttpStatus.OK).body(allEmployees);
    }

    @GetMapping("/health")
    ResponseEntity testEndPoint(){
        return ResponseEntity.status(HttpStatus.OK).body("services is up");
    }

    @GetMapping("/api/admin")
    ResponseEntity getAdmin(){
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeAdmin());
    }

    @PostMapping("/api/sign_up")
    @VerifyName
    ResponseEntity signUp(@RequestBody SignUpRequest request){
        employeeService.createEmployee(request.getName());
        return ResponseEntity.status(HttpStatus.OK).body("sign up success");
    }
}
