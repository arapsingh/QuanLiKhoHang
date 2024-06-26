package view;

import dao.DienThoaiDAO;
import javax.swing.JOptionPane;
import model.DienThoaiModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pc
 */
public class ThemSanPham extends javax.swing.JFrame {
    private SanPhamForm returnSP;


    /**
     * Creates new form ThemSanPham
     */
    public ThemSanPham(SanPhamForm returnSP) {
        initComponents();
        this.returnSP = returnSP; // Save the TaiKhoanForm instance
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        behindCamLbl = new javax.swing.JLabel();
        frontCamLbl = new javax.swing.JLabel();
        osLbl = new javax.swing.JLabel();
        screenTxt = new javax.swing.JTextField();
        screenLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        osTxt = new javax.swing.JTextField();
        frontCamTxt = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        behindCamTxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ramLbl = new javax.swing.JLabel();
        chipTxt = new javax.swing.JTextField();
        batteryTxt = new javax.swing.JTextField();
        chargerTxt = new javax.swing.JTextField();
        sizeTxt = new javax.swing.JTextField();
        weightTxt = new javax.swing.JTextField();
        quantityTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        capacityTxt = new javax.swing.JTextField();
        ramTxt = new javax.swing.JTextField();
        batteryLbl = new javax.swing.JLabel();
        chargerLbl = new javax.swing.JLabel();
        sizeLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        quantityLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        capacityLbl = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        statusCb = new javax.swing.JComboBox<>();
        simTxt = new javax.swing.JTextField();
        simLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(157, 236, 233));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jPanel7.setBackground(new java.awt.Color(194, 238, 194));

        behindCamLbl.setText("Camera sau");

        frontCamLbl.setText("Camera trước");

        osLbl.setText("Hệ điều hành");

        screenTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenTxtActionPerformed(evt);
            }
        });

        screenLbl.setText("Màn hình");

        nameLbl.setText("Tên điện thoại");

        btnSave.setBackground(new java.awt.Color(35, 210, 64));
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(243, 33, 60));
        btnCancel.setText("Hủy");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel17.setText("Chip");

        ramLbl.setText("Ram");

        batteryLbl.setText("Pin");

        chargerLbl.setText("Sạc");

        sizeLbl.setText("Kích thước");

        weightLbl.setText("Khối lượng");

        quantityLbl.setText("Số lượng");

        priceLbl.setText("Giá");

        capacityLbl.setText("Dung lượng");

        statusLbl.setText("Trạng thái");

        statusCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa có", "Đã có" }));

        simLbl.setText("Sim");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(76, 76, 76)
                        .addComponent(btnCancel)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel17)
                                .addComponent(behindCamLbl)
                                .addComponent(osLbl)
                                .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(nameLbl)
                                .addComponent(screenLbl)
                                .addComponent(screenTxt)
                                .addComponent(osTxt)
                                .addComponent(frontCamLbl)
                                .addComponent(frontCamTxt)
                                .addComponent(behindCamTxt)
                                .addComponent(ramLbl)
                                .addComponent(chipTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(ramTxt)
                                .addComponent(simTxt))
                            .addComponent(simLbl))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batteryTxt)
                            .addComponent(chargerTxt)
                            .addComponent(sizeTxt)
                            .addComponent(weightTxt)
                            .addComponent(quantityTxt)
                            .addComponent(priceTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(capacityTxt)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(batteryLbl)
                                    .addComponent(chargerLbl)
                                    .addComponent(sizeLbl)
                                    .addComponent(weightLbl)
                                    .addComponent(quantityLbl)
                                    .addComponent(priceLbl)
                                    .addComponent(capacityLbl)
                                    .addComponent(statusLbl))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(statusCb, 0, 209, Short.MAX_VALUE))))
                .addGap(81, 81, 81))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLbl)
                    .addComponent(batteryLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batteryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(screenLbl)
                    .addComponent(chargerLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(screenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chargerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osLbl)
                    .addComponent(sizeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(osTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frontCamLbl)
                    .addComponent(weightLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frontCamTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(behindCamLbl)
                    .addComponent(quantityLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(behindCamTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(priceLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ramLbl)
                    .addComponent(capacityLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ramTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLbl)
                    .addComponent(simLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(12, 12, 12))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 620, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void screenTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_screenTxtActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            String tenDT = nameTxt.getText();
            String manHinh = screenTxt.getText();
            String heDieuHanh = osTxt.getText();
            String cameraTruoc = frontCamTxt.getText();
            String cameraSau = behindCamTxt.getText();
            String chip = chipTxt.getText();
            int ram = Integer.parseInt(ramTxt.getText());
            String dungLuong = capacityTxt.getText();
            String sim = simTxt.getText();
            String pin = batteryTxt.getText();
            String sac = chargerTxt.getText();
            String kichThuoc = sizeTxt.getText();
            double khoiLuong = Double.parseDouble(weightTxt.getText());
            int soLuong = Integer.parseInt(quantityTxt.getText());
            double gia = Double.parseDouble(priceTxt.getText());
            String selectedTrangThai = (String) statusCb.getSelectedItem();
            int status;
            if (selectedTrangThai.equals("Đã có")) {
                status = 1;
            } else if (selectedTrangThai.equals("Chưa có")) {
                status = 0;
            } else {
                // Xử lý trường hợp không xác định được
                status = 0; // hoặc một giá trị mặc định khác
            }            
            DienThoaiDAO dtDAO = new DienThoaiDAO();
            if (!tenDT.isEmpty() && !manHinh.isEmpty() && !heDieuHanh.isEmpty() && !cameraTruoc.isEmpty() && 
                    !cameraSau.isEmpty() && !chip.isEmpty() && !dungLuong.isEmpty() && !sim.isEmpty() && !pin.isEmpty()
                    && !sac.isEmpty() && !kichThuoc.isEmpty() && !selectedTrangThai.isEmpty() && !ramTxt.getText().isEmpty() 
                    && !weightTxt.getText().isEmpty() && !quantityTxt.getText().isEmpty() && !priceTxt.getText().isEmpty()) {
                if (dtDAO.selectByName(tenDT) == null) {
                    DienThoaiDAO dtDAO1 = new DienThoaiDAO();
                    DienThoaiModel dt = new DienThoaiModel(tenDT, manHinh, heDieuHanh, cameraTruoc, cameraSau, chip, ram, dungLuong, sim, pin, sac, kichThuoc, khoiLuong, soLuong, gia, status);
                    dtDAO1.insert(dt);
                    JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công");
                    this.dispose();
                    DienThoaiDAO dtDAO2 = new DienThoaiDAO();
                    returnSP.loadDataToTable(dtDAO2.selectAll()); // loadDataToTable method should be public
                    
                } else {                       
                    JOptionPane.showMessageDialog(this, "Sản phẩm đã tồn tại!");
                }
            } else {                        
                JOptionPane.showMessageDialog(this, "Hãy điền đầy đủ thông tin!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SanPhamForm sanPhamForm = new SanPhamForm(); // Create an instance of TaiKhoanForm
                sanPhamForm.setVisible(true); // Make TaiKhoanForm visible
                // Now, you can pass taiKhoanForm instance to ThemTaiKhoan constructor
                new ThemSanPham(sanPhamForm).setVisible(true); // Pass the instance of TaiKhoanForm to ThemTaiKhoan
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel batteryLbl;
    private javax.swing.JTextField batteryTxt;
    private javax.swing.JLabel behindCamLbl;
    private javax.swing.JTextField behindCamTxt;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel capacityLbl;
    private javax.swing.JTextField capacityTxt;
    private javax.swing.JLabel chargerLbl;
    private javax.swing.JTextField chargerTxt;
    private javax.swing.JTextField chipTxt;
    private javax.swing.JLabel frontCamLbl;
    private javax.swing.JTextField frontCamTxt;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel osLbl;
    private javax.swing.JTextField osTxt;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JLabel quantityLbl;
    private javax.swing.JTextField quantityTxt;
    private javax.swing.JLabel ramLbl;
    private javax.swing.JTextField ramTxt;
    private javax.swing.JLabel screenLbl;
    private javax.swing.JTextField screenTxt;
    private javax.swing.JLabel simLbl;
    private javax.swing.JTextField simTxt;
    private javax.swing.JLabel sizeLbl;
    private javax.swing.JTextField sizeTxt;
    private javax.swing.JComboBox<String> statusCb;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField weightTxt;
    // End of variables declaration//GEN-END:variables
}
