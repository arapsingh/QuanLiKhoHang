/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DBConnection;
import java.util.ArrayList;
import model.PhieuNhapModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import model.AccountModel;
import model.NhaCungCapModel;

/**
 *
 * @author nhanprovjp
 */
public class PhieuNhapDAO  implements DAOInterface<PhieuNhapModel> {

    private DBConnection db;
    private AccountDAO accountDAO;
    private NhaCungCapDAO nhaCungCapDAO;

    public PhieuNhapDAO() {
        this.db = new DBConnection();
        this.accountDAO = new AccountDAO();
        this.nhaCungCapDAO = new NhaCungCapDAO();
    }
    
    @Override
    public int insert(PhieuNhapModel t) {
        String sql = "INSERT INTO PhieuNhap (maPhieu, thoiGianTao, accountID, nhaCungCapID, tongTien) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getMaPhieu());
            stmt.setTimestamp(2, new java.sql.Timestamp(t.getThoiGianTao().getTime()));
            stmt.setInt(3, t.getAccountModel().getId());
            stmt.setString(4, t.getNhaCungCapModel().getMaNhaCungCap());
            stmt.setDouble(5, t.getTongTien());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi thêm
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }}

    @Override
    public int update(PhieuNhapModel t) {
       String sql = "UPDATE PhieuNhap SET thoiGianTao=?, accountID=?, nhaCungCapID=?, tongTien=? WHERE maPhieu=?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setTimestamp(1, new java.sql.Timestamp(t.getThoiGianTao().getTime()));
            stmt.setInt(2, t.getAccountModel().getId());
            stmt.setString(3, t.getNhaCungCapModel().getMaNhaCungCap());
            stmt.setDouble(4, t.getTongTien());
            stmt.setString(5, t.getMaPhieu());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi cập nhật
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }}

    @Override
    public int delete(PhieuNhapModel t) {
         String sql = "DELETE FROM PhieuNhap WHERE maPhieu=?";
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
    public ArrayList<PhieuNhapModel> selectAll() {
      ArrayList<PhieuNhapModel> list = new ArrayList<>();
        String sql = "SELECT * FROM PhieuNhap";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                 Date thoiGianTao = rs.getTimestamp("thoiGianTao");
                int accountID = rs.getInt("nguoiTao");
                int nhaCungCapID = rs.getInt("maNhaCungCap");
                double tongTien = rs.getDouble("tongTien");

                // Assume you have a method to retrieve AccountModel and NhaCungCapModel based on their IDs
                AccountModel accountModel = this.accountDAO.selectById(accountID);
                NhaCungCapModel nhaCungCapModel = this.nhaCungCapDAO.selectById(nhaCungCapID);

                PhieuNhapModel phieuNhapModel = new PhieuNhapModel(maPhieu, thoiGianTao, accountModel, nhaCungCapModel, tongTien);
                list.add(phieuNhapModel);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi lấy danh sách
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;}

    @Override
    public PhieuNhapModel selectById(int t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }

    @Override
    public PhieuNhapModel selectByName(String t) {
        
    PhieuNhapModel phieuNhapModel = null;
        String sql = "SELECT * FROM PhieuNhap WHERE maPhieu LIKE ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + t + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Date thoiGianTao = rs.getTimestamp("thoiGianTao");
                int accountID = rs.getInt("accountID");
                int nhaCungCapID = rs.getInt("nhaCungCapID");
                double tongTien = rs.getDouble("tongTien");

                // Assume you have a method to retrieve AccountModel and NhaCungCapModel based on their IDs
                AccountModel accountModel = this.accountDAO.selectById(accountID);
                NhaCungCapModel nhaCungCapModel = this.nhaCungCapDAO.selectById(nhaCungCapID);

                phieuNhapModel = new PhieuNhapModel(maPhieu, thoiGianTao, accountModel, nhaCungCapModel, tongTien);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return phieuNhapModel;
    }

    

    
    
}
