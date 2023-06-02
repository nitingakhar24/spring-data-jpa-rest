package com.employee.management.repository;

import com.employee.management.entity.Department;
import com.employee.management.entity.DepartmentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department getDepartmentByDeptName(String deptName);

    Department getDepartmentByDeptType(DepartmentType deptType);
}
