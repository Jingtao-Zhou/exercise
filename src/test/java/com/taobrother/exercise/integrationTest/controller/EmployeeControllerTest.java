//package com.taobrother.exercise.integrationTest.controller;
//
//import com.taobrother.exercise.service.EmployeeService;
//import com.taobrother.exercise.web.EmployeeController;
//import com.taobrother.exercise.web.exception.InvalidUserException;
//import com.taobrother.exercise.web.request.SignUpRequest;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.verify;
//
//@SpringBootTest
//class EmployeeControllerTest {
//    @Mock
//    private EmployeeService employeeService;
//
//    @InjectMocks
//    private EmployeeController employeeController;
//
//    @Test
//    void should_get_all_employees() {
//        employeeController.getAllEmployees();
//        verify(employeeService).getAllEmployees();
//    }
//
//    @Test
//    void should_check_server_status() {
//        ResponseEntity response = employeeController.testEndPoint();
//        assertEquals(HttpStatus.OK,response.getStatusCode());
//    }
//
//    @Test
//    void should_sign_up_success_when_user_name_is_valid() {
//        String userName = "Kayanon";
//        SignUpRequest request = new SignUpRequest();
//        request.setName(userName);
//        employeeController.signUp(request);
//        verify(employeeService).createEmployee(userName);
//    }
//
//    @Test
//    void should_throw_invalid_user_exception_when_sign_up_and_name_is_invalid() {
//        try{
//            employeeController.signUp(new SignUpRequest());
//        }catch (RuntimeException ex){
//            assertTrue(ex instanceof InvalidUserException);
//        }
//    }
//}
