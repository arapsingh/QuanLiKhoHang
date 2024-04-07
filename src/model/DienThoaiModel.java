/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pc
 */
public class DienThoaiModel {
    private int maDT;
    private String tenDT;
    private String manHinh;
    private String cameraTruoc;
    private String cameraSau;
    private String chip;
    private String heDieuHanh;
    private int ram;
    private String dungLuong;
    private String sim;
    private String pin;
    private String sac;
    private String kichThuoc;
    private double khoiLuong;
    private int soLuong;
    private double gia;
    private int trangThai;

    public int getMaDT() {
        return maDT;
    }

    public void setMaDT(int maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getManHinh() {
        return manHinh;
    }

    public void setManHinh(String manHinh) {
        this.manHinh = manHinh;
    }

    public String getCameraTruoc() {
        return cameraTruoc;
    }

    public void setCameraTruoc(String cameraTruoc) {
        this.cameraTruoc = cameraTruoc;
    }

    public String getCameraSau() {
        return cameraSau;
    }

    public void setCameraSau(String cameraSau) {
        this.cameraSau = cameraSau;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getSac() {
        return sac;
    }

    public void setSac(String sac) {
        this.sac = sac;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    public void setHeDieuHanh(String heDieuHanh) {
        this.heDieuHanh = heDieuHanh;
    }

    public DienThoaiModel(String tenDT, String manHinh, String cameraTruoc, String cameraSau, String chip, String heDieuHanh, int ram, String dungLuong, String sim, String pin, String sac, String kichThuoc, double khoiLuong, int soLuong, double gia, int trangThai) {
        this.tenDT = tenDT;
        this.manHinh = manHinh;
        this.cameraTruoc = cameraTruoc;
        this.cameraSau = cameraSau;
        this.chip = chip;
        this.heDieuHanh = heDieuHanh;
        this.ram = ram;
        this.dungLuong = dungLuong;
        this.sim = sim;
        this.pin = pin;
        this.sac = sac;
        this.kichThuoc = kichThuoc;
        this.khoiLuong = khoiLuong;
        this.soLuong = soLuong;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public DienThoaiModel(int maDT, String tenDT, String manHinh, String cameraTruoc, String cameraSau, String chip, String heDieuHanh, int ram, String dungLuong, String sim, String pin, String sac, String kichThuoc, double khoiLuong, int soLuong, double gia, int trangThai) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.manHinh = manHinh;
        this.cameraTruoc = cameraTruoc;
        this.cameraSau = cameraSau;
        this.chip = chip;
        this.heDieuHanh = heDieuHanh;
        this.ram = ram;
        this.dungLuong = dungLuong;
        this.sim = sim;
        this.pin = pin;
        this.sac = sac;
        this.kichThuoc = kichThuoc;
        this.khoiLuong = khoiLuong;
        this.soLuong = soLuong;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiModel{" + "maDT=" + maDT + ", tenDT=" + tenDT + ", manHinh=" + manHinh + ", cameraTruoc=" + cameraTruoc + ", cameraSau=" + cameraSau + ", chip=" + chip + ", heDieuHanh=" + heDieuHanh + ", ram=" + ram + ", dungLuong=" + dungLuong + ", sim=" + sim + ", pin=" + pin + ", sac=" + sac + ", kichThuoc=" + kichThuoc + ", khoiLuong=" + khoiLuong + ", soLuong=" + soLuong + ", gia=" + gia + ", trangThai=" + trangThai + '}';
    }

    
    
    
    
}
