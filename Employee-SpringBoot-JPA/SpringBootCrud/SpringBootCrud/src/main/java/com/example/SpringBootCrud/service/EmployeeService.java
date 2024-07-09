package com.example.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootCrud.bean.Employee;
import com.example.SpringBootCrud.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    public EmployeeRepository EmployeeRepo; 

    public List<Employee> getAllEmployee(){
        List<Employee>employees = new ArrayList<>();
        EmployeeRepo.findAll().forEach(employees::add);
        return employees;
    }
    
    public void addEmployee(Employee employee){
        
        EmployeeRepo.save(employee);
    }

    public void updateEmployee(String id, Employee employee){
        EmployeeRepo.save(employee);
    }
    
    public void deleteEmployee(String id){
        EmployeeRepo.deleteById(id);
    }
}
