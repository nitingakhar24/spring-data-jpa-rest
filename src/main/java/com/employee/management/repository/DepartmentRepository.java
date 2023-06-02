package com.employee.management.repository;

import com.employee.management.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department getDepartmentByDeptName(String deptName);

    Department getDepartmentByDeptCode(String depCode);
}
