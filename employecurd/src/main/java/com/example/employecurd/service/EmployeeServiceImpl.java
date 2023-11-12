package com.example.employecurd.service;

import com.example.employecurd.Repository.EmployeeRepository;
import com.example.employecurd.dto.EmployeeDto;
import com.example.employecurd.entity.Employee;
import com.example.employecurd.mapper.EmployeeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee;

        employee = EmployeeMapper.DtoToEntity(employeeDto);

        Employee savedEmployee;

        savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.EntityToDto(savedEmployee);
    }

    @Override
    public List<EmployeeDto> fetchEmployeeList() {
        List<Employee> employees=employeeRepository.findAll();
        return employees.stream().map((employee) -> EmployeeMapper.EntityToDto(employee)).collect(Collectors.toList());

    }

}
