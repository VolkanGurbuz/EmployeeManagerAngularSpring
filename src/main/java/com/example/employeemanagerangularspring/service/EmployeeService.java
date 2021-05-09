package com.example.employeemanagerangularspring.service;

import com.example.employeemanagerangularspring.exception.UserNotFoundException;
import com.example.employeemanagerangularspring.model.Employee;
import com.example.employeemanagerangularspring.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

  private final EmployeeRepo employeeRepo;

  @Autowired
  public EmployeeService(EmployeeRepo employeeRepo) {
    this.employeeRepo = employeeRepo;
  }

  public Employee addEmployee(Employee employee) {
    employee.setEmployeeCode(UUID.randomUUID().toString());
    return employeeRepo.save(employee);
  }

  public List<Employee> findAllEmployees() {

    return employeeRepo.findAll();
  }

  public Employee updateEmployee(Employee employee) {

    return employeeRepo.save(employee);
  }

  public Employee findEmployeeById(Long employeeId) {

    return employeeRepo
        .findById(employeeId)
        .orElseThrow(() -> new UserNotFoundException("User by id not found " + employeeId));
  }

  public void deleteEmployee(Long employeeId) {

    employeeRepo.deleteById(employeeId);
  }
}
