/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DBConnection;
import java.util.ArrayList;
import model.AccountModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author pc
 */
public class AccountDAO implements DAOInterface<AccountModel> {
    private DBConnection db;

    public AccountDAO() {
        this.db = new DBConnection();
    }
    

    @Override
    public int insert(AccountModel t) {
        String sql = "INSERT INTO Account (fullName, userName, password, role, status, email) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getFullName());
            stmt.setString(2, t.getUserName());
            stmt.setString(3, t.getPassword());
            stmt.setString(4, t.getRole());
            stmt.setInt(5, t.getStatus());
            stmt.setString(6, t.getEmail());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi thêm
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(AccountModel t) {
        String sql = "UPDATE Account SET fullName=?, userName=?, password=?, role=?, status=?, email=? WHERE id=?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getFullName());
            stmt.setString(2, t.getUserName());
            stmt.setString(3, t.getPassword());
            stmt.setString(4, t.getRole());
            stmt.setInt(5, t.getStatus());
            stmt.setString(6, t.getEmail());
            stmt.setInt(7, t.getId());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi thêm
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(AccountModel t) {
        String sql = "DELETE FROM Account WHERE userName = ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getUserName());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi xóa
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public ArrayList<AccountModel> selectAll() {
        ArrayList<AccountModel> list = new ArrayList<>();
        String sql = "SELECT * FROM Account";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");
                AccountModel acc = new AccountModel(fullName, userName, password, role, status, email, id);
                list.add(acc);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi lấy danh sách
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public AccountModel selectByUsername(String t) {
        AccountModel acc = null;
        String sql = "SELECT * FROM Account WHERE userName LIKE ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + t + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");
                acc = new AccountModel(fullName, userName, password, role, status, email,id);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return acc;
    }
    @Override
    public AccountModel selectById(int  t){
        AccountModel acc = null;
        String sql = "SELECT * FROM Account WHERE id = ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, t );
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String userName = rs.getString("userName");
                String password = rs.getString("password");
                String role = rs.getString("role");
                int status = rs.getInt("status");
                String email = rs.getString("email");
                acc = new AccountModel(fullName, userName, password, role, status, email,id);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return acc;
    }
  
}
