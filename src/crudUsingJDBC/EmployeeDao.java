package crudUsingJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {

    public static void insertEmployeeToDb(Employee employee){
        try{
            // jdbc
            Connection con = ConnectionProvider.createConnection();
            String query="insert into employees(id,name,department) values(?,?,?)";

            // prepared statement(used for dynamic query)
            PreparedStatement pstmt = con.prepareStatement(query);

            //setting values to parameter
            pstmt.setInt(1,employee.getId());
            pstmt.setString(2,employee.getName());
            pstmt.setString(3,employee.getDepartment());

            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void deleteEmployeeFromDb(Employee employee){
        try{
            // jdbc
            Connection con = ConnectionProvider.createConnection();
            String query="delete from employees where id=?";

            // prepared statement(used for dynamic query)
            PreparedStatement pstmt = con.prepareStatement(query);

            //setting values to parameter
            pstmt.setInt(1,employee.getId());

            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void showAllEmployee(){
        try{
            // jdbc
            Connection con = ConnectionProvider.createConnection();
            String query="select * from employees;";

            // statement(used for static query)
            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(query);
            while(set.next()){
                int id= set.getInt(1);
                String name=set.getString(2);
                String department=set.getString(3);
                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("Department: "+department);
                System.out.println("+++++++++++++++++++++++++++");

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void updateEmployeeToDb(Employee employee){
        try{
            // jdbc
            Connection con = ConnectionProvider.createConnection();
            String query = "UPDATE employees SET name = ?, department = ? WHERE id = ?";

            // prepared statement(used for dynamic query)
            PreparedStatement pstmt = con.prepareStatement(query);

            //setting values to parameter
            pstmt.setString(1,employee.getName());
            pstmt.setString(2,employee.getDepartment());
            pstmt.setInt(3,employee.getId());

            pstmt.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
