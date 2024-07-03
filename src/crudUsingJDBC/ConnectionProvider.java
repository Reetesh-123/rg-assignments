package crudUsingJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    public static Connection con;
    public static  Connection createConnection(){
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create the connection
            String user="root";
            String password="root";
            String url="jdbc:mysql://localhost:3306/employee_manage";

            con= DriverManager.getConnection(url,user,password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
