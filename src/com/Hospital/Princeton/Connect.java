/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Hospital.Princeton;


import java.sql.*;

/**
 *
 * @author mittr
 */
public class Connect {
    public Connection con;
    
    public Connect() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/princeton", "root",  "");
      
    }
}


