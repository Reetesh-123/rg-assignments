package com.example.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootCrud.bean.Employee;
import com.example.SpringBootCrud.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService; 

    @RequestMapping("/employees")
    public List<Employee>getAllEmployee(){
       return employeeService.getAllEmployee();
    }

    @RequestMapping(method=RequestMethod.POST,value = "/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }
    
    @RequestMapping(method=RequestMethod.PUT,value = "/employees/{id}")
    public void updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id,employee);
    }

    public void deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
    }
}
