package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {
    private String  url="jdbc:mysql://192.168.1.6:3306/curenttemp_db?useSSL=false";
    private String username="current_temp";
    private String password="current_temp";

    public Connection getConnection(){
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            return con;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
