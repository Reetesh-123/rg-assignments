package com.example.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootCrud.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,String> {
    
}
