package com.employee.management.controller;

import com.employee.management.entity.Department;
import com.employee.management.entity.Employee;
import com.employee.management.services.DepartmentService;
import com.employee.management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private static final String DEFAULT_DEPT_NAME = "Training";
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody final Employee employee) {
        if (Objects.isNull(employee.getDepartment())) {
            final Department defaultDept = departmentService.getDepartmentByDeptName(DEFAULT_DEPT_NAME);
            employee.setDepartment(defaultDept);
        }
        return new ResponseEntity<Employee>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

}
