/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author pc
 */
public class PhieuXuatModel {
    private String maPhieu;
    private Date thoiGianTao;
    private AccountModel accountModel;
    private double tongTien;

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Date getThoiGianTao() {
        return thoiGianTao;
    }

    public void setThoiGianTao(Date thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public AccountModel getAccountModel() {
        return accountModel;
    }

    public void setAccountModel(AccountModel accountModel) {
        this.accountModel = accountModel;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public PhieuXuatModel(String maPhieu, Date thoiGianTao, AccountModel accountModel, double tongTien) {
        this.maPhieu = maPhieu;
        this.thoiGianTao = thoiGianTao;
        this.accountModel = accountModel;
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "PhieuXuatModel{" + "maPhieu=" + maPhieu + ", thoiGianTao=" + thoiGianTao + ", accountModel=" + accountModel + ", tongTien=" + tongTien + '}';
    }
    
}
