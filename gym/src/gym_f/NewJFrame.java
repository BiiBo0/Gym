
package gym_f;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

     Connection con;
    public NewJFrame() {  
        initComponents();
      //playSound();
      
         setLocationRelativeTo(null);
          alarm.setVisible(false);
          jPanel2.setVisible(false);
          try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_system", "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server .IS Closed");       
        }
          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        close = new javax.swing.JLabel();
        alarm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        login1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        r_coach = new javax.swing.JRadioButton();
        r_admin = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        r_customer = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_user.setText("Enter Username");
        txt_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_userFocusLost(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 270, 30));

        txt_pass.setText("Enter Password");
        txt_pass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passFocusLost(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 270, 30));

        show.setText("Show Password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pass(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 110, 60));

        close.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("×");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 60, 50));

        alarm.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        alarm.setForeground(new java.awt.Color(255, 51, 51));
        alarm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/remove.png"))); // NOI18N
        alarm.setText("Incorrect password or user");
        alarm.setToolTipText("");
        getContentPane().add(alarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 300, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/lock.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 301, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });

        login1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        login1.setForeground(new java.awt.Color(255, 255, 255));
        login1.setText("login");
        login1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        login1.setContentAreaFilled(false);
        login1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                login1MouseMoved(evt);
            }
        });
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 130, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/user.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 259, 30, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        login.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("login");
        login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        login.setContentAreaFilled(false);
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                loginMouseMoved(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 130, 50));

        buttonGroup1.add(r_coach);
        r_coach.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        r_coach.setForeground(new java.awt.Color(102, 102, 102));
        r_coach.setText("Coach");
        r_coach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_coachActionPerformed(evt);
            }
        });
        getContentPane().add(r_coach, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        buttonGroup1.add(r_admin);
        r_admin.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        r_admin.setForeground(new java.awt.Color(102, 102, 102));
        r_admin.setSelected(true);
        r_admin.setText("Admin");
        r_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_adminActionPerformed(evt);
            }
        });
        getContentPane().add(r_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("login");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, -1, -1));

        buttonGroup1.add(r_customer);
        r_customer.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        r_customer.setForeground(new java.awt.Color(102, 102, 102));
        r_customer.setText("Customer");
        r_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_customerActionPerformed(evt);
            }
        });
        getContentPane().add(r_customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/baseeeeeet.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        jRadioButton1.setText("jRadioButton1");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        jRadioButton2.setText("jRadioButton2");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        jRadioButton3.setText("jRadioButton3");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//  private void playSound() {
//    try {
//        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\1214.wav").getAbsoluteFile());
//        Clip clip = AudioSystem.getClip();
//        clip.open(audioInputStream);
//        clip.start();
//      //  clip.close();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }


    private void show_pass(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pass
       alarm.setVisible(false);
        if(show.isSelected()){
           txt_pass.setEchoChar((char)0);
       }else
       {
            txt_pass.setEchoChar('*');
       } 
    }//GEN-LAST:event_show_pass

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
         alarm.setVisible(false);
        if(txt_user.getText().equals("Enter Username")||txt_user.getText().equals("Enter ID_Customer")||txt_user.getText().equals("Enter ID_Coach")){
           txt_user.setText("");
       }
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusLost
        alarm.setVisible(false);
        if(txt_user.getText().equals("")&&r_admin.isSelected()){
            txt_user.setText("Enter Username");
        }
        if(txt_user.getText().equals("")&&r_coach.isSelected()){
            txt_user.setText("Enter ID_Coach");
        }
        if(txt_user.getText().equals("")&&r_customer.isSelected()){
            txt_user.setText("Enter ID_Customer");
        }
    }//GEN-LAST:event_txt_userFocusLost

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
         alarm.setVisible(false);
        if(txt_pass.getText().equals("Enter Password")){
           txt_pass.setText("");
        }
    }//GEN-LAST:event_txt_passFocusGained

    private void txt_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusLost
        alarm.setVisible(false);
        if(txt_pass.getText().equals("")){
           txt_pass.setText("Enter Password");
        }
    }//GEN-LAST:event_txt_passFocusLost

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login
        alarm.setVisible(false);
        if(r_admin.isSelected()){
        if(txt_user.getText().equals("admin")&&txt_pass.getText().equals("admin")){
            setVisible(false);
            new NewHome().setVisible(true);
           }else
       {
             alarm.setVisible(true);
        }
                                                                                                                 
        }else if(r_coach.isSelected()){
              try {
            PreparedStatement stmt = con.prepareStatement("select coach_id,coach_password,f_name,phone,working_hours from coach");
            ResultSet rs=stmt.executeQuery();
            boolean pass=false;
            while(rs.next()){
                 if(txt_user.getText().equals(String.valueOf(rs.getInt(1)))&&txt_pass.getText().equals(rs.getString(2))){
                     pass=true; 
                     DataOfCoach.setId(rs.getInt(1));
                     DataOfCoach.setName(rs.getString(3));
                     DataOfCoach.setPhone(rs.getString(4));
                     DataOfCoach.setWorking_hour(rs.getInt(5));
                      PreparedStatement stmmt = con.prepareStatement("select coach_id from customer");
                      ResultSet rss=stmmt.executeQuery(); 
                      int counter=0;
                      while(rss.next()){
                          if(rs.getInt(1) == rss.getInt(1)){
                              counter++;
                          }
                      }
                      DataOfCoach.setNum_of_trainee(counter);

                     break;
                 }
                
            }
            if(pass){
                setVisible(false);
                new New_coach().setVisible(true);
                
            }else{
                alarm.setVisible(true);
            }
              }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
              }
         }
        else{
             try {
             PreparedStatement stmt = con.prepareStatement("select customer_id,customer_password,phone,f_name,Customer.coach_id from customer ");
            ResultSet rs=stmt.executeQuery();
            boolean pass1=false;
            while(rs.next()){
                 if(txt_user.getText().equals(String.valueOf(rs.getInt(1)))&&txt_pass.getText().equals(rs.getString(2))){
                     DataOfCustomer.setId(rs.getInt(1));
                     DataOfCustomer.setName(rs.getString(4));
                     DataOfCustomer.setPhone(rs.getString(3));
                     pass1=true; 
                     break;
                 }
                
            }
            if(pass1){
                new New_customer().setVisible(true);
            }else{
                alarm.setVisible(true);
            }
              }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
              }
        }
         
    }//GEN-LAST:event_login

    private void r_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_adminActionPerformed
        txt_user.setText("Enter Username");
    }//GEN-LAST:event_r_adminActionPerformed

    private void login1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1
          
        alarm.setVisible(false);
         if(r_admin.isSelected()){
        if(txt_user.getText().equals("admin")&&txt_pass.getText().equals("admin")){
            setVisible(false);
            new NewHome().setVisible(true);
            }else
        {
               alarm.setVisible(true);
            }
            
         }else if(r_coach.isSelected()){
              try {
            PreparedStatement stmt = con.prepareStatement("select coach_id,coach_password from coach");
            ResultSet rs=stmt.executeQuery();
            boolean pass=false;
            while(rs.next()){
                 if(txt_user.getText().equals(rs.getInt(1))&&txt_pass.getText().equals(rs.getString(2))){
                     pass=true; 
                     break;
                 }
                
            }
            if(pass){
                new New_coach().setVisible(true);
            }else{
                alarm.setVisible(true);
            }
              }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
              }
         }
         else{
             try {
             PreparedStatement stmt = con.prepareStatement("select customer_id,customer_password from customer");
            ResultSet rs=stmt.executeQuery();
            boolean pass=false;
            while(rs.next()){
                 if(txt_user.getText().equals(rs.getInt(1))&&txt_pass.getText().equals(rs.getString(2))){
                     pass=true; 
                     break;
                 }
                
            }
            if(pass){
                new New_customer().setVisible(true);
            }else{
                alarm.setVisible(true);
            }
              }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
              }
             }
    }//GEN-LAST:event_login1

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
     
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
      
    }//GEN-LAST:event_jPanel2MouseMoved

    private void r_coachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_coachActionPerformed
        txt_user.setText("Enter ID_Coach");
       
    }//GEN-LAST:event_r_coachActionPerformed

    private void r_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_customerActionPerformed
          txt_user.setText("Enter ID_Customer");
    }//GEN-LAST:event_r_customerActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseMoved
        
    }//GEN-LAST:event_loginMouseMoved

    private void login1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseMoved
         if((txt_user.getText().equals("Enter Username")||txt_user.getText().equals("Enter ID_Coach")||txt_user.getText().equals("Enter ID_Customer"))&&txt_pass.getText().equals("Enter Password")){
     //  playSound();
        jPanel1.setVisible(true);
       jPanel2.setVisible(false);
       }
    }//GEN-LAST:event_login1MouseMoved

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        if((txt_user.getText().equals("Enter Username")||txt_user.getText().equals("Enter ID_Coach")||txt_user.getText().equals("Enter ID_Customer"))&&txt_pass.getText().equals("Enter Password")){
      // playSound();
        jPanel1.setVisible(false);
       jPanel2.setVisible(true);
       }
    }//GEN-LAST:event_loginMouseEntered

   
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
     
            }
        });
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alarm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JButton login;
    private javax.swing.JButton login1;
    private javax.swing.JRadioButton r_admin;
    private javax.swing.JRadioButton r_coach;
    private javax.swing.JRadioButton r_customer;
    private javax.swing.JCheckBox show;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
