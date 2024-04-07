/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pc
 */
public class ChiTietPhieuNhapModel {
    private PhieuNhapModel phieuNhapModel;
    private DienThoaiModel sanPhamModel;
    private int soLuong;
    private double donGia;

    public PhieuNhapModel getPhieuNhapModel() {
        return phieuNhapModel;
    }

    public void setPhieuNhapModel(PhieuNhapModel phieuNhapModel) {
        this.phieuNhapModel = phieuNhapModel;
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

    public DienThoaiModel getSanPhamModel() {
        return sanPhamModel;
    }

    public void setSanPhamModel(DienThoaiModel sanPhamModel) {
        this.sanPhamModel = sanPhamModel;
    }

    public ChiTietPhieuNhapModel(PhieuNhapModel phieuNhapModel, DienThoaiModel sanPhamModel, int soLuong, double donGia) {
        this.phieuNhapModel = phieuNhapModel;
        this.sanPhamModel = sanPhamModel;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhapModel{" + "phieuNhapModel=" + phieuNhapModel + ", sanPhamModel=" + sanPhamModel + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

    
}
