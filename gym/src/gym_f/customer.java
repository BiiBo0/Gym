/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym_f;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;



public class customer extends javax.swing.JFrame {

Connection con;
int find_id;
    public customer() {
        initComponents();
         alarm.setVisible(false);
          setLocationRelativeTo(null);
            try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_system", "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server IS Closed");       
        }
           
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        alarm = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_user.setText("ID_Customer");
        txt_user.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_userFocusLost(evt);
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
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 270, 30));

        alarm.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        alarm.setForeground(new java.awt.Color(255, 51, 51));
        alarm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/remove.png"))); // NOI18N
        alarm.setText("Incorrect password or user");
        alarm.setToolTipText("");
        getContentPane().add(alarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 310, 30));

        show.setText("Show Password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pass(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 110, 60));

        jLabel1.setFont(new java.awt.Font("Simplified Arabic", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, 50));

        back.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/left-arrow.png"))); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/user.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 259, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/lock.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 301, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        login.setBackground(new java.awt.Color(153, 153, 153));
        login.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("login");
        login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login(evt);
            }
        });
        jPanel2.add(login);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 395, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/baseeeeeet.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login
        alarm.setVisible(false);
         find_id=Integer.parseInt(txt_user.getText());
        try {
            PreparedStatement stmt = con.prepareStatement("select customer_id,customer_password from customer");
            ResultSet rs=stmt.executeQuery();
            boolean pass=false;
            while(rs.next()){
                if(rs.getInt(1)==find_id){
                    pass=true;
                    DataOfCustomer.setId(rs.getInt(1));
                }
                 if(txt_pass.getText().equals(rs.getString(2) )&&pass==true){
                 setVisible(false);
                 new custmor_home().setVisible(true);
                 
               }else
             {
             alarm.setVisible(true);
             }

            }
            if(pass==false)
            JOptionPane.showMessageDialog(this,"customer not found");
        }
        catch (SQLException ex) {
     JOptionPane.showMessageDialog(this,"Server IS Closed");
        }
       
    }//GEN-LAST:event_login

    private void show_pass(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pass
        alarm.setVisible(false);
        if(show.isSelected()){
            txt_pass.setEchoChar((char)0);
        }else
        {
            txt_pass.setEchoChar('*');
        }
    }//GEN-LAST:event_show_pass

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new StartFrame().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void txt_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusLost
        alarm.setVisible(false);
        if(txt_user.getText().equals("")){
            txt_user.setText("ID_Customer");
        }
    }//GEN-LAST:event_txt_userFocusLost

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
        alarm.setVisible(false);
        if(txt_user.getText().equals("ID_Customer")){
            txt_user.setText("");
        }
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

   
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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alarm;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JCheckBox show;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
