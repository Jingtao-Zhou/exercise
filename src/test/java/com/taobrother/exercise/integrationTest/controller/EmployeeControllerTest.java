package com.taobrother.exercise.integrationTest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

//@SpringBootTest
@AutoConfigureMockMvc
class EmployeeControllerTest {
//    @Autowired
//    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    void test() {
        System.out.println("Integration Test");
    }
}
