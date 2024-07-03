import java.util.ArrayList;
import java.util.Iterator;

class Employee{
    private final int id;
    private String name;
    private String department;

    Employee(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }
    // Getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    // Setter
    public void setName(String name){
        this.name=name;
    }
    public void setDepartment(String department){
        this.department=department;
    }
}

class EmployeeCRUD{
    private final ArrayList<Employee> list;

    EmployeeCRUD(){
        list=new ArrayList<>();
    }

    // Create
    public void addEmployee(Employee employee){
        list.add(employee);
    }
    // Read
    public Employee getEmployee(int id){
        for (Employee employee : list) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
    //Update
    public void updateEmployee(Employee updatedEmployee){
        for(Employee employee:list){
            if(employee.getId()==updatedEmployee.getId()){
                employee.setName(updatedEmployee.getName());
                employee.setDepartment(updatedEmployee.getDepartment());
            }
        }
    }
    // Delete
    public void removeEmployee(int id){
        Iterator<Employee> iterator = list.iterator();
        while(iterator.hasNext())
        {
            Employee employee=iterator.next();
            if(employee.getId()==id){
                iterator.remove();
            }
        }
    }
    public void showEmployee(){
        for(Employee employee:list){
            System.out.println("id: " + employee.getId() +" Name: " + employee.getName()+" Department: " + employee.getDepartment()+"\n");
        }
    }
}


public class CRUDusingArrayList {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Mike","CSE");
        Employee employee2 = new Employee(2,"John","ECE");

        EmployeeCRUD EmployeeObject = new EmployeeCRUD();

        // Adding Employees
        System.out.println("After adding Employees:");
        EmployeeObject.addEmployee(employee1);
        EmployeeObject.addEmployee(employee2);
        EmployeeObject.showEmployee();

        // Reading Employee
        System.out.println("Reading Employees of given id:");
        Employee employee=EmployeeObject.getEmployee(1);
        System.out.println("id: " + employee.getId() +" Name: " + employee.getName()+" Department: " + employee.getDepartment()+"\n");


        // Update Employee
        System.out.println("After Updating Employee:");
        Employee updatedEmployee = new Employee(2,"John Tyson","CSE");
        EmployeeObject.updateEmployee(updatedEmployee);
        EmployeeObject.showEmployee();

        // Remove Employee
        System.out.println("After Removing Employee:");

        EmployeeObject.removeEmployee(2);
        EmployeeObject.showEmployee();
    }
}
