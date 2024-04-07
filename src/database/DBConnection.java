/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class DBConnection {
    private Connection con;

    public DBConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/quanlikhohang"; 
            String user = "root"; 
            String password = "123456"; // 
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getCon() {
        return con;
    }
    public boolean executeNonQuery(PreparedStatement stmt) {
    try {
        int rowsAffected = stmt.executeUpdate();
        stmt.close();
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
