import static com.mysql.cj.MysqlType.SET;
import java.sql.*;
import java.awt.event.KeyEvent;
import static java.awt.event.PaintEvent.UPDATE;
import javax.swing.JOptionPane;
public class Update_pat extends javax.swing.JFrame {

 
    public Update_pat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        L_name = new javax.swing.JTextField();
        M_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        F_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pat_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 150, 40));

        jButton4.setBackground(new java.awt.Color(0, 204, 204,40));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 40));

        jButton8.setBackground(new java.awt.Color(249, 73, 73));
        jButton8.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 51));
        jButton8.setText("LOG OUT");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, 140, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setText("EDIT PATIENT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, 50));

        address.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 380, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Address");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 60, 20));

        contact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 200, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Contact No :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 90, 30));

        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 50, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Age");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 30, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Middle Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        L_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_nameActionPerformed(evt);
            }
        });
        jPanel1.add(L_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 260, 30));

        M_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        M_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_nameActionPerformed(evt);
            }
        });
        jPanel1.add(M_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("First Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        F_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        F_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_nameActionPerformed(evt);
            }
        });
        jPanel1.add(F_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 30));

        pat_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pat_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pat_idActionPerformed(evt);
            }
        });
        jPanel1.add(pat_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Patient ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewp.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try
        {
            // Register  JDBC  driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver Loaded Sucessfully");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","1234");

            PreparedStatement ptst = con.prepareStatement("UPDATE  add_patient  SET  `First Name` = ?, `Middle Name` =?, `Last Name` = ?, `Age`= ?, `Contact No`= ?,`Address` = ?  WHERE  `Patient_ID`= ?");
            ptst.setString(1, F_name.getText());
            ptst.setString (2, M_name.getText());
            ptst.setString(3, L_name.getText());
            ptst.setInt( 4,Integer.parseInt(age.getText() ) ) ;
            ptst.setInt( 5,Integer.parseInt(contact.getText() ) ) ;
            ptst.setString (6,address.getText( ) );
            ptst.setString (7,pat_id.getText( ) );

            ptst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated Successfully");

            con.close();
        }//end of try
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }//end of catch

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        add_patient  a = new add_patient  ();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(JOptionPane.showConfirmDialog(this,"Do you really want to exit?", "Confirm", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_NO_OPTION)
    {
        LOGIN L = new LOGIN();
        L.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void L_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_nameActionPerformed

    private void M_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M_nameActionPerformed

    private void F_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_nameActionPerformed

    private void pat_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pat_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pat_idActionPerformed

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
            java.util.logging.Logger.getLogger(Update_pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_pat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_pat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField F_name;
    private javax.swing.JTextField L_name;
    private javax.swing.JTextField M_name;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField contact;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pat_id;
    // End of variables declaration//GEN-END:variables
}
