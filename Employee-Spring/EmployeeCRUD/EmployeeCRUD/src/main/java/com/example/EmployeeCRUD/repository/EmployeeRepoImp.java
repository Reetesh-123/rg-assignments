package com.example.EmployeeCRUD.repository;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.example.EmployeeCRUD.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepoImp implements EmployeeRepository{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeRepoImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addEmployee(Employee employee) {
        String insertQuery="insert into employee values(?,?,?)";
        Object [] properties = {employee.getId(),employee.getName(),employee.getDepartment()};
        jdbcTemplate.update(insertQuery,properties);
    }

    @Override
    public void updateEmployee(Employee employee) {
        String updateQuery="update employee set name=? , department=? where id=?";
        Object [] properties = {employee.getName(),employee.getDepartment(),employee.getId()};
        jdbcTemplate.update(updateQuery,properties);
    }

    @Override
    public void deleteEmployee(int id) {
        String deleteQuery="delete from employee where id=?";
        jdbcTemplate.update(deleteQuery,id);
    }

    @Override
    public void getAllEmployee() {
        String selectQuery = "SELECT * FROM employee";
        List<Employee> employees = jdbcTemplate.query(selectQuery, (resultSet, rowNum) ->
                new Employee(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("department")));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    System.out.println("################################");
    }
}