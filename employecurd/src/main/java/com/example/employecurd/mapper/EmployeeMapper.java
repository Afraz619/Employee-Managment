package com.example.employecurd.mapper;

import com.example.employecurd.dto.EmployeeDto;
import com.example.employecurd.entity.Employee;
//We use EmployeeDto class to transfer data from client and server
public class EmployeeMapper {

    public static EmployeeDto EntityToDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getName(),
                employee.getEmail()
        );
    }

    public static Employee DtoToEntity(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getName(),
                employeeDto.getEmail()

        );
    }
}
