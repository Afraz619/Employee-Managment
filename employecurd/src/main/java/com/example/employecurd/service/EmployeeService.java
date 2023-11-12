package com.example.employecurd.service;

import com.example.employecurd.dto.EmployeeDto;
import com.example.employecurd.entity.Employee;

import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> fetchEmployeeList();
}
