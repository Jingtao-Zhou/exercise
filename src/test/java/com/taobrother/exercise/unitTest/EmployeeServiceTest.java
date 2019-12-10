package com.taobrother.exercise.unitTest;

import com.taobrother.exercise.repository.EmployeeRepository;
import com.taobrother.exercise.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


class EmployeeServiceTest {

	@Mock
	private EmployeeRepository employeeRepository;

	private EmployeeService employeeService = new EmployeeService(employeeRepository);

	@Test
	void test() {
        System.out.println("Unit test");
	}

}
