/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import database.DBConnection;
import model.NhaCungCapModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nhanprovjp
 */
public class NhaCungCapDAO implements DAOInterface<NhaCungCapModel> {
     private DBConnection db;

    public NhaCungCapDAO() {
        this.db = new DBConnection();
    }

    @Override
    public int insert(NhaCungCapModel t) {
        String sql = "INSERT INTO NhaCungCap (maNhaCungCap, tenNhaCungCap, sDT, diaChi) VALUES (?, ?, ?, ?)";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getMaNhaCungCap());
            stmt.setString(2, t.getTenNhaCungCap());
            stmt.setString(3, t.getsDT());
            stmt.setString(4, t.getDiaChi());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi thêm
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }}

    @Override
    public int update(NhaCungCapModel t) {
        String sql = "UPDATE NhaCungCap SET tenNhaCungCap=?, sDT=?, diaChi=? WHERE maNhaCungCap=?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getTenNhaCungCap());
            stmt.setString(2, t.getsDT());
            stmt.setString(3, t.getDiaChi());
            stmt.setString(4, t.getMaNhaCungCap());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi cập nhật
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }}

    @Override
    public int delete(NhaCungCapModel t) {
        String sql = "DELETE FROM NhaCungCap WHERE maNhaCungCap=?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getMaNhaCungCap());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi xóa
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }}

    @Override
    public ArrayList<NhaCungCapModel> selectAll() {
        ArrayList<NhaCungCapModel> list = new ArrayList<>();
        String sql = "SELECT * FROM NhaCungCap";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maNhaCungCap = rs.getString("maNhaCungCap");
                String tenNhaCungCap = rs.getString("tenNhaCungCap");
                String sDT = rs.getString("sDT");
                String diaChi = rs.getString("diaChi");

                NhaCungCapModel nhaCungCapModel = new NhaCungCapModel(maNhaCungCap, tenNhaCungCap, sDT, diaChi);
                list.add(nhaCungCapModel);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi lấy danh sách
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;}

    @Override
    public NhaCungCapModel selectById(int t) {
       
        NhaCungCapModel nhaCungCapModel = null;
        String sql = "SELECT * FROM NhaCungCap WHERE maNhaCungCap = ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,  t );
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String maNhaCungCap = rs.getString("maNhaCungCap");
                String tenNhaCungCap = rs.getString("tenNhaCungCap");
                String sDT = rs.getString("sDT");
                String diaChi = rs.getString("diaChi");

                nhaCungCapModel = new NhaCungCapModel(maNhaCungCap, tenNhaCungCap, sDT, diaChi);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhaCungCapModel;
    }

    @Override
    public NhaCungCapModel selectByName(String t) {
                NhaCungCapModel nhaCungCapModel = null;
        String sql = "SELECT * FROM NhaCungCap WHERE maNhaCungCap like ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + t + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String maNhaCungCap = rs.getString("maNhaCungCap");
                String tenNhaCungCap = rs.getString("tenNhaCungCap");
                String sDT = rs.getString("sDT");
                String diaChi = rs.getString("diaChi");

                nhaCungCapModel = new NhaCungCapModel(maNhaCungCap, tenNhaCungCap, sDT, diaChi);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nhaCungCapModel;
    
    }
    
}
