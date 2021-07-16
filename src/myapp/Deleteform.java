 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author user
 */
public class Deleteform extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    PreparedStatement stat;
    String selectquery;
    ResultSet rs;

    public Deleteform() {
        initComponents();

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection("jdbc:sqlserver://IKAY\\MSSQLSERVERIK;databaseName=Library;user=sa;password=9815");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        } catch (Exception e) {
            System.out.println("Error : " + "Could not connect to server");
        }

        display();

    }

    public void display() {

        try {
            stat = con.prepareStatement("select Tourid as 'ID', Tourfn as 'First Name', Tourln as 'Last Name', Tournumber as 'Mobile no', Tourmail as 'Email', TourPrice as 'Price', Touroccu as 'Occupation', Tourtlo as 'Tour Location', Tourdays as 'No of days', Tourbind as 'Booking Date', Tourbed as 'Tour Date', Tourbgr as 'Gender' from mynewtour");
            rs = stat.executeQuery();

            //data will be added until finish 
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("ID"));
                String fn = rs.getString("First Name");
                String ln = rs.getString("Last Name");
                String ntn = rs.getString("Mobile no");
                String mail = rs.getString("Email");
                String price = String.valueOf(rs.getInt("Price"));
                String occu = rs.getString("Occupation");
                String tlo = rs.getString("Tour Location");
                String days = rs.getString("No of days");
                String bed = rs.getString("Tour Date");
                String bind = rs.getString("Booking Date");
                String bgr = rs.getString("Gender");

                //string array to store data in jtable
                String data[] = {id, fn, ln, ntn, mail, price, occu, tlo, days, bed, bind, bgr};
                //jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
                tblmodel.addRow(data);

            }
               // DefaultTableModel tblmodel = (DefaultTableModel)jTable1.getModel();
            //tblmodel.addRow(data);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Could not retrieve from database");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deletebutton = new javax.swing.JButton();
        jPanelform1 = new javax.swing.JPanel();
        jLabelbookeddetailsform = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DELETE");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Mobile no", "Email", "Price", "Occupation", "Tour location", "No of days", "Tour date", "Booking date", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 255, 204));
        jScrollPane.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(11).setResizable(false);
        }

        deletebutton.setBackground(new java.awt.Color(0, 255, 255));
        deletebutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebuttonMouseClicked(evt);
            }
        });
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        jPanelform1.setBackground(new java.awt.Color(0, 255, 255));
        jPanelform1.setLayout(new java.awt.GridBagLayout());

        jLabelbookeddetailsform.setBackground(new java.awt.Color(0, 0, 0));
        jLabelbookeddetailsform.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelbookeddetailsform.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelbookeddetailsform.setText("Delete Menu");
        jLabelbookeddetailsform.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 285, 11, 286);
        jPanelform1.add(jLabelbookeddetailsform, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(deletebutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanelform1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelform1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletebutton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deletebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonMouseClicked

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:

        ikbook k = new ikbook();
        try {

            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());

            int n = JOptionPane.showConfirmDialog(this, "Do you want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (n == JOptionPane.YES_OPTION) {
                int y = JOptionPane.showConfirmDialog(this, "There is no going back, are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (y == JOptionPane.YES_OPTION) {

                    selectquery = "DELETE FROM mynewtour WHERE Tourid=" + value;
                    stat = con.prepareStatement(selectquery);
                    stat.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Delete Successful");
                    display();
                } else {
                    display();
                }
            } else {
                display();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Did not delete");
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Deleteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deleteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deleteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deleteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deleteform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel jLabelbookeddetailsform;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelform1;
    public javax.swing.JScrollPane jScrollPane;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
