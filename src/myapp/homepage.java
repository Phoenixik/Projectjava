package myapp;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class homepage extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    PreparedStatement stat;
    String selectquery;
    ResultSet rs;

    CardLayout panelLayout;

    public homepage() {

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection("jdbc:sqlserver://IKAY\\MSSQLSERVERIK;databaseName=Library;user=sa;password=9815");
            stmt = con.createStatement();

        } catch (Exception e) {
            System.out.println("Error : " + "Could not connect to server");
        }

        initComponents();

        panelLayout = (CardLayout) (maingradientcard.getLayout());
    }

    public final ImageIcon createImage(String path) {
        return new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getClass().getResource(path));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        maingradientcard = new keeptoo.KGradientPanel();
        kGradientPaneluser = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        myjPanel1 = new javax.swing.JPanel();
        jLabeltxt3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox_mycheckbox = new javax.swing.JCheckBox();
        kGradientPanel_message = new keeptoo.KGradientPanel();
        jLabelup = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jButton1_login1 = new javax.swing.JButton();
        jButton_admin = new javax.swing.JButton();
        kGradientPaneladmin = new keeptoo.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        myjPanel2 = new javax.swing.JPanel();
        jLabeltxt4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_admin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField_admin = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox_admin = new javax.swing.JCheckBox();
        kGradientPanel_message1 = new keeptoo.KGradientPanel();
        jLabelup1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        adminlogin = new javax.swing.JButton();
        jButton_user = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setText("PhoenixTours");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHOENIX TOURS ");
        getContentPane().setLayout(new java.awt.CardLayout());

        maingradientcard.setBackground(new java.awt.Color(255, 255, 255));
        maingradientcard.setAutoscrolls(true);
        maingradientcard.setLayout(new java.awt.CardLayout());

        kGradientPaneluser.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPaneluser.setkStartColor(new java.awt.Color(155, 0, 153));
        kGradientPaneluser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("PhoenixTours");
        kGradientPaneluser.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 1109, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html> We plan your trip... <br> Your fun is our priority");
        kGradientPaneluser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 450, 115));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/Capture.PNG"))); // NOI18N
        jLabel3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/travelc.jpg"))); // NOI18N
        jLabel3.setEnabled(false);
        kGradientPaneluser.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 500, 272));

        jLabeltxt3.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltxt3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabeltxt3.setText("Clerk Login");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Username");

        jTextField_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Password");

        jPasswordField_pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField_pass.setText("jPasswordField1");
        jPasswordField_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPasswordField_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_passActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Show Password");

        jCheckBox_mycheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_mycheckboxMouseClicked(evt);
            }
        });
        jCheckBox_mycheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_mycheckboxActionPerformed(evt);
            }
        });

        kGradientPanel_message.setBackground(new java.awt.Color(0, 204, 204));
        kGradientPanel_message.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel_message.setkStartColor(new java.awt.Color(0, 204, 204));

        jLabelup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/Up.png"))); // NOI18N
        jLabelup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelupMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel8.setText("Enter correct login details");

        javax.swing.GroupLayout kGradientPanel_messageLayout = new javax.swing.GroupLayout(kGradientPanel_message);
        kGradientPanel_message.setLayout(kGradientPanel_messageLayout);
        kGradientPanel_messageLayout.setHorizontalGroup(
            kGradientPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel_messageLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addComponent(jLabelup, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel_messageLayout.setVerticalGroup(
            kGradientPanel_messageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel_messageLayout.createSequentialGroup()
                .addComponent(jLabelup, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel_messageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel3.setBackground(new java.awt.Color(0, 204, 204));
        kGradientPanel3.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 204, 204));

        jButton1_login1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1_login1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1_login1.setText("LOG IN");
        jButton1_login1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_login1.setOpaque(false);
        jButton1_login1.setPreferredSize(new java.awt.Dimension(36, 36));
        jButton1_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_login1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton1_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1_login1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_admin.setBackground(new java.awt.Color(0, 204, 204));
        jButton_admin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_admin.setText("Admin");
        jButton_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_admin.setOpaque(false);
        jButton_admin.setPreferredSize(new java.awt.Dimension(36, 36));
        jButton_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myjPanel1Layout = new javax.swing.GroupLayout(myjPanel1);
        myjPanel1.setLayout(myjPanel1Layout);
        myjPanel1Layout.setHorizontalGroup(
            myjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myjPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(myjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myjPanel1Layout.createSequentialGroup()
                        .addComponent(jLabeltxt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(myjPanel1Layout.createSequentialGroup()
                        .addGroup(myjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(myjPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(myjPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addGap(218, 218, 218))
                    .addGroup(myjPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_mycheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(121, 121, 121))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myjPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(myjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myjPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel_message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myjPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        myjPanel1Layout.setVerticalGroup(
            myjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myjPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabeltxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(myjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox_mycheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(kGradientPanel_message, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPaneluser.add(myjPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 104, -1, 498));

        maingradientcard.add(kGradientPaneluser, "kGradientPaneluser");

        kGradientPaneladmin.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPaneladmin.setkStartColor(new java.awt.Color(155, 0, 153));
        kGradientPaneladmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("<html> We plan your trip... <br> Your fun is our priority");
        kGradientPaneladmin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 450, 115));

        jLabeltxt4.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltxt4.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabeltxt4.setText("Admin Login");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Username");

        jTextField_admin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_adminActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Password");

        jPasswordField_admin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField_admin.setText("jPasswordField1");
        jPasswordField_admin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPasswordField_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_adminActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Show Password");

        jCheckBox_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox_adminMouseClicked(evt);
            }
        });
        jCheckBox_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_adminActionPerformed(evt);
            }
        });

        kGradientPanel_message1.setBackground(new java.awt.Color(0, 204, 204));
        kGradientPanel_message1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel_message1.setkStartColor(new java.awt.Color(0, 204, 204));

        jLabelup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/Up.png"))); // NOI18N
        jLabelup1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelup1MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel14.setText("Enter correct login details");

        javax.swing.GroupLayout kGradientPanel_message1Layout = new javax.swing.GroupLayout(kGradientPanel_message1);
        kGradientPanel_message1.setLayout(kGradientPanel_message1Layout);
        kGradientPanel_message1Layout.setHorizontalGroup(
            kGradientPanel_message1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel_message1Layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(jLabelup1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel_message1Layout.setVerticalGroup(
            kGradientPanel_message1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel_message1Layout.createSequentialGroup()
                .addComponent(jLabelup1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel_message1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel5.setBackground(new java.awt.Color(0, 204, 204));
        kGradientPanel5.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel5.setkStartColor(new java.awt.Color(0, 204, 204));

        adminlogin.setBackground(new java.awt.Color(0, 204, 204));
        adminlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminlogin.setText("LOG IN");
        adminlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminlogin.setOpaque(false);
        adminlogin.setPreferredSize(new java.awt.Dimension(36, 36));
        adminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(adminlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_user.setBackground(new java.awt.Color(0, 204, 204));
        jButton_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_user.setText("User");
        jButton_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_user.setOpaque(false);
        jButton_user.setPreferredSize(new java.awt.Dimension(36, 36));
        jButton_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myjPanel2Layout = new javax.swing.GroupLayout(myjPanel2);
        myjPanel2.setLayout(myjPanel2Layout);
        myjPanel2Layout.setHorizontalGroup(
            myjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myjPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(myjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(myjPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(myjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myjPanel2Layout.createSequentialGroup()
                        .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(myjPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addGap(218, 218, 218))
                    .addGroup(myjPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(121, 121, 121))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myjPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltxt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myjPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel_message1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myjPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_user, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myjPanel2Layout.setVerticalGroup(
            myjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myjPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabeltxt4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addComponent(jTextField_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jPasswordField_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(myjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBox_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(kGradientPanel_message1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPaneladmin.add(myjPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(763, 104, -1, 498));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel15.setText("PhoenixTours");
        kGradientPaneladmin.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 1000, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/Capture.PNG"))); // NOI18N
        jLabel16.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/myapp/travelc.jpg"))); // NOI18N
        jLabel16.setEnabled(false);
        kGradientPaneladmin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 500, 272));

        maingradientcard.add(kGradientPaneladmin, "kGradientPaneladmin");

        getContentPane().add(maingradientcard, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    public void reset() {
        jTextField_username.setText(null);
        jPasswordField_pass.setText(null);
        jPasswordField_admin.setText(null);
    }

    private void uservalidate() {
        try {
            stat = con.prepareStatement("SELECT username, userpass from validate where loginid = 1");
            rs = stat.executeQuery();

            while (rs.next()) {
                String uname = rs.getString("username");
                String upass = rs.getString("userpass");

                //      timerDown.start();
                String passtext = new String(jPasswordField_pass.getPassword());
                if (jTextField_username.getText().trim().toLowerCase().equals(uname) && passtext.trim().toLowerCase().equals(upass)) {
                    JOptionPane.showMessageDialog(null, "password match");
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new user().setVisible(true);
                        }
                    });
                    reset();
                    this.dispose();
                } else {
                    timerDown.start();
                    JOptionPane.showMessageDialog(null, "password not match");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void adminvalidate() {
        try {
            stat = con.prepareStatement("SELECT * from validate where loginid = 2 ");
            rs = stat.executeQuery();

            while (rs.next()) {
                String aname = rs.getString("adminname");
                String apass = rs.getString("adminpass");

                String passtextadmin = new String(jPasswordField_admin.getPassword());
                if (jTextField_admin.getText().trim().toLowerCase().equals(aname) && passtextadmin.trim().toLowerCase().equals(apass)) {
                    JOptionPane.showMessageDialog(null, "password match");
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new ikbook().setVisible(true);
                        }
                    });
                    reset();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "password not match");
                    timerDownadmin.start();
                    System.out.println("error");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }


    private void jPasswordField_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_passActionPerformed

    //timer to hide panel
    Timer timerUp = new Timer(10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (kGradientPanel_message.getHeight() != 0) {
                kGradientPanel_message.setBounds(kGradientPanel_message.getX(), kGradientPanel_message.getY(), kGradientPanel_message.getWidth(), kGradientPanel_message.getHeight() - 5);
            } else {
                timerUp.stop();
            }

        }
    });

    //timer to show panel
    Timer timerDown = new Timer(10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (kGradientPanel_message.getHeight() != 60) {
                kGradientPanel_message.setBounds(kGradientPanel_message.getX(), kGradientPanel_message.getY(), kGradientPanel_message.getWidth(), kGradientPanel_message.getHeight() + 5);
            } else {
                timerDown.stop();
            }

        }
    });

    private void jCheckBox_mycheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_mycheckboxMouseClicked

    }//GEN-LAST:event_jCheckBox_mycheckboxMouseClicked

    private void jCheckBox_mycheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_mycheckboxActionPerformed
        // show n hide password
        if (jCheckBox_mycheckbox.isSelected()) {
            jPasswordField_pass.setEchoChar((char) 0);
        } else {
            jPasswordField_pass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_mycheckboxActionPerformed

    private void jButton1_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_login1ActionPerformed
        // TODO add your handling code here:
        uservalidate();

    }//GEN-LAST:event_jButton1_login1ActionPerformed

    private void jLabelupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelupMouseClicked
        // TODO add your handling code here:
        timerUp.start();
    }//GEN-LAST:event_jLabelupMouseClicked

    private void jTextField_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_adminActionPerformed

    private void jPasswordField_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_adminActionPerformed

    Timer timerUpadmin = new Timer(10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (kGradientPanel_message1.getHeight() != 0) {
                kGradientPanel_message1.setBounds(kGradientPanel_message1.getX(), kGradientPanel_message1.getY(), kGradientPanel_message1.getWidth(), kGradientPanel_message1.getHeight() - 5);
            } else {
                timerUpadmin.stop();
            }

        }
    });

    //timer to show panel
    Timer timerDownadmin = new Timer(10, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (kGradientPanel_message1.getHeight() != 60) {
                kGradientPanel_message1.setBounds(kGradientPanel_message1.getX(), kGradientPanel_message1.getY(), kGradientPanel_message1.getWidth(), kGradientPanel_message1.getHeight() + 5);
            } else {
                timerDownadmin.stop();
            }

        }
    });

    private void jCheckBox_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox_adminMouseClicked
        // TODO add your handling code here:
        if (jCheckBox_admin.isSelected()) {
            jPasswordField_admin.setEchoChar((char) 0);
        } else {
            jPasswordField_admin.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox_adminMouseClicked

    private void jCheckBox_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_adminActionPerformed

    private void jLabelup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelup1MouseClicked
        // TODO add your handling code here:
        timerUpadmin.start();
    }//GEN-LAST:event_jLabelup1MouseClicked

    private void adminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminloginActionPerformed
        // TODO add your handling code here:
        adminvalidate();

    }//GEN-LAST:event_adminloginActionPerformed

    private void jButton_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_userActionPerformed
        // TODO add your handling code here:
        panelLayout.show(maingradientcard, "kGradientPaneluser");
        reset();
    }//GEN-LAST:event_jButton_userActionPerformed

    private void jButton_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_adminActionPerformed
        // TODO add your handling code here:
        panelLayout.show(maingradientcard, "kGradientPaneladmin");
        reset();
    }//GEN-LAST:event_jButton_adminActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminlogin;
    private javax.swing.JButton jButton1_login1;
    private javax.swing.JButton jButton_admin;
    private javax.swing.JButton jButton_user;
    private javax.swing.JCheckBox jCheckBox_admin;
    private javax.swing.JCheckBox jCheckBox_mycheckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabeltxt3;
    private javax.swing.JLabel jLabeltxt4;
    private javax.swing.JLabel jLabelup;
    private javax.swing.JLabel jLabelup1;
    private javax.swing.JPasswordField jPasswordField_admin;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_admin;
    private javax.swing.JTextField jTextField_username;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel5;
    private keeptoo.KGradientPanel kGradientPanel_message;
    private keeptoo.KGradientPanel kGradientPanel_message1;
    private keeptoo.KGradientPanel kGradientPaneladmin;
    private keeptoo.KGradientPanel kGradientPaneluser;
    private keeptoo.KGradientPanel maingradientcard;
    private javax.swing.JPanel myjPanel1;
    private javax.swing.JPanel myjPanel2;
    // End of variables declaration//GEN-END:variables
}
