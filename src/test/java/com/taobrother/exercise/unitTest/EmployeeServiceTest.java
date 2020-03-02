//package com.taobrother.exercise.unitTest;
//
//import com.taobrother.exercise.repository.EmployeeRepository;
//import com.taobrother.exercise.service.EmployeeService;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.verify;
//
//@SpringBootTest
//class EmployeeServiceTest {
//
//    @Mock
//    private EmployeeRepository employeeRepository;
//
//    @InjectMocks
//    private EmployeeService employeeService;
//
//    @Test
//    void should_find_all_the_employee_in_database() {
//
//        employeeService.getAllEmployees();
//
//        verify(employeeRepository).findAll();
//    }
//
//    @Test
//    void should_sign_up_success_when_name_is_valid() {
//
//        employeeService.createEmployee("Kayanon");
//
//        verify(employeeRepository).save(any());
//    }
//}
