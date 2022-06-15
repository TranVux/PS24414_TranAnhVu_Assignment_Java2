package com.assignment.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JFrame {

    private final String USERNAME = "fpt";
    private final String PASSWORD = "polytechnic";
//    create icon for this JFrame
    ImageIcon img = new ImageIcon("src\\com\\assignment\\images\\login.png");

    public FormLogin() {
        initComponents();
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                LoadDataUser(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(442, 80));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tài khoản");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 35));

        txtAccount.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtAccount.setCaretColor(new java.awt.Color(51, 153, 255));
        jPanel3.add(txtAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 35));

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mật khẩu");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 35));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPassword.setCaretColor(new java.awt.Color(51, 153, 255));
        jPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 35));

        jPanel2.add(jPanel4);

        btnLogin.setBackground(new java.awt.Color(0, 153, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 93, 93));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(123, 123, 123))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnLogin)
                    .addComponent(btnExit))
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (check()) {
            if (txtAccount.getText().equals(USERNAME) && txtPassword.getText().equals(PASSWORD)) {
                View mainView = new View();
                mainView.setVisible(true);
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                this.setVisible(false);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Mật khẩu hay tài khoản chưa đúng");
                txtAccount.grabFocus();
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát không") == 0) {
            System.exit(0);
        }
        txtAccount.grabFocus();
    }//GEN-LAST:event_btnExitActionPerformed

    private void LoadDataUser(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoadDataUser

    }//GEN-LAST:event_LoadDataUser


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

    public boolean check() {
        if (txtAccount.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không được để trống mật khẩu và tên đăng nhập", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
}
