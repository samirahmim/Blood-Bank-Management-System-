/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.bank.management;
import java.sql.*;
/**
 *
 * @author User
 */
public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost/bloodbank";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connectDB(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("There were errors connecting to DB");
            return null;
        }
    }
}
