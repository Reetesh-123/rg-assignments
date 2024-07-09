package com.example.EmployeeCRUD.repository;

import com.example.EmployeeCRUD.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    void getAllEmployee();
}
