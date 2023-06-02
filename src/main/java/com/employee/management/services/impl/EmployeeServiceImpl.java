package com.employee.management.services.impl;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepository;
import com.employee.management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(final Employee employee) {
        final Employee newEmployee = employeeRepository.save(employee);
        return newEmployee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}