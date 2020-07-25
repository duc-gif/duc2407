/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myJInternalFrame;

/**
 *
 * @author markhyun
 */
public class DangKy extends javax.swing.JInternalFrame {

    /**
     * Creates new form DangKy
     */
    public DangKy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel4 = new keeptoo.KGradientPanel();
        lbDangKy = new javax.swing.JLabel();
        lbTenDangNhap = new javax.swing.JLabel();
        lbMatKhau = new javax.swing.JLabel();
        lbVaiTro = new javax.swing.JLabel();
        lbXacNhan = new javax.swing.JLabel();
        lbMaNV = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtXacNhan = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        cbbVaiTro = new javax.swing.JComboBox<>();
        btnDangKi = new javax.swing.JButton();
        btnVaoQuanLi = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        kGradientPanel4.setkEndColor(new java.awt.Color(229, 189, 240));
        kGradientPanel4.setkGradientFocus(1000);
        kGradientPanel4.setkStartColor(new java.awt.Color(168, 168, 233));

        lbDangKy.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        lbDangKy.setForeground(new java.awt.Color(255, 255, 255));
        lbDangKy.setText("Đăng ký");

        lbTenDangNhap.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbTenDangNhap.setForeground(new java.awt.Color(252, 244, 252));
        lbTenDangNhap.setText("Tên đăng nhập:");

        lbMatKhau.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMatKhau.setForeground(new java.awt.Color(252, 244, 252));
        lbMatKhau.setText("Mật khẩu: ");

        lbVaiTro.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbVaiTro.setForeground(new java.awt.Color(252, 244, 252));
        lbVaiTro.setText("Vai trò:");

        lbXacNhan.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbXacNhan.setForeground(new java.awt.Color(252, 244, 252));
        lbXacNhan.setText("Xác nhận: ");

        lbMaNV.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        lbMaNV.setForeground(new java.awt.Color(252, 244, 252));
        lbMaNV.setText("Mã nhân viên:  ");

        txtTenDangNhap.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        txtMatKhau.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });

        txtXacNhan.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        txtMaNV.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N

        cbbVaiTro.setEditable(true);
        cbbVaiTro.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        cbbVaiTro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lí", "Nhân viên", "" }));
        cbbVaiTro.setOpaque(false);

        btnDangKi.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnDangKi.setForeground(new java.awt.Color(72, 61, 139));
        btnDangKi.setText("Đăng kí");
        btnDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKiActionPerformed(evt);
            }
        });

        btnVaoQuanLi.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        btnVaoQuanLi.setForeground(new java.awt.Color(72, 61, 139));
        btnVaoQuanLi.setText("Vào quản lí");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                            .addGap(192, 192, 192)
                            .addComponent(btnDangKi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(35, 35, 35)
                            .addComponent(btnVaoQuanLi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(108, 108, 108))
                        .addGroup(kGradientPanel4Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbXacNhan)
                                        .addComponent(lbMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lbTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(lbMaNV))
                                .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(lbVaiTro)))
                            .addGap(59, 59, 59)
                            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMatKhau)
                                .addGroup(kGradientPanel4Layout.createSequentialGroup()
                                    .addComponent(cbbVaiTro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(113, 113, 113))
                                .addComponent(txtMaNV)
                                .addComponent(txtXacNhan)
                                .addComponent(txtTenDangNhap)))
                        .addComponent(lbDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbDangKy)
                    .addGap(28, 28, 28)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTenDangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTenDangNhap, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(24, 24, 24)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbMatKhau, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtXacNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbXacNhan, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(18, 18, 18)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbbVaiTro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbVaiTro, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(18, 18, 18)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbMaNV, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(18, 18, 18)
                    .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDangKi, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnVaoQuanLi, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void btnDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangKiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKi;
    private javax.swing.JButton btnVaoQuanLi;
    private javax.swing.JComboBox<String> cbbVaiTro;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel lbDangKy;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbTenDangNhap;
    private javax.swing.JLabel lbVaiTro;
    private javax.swing.JLabel lbXacNhan;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtXacNhan;
    // End of variables declaration//GEN-END:variables
}
