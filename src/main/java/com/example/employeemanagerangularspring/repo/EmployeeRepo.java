package com.example.employeemanagerangularspring.repo;

import com.example.employeemanagerangularspring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {}
