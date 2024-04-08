/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DBConnection;
import java.util.ArrayList;
import model.ChiTietPhieuXuatModel;
import model.PhieuXuatModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import model.AccountModel;

/**
 *
 * @author nhanprovjp
 */
public class PhieuXuatDAO implements  DAOInterface<PhieuXuatModel>{
    private DBConnection db;
    private AccountDAO accountDAO;

    public PhieuXuatDAO() {
        this.db = new DBConnection();
        this.accountDAO = new AccountDAO();
    }

    @Override
    public int insert(PhieuXuatModel t) {
         String sql = "INSERT INTO PhieuXuat (maPhieu, thoiGianTao, accountID, tongTien) VALUES (?, ?, ?, ?)";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getMaPhieu());
            stmt.setTimestamp(2, new java.sql.Timestamp(t.getThoiGianTao().getTime()));
            stmt.setInt(3, t.getAccountModel().getId());
            stmt.setDouble(4, t.getTongTien());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi thêm
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }}

    @Override
    public int update(PhieuXuatModel t) {
      String sql = "UPDATE PhieuXuat SET thoiGianTao=?, accountID=?, tongTien=? WHERE maPhieu=?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setTimestamp(1, new java.sql.Timestamp(t.getThoiGianTao().getTime()));
            stmt.setInt(2, t.getAccountModel().getId());
            stmt.setDouble(3, t.getTongTien());
            stmt.setString(4, t.getMaPhieu());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi cập nhật
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }}

    @Override
    public int delete(PhieuXuatModel t) {
       String sql = "DELETE FROM PhieuXuat WHERE maPhieu=?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getMaPhieu());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi xóa
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }}

    @Override
    public ArrayList<PhieuXuatModel> selectAll() {
        ArrayList<PhieuXuatModel> list = new ArrayList<>();
        String sql = "SELECT * FROM PhieuXuat";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Date thoiGianTao = rs.getTimestamp("thoiGianTao");
                int accountID = rs.getInt("accountID");
                double tongTien = rs.getDouble("tongTien");

                // Assume you have a method to retrieve AccountModel based on ID
                AccountModel accountModel = this.accountDAO.selectById(accountID);

                PhieuXuatModel phieuXuatModel = new PhieuXuatModel(maPhieu, thoiGianTao, accountModel, tongTien);
                list.add(phieuXuatModel);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi lấy danh sách
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;}

    @Override
    public PhieuXuatModel selectById(int t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    @Override
    public PhieuXuatModel selectByName(String t) {
        
        PhieuXuatModel phieuXuatModel = null;
        String sql = "SELECT * FROM PhieuXuat WHERE maPhieu like ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + t + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Date thoiGianTao = rs.getDate("thoiGianTao");
                int accountID = rs.getInt("accountID");
                double tongTien = rs.getDouble("tongTien");

                // Assume you have a method to retrieve AccountModel based on ID
                AccountModel accountModel = this.accountDAO.selectById(accountID);

                phieuXuatModel = new PhieuXuatModel(maPhieu, thoiGianTao, accountModel, tongTien);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phieuXuatModel;
    
    }

 
    
}
