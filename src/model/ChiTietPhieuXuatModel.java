/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pc
 */
public class ChiTietPhieuXuatModel {
    private PhieuXuatModel phieuXuatModel;
    private DienThoaiModel sanPhamModel;
    private int soLuong;
    private double donGia;

    public PhieuXuatModel getPhieuXuatModel() {
        return phieuXuatModel;
    }

    public void setPhieuXuatModel(PhieuXuatModel phieuXuatModel) {
        this.phieuXuatModel = phieuXuatModel;
    }

    public DienThoaiModel getSanPhamModel() {
        return sanPhamModel;
    }

    public void setSanPhamModel(DienThoaiModel sanPhamModel) {
        this.sanPhamModel = sanPhamModel;
    }


    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public ChiTietPhieuXuatModel(PhieuXuatModel phieuXuatModel, DienThoaiModel sanPhamModel, int soLuong, double donGia) {
        this.phieuXuatModel = phieuXuatModel;
        this.sanPhamModel = sanPhamModel;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuXuatModel{" + "phieuXuatModel=" + phieuXuatModel + ", sanPhamModel=" + sanPhamModel + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
    
    
}
