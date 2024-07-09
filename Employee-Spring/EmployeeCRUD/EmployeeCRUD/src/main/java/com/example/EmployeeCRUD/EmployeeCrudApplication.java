package com.example.EmployeeCRUD;

import com.example.EmployeeCRUD.model.Employee;
import com.example.EmployeeCRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
	}

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeCrudApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee(1,"Mike","CSE");
		Employee employee2 = new Employee(2,"Tyson","ECE");

		System.out.println("After inserting employees");
		employeeRepository.addEmployee(employee1);
		employeeRepository.addEmployee(employee2);
		employeeRepository.getAllEmployee();

		System.out.println("After updating employees with id:2");
		Employee updatedEmployee = new Employee(2,"Tyson","CSE");
		employeeRepository.updateEmployee(updatedEmployee);
		employeeRepository.getAllEmployee();

		System.out.println("After deleting employees with id:2");
		employeeRepository.deleteEmployee(2);
		employeeRepository.getAllEmployee();

	}
}
