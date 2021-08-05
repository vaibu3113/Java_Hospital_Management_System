import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class add_doctor extends javax.swing.JFrame {

    String gender,department;
    public add_doctor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doc_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        L_name = new javax.swing.JTextField();
        visit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        M_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        F_name = new javax.swing.JTextField();
        joindate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Add Doctor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 190, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add d1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 110));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Department");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, 90, 30));

        doc_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doc_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc_idActionPerformed(evt);
            }
        });
        jPanel1.add(doc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Visiting Time");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 100, 30));

        contact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 200, 30));

        L_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_nameActionPerformed(evt);
            }
        });
        jPanel1.add(L_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 260, 30));

        visit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        visit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitActionPerformed(evt);
            }
        });
        jPanel1.add(visit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Age");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 30, 30));

        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 50, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Gender");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 60, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 170, 30));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 102, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 150, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Contact No :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, -1, -1));

        M_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        M_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_nameActionPerformed(evt);
            }
        });
        jPanel1.add(M_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 200, 30));

        jLabel8.setText("Middle Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLabel7.setText("First Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Address");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 60, 20));

        address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 470, 100));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Doctor I D");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Dentist", "Cariology", "Accident & emergency", "General surgery", "Neurology", "Pharmacy" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 30));

        F_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        F_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_nameActionPerformed(evt);
            }
        });
        jPanel1.add(F_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        joindate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        joindate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joindateActionPerformed(evt);
            }
        });
        jPanel1.add(joindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 200, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Joining Date");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 100, 30));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        jButton1.setText("Enroll");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 120, 40));

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, 130, 40));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 60, 50));

        jButton5.setBackground(new java.awt.Color(0, 153, 153,60));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Delete Doctor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 190, 50));

        jButton6.setBackground(new java.awt.Color(0, 153, 153,60));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/u d.png"))); // NOI18N
        jButton6.setText("Update Doctor");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 190, 50));

        jButton4.setBackground(new java.awt.Color(0, 153, 153,60));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.png"))); // NOI18N
        jButton4.setText("View Doctor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 200, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doc_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doc_idActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void L_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_nameActionPerformed

    private void visitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (jComboBox2.getSelectedIndex() == 1 || jComboBox2.getSelectedIndex() == 2 )
        {
            jLabel13.setText(" ");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void M_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M_nameActionPerformed

    private void F_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_nameActionPerformed

    private void joindateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joindateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joindateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String choice = jComboBox1.getSelectedItem()+"";
        if (choice.equals("Select Department"))
        {
            jLabel18.setText("Please select the Department");
        }
        String ch = jComboBox2.getSelectedItem()+"";
        if (ch.equals("Select Gender"))
        {
            jLabel13.setText("Please select Gender");
        }
        if(jComboBox2.getSelectedIndex()==1)
        {
            gender = "Male";
            
        }
        if(jComboBox2.getSelectedIndex()==2)
        {
            gender = "Female";
           
        }
        if(jComboBox1.getSelectedIndex()==1)
        {
            department = "Dentist";
           
        }
        if(jComboBox1.getSelectedIndex()==2)
        {
            department = "Cardiologist";
           
        }
        if(jComboBox1.getSelectedIndex()==3)
        {
                 department = "Accident & Emergency";
           
        }
        if(jComboBox1.getSelectedIndex()==4)
        {
             department = "general surgery";
           
        }
        if(jComboBox1.getSelectedIndex()==5)
        {
             department= "Neurology";
           
        }
                if(jComboBox1.getSelectedIndex()==6)
                {
                    department = "Pharmacy";
                }
 
        try
       {
           // Register  JDBC  driver
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            System.out.println("Driver Loaded Sucessfully");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","1234");
            // Create a Query
           PreparedStatement stmt = con.prepareStatement("insert into add_doctor values (?,?,?,?,?,?,?,?,?,?,?)");
           stmt.setString(1,doc_id.getText());
           stmt.setString(2,F_name.getText());
           stmt.setString(3,M_name.getText());
           stmt.setString(4,L_name.getText());
           stmt.setInt(5 ,Integer.parseInt(age.getText() ) ) ;
           stmt.setString(6, gender);
           stmt.setInt( 7,Integer.parseInt(contact.getText() ) ) ;
           stmt.setString(8,address.getText());
           stmt.setString(9,department);
         stmt.setString(10,joindate.getText());
        stmt.setString(11,visit.getText());  
           
            //Execute a Query
            int i = stmt.executeUpdate();
            System.out.println(i+"Record Inserted");
            JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
            
            // Close the connection
            con.close();
            
           doc_id.setText(""); F_name.setText("");M_name.setText("");L_name.setText("");age.setText("");
           contact.setText("");address.setText("");joindate.setText("");visit.setText("");
       }//end of try
       catch(ClassNotFoundException c)
       {
           // Handel errors of JDBC
            System.out.println("Driver not loaded");
       }//end of catch
       catch(SQLException s)
       {
           // Handel errors for Class.forName
           System.out.println(s.getMessage());
       }//end of catch
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(JOptionPane.showConfirmDialog(this,"Do you really want to exit?", "Confirm", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_NO_OPTION)
    {
        ADMIN s = new ADMIN();
        s.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Delete_doc obj = new  Delete_doc();
        obj.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
   Update_doc obj = new Update_doc();
        obj.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       View_doc obj = new View_doc();
        obj.setVisible(true);
        dispose();      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedIndex() == 1 || jComboBox1.getSelectedIndex() == 2 
                || jComboBox1.getSelectedIndex() == 3 ||jComboBox1.getSelectedIndex() == 4
                ||jComboBox1.getSelectedIndex() == 5 || jComboBox1.getSelectedIndex() == 6 
                 )
        {
            jLabel18.setText(" ");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(add_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_doctor().setVisible(true);
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
    private javax.swing.JTextField doc_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField joindate;
    private javax.swing.JTextField visit;
    // End of variables declaration//GEN-END:variables
}
