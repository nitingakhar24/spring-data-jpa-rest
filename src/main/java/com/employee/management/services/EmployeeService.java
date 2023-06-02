package com.employee.management.services;

import com.employee.management.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
