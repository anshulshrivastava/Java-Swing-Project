/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnshuL
 */
import java.sql.*;
import javax.swing.*;
public class connection {
    Connection conn = null;
    public static Connection ConnectDb(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://cs2.bradley.edu:3306/books_ashrivastava2","ashrivastava2","mgynewuh");
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
