package com.employee.management.services.impl;

import com.employee.management.entity.Department;
import com.employee.management.exception.ResourceNotFoundException;
import com.employee.management.repository.DepartmentRepository;
import com.employee.management.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(final Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(final Long id) {
        return departmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Department", "Id", id));
    }

    @Override
    public Department getDepartmentByDeptName(final String deptName) {
        return departmentRepository.getDepartmentByDeptName(deptName);
    }

    @Override
    public Department getDepartmentByDeptCode(String deptCode) {
        return  departmentRepository.getDepartmentByDeptCode(deptCode);
    }
}
