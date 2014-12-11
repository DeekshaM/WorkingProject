/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.td.dataFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TRANSDYN\ebe
 */
public class ConnectionFactory {
    
       static Connection connection = null;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing", "root", "venu");        
        }catch(Exception e) {
            throw new SQLException();
        }
        return connection;

    }
    
}
