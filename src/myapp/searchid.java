/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myapp;


import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class searchid extends javax.swing.JFrame {

       Connection con;
    Statement stmt;
    PreparedStatement stat;
    String selectquery;
    ResultSet rs;
   
    public searchid() {
        
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection("jdbc:sqlserver://IKAY\\MSSQLSERVERIK;databaseName=Library;user=sa;password=9815");
            stmt = con.createStatement();

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idpanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_tourdate = new com.toedter.calendar.JDateChooser();
        panelrest = new javax.swing.JPanel();
        fn = new javax.swing.JLabel();
        jTextField_fns = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_ln = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_number = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_mail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel_gn1 = new javax.swing.JLabel();
        jTextField_gn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        toutlocation = new javax.swing.JTextField();
        jTextField_dn = new javax.swing.JTextField();
        jTextField_tourdatebooked = new javax.swing.JTextField();
        jTextField_pr = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jTextField_occu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel_filesearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SEARCH");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        idpanel.setBackground(new java.awt.Color(0, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Booking Date");

        jTextField_tourdate.setDateFormatString("YYYY-MM-dd");

        javax.swing.GroupLayout idpanelLayout = new javax.swing.GroupLayout(idpanel);
        idpanel.setLayout(idpanelLayout);
        idpanelLayout.setHorizontalGroup(
            idpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(idpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_tourdate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(43, 43, 43))
        );
        idpanelLayout.setVerticalGroup(
            idpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(idpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_tourdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        fn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fn.setForeground(new java.awt.Color(0, 102, 255));
        fn.setText("Firstname");

        jTextField_fns.setEditable(false);
        jTextField_fns.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_fns.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_fns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_fnsActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Lastname");

        jTextField_ln.setEditable(false);
        jTextField_ln.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ln.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Phone number");

        jTextField_number.setEditable(false);
        jTextField_number.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_number.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_numberActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Mail address");

        jTextField_mail.setEditable(false);
        jTextField_mail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_mail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_mailActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 255));
        jLabel16.setText("Occupation");

        jLabel_gn1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_gn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_gn1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel_gn1.setText("Gender");

        jTextField_gn.setEditable(false);
        jTextField_gn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_gn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_gn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_gnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Tour Location");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("No of days");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 255));
        jLabel14.setText("Bookng ID");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 255));
        jLabel12.setText("Price");

        toutlocation.setEditable(false);
        toutlocation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toutlocation.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        toutlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toutlocationActionPerformed(evt);
            }
        });

        jTextField_dn.setEditable(false);
        jTextField_dn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_dn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_dn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dnActionPerformed(evt);
            }
        });

        jTextField_tourdatebooked.setEditable(false);
        jTextField_tourdatebooked.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_tourdatebooked.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_tourdatebooked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tourdatebookedActionPerformed(evt);
            }
        });

        jTextField_pr.setEditable(false);
        jTextField_pr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_pr.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_prActionPerformed(evt);
            }
        });

        ID.setEditable(false);
        ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        jTextField_occu.setEditable(false);
        jTextField_occu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_occu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jTextField_occu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_occuActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 255));
        jLabel15.setText("date booked");

        javax.swing.GroupLayout panelrestLayout = new javax.swing.GroupLayout(panelrest);
        panelrest.setLayout(panelrestLayout);
        panelrestLayout.setHorizontalGroup(
            panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelrestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelrestLayout.createSequentialGroup()
                        .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_fns, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(panelrestLayout.createSequentialGroup()
                        .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ln, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField_number, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_occu, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelrestLayout.createSequentialGroup()
                                        .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel13))
                                        .addGap(161, 161, 161))
                                    .addComponent(toutlocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_dn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_tourdatebooked, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel15)
                                .addComponent(jLabel12))
                            .addComponent(jTextField_pr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelrestLayout.createSequentialGroup()
                        .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_gn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_gn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelrestLayout.setVerticalGroup(
            panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelrestLayout.createSequentialGroup()
                .addGroup(panelrestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelrestLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toutlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_dn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(2, 2, 2)
                        .addComponent(jTextField_tourdatebooked, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_pr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelrestLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_fns, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ln, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_number, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_occu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(jLabel_gn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_gn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel_filesearch.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_filesearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_filesearch.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_filesearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_filesearch.setText("Find");
        jLabel_filesearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 255, 255)));
        jLabel_filesearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_filesearch.setOpaque(true);
        jLabel_filesearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_filesearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_filesearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_filesearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(idpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_filesearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelrest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel_filesearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panelrest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   public ResultSet datesearch() {
        try {
            stat = con.prepareStatement("select * from mynewtour where Tourbed=? ");
            stat.setString(1, ((JTextField)jTextField_tourdate.getDateEditor().getUiComponent()).getText() );
            rs = stat.executeQuery();
           //rs=jTextField_ids.getText();
            
            
            if (rs.next()) {
                ID.setText(rs.getString("Tourid"));
                jTextField_fns.setText(rs.getString("Tourfn"));
                jTextField_ln.setText(rs.getString("Tourln"));
                jTextField_number.setText(rs.getString("Tournumber"));
                jTextField_mail.setText(rs.getString("Tourmail"));
                jTextField_pr.setText(String.valueOf(rs.getInt("Tourprice")));
                
                jTextField_tourdatebooked.setText(rs.getString("Tourbind"));
                jTextField_dn.setText(rs.getString("Tourdays"));
                toutlocation.setText(rs.getString("Tourtlo"));
                jTextField_gn.setText(rs.getString("Tourbgr"));
                jTextField_occu.setText(rs.getString("Touroccu"));
            }
          
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
              return rs;
        }
    
    private void jTextField_fnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_fnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_fnsActionPerformed

    private void jTextField_lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lnActionPerformed

    private void jTextField_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_numberActionPerformed

    private void jTextField_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_mailActionPerformed

    private void jTextField_gnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_gnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_gnActionPerformed

    private void toutlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toutlocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toutlocationActionPerformed

    private void jTextField_dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dnActionPerformed

    private void jTextField_tourdatebookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tourdatebookedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tourdatebookedActionPerformed

    private void jTextField_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_prActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void jTextField_occuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_occuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_occuActionPerformed

    private void jLabel_filesearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_filesearchMouseClicked
        // TODO add your handling code here:
        datesearch();
    }//GEN-LAST:event_jLabel_filesearchMouseClicked

    private void jLabel_filesearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_filesearchMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_filesearchMouseEntered

    private void jLabel_filesearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_filesearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_filesearchMouseExited

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
            java.util.logging.Logger.getLogger(searchid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JLabel fn;
    private javax.swing.JPanel idpanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_filesearch;
    private javax.swing.JLabel jLabel_gn1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_dn;
    private javax.swing.JTextField jTextField_fns;
    private javax.swing.JTextField jTextField_gn;
    public javax.swing.JTextField jTextField_ln;
    private javax.swing.JTextField jTextField_mail;
    private javax.swing.JTextField jTextField_number;
    private javax.swing.JTextField jTextField_occu;
    private javax.swing.JTextField jTextField_pr;
    private com.toedter.calendar.JDateChooser jTextField_tourdate;
    private javax.swing.JTextField jTextField_tourdatebooked;
    private javax.swing.JPanel panelrest;
    private javax.swing.JTextField toutlocation;
    // End of variables declaration//GEN-END:variables
}
