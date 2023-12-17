package com.employee.management;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagement1Application {

	//logging
	static final Logger logger  = LogManager.getLogger(EmployeeManagement1Application.class.getName());
	
	public static void main(String[] args) {
		logger.info("entered application");
		SpringApplication.run(EmployeeManagement1Application.class, args);

	}

}