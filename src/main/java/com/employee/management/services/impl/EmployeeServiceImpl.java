package com.employee.management.services.impl;

import com.employee.management.entity.Department;
import com.employee.management.entity.DepartmentType;
import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepository;
import com.employee.management.services.DepartmentService;
import com.employee.management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentService departmentService;

    @Override
    public Employee createEmployee(final Employee employee) {
        if (Objects.isNull(employee.getDepartment())) {
            final Department defaultDept = departmentService.getDepartmentByDeptType(DepartmentType.TRAINING);
            employee.setDepartment(defaultDept);
        }
        final Employee newEmployee = employeeRepository.save(employee);
        return newEmployee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}