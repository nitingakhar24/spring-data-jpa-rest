package com.employee.management.services;

import com.employee.management.entity.Department;
import com.employee.management.entity.DepartmentType;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    Department getDepartmentByDeptName(String deptName);

    Department getDepartmentByDeptType(DepartmentType deptType);
}
