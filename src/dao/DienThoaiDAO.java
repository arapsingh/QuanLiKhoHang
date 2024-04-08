/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import model.DienThoaiModel;

/**
 *
 * @author pc
 */
public class DienThoaiDAO implements DAOInterface <DienThoaiModel> {
     private DBConnection db;

    public DienThoaiDAO() {
        this.db = new DBConnection();
    }

    @Override
    public int insert(DienThoaiModel t) {
        String sql = "INSERT INTO DienThoai (tenDT, manHinh, heDieuHanh, cameraTruoc, cameraSau, chip, ram, dungLuong, sim, pin, sac, kichThuoc, khoiLuong, soLuong, gia, trangThai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getTenDT());
            stmt.setString(2, t.getManHinh());
            stmt.setString(3, t.getHeDieuHanh());
            stmt.setString(4, t.getCameraTruoc());
            stmt.setString(5, t.getCameraSau());
            stmt.setString(6, t.getChip());
            stmt.setInt(7, t.getRam());
            stmt.setString(8, t.getDungLuong());
            stmt.setString(9, t.getSim());
            stmt.setString(10, t.getPin());
            stmt.setString(11, t.getSac());
            stmt.setString(12, t.getKichThuoc());
            stmt.setDouble(13, t.getKhoiLuong());
            stmt.setInt(14, t.getSoLuong());
            stmt.setDouble(15, t.getGia());
            stmt.setInt(16, t.getTrangThai());

            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi thêm
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(DienThoaiModel t) {
        String sql = "UPDATE DienThoai SET tenDT=?, manHinh=?, heDieuHanh=?, cameraTruoc=?, cameraSau=?, chip=?, ram=?, dungLuong=?, sim=?, pin=?, sac=?, kichThuoc=?, khoiLuong=?, soLuong=?, gia=?, trangThai=?  WHERE maDT=?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, t.getTenDT());
            stmt.setString(2, t.getManHinh());
            stmt.setString(3, t.getHeDieuHanh());
            stmt.setString(4, t.getCameraTruoc());
            stmt.setString(5, t.getCameraSau());
            stmt.setString(6, t.getChip());
            stmt.setInt(7, t.getRam());
            stmt.setString(8, t.getDungLuong());
            stmt.setString(9, t.getSim());
            stmt.setString(10, t.getPin());
            stmt.setString(11, t.getSac());
            stmt.setString(12, t.getKichThuoc());
            stmt.setDouble(13, t.getKhoiLuong());
            stmt.setInt(14, t.getSoLuong());
            stmt.setDouble(15, t.getGia());
            stmt.setInt(16, t.getTrangThai());
            stmt.setInt(17, t.getMaDT());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi thêm
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int delete(DienThoaiModel t) {
        String sql = "DELETE FROM DienThoia WHERE maDT = ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, t.getMaDT());
            boolean result = db.executeNonQuery(stmt);
            db.closeConnection(); // Đóng kết nối sau khi xóa
            return 1;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public ArrayList<DienThoaiModel> selectAll() {
        ArrayList<DienThoaiModel> list = new ArrayList<>();
        String sql = "SELECT * FROM DienThoai";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int maDT = rs.getInt("maDT");
                String tenDT = rs.getString("tenDT");
                String manHinh = rs.getString("manHinh");
                String heDieuHanh = rs.getString("heDieuHanh");
                String cameraTruoc = rs.getString("cameraTruoc");
                String cameraSau = rs.getString("cameraSau");
                String chip = rs.getString("chip");
                int ram = rs.getInt("ram");
                String dungLuong = rs.getString("dungLuong");
                String sim = rs.getString("sim");
                String pin = rs.getString("pin");
                String sac = rs.getString("sac");
                String kichThuoc = rs.getString("kichThuoc");
                double khoiLuong = rs.getDouble("khoiLuong");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                int trangThai = rs.getInt("trangThai");
                DienThoaiModel dt = new DienThoaiModel(tenDT, manHinh, heDieuHanh, cameraTruoc, cameraSau, chip, ram, dungLuong, sim, pin, sac, kichThuoc, khoiLuong, soLuong, gia, trangThai);
                list.add(dt);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi lấy danh sách
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public DienThoaiModel selectById(int t) {
        DienThoaiModel dt = null;
        String sql = "SELECT * FROM DienThoai WHERE maDT = ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,  t );
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int maDT = rs.getInt("maDT");
                String tenDT = rs.getString("tenDT");
                String manHinh = rs.getString("manHinh");
                String heDieuHanh = rs.getString("heDieuHanh");
                String cameraTruoc = rs.getString("cameraTruoc");
                String cameraSau = rs.getString("cameraSau");
                String chip = rs.getString("chip");
                int ram = rs.getInt("ram");
                String dungLuong = rs.getString("dungLuong");
                String sim = rs.getString("sim");
                String pin = rs.getString("pin");
                String sac = rs.getString("sac");
                String kichThuoc = rs.getString("kichThuoc");
                double khoiLuong = rs.getDouble("khoiLuong");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                int trangThai = rs.getInt("trangThai");
                dt = new DienThoaiModel(tenDT, manHinh, heDieuHanh, cameraTruoc, cameraSau, chip, ram, dungLuong, sim, pin, sac, kichThuoc, khoiLuong, soLuong, gia, trangThai);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dt;
    }
    public DienThoaiModel selectByTenDT(String t) {
        DienThoaiModel dt = null;
        String sql = "SELECT * FROM DienThoai WHERE tenDT LIKE ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + t + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int maDT = rs.getInt("maDT");
                String tenDT = rs.getString("tenDT");
                String manHinh = rs.getString("manHinh");
                String heDieuHanh = rs.getString("heDieuHanh");
                String cameraTruoc = rs.getString("cameraTruoc");
                String cameraSau = rs.getString("cameraSau");
                String chip = rs.getString("chip");
                int ram = rs.getInt("ram");
                String dungLuong = rs.getString("dungLuong");
                String sim = rs.getString("sim");
                String pin = rs.getString("pin");
                String sac = rs.getString("sac");
                String kichThuoc = rs.getString("kichThuoc");
                double khoiLuong = rs.getDouble("khoiLuong");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                int trangThai = rs.getInt("trangThai");
                dt = new DienThoaiModel(tenDT, manHinh, heDieuHanh, cameraTruoc, cameraSau, chip, ram, dungLuong, sim, pin, sac, kichThuoc, khoiLuong, soLuong, gia, trangThai);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dt;
    } 

    @Override
    public DienThoaiModel selectByName(String t) {
        DienThoaiModel dt = null;
        String sql = "SELECT * FROM DienThoai WHERE tenDT LIKE ?";
        try {
            Connection con = db.getCon();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + t + "%");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int maDT = rs.getInt("maDT");
                String tenDT = rs.getString("tenDT");
                String manHinh = rs.getString("manHinh");
                String heDieuHanh = rs.getString("heDieuHanh");
                String cameraTruoc = rs.getString("cameraTruoc");
                String cameraSau = rs.getString("cameraSau");
                String chip = rs.getString("chip");
                int ram = rs.getInt("ram");
                String dungLuong = rs.getString("dungLuong");
                String sim = rs.getString("sim");
                String pin = rs.getString("pin");
                String sac = rs.getString("sac");
                String kichThuoc = rs.getString("kichThuoc");
                double khoiLuong = rs.getDouble("khoiLuong");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                int trangThai = rs.getInt("trangThai");
                dt = new DienThoaiModel(tenDT, manHinh, heDieuHanh, cameraTruoc, cameraSau, chip, ram, dungLuong, sim, pin, sac, kichThuoc, khoiLuong, soLuong, gia, trangThai);
            }
            rs.close();
            db.closeConnection(); // Đóng kết nối sau khi tìm kiếm
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dt;}
    
}
