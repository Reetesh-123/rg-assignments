package crudUsingJDBC;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1,"John","CSE");
        Employee employee2 = new Employee(2,"Mike","ECE");

        System.out.println("After Inserting employee into database");
        EmployeeDao.insertEmployeeToDb(employee1);
        EmployeeDao.insertEmployeeToDb(employee2);
        EmployeeDao.showAllEmployee();

        System.out.println("After Deleting employee1 from database");
        EmployeeDao.deleteEmployeeFromDb(employee1);
        EmployeeDao.showAllEmployee();

        System.out.println("After Updating employee2 from database");
        Employee updatedEmployee = new Employee(2,"Mike Tyson","CSE");
        EmployeeDao.updateEmployeeToDb(updatedEmployee);
        EmployeeDao.showAllEmployee();
    }
}
