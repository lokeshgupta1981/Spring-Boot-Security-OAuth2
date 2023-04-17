package com.howtodoinjava.app;

import com.howtodoinjava.app.entity.Employee;
import com.howtodoinjava.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeRestApiApplication implements CommandLineRunner {

  @Autowired
  EmployeeRepository employeeRepository;

  public static void main(String[] args) {
    SpringApplication.run(EmployeeRestApiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    employeeRepository.save(
        new Employee(1L, "Lokesh", "123456", "admin@howtodoinjava", "Author", "Java Learner")
    );

    employeeRepository.save(
        new Employee(2L, "Alex", "999999", "info@howtodoinjava", "Author", "Another Java Learner")
    );
  }
}
