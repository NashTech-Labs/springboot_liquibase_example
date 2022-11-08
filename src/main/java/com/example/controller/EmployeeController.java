package com.example.controller;

import com.example.entities.Employee;
import com.example.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
     @GetMapping("/getEmp")
    public Stream<Employee> getEmployee(){
         return employeeService.getAllEmployees();
     }

}
