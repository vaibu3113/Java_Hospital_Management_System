/* VAIBHAVI KHARKAR
     SE-IT , A - 58*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class add_patient extends javax.swing.JFrame {
  
    String g,blood_grp;
    public add_patient() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        F_name = new javax.swing.JTextField();
        M_name = new javax.swing.JTextField();
        L_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bloodgroup = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        No = new javax.swing.JRadioButton();
        Yes = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Admit Patient");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v4 (2).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 120));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Patient I D");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 30));

        p_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idActionPerformed(evt);
            }
        });
        p_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p_idKeyPressed(evt);
            }
        });
        jPanel1.add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 30));

        F_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        F_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_nameActionPerformed(evt);
            }
        });
        F_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F_nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                F_nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                F_nameKeyTyped(evt);
            }
        });
        jPanel1.add(F_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        M_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        M_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                M_nameKeyPressed(evt);
            }
        });
        jPanel1.add(M_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 200, 30));

        L_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_nameActionPerformed(evt);
            }
        });
        L_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                L_nameKeyPressed(evt);
            }
        });
        jPanel1.add(L_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 220, 30));

        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, -1, -1));

        jLabel7.setText("First Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel8.setText("Middle Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Age");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 50, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Blood group");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        bloodgroup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloodgroup.setForeground(new java.awt.Color(0, 51, 153));
        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        bloodgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodgroupActionPerformed(evt);
            }
        });
        jPanel1.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 200, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Gender");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, -1));

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 102, 204));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 290, 150, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 140, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Contact No :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 150, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Address");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 60, 20));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 520, 70));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Taking any medications,");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("currently ?");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        No.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        No.setText("N O");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanel1.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 60, 20));

        Yes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Yes.setText("Y E S");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });
        jPanel1.add(Yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 60, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("If yes please List it here");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 170, 20));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 350, 110));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 120, 40));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 130, 40));

        jButton4.setBackground(new java.awt.Color(0, 153, 153,60));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.png"))); // NOI18N
        jButton4.setText("View Patient");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, 50));

        jButton5.setBackground(new java.awt.Color(0, 153, 153,60));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d p.png"))); // NOI18N
        jButton5.setText("Discharge Patient");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, 50));

        jButton6.setBackground(new java.awt.Color(0, 153, 153,60));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit p.png"))); // NOI18N
        jButton6.setText("Update Patient");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_idActionPerformed

    private void F_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_nameActionPerformed

    private void L_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L_nameActionPerformed

    private void bloodgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodgroupActionPerformed
       if (bloodgroup.getSelectedIndex() == 1 || bloodgroup.getSelectedIndex() == 2 || bloodgroup.getSelectedIndex() == 3 || bloodgroup.getSelectedIndex() == 4 ||
               bloodgroup.getSelectedIndex() == 5 || bloodgroup.getSelectedIndex() == 6 || bloodgroup.getSelectedIndex() == 7 || bloodgroup.getSelectedIndex() == 1)
       {
           jLabel11.setText(" ");
       }
       
    }//GEN-LAST:event_bloodgroupActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
    
    }//GEN-LAST:event_genderActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        if (No.isSelected())
       {
           Yes.setSelected(false);    
    }      
    }//GEN-LAST:event_NoActionPerformed

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
       if (Yes.isSelected())
       {
           No.setSelected(false);
       } 
    }//GEN-LAST:event_YesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
             if (bloodgroup.getSelectedIndex()==0)
            {
                jLabel11.setText("Please select the Blood group");
            }
             else if(gender.getSelectedIndex()==0)
            {
                jLabel13.setText("Please select Gender");
            }
         else
        {
            if(gender.getSelectedIndex()==1)
            {
                g = "Male";
            }
             if(gender.getSelectedIndex()==2)
            {
                g = "Female";
            }
             if(bloodgroup.getSelectedIndex()==1)
             {
                 blood_grp = "A+";
             }
             if(bloodgroup.getSelectedIndex()==2)
             {
                 blood_grp = "A-";
             }
             if(bloodgroup.getSelectedIndex()==3)
             {
                 blood_grp = "B+";   
             }
             if(bloodgroup.getSelectedIndex()==4)
             {
                 blood_grp = "B-";   
             }
             if(bloodgroup.getSelectedIndex()==5)
             {
                 blood_grp = "O+";  
             }
              if(bloodgroup.getSelectedIndex()==6)
             {
                 blood_grp = "O-";  
             }
              if(bloodgroup.getSelectedIndex()==7)
             {
                 blood_grp = "AB+";  
             }
              if(bloodgroup.getSelectedIndex()==7)
             {
                 blood_grp = "AB-";  
             }
             try
                    {
                        // Register  JDBC  driver
                         Class.forName("com.mysql.cj.jdbc.Driver");

                         System.out.println("Driver Loaded Sucessfully");
                         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","1234");
                         // Create a Query
                        PreparedStatement stmt = con.prepareStatement("insert into add_patient values (?,?,?,?,?,?,?,?,?)");
                        stmt.setString(1,p_id.getText());
                        stmt.setString(2,F_name.getText());
                        stmt.setString(3,M_name.getText());
                        stmt.setString(4,L_name.getText());
                        stmt.setInt(5 ,Integer.parseInt(age.getText() ) ) ;
                        stmt.setString(6,blood_grp);      
                        stmt.setString(7, g);
                        stmt.setInt(8,Integer.parseInt(contact.getText() ) ) ;
                        stmt.setString(9,address.getText());

                         //Execute a Query
                         int i = stmt.executeUpdate();
                         System.out.println(i+"Record Inserted");
                         JOptionPane.showMessageDialog(null,"Data Inserted Successfully");

                         // Close the connection
                         con.close();


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

            JOptionPane.showMessageDialog(this,"Your data have been successfully enrolled");
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(JOptionPane.showConfirmDialog(this,"Do you really want to exit?", "Confirm", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_NO_OPTION)
        {
             ADMIN a = new ADMIN();
             a.setVisible(true);
             dispose();
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            View_pat obj = new View_pat();
             obj.setVisible(true);
             dispose();  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
             Delete_pat obj = new Delete_pat();
             obj.setVisible(true);
             dispose();  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          Update_pat obj = new Update_pat();
             obj.setVisible(true);
             dispose();  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void p_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_idKeyPressed
  
    }//GEN-LAST:event_p_idKeyPressed

    private void F_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_nameKeyPressed
       
    }//GEN-LAST:event_F_nameKeyPressed

    private void F_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_nameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_F_nameKeyReleased

    private void F_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F_nameKeyTyped
        // TODO add your handling code here:
          //get textfield string 
      /*  String patientid = jtextField1.getText();
        int length = patientid.length();
        
        char c = evt.getKeyChar();
        
        if (evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length < 10)
            {
              jTextField1.setEditable(true);
            }
            else
            {
              jTextField1.setEditable(true);
            }   
            
        }*/
    }//GEN-LAST:event_F_nameKeyTyped

    private void M_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_M_nameKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_M_nameKeyPressed

    private void L_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_L_nameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_L_nameKeyPressed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField F_name;
    private javax.swing.JTextField L_name;
    private javax.swing.JTextField M_name;
    private javax.swing.JRadioButton No;
    private javax.swing.JRadioButton Yes;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> bloodgroup;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField p_id;
    // End of variables declaration//GEN-END:variables
}
