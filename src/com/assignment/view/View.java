package com.assignment.view;

import com.assignment.fileio.FileIO;
import com.assignment.model.StaffList;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {

    static public StaffList listStaff = new StaffList();
    static String filePath = "";
    static String imageAvtPath = "";
    String[] columns = {"MÃ NHÂN VIÊN", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"};

    JFileChooser chooseFile = new JFileChooser();
    JFileChooser chooseImage = new JFileChooser();
    FileNameExtensionFilter filterInput = new FileNameExtensionFilter("DAT FILE", "dat", "Text FILE", "txt");
    FileNameExtensionFilter filterImage = new FileNameExtensionFilter("PNG images", "png", "Images", "JPG images ", "jpg", "png", "gif", "bmp");
    public DefaultTableModel tblStaffModel = new DefaultTableModel(columns, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    public static boolean isUpdate = false, changedId = false, isOpenFile = false;

   static  int indexStaffSeleted = -1;

//    create default path for file chooser
    Path parentPath = Paths.get("");
    String absolutePath = parentPath.toAbsolutePath().toString();
    File parentFile = new File(absolutePath);
//**********************************
    // create file icon for this JFrame
    ImageIcon img = new ImageIcon("src\\com\\assignment\\avt\\avtnorNew1.png");

    public View() {
        this.setIconImage(img.getImage());
        initComponents();
        this.setTitle("Staff Management");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.tblStaff.getTableHeader().setFont(new Font("Segoe UI", 0, 20));
        this.tblStaff.setModel(tblStaffModel);
        this.lblImage.setText("");
        chooseFile.setAcceptAllFileFilterUsed(false);
        chooseFile.addChoosableFileFilter(filterInput);
        chooseFile.setDialogTitle("Chọn file danh sách nhân viên");
        chooseFile.setCurrentDirectory(parentFile);
        chooseImage.setAcceptAllFileFilterUsed(false);
        chooseImage.setDialogTitle("Chọn hình ảnh đại diện cho nhân viên");
        chooseImage.addChoosableFileFilter(filterImage);
        chooseImage.setCurrentDirectory(new File(absolutePath + "/avts"));
        lblImage.setIcon(new ImageIcon("src\\com\\assignment\\avt\\avtnorNew1.png"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tbnField = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        controlerContainer = new javax.swing.JPanel();
        asideBtnGroup = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnNewStaff = new javax.swing.JButton();
        btnSaveStaff = new javax.swing.JButton();
        btnDeleteStaff = new javax.swing.JButton();
        btnFindStaff = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        article = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        groupRecordBtn = new javax.swing.JPanel();
        btnFirstStaff = new javax.swing.JButton();
        btnPreviousStaff = new javax.swing.JButton();
        btnNextStaff = new javax.swing.JButton();
        btnLastStaff = new javax.swing.JButton();
        lblRecord = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btnImportImage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1120, 7000));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        header.setBackground(new java.awt.Color(104, 167, 173));
        header.setPreferredSize(new java.awt.Dimension(1200, 60));
        header.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(104, 167, 173));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");
        header.add(jLabel1, java.awt.BorderLayout.CENTER);

        lblClock.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblClock.setForeground(new java.awt.Color(239, 179, 79));
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClock.setText("10:20");
        lblClock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblClock.setInheritsPopupMenu(false);
        lblClock.setPreferredSize(new java.awt.Dimension(160, 14));
        header.add(lblClock, java.awt.BorderLayout.LINE_END);

        jLabel8.setPreferredSize(new java.awt.Dimension(65, 14));
        header.add(jLabel8, java.awt.BorderLayout.LINE_START);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        tbnField.setBackground(new java.awt.Color(0, 153, 153));
        tbnField.setPreferredSize(new java.awt.Dimension(1200, 230));
        tbnField.setLayout(new java.awt.BorderLayout());

        tblStaff.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStaff.setRowHeight(25);
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStaff);
        if (tblStaff.getColumnModel().getColumnCount() > 0) {
            tblStaff.getColumnModel().getColumn(0).setResizable(false);
            tblStaff.getColumnModel().getColumn(1).setResizable(false);
            tblStaff.getColumnModel().getColumn(2).setResizable(false);
            tblStaff.getColumnModel().getColumn(3).setResizable(false);
        }

        tbnField.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(tbnField, java.awt.BorderLayout.PAGE_END);

        controlerContainer.setBackground(new java.awt.Color(153, 196, 200));
        controlerContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asideBtnGroup.setPreferredSize(new java.awt.Dimension(150, 444));
        asideBtnGroup.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(150, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNewStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNewStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/New-file-icon.png"))); // NOI18N
        btnNewStaff.setText("New");
        btnNewStaff.setPreferredSize(new java.awt.Dimension(83, 30));
        btnNewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewStaffActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 40));

        btnSaveStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSaveStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/Document-save-icon.png"))); // NOI18N
        btnSaveStaff.setText("Save");
        btnSaveStaff.setPreferredSize(new java.awt.Dimension(83, 30));
        btnSaveStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveStaffActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 40));

        btnDeleteStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDeleteStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/Delete-file-icon.png"))); // NOI18N
        btnDeleteStaff.setText("Delete");
        btnDeleteStaff.setPreferredSize(new java.awt.Dimension(83, 30));
        btnDeleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStaffActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 40));

        btnFindStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFindStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/Start-Menu-Search-icon.png"))); // NOI18N
        btnFindStaff.setText("Find");
        btnFindStaff.setPreferredSize(new java.awt.Dimension(83, 30));
        btnFindStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindStaffActionPerformed(evt);
            }
        });
        jPanel1.add(btnFindStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 40));

        btnOpenFile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpenFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/Documents-icon.png"))); // NOI18N
        btnOpenFile.setText("Open");
        btnOpenFile.setPreferredSize(new java.awt.Dimension(83, 30));
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });
        jPanel1.add(btnOpenFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 40));

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/Button-Close-icon.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(83, 30));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 40));

        asideBtnGroup.add(jPanel1, java.awt.BorderLayout.CENTER);

        controlerContainer.add(asideBtnGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1038, 0, 140, 444));

        article.setPreferredSize(new java.awt.Dimension(320, 444));
        article.setLayout(new java.awt.GridLayout(6, 2));

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel2.setText("MÃ NHÂN VIÊN");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 40));

        txtId.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtId.setOpaque(false);
        txtId.setPreferredSize(new java.awt.Dimension(600, 30));
        jPanel4.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 450, 38));

        article.add(jPanel4);

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel3.setText("HỌ VÀ TÊN");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 40));

        txtFullname.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFullname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtFullname.setPreferredSize(new java.awt.Dimension(600, 30));
        jPanel5.add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 450, 38));

        article.add(jPanel5);

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel4.setText("TUỔI");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 40));

        txtAge.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtAge.setPreferredSize(new java.awt.Dimension(600, 30));
        jPanel6.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 450, 38));

        jLabel7.setText("jLabel7");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, -136, -1, 200));

        article.add(jPanel6);

        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel5.setText("EMAIL");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 60, 40));

        txtEmail.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtEmail.setPreferredSize(new java.awt.Dimension(600, 30));
        jPanel7.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 450, 38));

        article.add(jPanel7);

        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel8.setPreferredSize(new java.awt.Dimension(320, 60));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jLabel6.setText("LƯƠNG");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 40));

        txtSalary.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSalary.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 153, 153)));
        txtSalary.setPreferredSize(new java.awt.Dimension(600, 30));
        jPanel8.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 450, 38));

        article.add(jPanel8);

        btnFirstStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnFirstStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/back_first_icon_176695.png"))); // NOI18N
        btnFirstStaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFirstStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstStaffActionPerformed(evt);
            }
        });

        btnPreviousStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPreviousStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/previous_icon_128297.png"))); // NOI18N
        btnPreviousStaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPreviousStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousStaffActionPerformed(evt);
            }
        });

        btnNextStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNextStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/next_icon_128295.png"))); // NOI18N
        btnNextStaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNextStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextStaffActionPerformed(evt);
            }
        });

        btnLastStaff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLastStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/next_last_icon_176690.png"))); // NOI18N
        btnLastStaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLastStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastStaffActionPerformed(evt);
            }
        });

        lblRecord.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRecord.setText("Record: 0 of 0");

        javax.swing.GroupLayout groupRecordBtnLayout = new javax.swing.GroupLayout(groupRecordBtn);
        groupRecordBtn.setLayout(groupRecordBtnLayout);
        groupRecordBtnLayout.setHorizontalGroup(
            groupRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupRecordBtnLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(btnFirstStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPreviousStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnNextStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnLastStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(lblRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(272, 272, 272))
        );
        groupRecordBtnLayout.setVerticalGroup(
            groupRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupRecordBtnLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(groupRecordBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnFirstStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPreviousStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNextStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLastStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecord))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        article.add(groupRecordBtn);

        controlerContainer.add(article, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 444));

        btnImportImage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnImportImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/images/import-icon.png"))); // NOI18N
        btnImportImage.setText("Image");
        btnImportImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImportImage)
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImportImage)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        controlerContainer.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 270, 444));

        getContentPane().add(controlerContainer, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát và lưu file?");
        if (choice == 0) {
            SaveFile();
            System.exit(0);
        } else if (choice == 1) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewStaffActionPerformed
        FunctionOfView.ClearForm(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage);
        FunctionOfView.FillForm(tblStaffModel);
        isUpdate = false;
        isOpenFile = true;
    }//GEN-LAST:event_btnNewStaffActionPerformed

    private void btnSaveStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveStaffActionPerformed
        if (!isUpdate) {
            System.out.println("Thêm mới");
            FunctionOfView.AddStaff(tblStaffModel, txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage);
            try {
                tblStaff.setRowSelectionInterval(indexStaffSeleted, indexStaffSeleted);
            } catch (IllegalArgumentException e) {
            }
        } else {
            System.out.println("Update");
            FunctionOfView.UpdateStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage);
            indexStaffSeleted = tblStaff.getSelectedRow();
            FunctionOfView.WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
            FunctionOfView.FillForm(tblStaffModel);
        }
        FunctionOfView.UpdateLblRecord(lblRecord, listStaff);
    }//GEN-LAST:event_btnSaveStaffActionPerformed

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        indexStaffSeleted = tblStaff.getSelectedRow();
        FunctionOfView.WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        isUpdate = true;
    }//GEN-LAST:event_tblStaffMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FunctionOfView.updateClock(lblClock);
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStaffActionPerformed
        FunctionOfView.DeleteStaff();
        FunctionOfView.FillForm(tblStaffModel);
        FunctionOfView.ClearForm(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage);
        FunctionOfView.UpdateLblRecord(lblRecord, listStaff);
    }//GEN-LAST:event_btnDeleteStaffActionPerformed

    private void btnFindStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindStaffActionPerformed
        indexStaffSeleted = tblStaff.getSelectedRow();
        FunctionOfView.FindStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        FunctionOfView.UpdateLblRecord(lblRecord, listStaff);
    }//GEN-LAST:event_btnFindStaffActionPerformed

    private void btnFirstStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstStaffActionPerformed
        indexStaffSeleted = 0;
        FunctionOfView.WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        System.out.println(indexStaffSeleted);
    }//GEN-LAST:event_btnFirstStaffActionPerformed

    private void btnPreviousStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousStaffActionPerformed
        if (indexStaffSeleted > 0 && indexStaffSeleted < listStaff.getSize()) {
            indexStaffSeleted--;
            FunctionOfView.WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        } else {
            indexStaffSeleted = listStaff.getSize() - 1;
            FunctionOfView.WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        }
        System.out.println(indexStaffSeleted);
    }//GEN-LAST:event_btnPreviousStaffActionPerformed

    private void btnNextStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextStaffActionPerformed
        if (indexStaffSeleted >= 0 && indexStaffSeleted < listStaff.getSize() - 1) {
            indexStaffSeleted++;
            FunctionOfView.WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        } else {
            indexStaffSeleted = 0;
            FunctionOfView.WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        }
        System.out.println(indexStaffSeleted);
    }//GEN-LAST:event_btnNextStaffActionPerformed

    private void btnLastStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastStaffActionPerformed
        indexStaffSeleted = listStaff.getSize() - 1;
        FunctionOfView.WriteStaff( txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        System.out.println(indexStaffSeleted);
    }//GEN-LAST:event_btnLastStaffActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        OpenFile();
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnImportImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportImageActionPerformed
        choiceImage();
    }//GEN-LAST:event_btnImportImageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel article;
    private javax.swing.JPanel asideBtnGroup;
    private javax.swing.JButton btnDeleteStaff;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindStaff;
    private javax.swing.JButton btnFirstStaff;
    private javax.swing.JButton btnImportImage;
    private javax.swing.JButton btnLastStaff;
    private javax.swing.JButton btnNewStaff;
    private javax.swing.JButton btnNextStaff;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnPreviousStaff;
    private javax.swing.JButton btnSaveStaff;
    private javax.swing.JPanel controlerContainer;
    private javax.swing.JPanel groupRecordBtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JTable tblStaff;
    private javax.swing.JPanel tbnField;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables

    public void OpenFile() {
        chooseFile.showOpenDialog(null);
        try {
            filePath = chooseFile.getSelectedFile().getAbsolutePath();
            isOpenFile = true;
            isUpdate = true;
        } catch (Exception e) {
            return;
        }
        listStaff.RemoveAll();
        FunctionOfView.FillForm(tblStaffModel);
        FunctionOfView.ClearForm(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage);
        try {
            listStaff = (StaffList) FileIO.ReadFile(filePath);
            FunctionOfView.FillForm(tblStaffModel);
            indexStaffSeleted = 0;
            tblStaff.setRowSelectionInterval(indexStaffSeleted, indexStaffSeleted);
            FunctionOfView.WriteStaff(txtId, txtFullname, txtAge, txtEmail, txtSalary, lblImage, lblRecord, listStaff, tblStaff);
        } catch (FileNotFoundException ex) {
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi Class");
        } catch (IOException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "File đang rỗng");
            txtId.grabFocus();
            isUpdate = false;
        }
    }

    public void SaveFile() {
        if (!filePath.isEmpty()) {
            try {
                FileIO.WriteFile(listStaff, filePath);
                JOptionPane.showMessageDialog(null, "Lưu file thành công");
            } catch (IOException ex) {
                System.out.println("Có lỗi file");
            }
        } else {
            filePath = "";
            while (true) {
                filePath = JOptionPane.showInputDialog("Nhập tên cho file để lưu");
                if (!filePath.isEmpty()) {
                    break;
                }
            }
            try {
                File newFile = new File(filePath);
                if (!newFile.createNewFile()) {
                    System.out.println("chưa tạo");
                }
                FileIO.WriteFile(listStaff, filePath);
                JOptionPane.showMessageDialog(null, "Lưu file thành công");
            } catch (IOException ex) {
                System.out.println("Có lỗi file");
            }
        }
    }

    private void choiceImage() {
        chooseImage.showOpenDialog(null);
        try {
            imageAvtPath = chooseImage.getSelectedFile().getAbsolutePath();
        } catch (NullPointerException e) {
            imageAvtPath = "src\\com\\assignment\\avt\\avtnorNew1.png";
        }
        ImageIcon imageIcon = new ImageIcon(imageAvtPath);
        lblImage.setIcon(imageIcon);
    }
    
}
