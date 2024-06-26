/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author pc
 */
public class MenuForm extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer MenuForm
     */
    public MenuForm() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        btnSanPham = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Nhập hàng icon.png"))); // NOI18N
        jButton11.setText("Nhập hàng");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Xuất hàng icon.png"))); // NOI18N
        jButton12.setText("Xuất hàng");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Phiếu nhập hàng icon.png"))); // NOI18N
        jButton13.setText("Phiếu nhập hàng");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Thống kê icon.png"))); // NOI18N
        jButton14.setText("Thống kê");
        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon_profile1.png"))); // NOI18N
        jButton15.setText("Quản lí tài khoản");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Remove cr-fr.png"))); // NOI18N
        jButton16.setText("Đăng xuất");
        jButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 430, 520));

        btnSanPham.setBackground(new java.awt.Color(0, 204, 102));
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Sản phẩm icon.png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.setBorder(null);
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });
        add(btnSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 204, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tồn kho icon.png"))); // NOI18N
        jButton6.setText("Tồn kho");
        jButton6.setBorder(null);
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 204, 102));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Phiếu xuất kho icon.png"))); // NOI18N
        jButton7.setText("Phiếu xuất hàng");
        jButton7.setBorder(null);
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jButton8.setBackground(new java.awt.Color(0, 204, 102));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Nhà cung cấp icon.png"))); // NOI18N
        jButton8.setText("Nhà cung cấp");
        jButton8.setBorder(null);
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jButton9.setBackground(new java.awt.Color(0, 204, 102));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/settings1.png"))); // NOI18N
        jButton9.setText("Thông tin tài khoản");
        jButton9.setBorder(null);
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jButton10.setBackground(new java.awt.Color(0, 204, 102));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Danh mục sản phẩm icon.png"))); // NOI18N
        jButton10.setText("Danh mục sản phẩm");
        jButton10.setBorder(null);
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        SanPhamForm spframe = new SanPhamForm();
        spframe.setLocationRelativeTo(null);
        spframe.setVisible(true);
        spframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnSanPhamActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
