package com.example.EmployeeCRUD.Service;

import com.example.EmployeeCRUD.model.Employee;

public interface EmployeeService {
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    void deleteEmployee(int id);
    void getAllEmployee();
}
