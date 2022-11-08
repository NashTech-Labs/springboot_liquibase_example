package com.example.services;

import com.example.entities.Employee;

import java.util.stream.Stream;

public interface EmployeeService {
    Stream<Employee> getAllEmployees();
}
