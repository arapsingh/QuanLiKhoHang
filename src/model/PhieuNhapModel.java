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
public class PhieuNhapModel {
    private String maPhieu;
    private Date thoiGianTao;
    private AccountModel accountModel;
    private NhaCungCapModel nhaCungCapModel;
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


    public NhaCungCapModel getNhaCungCapModel() {
        return nhaCungCapModel;
    }

    public void setNhaCungCapModel(NhaCungCapModel nhaCungCapModel) {
        this.nhaCungCapModel = nhaCungCapModel;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public PhieuNhapModel(String maPhieu, Date thoiGianTao, AccountModel accountModel, NhaCungCapModel nhaCungCapModel, double tongTien) {
        this.maPhieu = maPhieu;
        this.thoiGianTao = thoiGianTao;
        this.accountModel = accountModel;
        this.nhaCungCapModel = nhaCungCapModel;
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "PhieuNhapModel{" + "maPhieu=" + maPhieu + ", thoiGianTao=" + thoiGianTao + ", accountModel=" + accountModel + ", nhaCungCapModel=" + nhaCungCapModel + ", tongTien=" + tongTien + '}';
    }
   
    
    
}
