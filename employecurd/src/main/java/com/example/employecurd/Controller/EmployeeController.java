package com.example.employecurd.Controller;

import com.example.employecurd.dto.EmployeeDto;
import com.example.employecurd.entity.Employee;
import com.example.employecurd.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/insert")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee =employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //get all employees
    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> fetchEmployeeList()
    {
        List<EmployeeDto>employees=employeeService.fetchEmployeeList();
        return ResponseEntity.ok(employees);
    }
}
