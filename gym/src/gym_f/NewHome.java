
package gym_f;

import java.awt.Color;
import static java.awt.Color.white;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class NewHome extends javax.swing.JFrame {
    DefaultTableModel dtm,dtmeq;
 Connection con;
Map<Integer,String> name_and_id=new HashMap<>();
 ArrayList<Integer> arr_coach=new ArrayList<>();
 int Customer_id=0;
 int Coach_id=0;
 int check_coach_id;
 int check_customer_id;
 int code;
 double price_of_month;
    public NewHome() {
        initComponents();
          setLocationRelativeTo(null);
          turnoff();
     List_of_member.setVisible(true);
     onclicked(button1, jPanel3,jLabel1);
     
      dtm=new DefaultTableModel();
      dtmeq=new DefaultTableModel();
      dtmeq.addColumn("code_of_equipment");
      dtmeq.addColumn("quantity_of_equipment");
      dtmeq.addColumn("name_of_equipment");
      dtm.addColumn("Customer id");
      dtm.addColumn("Name");
      dtm.addColumn("Gender");
      dtm.addColumn("Phone");
      dtm.addColumn("Email");
      dtm.addColumn("Age");
      dtm.addColumn("Start Date");
      dtm.addColumn("Expired Date");
      dtm.addColumn("Price");
      dtm.addColumn("Monthly plan");
      dtm.addColumn("Coach Name");
      try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_system", "root", "root");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server .IS Closed");       
        }
       try{
          PreparedStatement stmt = con.prepareStatement("select price_of_month from price");
      
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
              price_of_month= rs.getDouble(1) ;
            }
           }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server -***is closed");
          }
      
       //getname();
       fill_combobox_coach();
       filltable_equipment();
      filltable();
      
      
      get_id_customer();
      get_id_coach();
     
           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        button1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        button3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        button4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        button5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        button6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        button7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        button8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        List_of_member = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_show = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        Add_Member = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        show_id = new javax.swing.JLabel();
        txt_first_name_ac = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_second_name_ac = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_phone_ac = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_emil_ac = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_pass_ac = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        comb_coach_name_ac = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txt_age_ac = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        comb_number_of_month_ac = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        rpt_male_ac = new javax.swing.JRadioButton();
        rbt_female_ac = new javax.swing.JRadioButton();
        Add_member = new javax.swing.JPanel();
        Add_btn_ac = new javax.swing.JLabel();
        Reset_member = new javax.swing.JPanel();
        Reset_btn = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        Add_coach = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        show_id_aco = new javax.swing.JLabel();
        txt_first_name_aco = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_second_name_aco = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_phone_aco = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_emil_aco = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        working_hours_aco = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        rpt_male_aco = new javax.swing.JRadioButton();
        rbt_female_aco = new javax.swing.JRadioButton();
        txt_password_aco = new javax.swing.JPasswordField();
        add_coach = new javax.swing.JPanel();
        Add_btn_aco = new javax.swing.JLabel();
        Reset_coach = new javax.swing.JPanel();
        Reset_btn_aco = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        close2 = new javax.swing.JLabel();
        Edit_delete_member = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        enter_id_edm = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_first_name_edm = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_second_name_edm = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_phone_edm = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txt_emil_edm = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        combobox_coach_edm = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        txt_pass_edm = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_age_edm = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        rpt_male_edm = new javax.swing.JRadioButton();
        rbt_female_edm = new javax.swing.JRadioButton();
        search_customer_id = new javax.swing.JLabel();
        update_in_edit_member = new javax.swing.JPanel();
        update_member = new javax.swing.JLabel();
        delete_in_edit_member = new javax.swing.JPanel();
        delete_member = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        close3 = new javax.swing.JLabel();
        Edit_delete_coach = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        enter_id = new javax.swing.JTextField();
        txt_first_name_edc = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txt_second_name_edc = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txt_phone_edc = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_emil_edc = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt_working_hours_edc = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txt_pass_edc = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        search_coach_id = new javax.swing.JLabel();
        rpt_male_edc = new javax.swing.JRadioButton();
        rbt_female_edc = new javax.swing.JRadioButton();
        update_coach = new javax.swing.JPanel();
        update_coach_edc = new javax.swing.JLabel();
        delete_in_edit_coach = new javax.swing.JPanel();
        delete_coach_edc = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        close4 = new javax.swing.JLabel();
        Equipment = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txt_machine_name = new javax.swing.JTextField();
        txt_quantiy = new javax.swing.JTextField();
        Add_equipment = new javax.swing.JPanel();
        Addeq = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_machine = new javax.swing.JTable();
        update_equipment = new javax.swing.JPanel();
        updateeq = new javax.swing.JLabel();
        delete_equipment = new javax.swing.JPanel();
        deleteeq = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        close5 = new javax.swing.JLabel();
        Subscribtion = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        show_price = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        update_price = new javax.swing.JPanel();
        update_price_btn = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        close6 = new javax.swing.JLabel();
        Income = new javax.swing.JPanel();
        txt_month = new javax.swing.JTextField();
        txt_year = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        income = new javax.swing.JLabel();
        update_price1 = new javax.swing.JPanel();
        update_price_btn1 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        close7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        button1.setBackground(new java.awt.Color(153, 153, 153));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1MouseExited(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List of Member");

        javax.swing.GroupLayout button1Layout = new javax.swing.GroupLayout(button1);
        button1.setLayout(button1Layout);
        button1Layout.setHorizontalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button1Layout.setVerticalGroup(
            button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        button2.setBackground(new java.awt.Color(153, 153, 153));
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2MouseExited(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Member");

        javax.swing.GroupLayout button2Layout = new javax.swing.GroupLayout(button2);
        button2.setLayout(button2Layout);
        button2Layout.setHorizontalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        button2Layout.setVerticalGroup(
            button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, button2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        button3.setBackground(new java.awt.Color(153, 153, 153));
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button3MouseExited(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add Coach");

        javax.swing.GroupLayout button3Layout = new javax.swing.GroupLayout(button3);
        button3.setLayout(button3Layout);
        button3Layout.setHorizontalGroup(
            button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button3Layout.setVerticalGroup(
            button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(button3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        button4.setBackground(new java.awt.Color(153, 153, 153));
        button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button4MouseExited(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edit / Delete Member");

        javax.swing.GroupLayout button4Layout = new javax.swing.GroupLayout(button4);
        button4.setLayout(button4Layout);
        button4Layout.setHorizontalGroup(
            button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button4Layout.setVerticalGroup(
            button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(button4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        button5.setBackground(new java.awt.Color(153, 153, 153));
        button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button5MouseExited(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edit / Delete Coach");

        javax.swing.GroupLayout button5Layout = new javax.swing.GroupLayout(button5);
        button5.setLayout(button5Layout);
        button5Layout.setHorizontalGroup(
            button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button5Layout.setVerticalGroup(
            button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(button5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        button6.setBackground(new java.awt.Color(153, 153, 153));
        button6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button6MouseExited(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Equipment");

        javax.swing.GroupLayout button6Layout = new javax.swing.GroupLayout(button6);
        button6.setLayout(button6Layout);
        button6Layout.setHorizontalGroup(
            button6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button6Layout.setVerticalGroup(
            button6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(button6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        button7.setBackground(new java.awt.Color(153, 153, 153));
        button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button7MouseExited(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Income");

        javax.swing.GroupLayout button7Layout = new javax.swing.GroupLayout(button7);
        button7.setLayout(button7Layout);
        button7Layout.setHorizontalGroup(
            button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button7Layout.setVerticalGroup(
            button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button7Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(button7Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        button8.setBackground(new java.awt.Color(153, 153, 153));
        button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button8MouseExited(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Subscription");

        javax.swing.GroupLayout button8Layout = new javax.swing.GroupLayout(button8);
        button8.setLayout(button8Layout);
        button8Layout.setHorizontalGroup(
            button8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button8Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        button8Layout.setVerticalGroup(
            button8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button8Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(button8Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Admin");

        jSeparator1.setForeground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        List_of_member.setBackground(new java.awt.Color(255, 255, 255));

        tbl_show.setForeground(new java.awt.Color(102, 102, 102));
        tbl_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        tbl_show.setOpaque(false);
        jScrollPane1.setViewportView(tbl_show);

        jLabel55.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel55.setText("←");
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        close.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("×");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout List_of_memberLayout = new javax.swing.GroupLayout(List_of_member);
        List_of_member.setLayout(List_of_memberLayout);
        List_of_memberLayout.setHorizontalGroup(
            List_of_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List_of_memberLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        List_of_memberLayout.setVerticalGroup(
            List_of_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(List_of_memberLayout.createSequentialGroup()
                .addGroup(List_of_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(List_of_memberLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

        Add_Member.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("ID:");

        show_id.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        show_id.setForeground(new java.awt.Color(255, 153, 153));
        show_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_first_name_ac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_first_name_ac.setForeground(new java.awt.Color(255, 153, 153));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("FirstName:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("SecondName:");

        txt_second_name_ac.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        txt_second_name_ac.setForeground(new java.awt.Color(255, 153, 153));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Phone:");

        txt_phone_ac.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_phone_ac.setForeground(new java.awt.Color(255, 153, 153));

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Email:");

        txt_emil_ac.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_emil_ac.setForeground(new java.awt.Color(255, 153, 153));

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Password:");

        txt_pass_ac.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_pass_ac.setForeground(new java.awt.Color(255, 153, 153));

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("CoachName:");

        comb_coach_name_ac.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        comb_coach_name_ac.setForeground(new java.awt.Color(255, 153, 153));
        comb_coach_name_ac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        comb_coach_name_ac.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Age:");

        txt_age_ac.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        txt_age_ac.setForeground(new java.awt.Color(255, 153, 153));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Monthly Plan");

        comb_number_of_month_ac.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        comb_number_of_month_ac.setForeground(new java.awt.Color(255, 153, 153));
        comb_number_of_month_ac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "3", "6", "12", " " }));
        comb_number_of_month_ac.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Gander:");

        rpt_male_ac.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rpt_male_ac);
        rpt_male_ac.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rpt_male_ac.setForeground(new java.awt.Color(255, 153, 153));
        rpt_male_ac.setSelected(true);
        rpt_male_ac.setText("Male");

        rbt_female_ac.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbt_female_ac);
        rbt_female_ac.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbt_female_ac.setForeground(new java.awt.Color(255, 153, 153));
        rbt_female_ac.setText("Female");

        Add_member.setBackground(new java.awt.Color(255, 153, 153));

        Add_btn_ac.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Add_btn_ac.setForeground(new java.awt.Color(255, 255, 255));
        Add_btn_ac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_btn_ac.setText("Add");
        Add_btn_ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_btn_acMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Add_memberLayout = new javax.swing.GroupLayout(Add_member);
        Add_member.setLayout(Add_memberLayout);
        Add_memberLayout.setHorizontalGroup(
            Add_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add_btn_ac, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        Add_memberLayout.setVerticalGroup(
            Add_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add_btn_ac, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Reset_member.setBackground(new java.awt.Color(255, 153, 153));

        Reset_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Reset_btn.setForeground(new java.awt.Color(255, 255, 255));
        Reset_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reset_btn.setText("Reset");
        Reset_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reset_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Reset_memberLayout = new javax.swing.GroupLayout(Reset_member);
        Reset_member.setLayout(Reset_memberLayout);
        Reset_memberLayout.setHorizontalGroup(
            Reset_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reset_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        Reset_memberLayout.setVerticalGroup(
            Reset_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reset_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel56.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel56.setText("←");
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });

        close1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("×");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Add_MemberLayout = new javax.swing.GroupLayout(Add_Member);
        Add_Member.setLayout(Add_MemberLayout);
        Add_MemberLayout.setHorizontalGroup(
            Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_MemberLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_MemberLayout.createSequentialGroup()
                        .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(Add_MemberLayout.createSequentialGroup()
                                    .addComponent(rpt_male_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rbt_female_ac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txt_pass_ac, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap())
                    .addGroup(Add_MemberLayout.createSequentialGroup()
                        .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_age_ac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txt_first_name_ac, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_emil_ac, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_phone_ac, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Add_MemberLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(show_id, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Add_MemberLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_second_name_ac)
                                    .addComponent(jLabel17)
                                    .addComponent(comb_number_of_month_ac, 0, 201, Short.MAX_VALUE)
                                    .addComponent(jLabel15)
                                    .addComponent(comb_coach_name_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(152, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_MemberLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Add_MemberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reset_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        Add_MemberLayout.setVerticalGroup(
            Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_MemberLayout.createSequentialGroup()
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_MemberLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(show_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addGap(40, 40, 40)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_first_name_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_second_name_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comb_number_of_month_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_emil_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comb_coach_name_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_age_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txt_pass_ac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rpt_male_ac)
                    .addComponent(rbt_female_ac))
                .addGap(27, 27, 27)
                .addGroup(Add_MemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        Add_coach.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("ID:");

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("FirstName:");

        show_id_aco.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        show_id_aco.setForeground(new java.awt.Color(255, 153, 153));
        show_id_aco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt_first_name_aco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_first_name_aco.setForeground(new java.awt.Color(255, 153, 153));

        jLabel22.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("SecondName:");

        txt_second_name_aco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_second_name_aco.setForeground(new java.awt.Color(255, 153, 153));

        jLabel23.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("Phone:");

        txt_phone_aco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_phone_aco.setForeground(new java.awt.Color(255, 153, 153));

        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Email:");

        txt_emil_aco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_emil_aco.setForeground(new java.awt.Color(255, 153, 153));

        jLabel25.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Password:");

        jLabel26.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Working Hours:");

        working_hours_aco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        working_hours_aco.setForeground(new java.awt.Color(255, 153, 153));
        working_hours_aco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                working_hours_acoActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("Gander:");

        rpt_male_aco.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rpt_male_aco);
        rpt_male_aco.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rpt_male_aco.setForeground(new java.awt.Color(255, 153, 153));
        rpt_male_aco.setSelected(true);
        rpt_male_aco.setText("Male");

        rbt_female_aco.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbt_female_aco);
        rbt_female_aco.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbt_female_aco.setForeground(new java.awt.Color(255, 153, 153));
        rbt_female_aco.setText("Female");

        txt_password_aco.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_password_aco.setForeground(new java.awt.Color(255, 153, 153));
        txt_password_aco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_password_acoActionPerformed(evt);
            }
        });

        add_coach.setBackground(new java.awt.Color(255, 153, 153));
        add_coach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_coachMouseClicked(evt);
            }
        });

        Add_btn_aco.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Add_btn_aco.setForeground(new java.awt.Color(255, 255, 255));
        Add_btn_aco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Add_btn_aco.setText("Add");

        javax.swing.GroupLayout add_coachLayout = new javax.swing.GroupLayout(add_coach);
        add_coach.setLayout(add_coachLayout);
        add_coachLayout.setHorizontalGroup(
            add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add_btn_aco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        add_coachLayout.setVerticalGroup(
            add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add_btn_aco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        Reset_coach.setBackground(new java.awt.Color(255, 153, 153));

        Reset_btn_aco.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Reset_btn_aco.setForeground(new java.awt.Color(255, 255, 255));
        Reset_btn_aco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reset_btn_aco.setText("Reset");
        Reset_btn_aco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reset_btn_acoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Reset_coachLayout = new javax.swing.GroupLayout(Reset_coach);
        Reset_coach.setLayout(Reset_coachLayout);
        Reset_coachLayout.setHorizontalGroup(
            Reset_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reset_btn_aco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        Reset_coachLayout.setVerticalGroup(
            Reset_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reset_btn_aco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel57.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel57.setText("←");
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });

        close2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close2.setText("×");
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Add_coachLayout = new javax.swing.GroupLayout(Add_coach);
        Add_coach.setLayout(Add_coachLayout);
        Add_coachLayout.setHorizontalGroup(
            Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_coachLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_coachLayout.createSequentialGroup()
                        .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txt_password_aco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addGroup(Add_coachLayout.createSequentialGroup()
                                .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_first_name_aco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23)
                                    .addComponent(txt_phone_aco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_emil_aco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(123, 123, 123)
                                .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(txt_second_name_aco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rbt_female_aco)
                                .addComponent(working_hours_aco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(187, Short.MAX_VALUE))
                    .addGroup(Add_coachLayout.createSequentialGroup()
                        .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(rpt_male_aco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_coach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Reset_coach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(Add_coachLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(show_id_aco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        Add_coachLayout.setVerticalGroup(
            Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_coachLayout.createSequentialGroup()
                .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Add_coachLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(show_id_aco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Add_coachLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_first_name_aco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_second_name_aco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Add_coachLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txt_phone_aco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(txt_emil_aco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txt_password_aco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(working_hours_aco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addGroup(Add_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rpt_male_aco)
                            .addComponent(rbt_female_aco))
                        .addGap(15, 15, 15)
                        .addComponent(Reset_coach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_coach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        Edit_delete_member.setBackground(new java.awt.Color(255, 255, 255));
        Edit_delete_member.setForeground(new java.awt.Color(255, 255, 255));

        jLabel28.setBackground(new java.awt.Color(153, 153, 153));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(153, 153, 153));
        jLabel28.setText("ID:");

        enter_id_edm.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        enter_id_edm.setForeground(new java.awt.Color(255, 153, 153));

        jLabel29.setBackground(new java.awt.Color(153, 153, 153));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 153, 153));
        jLabel29.setText("FirstName:");

        txt_first_name_edm.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_first_name_edm.setForeground(new java.awt.Color(255, 153, 153));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("SecondName:");

        txt_second_name_edm.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_second_name_edm.setForeground(new java.awt.Color(255, 153, 153));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 153, 153));
        jLabel31.setText("Phone:");

        txt_phone_edm.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_phone_edm.setForeground(new java.awt.Color(255, 153, 153));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 153, 153));
        jLabel32.setText("Email:");

        txt_emil_edm.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_emil_edm.setForeground(new java.awt.Color(255, 153, 153));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 153, 153));
        jLabel33.setText("CoachName:");

        combobox_coach_edm.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        combobox_coach_edm.setForeground(new java.awt.Color(255, 153, 153));
        combobox_coach_edm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Password:");

        txt_pass_edm.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_pass_edm.setForeground(new java.awt.Color(255, 153, 153));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("Age:");

        txt_age_edm.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_age_edm.setForeground(new java.awt.Color(255, 153, 153));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 153, 153));
        jLabel36.setText("Gander:");

        rpt_male_edm.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rpt_male_edm);
        rpt_male_edm.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rpt_male_edm.setForeground(new java.awt.Color(255, 153, 153));
        rpt_male_edm.setSelected(true);
        rpt_male_edm.setText("Male");

        rbt_female_edm.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup4.add(rbt_female_edm);
        rbt_female_edm.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbt_female_edm.setForeground(new java.awt.Color(255, 153, 153));
        rbt_female_edm.setText("Female");

        search_customer_id.setForeground(new java.awt.Color(255, 51, 51));
        search_customer_id.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/search (2).png"))); // NOI18N
        search_customer_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_customer_idMouseClicked(evt);
            }
        });

        update_in_edit_member.setBackground(new java.awt.Color(255, 153, 153));
        update_in_edit_member.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_in_edit_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_in_edit_memberMouseClicked(evt);
            }
        });

        update_member.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        update_member.setForeground(new java.awt.Color(255, 255, 255));
        update_member.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_member.setText("Update");
        update_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_memberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout update_in_edit_memberLayout = new javax.swing.GroupLayout(update_in_edit_member);
        update_in_edit_member.setLayout(update_in_edit_memberLayout);
        update_in_edit_memberLayout.setHorizontalGroup(
            update_in_edit_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_member, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        update_in_edit_memberLayout.setVerticalGroup(
            update_in_edit_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_member, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        delete_in_edit_member.setBackground(new java.awt.Color(255, 153, 153));
        delete_in_edit_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_in_edit_memberMouseClicked(evt);
            }
        });

        delete_member.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        delete_member.setForeground(new java.awt.Color(255, 255, 255));
        delete_member.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_member.setText("Delete");
        delete_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_memberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout delete_in_edit_memberLayout = new javax.swing.GroupLayout(delete_in_edit_member);
        delete_in_edit_member.setLayout(delete_in_edit_memberLayout);
        delete_in_edit_memberLayout.setHorizontalGroup(
            delete_in_edit_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete_member, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        delete_in_edit_memberLayout.setVerticalGroup(
            delete_in_edit_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete_member, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel62.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel62.setText("←");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });

        close3.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close3.setText("×");
        close3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Edit_delete_memberLayout = new javax.swing.GroupLayout(Edit_delete_member);
        Edit_delete_member.setLayout(Edit_delete_memberLayout);
        Edit_delete_memberLayout.setHorizontalGroup(
            Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                        .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_first_name_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_phone_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_emil_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(123, 123, 123)
                                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(combobox_coach_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_second_name_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))))
                        .addContainerGap(188, Short.MAX_VALUE))
                    .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                        .addComponent(rpt_male_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbt_female_edm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_in_edit_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_in_edit_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                        .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_age_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pass_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enter_id_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        Edit_delete_memberLayout.setVerticalGroup(
            Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search_customer_id)
                            .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28)
                                .addComponent(enter_id_edm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(close3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(12, 12, 12)
                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_second_name_edm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_first_name_edm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone_edm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox_coach_edm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(txt_emil_edm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(txt_pass_edm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_age_edm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Edit_delete_memberLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rpt_male_edm)
                            .addComponent(rbt_female_edm))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Edit_delete_memberLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(Edit_delete_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete_in_edit_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_in_edit_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );

        Edit_delete_coach.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(153, 153, 153));
        jLabel37.setText("ID:");

        enter_id.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        enter_id.setForeground(new java.awt.Color(255, 153, 153));
        enter_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_idActionPerformed(evt);
            }
        });

        txt_first_name_edc.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        txt_first_name_edc.setForeground(new java.awt.Color(255, 153, 153));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 153, 153));
        jLabel38.setText("FirstName:");

        txt_second_name_edc.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_second_name_edc.setForeground(new java.awt.Color(255, 153, 153));
        txt_second_name_edc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_second_name_edcActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 153, 153));
        jLabel39.setText("SecondName:");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(153, 153, 153));
        jLabel40.setText("Phone:");

        txt_phone_edc.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        txt_phone_edc.setForeground(new java.awt.Color(255, 153, 153));
        txt_phone_edc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phone_edcActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(153, 153, 153));
        jLabel41.setText("Email:");

        txt_emil_edc.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_emil_edc.setForeground(new java.awt.Color(255, 153, 153));
        txt_emil_edc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emil_edcActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 153, 153));
        jLabel42.setText("Working Hours:");

        txt_working_hours_edc.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_working_hours_edc.setForeground(new java.awt.Color(255, 153, 153));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("Password:");

        txt_pass_edc.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_pass_edc.setForeground(new java.awt.Color(255, 153, 153));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(153, 153, 153));
        jLabel44.setText("Gander:");

        search_coach_id.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/search (2).png"))); // NOI18N
        search_coach_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_coach_idMouseClicked(evt);
            }
        });

        rpt_male_edc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rpt_male_edc);
        rpt_male_edc.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rpt_male_edc.setForeground(new java.awt.Color(255, 153, 153));
        rpt_male_edc.setSelected(true);
        rpt_male_edc.setText("Male");

        rbt_female_edc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbt_female_edc);
        rbt_female_edc.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        rbt_female_edc.setForeground(new java.awt.Color(255, 153, 153));
        rbt_female_edc.setText("Female");
        rbt_female_edc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_female_edcActionPerformed(evt);
            }
        });

        update_coach.setBackground(new java.awt.Color(255, 153, 153));
        update_coach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_coachMouseClicked(evt);
            }
        });

        update_coach_edc.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        update_coach_edc.setForeground(new java.awt.Color(255, 255, 255));
        update_coach_edc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_coach_edc.setText("Update");
        update_coach_edc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_coach_edcMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout update_coachLayout = new javax.swing.GroupLayout(update_coach);
        update_coach.setLayout(update_coachLayout);
        update_coachLayout.setHorizontalGroup(
            update_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_coach_edc, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        update_coachLayout.setVerticalGroup(
            update_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_coach_edc, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        delete_in_edit_coach.setBackground(new java.awt.Color(255, 153, 153));
        delete_in_edit_coach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_in_edit_coachMouseClicked(evt);
            }
        });

        delete_coach_edc.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        delete_coach_edc.setForeground(new java.awt.Color(255, 255, 255));
        delete_coach_edc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_coach_edc.setText("Delete");
        delete_coach_edc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_coach_edcMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout delete_in_edit_coachLayout = new javax.swing.GroupLayout(delete_in_edit_coach);
        delete_in_edit_coach.setLayout(delete_in_edit_coachLayout);
        delete_in_edit_coachLayout.setHorizontalGroup(
            delete_in_edit_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete_coach_edc, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        delete_in_edit_coachLayout.setVerticalGroup(
            delete_in_edit_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete_coach_edc, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel58.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel58.setText("←");
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });

        close4.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close4.setText("×");
        close4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Edit_delete_coachLayout = new javax.swing.GroupLayout(Edit_delete_coach);
        Edit_delete_coach.setLayout(Edit_delete_coachLayout);
        Edit_delete_coachLayout.setHorizontalGroup(
            Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                        .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(txt_emil_edc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_phone_edc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pass_edc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_first_name_edc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(123, 123, 123)
                                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(txt_second_name_edc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                                .addComponent(rpt_male_edc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbt_female_edc))
                            .addComponent(txt_working_hours_edc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(187, Short.MAX_VALUE))
                    .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(search_coach_id, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Edit_delete_coachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update_coach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_in_edit_coach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        Edit_delete_coachLayout.setVerticalGroup(
            Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(enter_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_coach_id)))
                    .addComponent(close4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Edit_delete_coachLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_first_name_edc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_second_name_edc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(txt_phone_edc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(txt_emil_edc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(txt_pass_edc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addGap(18, 18, 18)
                .addComponent(txt_working_hours_edc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rpt_male_edc)
                    .addComponent(rbt_female_edc))
                .addGap(5, 5, 5)
                .addGroup(Edit_delete_coachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_coach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_in_edit_coach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        Equipment.setBackground(new java.awt.Color(255, 255, 255));
        Equipment.setPreferredSize(new java.awt.Dimension(724, 663));

        jLabel45.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(153, 153, 153));
        jLabel45.setText("Quantity:");

        jLabel47.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(153, 153, 153));
        jLabel47.setText("Machine Name:");

        txt_machine_name.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_machine_name.setForeground(new java.awt.Color(255, 153, 153));
        txt_machine_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_machine_nameActionPerformed(evt);
            }
        });

        txt_quantiy.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_quantiy.setForeground(new java.awt.Color(255, 153, 153));

        Add_equipment.setBackground(new java.awt.Color(255, 153, 153));

        Addeq.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Addeq.setForeground(new java.awt.Color(255, 255, 255));
        Addeq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addeq.setText("Add");
        Addeq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddeqMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Add_equipmentLayout = new javax.swing.GroupLayout(Add_equipment);
        Add_equipment.setLayout(Add_equipmentLayout);
        Add_equipmentLayout.setHorizontalGroup(
            Add_equipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Addeq, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Add_equipmentLayout.setVerticalGroup(
            Add_equipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Addeq, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        tbl_machine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tbl_machine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_machineMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_machine);

        update_equipment.setBackground(new java.awt.Color(255, 153, 153));
        update_equipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_equipmentMouseClicked(evt);
            }
        });

        updateeq.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        updateeq.setForeground(new java.awt.Color(255, 255, 255));
        updateeq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateeq.setText("Update");
        updateeq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateeqMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout update_equipmentLayout = new javax.swing.GroupLayout(update_equipment);
        update_equipment.setLayout(update_equipmentLayout);
        update_equipmentLayout.setHorizontalGroup(
            update_equipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateeq, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        );
        update_equipmentLayout.setVerticalGroup(
            update_equipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateeq, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        delete_equipment.setBackground(new java.awt.Color(255, 153, 153));
        delete_equipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_equipmentMouseClicked(evt);
            }
        });

        deleteeq.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        deleteeq.setForeground(new java.awt.Color(255, 255, 255));
        deleteeq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteeq.setText("Delete");
        deleteeq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteeqMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout delete_equipmentLayout = new javax.swing.GroupLayout(delete_equipment);
        delete_equipment.setLayout(delete_equipmentLayout);
        delete_equipmentLayout.setHorizontalGroup(
            delete_equipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteeq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
        );
        delete_equipmentLayout.setVerticalGroup(
            delete_equipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteeq, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel59.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel59.setText("←");
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });

        close5.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close5.setText("×");
        close5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EquipmentLayout = new javax.swing.GroupLayout(Equipment);
        Equipment.setLayout(EquipmentLayout);
        EquipmentLayout.setHorizontalGroup(
            EquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipmentLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(EquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EquipmentLayout.createSequentialGroup()
                        .addGroup(EquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_quantiy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(txt_machine_name, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(EquipmentLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EquipmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_equipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update_equipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete_equipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        EquipmentLayout.setVerticalGroup(
            EquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EquipmentLayout.createSequentialGroup()
                .addGroup(EquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EquipmentLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel47)
                        .addGap(10, 10, 10))
                    .addGroup(EquipmentLayout.createSequentialGroup()
                        .addGroup(EquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EquipmentLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addComponent(txt_machine_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel45)
                .addGap(10, 10, 10)
                .addComponent(txt_quantiy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(EquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_equipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_equipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_equipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        Subscribtion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(153, 153, 153));
        jLabel48.setText(" Price:");

        txt_price.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txt_price.setForeground(new java.awt.Color(255, 153, 153));
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });

        show_price.setForeground(new java.awt.Color(255, 153, 153));

        jLabel46.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(153, 153, 153));
        jLabel46.setText("Current price:");

        update_price.setBackground(new java.awt.Color(255, 153, 153));
        update_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_priceMouseClicked(evt);
            }
        });

        update_price_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        update_price_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_price_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_price_btn.setText("Update Price");
        update_price_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_price_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout update_priceLayout = new javax.swing.GroupLayout(update_price);
        update_price.setLayout(update_priceLayout);
        update_priceLayout.setHorizontalGroup(
            update_priceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_price_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        update_priceLayout.setVerticalGroup(
            update_priceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_price_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel60.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel60.setText("←");
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });

        close6.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close6.setText("×");
        close6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SubscribtionLayout = new javax.swing.GroupLayout(Subscribtion);
        Subscribtion.setLayout(SubscribtionLayout);
        SubscribtionLayout.setHorizontalGroup(
            SubscribtionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubscribtionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(SubscribtionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubscribtionLayout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SubscribtionLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(show_price, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubscribtionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        SubscribtionLayout.setVerticalGroup(
            SubscribtionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubscribtionLayout.createSequentialGroup()
                .addGroup(SubscribtionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SubscribtionLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(SubscribtionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(show_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(close6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SubscribtionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(SubscribtionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
                .addComponent(update_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        Income.setBackground(new java.awt.Color(255, 255, 255));

        txt_month.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txt_month.setForeground(new java.awt.Color(255, 153, 153));

        txt_year.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txt_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yearActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(153, 153, 153));
        jLabel49.setText("Enter  year:");

        jLabel51.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(153, 153, 153));
        jLabel51.setText("Enter month:");

        jLabel54.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(153, 153, 153));
        jLabel54.setText("Total Income:");

        income.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        income.setForeground(new java.awt.Color(255, 153, 153));

        update_price1.setBackground(new java.awt.Color(255, 153, 153));
        update_price1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_price1MouseClicked(evt);
            }
        });

        update_price_btn1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        update_price_btn1.setForeground(new java.awt.Color(255, 255, 255));
        update_price_btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update_price_btn1.setText("calculate");
        update_price_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_price_btn1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout update_price1Layout = new javax.swing.GroupLayout(update_price1);
        update_price1.setLayout(update_price1Layout);
        update_price1Layout.setHorizontalGroup(
            update_price1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_price_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        update_price1Layout.setVerticalGroup(
            update_price1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update_price_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel61.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel61.setText("←");
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        close7.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        close7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close7.setText("×");
        close7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout IncomeLayout = new javax.swing.GroupLayout(Income);
        Income.setLayout(IncomeLayout);
        IncomeLayout.setHorizontalGroup(
            IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeLayout.createSequentialGroup()
                .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IncomeLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IncomeLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(76, 76, 76)
                        .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_year, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_month, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IncomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(update_price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(IncomeLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel54)
                .addGap(18, 18, 18)
                .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        IncomeLayout.setVerticalGroup(
            IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeLayout.createSequentialGroup()
                .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IncomeLayout.createSequentialGroup()
                        .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IncomeLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel54)
                                    .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(close7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(IncomeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IncomeLayout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IncomeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(txt_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(IncomeLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(IncomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IncomeLayout.createSequentialGroup()
                                .addComponent(txt_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(update_price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Edit_delete_member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Equipment, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Edit_delete_coach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Add_Member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Subscribtion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Income, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Add_coach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(List_of_member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Edit_delete_member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addComponent(Equipment, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 29, Short.MAX_VALUE)))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Edit_delete_coach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Add_Member, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Subscribtion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Income, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Add_coach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(List_of_member, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void onHover(JPanel panel){
       if(panel.getBackground().equals(new Color(255,255,255))){
            panel.setBackground(Color.white);
       }
       else{
       panel.setBackground(new Color(102,102,102));
       }
   }
   private void onclicked(JPanel panel,JPanel panel1,JLabel label ){
       panel.setBackground(Color.white);
        panel1.setBackground(new Color(255,153,153));
        label.setForeground(new Color(153,153,153));
   }
   private void onleaveclicked(JPanel panel,JPanel panel1,JLabel label){
       panel.setBackground(new Color(153,153,153));
       panel1.setBackground(new Color(153,153,153));
       label.setForeground(Color.WHITE);
   }
   private void onleavehover(JPanel panel){
      if(panel.getBackground().equals(new Color(255,255,255))){
            panel.setBackground(Color.white);
       }
       else{
       panel.setBackground(new Color(153,153,153));
       }
   }
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        onclicked(button1, jPanel3,jLabel1);
        onleaveclicked(button2, jPanel4,jLabel2);
         onleaveclicked(button3, jPanel5,jLabel3);
          onleaveclicked(button4, jPanel6,jLabel4);
         onleaveclicked(button5, jPanel7,jLabel5);
          onleaveclicked(button6, jPanel8,jLabel6);
           onleaveclicked(button7, jPanel9,jLabel7);
            onleaveclicked(button8, jPanel10,jLabel8); 
               turnoff();
            
            List_of_member.setVisible(true);
            dtm.setRowCount(0);
         filltable();
            
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
      
        onclicked(button2, jPanel4,jLabel2);
         onleaveclicked(button1, jPanel3,jLabel1); 
         onleaveclicked(button3, jPanel5,jLabel3);
          onleaveclicked(button4, jPanel6,jLabel4);
         onleaveclicked(button5, jPanel7,jLabel5);
          onleaveclicked(button6, jPanel8,jLabel6);
           onleaveclicked(button7, jPanel9,jLabel7);
            onleaveclicked(button8, jPanel10,jLabel8);
           turnoff();
            Add_Member.setVisible(true);
            
          
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        onclicked(button3, jPanel5,jLabel3);
         onleaveclicked(button1, jPanel3,jLabel1); 
         onleaveclicked(button2, jPanel4,jLabel2);
          onleaveclicked(button4, jPanel6,jLabel4);
         onleaveclicked(button5, jPanel7,jLabel5);
          onleaveclicked(button6, jPanel8,jLabel6);
           onleaveclicked(button7, jPanel9,jLabel7);
            onleaveclicked(button8, jPanel10,jLabel8);
            turnoff();
           Add_coach.setVisible(true);
    }//GEN-LAST:event_button3MouseClicked

    private void button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseClicked
       onclicked(button4, jPanel6,jLabel4);
         onleaveclicked(button1, jPanel3,jLabel1); 
         onleaveclicked(button2, jPanel4,jLabel2);
          onleaveclicked(button3, jPanel5,jLabel3);
         onleaveclicked(button5, jPanel7,jLabel5);
          onleaveclicked(button6, jPanel8,jLabel6);
           onleaveclicked(button7, jPanel9,jLabel7);
            onleaveclicked(button8, jPanel10,jLabel8);
             turnoff();
            Edit_delete_member.setVisible(true);
    }//GEN-LAST:event_button4MouseClicked

    private void button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseClicked
        onclicked(button5, jPanel7,jLabel5);
         onleaveclicked(button1, jPanel3,jLabel1); 
         onleaveclicked(button2, jPanel4,jLabel2);
          onleaveclicked(button3, jPanel5,jLabel3);
         onleaveclicked(button4, jPanel6,jLabel4);
          onleaveclicked(button6, jPanel8,jLabel6);
           onleaveclicked(button7, jPanel9,jLabel7);
            onleaveclicked(button8, jPanel10,jLabel8);
             turnoff();
            Edit_delete_coach.setVisible(true);
    }//GEN-LAST:event_button5MouseClicked

    private void button6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseClicked
        onclicked(button6, jPanel8,jLabel6);
         onleaveclicked(button1, jPanel3,jLabel1); 
         onleaveclicked(button2, jPanel4,jLabel2);
          onleaveclicked(button3, jPanel5,jLabel3);
         onleaveclicked(button4, jPanel6,jLabel4);
          onleaveclicked(button5, jPanel7,jLabel5);
           onleaveclicked(button7, jPanel9,jLabel7);
            onleaveclicked(button8, jPanel10,jLabel8);
             turnoff();
            Equipment.setVisible(true);
    }//GEN-LAST:event_button6MouseClicked

    private void button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseClicked
       onclicked(button8, jPanel10,jLabel8);
         onleaveclicked(button1, jPanel3,jLabel1); 
         onleaveclicked(button2, jPanel4,jLabel2);
          onleaveclicked(button3, jPanel5,jLabel3);
         onleaveclicked(button4, jPanel6,jLabel4);
          onleaveclicked(button5, jPanel7,jLabel5);
           onleaveclicked(button7, jPanel9,jLabel7);
            onleaveclicked(button6, jPanel8,jLabel6);
             turnoff();
             show_price.setText((Double.toString(price_of_month)));
            Subscribtion.setVisible(true);
            
    }//GEN-LAST:event_button8MouseClicked

    private void button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseClicked
         onclicked(button7, jPanel9,jLabel7);
         onleaveclicked(button1, jPanel3,jLabel1); 
         onleaveclicked(button2, jPanel4,jLabel2);
          onleaveclicked(button3, jPanel5,jLabel3);
         onleaveclicked(button4, jPanel6,jLabel4);
          onleaveclicked(button5, jPanel7,jLabel5);
           onleaveclicked(button8, jPanel10,jLabel8);
            onleaveclicked(button6, jPanel8,jLabel6);
             turnoff();
            Income.setVisible(true);
    }//GEN-LAST:event_button7MouseClicked

    private void button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseEntered
       onHover(button1);
        onleavehover(button2);
        onleavehover(button3);
        onleavehover(button4);
        onleavehover(button5);
        onleavehover(button6);
        onleavehover(button7);
        onleavehover(button8);
        
    }//GEN-LAST:event_button1MouseEntered

    private void button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseEntered
         onHover(button2);
        onleavehover(button1);
        onleavehover(button3);
        onleavehover(button4);
        onleavehover(button5);
        onleavehover(button6);
        onleavehover(button7);
        onleavehover(button8);
    }//GEN-LAST:event_button2MouseEntered

    private void button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseEntered
         onHover(button3);
        onleavehover(button2);
        onleavehover(button1);
        onleavehover(button4);
        onleavehover(button5);
        onleavehover(button6);
        onleavehover(button7);
        onleavehover(button8);
    }//GEN-LAST:event_button3MouseEntered

    private void button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseEntered
         onHover(button4);
        onleavehover(button2);
        onleavehover(button3);
        onleavehover(button1);
        onleavehover(button5);
        onleavehover(button6);
        onleavehover(button7);
        onleavehover(button8);
    }//GEN-LAST:event_button4MouseEntered

    private void button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseEntered
        onHover(button5);
        onleavehover(button2);
        onleavehover(button3);
        onleavehover(button4);
        onleavehover(button1);
        onleavehover(button6);
        onleavehover(button7);
        onleavehover(button8);
    }//GEN-LAST:event_button5MouseEntered

    private void button6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseEntered
        onHover(button6);
        onleavehover(button2);
        onleavehover(button3);
        onleavehover(button4);
        onleavehover(button5);
        onleavehover(button1);
        onleavehover(button7);
        onleavehover(button8);
    }//GEN-LAST:event_button6MouseEntered

    private void button8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseEntered
        onHover(button8);
        onleavehover(button2);
        onleavehover(button3);
        onleavehover(button4);
        onleavehover(button5);
        onleavehover(button6);
        onleavehover(button7);
        onleavehover(button1);
    }//GEN-LAST:event_button8MouseEntered

    private void button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseEntered
        onHover(button7);
        onleavehover(button2);
        onleavehover(button3);
        onleavehover(button4);
        onleavehover(button5);
        onleavehover(button6);
        onleavehover(button1);
        onleavehover(button8);
    }//GEN-LAST:event_button7MouseEntered

    private void button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseExited
      onleavehover(button1);
    }//GEN-LAST:event_button1MouseExited

    private void button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseExited
       onleavehover(button2);
    }//GEN-LAST:event_button2MouseExited

    private void button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseExited
       onleavehover(button3);
    }//GEN-LAST:event_button3MouseExited

    private void button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button4MouseExited
        onleavehover(button4);
    }//GEN-LAST:event_button4MouseExited

    private void button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button5MouseExited
        onleavehover(button5);
    }//GEN-LAST:event_button5MouseExited

    private void button6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button6MouseExited
       onleavehover(button6);
    }//GEN-LAST:event_button6MouseExited

    private void button8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button8MouseExited
       onleavehover(button8);
    }//GEN-LAST:event_button8MouseExited

    private void button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button7MouseExited
        onleavehover(button7);
    }//GEN-LAST:event_button7MouseExited

    private void txt_password_acoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_password_acoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_password_acoActionPerformed

    private void Reset_btn_acoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reset_btn_acoMouseClicked
          txt_first_name_aco.setText("");
          txt_second_name_aco.setText("");
          txt_phone_aco.setText("");
          txt_emil_aco.setText("");
          txt_password_aco.setText("");
          working_hours_aco.setText("");
           if(!rpt_male_aco.isSelected())
              rpt_male_aco.setSelected(true);
    }//GEN-LAST:event_Reset_btn_acoMouseClicked

    private void add_coachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_coachMouseClicked
      if(!txt_first_name_aco.getText().isEmpty()&&!txt_second_name_aco.getText().isEmpty()&&!txt_phone_aco.getText().isEmpty()&&!txt_emil_aco.getText().isEmpty()&&!txt_password_aco.getText().isEmpty()){
      try{
        String first_name=txt_first_name_aco.getText();
          String second_name=txt_second_name_aco.getText();
          String phone=txt_phone_aco.getText();
          String E_mail=txt_emil_aco.getText();
          String password=txt_password_aco.getText();
          int number_of_hours=Integer.parseInt(working_hours_aco.getText());
          String gender;
        
          //int coach_id=DataOfCoach.add_coach();
          if(rpt_male_aco.isSelected()) gender="male"; else gender="female";
          //String full_name=first_name+second_name;
         // DataOfCoach.set_name_id(full_name,coach_id);
        
           PreparedStatement stmt = con.prepareStatement("insert into coach(f_name,s_name,coach_password,gender,phone,email,working_hours)values(?,?,?,?,?,?,?)");
              stmt.setString(1,first_name );
              stmt.setString(2,second_name );
              stmt.setString(3,password );
              stmt.setString(4,gender );
              stmt.setString(5,phone );
              stmt.setString(6,E_mail );
              stmt.setInt(7,number_of_hours );
                stmt.executeUpdate();
             JOptionPane.showMessageDialog(this, "added successful");
             Coach_id++;
             show_id_aco.setText(Integer.toString(Coach_id));
             txt_first_name_aco.setText("");
             txt_second_name_aco.setText("");
             txt_phone_aco.setText("");
             txt_emil_aco.setText("");
             txt_password_aco.setText("");
             working_hours_aco.setText("");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }
       
    
      
    }
    }//GEN-LAST:event_add_coachMouseClicked

    private void txt_second_name_edcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_second_name_edcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_second_name_edcActionPerformed

    private void txt_phone_edcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phone_edcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phone_edcActionPerformed

    private void txt_emil_edcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emil_edcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emil_edcActionPerformed

    private void rbt_female_edcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_female_edcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_female_edcActionPerformed

    private void enter_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_idActionPerformed

// function edit and update the data for customer
    
    private void update_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_memberMouseClicked
        if(!txt_first_name_edm.getText().isEmpty()&&!txt_second_name_edm.getText().isEmpty()&&!txt_phone_edm.getText().isEmpty()&&!txt_emil_edm.getText().isEmpty()&&!txt_pass_edm.getText().isEmpty()&&combobox_coach_edm.getSelectedItem()!="None"&&!txt_age_edm.getText().isEmpty())
     {
          try{
          String first_name=txt_first_name_edm.getText();
          String second_name=txt_second_name_edm.getText();
          String phone=txt_phone_edm.getText();
          String E_mail=txt_emil_edm.getText();
          String password=txt_pass_edm.getText();
          String gender;
          if(rpt_male_edm.isSelected())
              gender="male";
          else
              gender="female";
          int coach_id=combobox_coach_edm.getSelectedIndex();
         
          int age=Integer.parseInt(txt_age_edm.getText());

          PreparedStatement stmt = con.prepareStatement("update  Customer set f_name=?,s_name=?,customer_password=?,gender=?,phone=?,email=?,coach_id=?,age=? where customer_id=?") ;
              stmt.setString(1,first_name );
              stmt.setString(2,second_name );
              stmt.setString(3,password );
              stmt.setString(4,gender );
              stmt.setString(5,phone );
               stmt.setString(6,E_mail );
              stmt.setInt(7,arr_coach.get(coach_id-1) ); 
              stmt.setInt(8,age );
               stmt.setInt(9,check_customer_id );     
              stmt.executeUpdate();    
             JOptionPane.showMessageDialog(this, "Update successful");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }
     }
    }//GEN-LAST:event_update_memberMouseClicked


    private void update_in_edit_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_in_edit_memberMouseClicked
     
    }//GEN-LAST:event_update_in_edit_memberMouseClicked

    private void delete_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_memberMouseClicked
         try{
             PreparedStatement stmt = con.prepareStatement("delete from customer where customer_id=?") ;
             PreparedStatement stm = con.prepareStatement("delete from subscribtion where sub_id=?") ;
             stmt.setInt(1,check_customer_id);
             stm.setInt(1,check_customer_id);
//             boolean pass=false;
//             for(int i=0;i<arr_coach.size();i++){
//                 if(check_customer_id==arr_coach.get(i)){
//                  arr_coach.remove(i);
//                 }
//             }
             stmt.executeUpdate();
             stm.executeUpdate();
          txt_first_name_edm.setText("");
          txt_second_name_edm.setText("");
          txt_phone_edm.setText("");
          txt_emil_edm.setText("");
          txt_pass_edm.setText("");
          combobox_coach_edm.setSelectedIndex(0);
          txt_age_edm.setText("");
          if(!rpt_male_edm.isSelected())
              rpt_male_edm.setSelected(true);
          
             
          JOptionPane.showMessageDialog(this, "delete successful");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }
    }//GEN-LAST:event_delete_memberMouseClicked

    private void delete_in_edit_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_in_edit_memberMouseClicked
      
    }//GEN-LAST:event_delete_in_edit_memberMouseClicked

    private void working_hours_acoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_working_hours_acoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_working_hours_acoActionPerformed

    private void update_coach_edcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_coach_edcMouseClicked
          if(!txt_first_name_edc.getText().isEmpty()&&!txt_second_name_edc.getText().isEmpty()&&!txt_phone_edc.getText().isEmpty()&&!txt_emil_edc.getText().isEmpty()&&!txt_pass_edc.getText().isEmpty()&&!txt_working_hours_edc.getText().isEmpty())
     {
          try{
          String first_name=txt_first_name_edc.getText();
          String second_name=txt_second_name_edc.getText();
          String phone=txt_phone_edc.getText();
          String E_mail=txt_emil_edc.getText();
          String password=txt_pass_edc.getText();
          int working_hours=Integer.parseInt(txt_working_hours_edc.getText());
          String gender;
          if(rpt_male_edc.isSelected())
              gender="male";
          else
              gender="female";
         
          PreparedStatement stmt = con.prepareStatement("update  coach set f_name=?,s_name=?,coach_password=?,gender=?,phone=?,email=?,working_hours=? where coach_id=?") ;
              stmt.setString(1,first_name );
              stmt.setString(2,second_name );
              stmt.setString(3,password );
              stmt.setString(4,gender );
              stmt.setString(5,phone );
              stmt.setString(6,E_mail );
              stmt.setInt(7,working_hours );
              stmt.setInt(8,check_coach_id );
              stmt.executeUpdate();        
             JOptionPane.showMessageDialog(this, "update successful");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }
     }
     
    }//GEN-LAST:event_update_coach_edcMouseClicked

    private void update_coachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_coachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_coachMouseClicked

    private void delete_coach_edcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_coach_edcMouseClicked
    try {
            boolean pass=false;
            PreparedStatement stmt = con.prepareStatement("select coach_id from customer");
            ResultSet rs=stmt.executeQuery();
           while(rs.next()){
               if(check_coach_id==rs.getInt(1)){
                   pass=true;
               }
           }
           if(pass){
                JOptionPane.showMessageDialog(this,"Not Allowed");
           }
           else{
                try{
             PreparedStatement stm = con.prepareStatement("delete from coach where coach_id=?") ;
             stm.setInt(1,check_coach_id);
             stm.executeUpdate();
             
          txt_first_name_edc.setText("");
          txt_second_name_edc.setText("");
          txt_phone_edc.setText("");
          txt_emil_edc.setText("");
          txt_pass_edc.setText("");
          txt_working_hours_edc.setText("");
          if(!rpt_male_edc.isSelected())
              rpt_male_edc.setSelected(true);
             
          JOptionPane.showMessageDialog(this, "delete successful");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }
           }
           
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server IS Closed");
        }
    }//GEN-LAST:event_delete_coach_edcMouseClicked

    private void delete_in_edit_coachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_in_edit_coachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_in_edit_coachMouseClicked

    private void txt_machine_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_machine_nameActionPerformed

    }//GEN-LAST:event_txt_machine_nameActionPerformed

    private void tbl_machineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_machineMouseClicked
        txt_machine_name.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 2).toString());
        txt_quantiy.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_tbl_machineMouseClicked

    private void updateeqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeqMouseClicked
                if(!txt_machine_name.getText().isEmpty()&&!txt_quantiy.getText().isEmpty());  
try{
        String machine_name=txt_machine_name.getText();
          int quantiy=Integer.parseInt(txt_quantiy.getText());
          PreparedStatement stmt = con.prepareStatement("update equipment set quantity=?,name_of_equipment=? where equipment_code=? ");
          stmt.setInt(1,quantiy );
          stmt.setString(2, machine_name);
          stmt.setInt(3, code);
          stmt.executeUpdate();
          JOptionPane.showMessageDialog(this, "update successful");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }

        
    }//GEN-LAST:event_updateeqMouseClicked

    private void update_equipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_equipmentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_equipmentMouseClicked

    private void deleteeqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteeqMouseClicked
      try{
           PreparedStatement stmt = con.prepareStatement("delete from equipment where equipment_code=?");
           stmt.setInt(1,code);
           stmt.executeUpdate();
           txt_machine_name.setText(  "");
           txt_quantiy.setText("");
             dtmeq.setRowCount(0);
          filltable_equipment();
         JOptionPane.showMessageDialog(this, "delete successful");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }
       
    }//GEN-LAST:event_deleteeqMouseClicked

    private void delete_equipmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_equipmentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_equipmentMouseClicked

    private void AddeqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddeqMouseClicked
if(!txt_machine_name.getText().isEmpty()&&!txt_quantiy.getText().isEmpty());  
try{
        String machine_name=txt_machine_name.getText();
          int quantiy=Integer.parseInt(txt_quantiy.getText());
          PreparedStatement stmt = con.prepareStatement("insert into equipment (quantity,name_of_equipment)values(?,?)");
          stmt.setInt(1,quantiy );
          stmt.setString(2, machine_name);
          stmt.executeUpdate();
          dtmeq.setRowCount(0);
          filltable_equipment();
          JOptionPane.showMessageDialog(this, "added successful");
          
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }    
    }//GEN-LAST:event_AddeqMouseClicked

    private void search_customer_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_customer_idMouseClicked
         check_customer_id = Integer.parseInt(enter_id_edm.getText());
        try {
            PreparedStatement stmt = con.prepareStatement("select customer_id,f_name,s_name,customer_password,gender,phone,email,coach_id,age from customer");
         ResultSet rs=stmt.executeQuery();
         boolean pass=false;
         while(rs.next()){
             if(rs.getInt(1)==check_customer_id){
                 pass=true;
                txt_first_name_edm.setText( rs.getString(2 ));
                txt_second_name_edm.setText( rs.getString(3 ));
                txt_phone_edm.setText( rs.getString(6));
                txt_pass_edm.setText( rs.getString(4 ));
                txt_emil_edm.setText( rs.getString(7 ));
                txt_age_edm.setText( rs.getString(9 ));
               for(int i=0;i<arr_coach.size();i++){
                  if(rs.getInt(8)==arr_coach.get(i)){
                      combobox_coach_edm.setSelectedIndex(i+1);
                      break;
                      
                  }
              }
              //show.setText(Integer.toString(arr_coach.size()));
           
              
              if(rs.getString(5).equals("male"))
                      
                      rpt_male_edm.setSelected(true);
              else
                  
                      rbt_female_edm.setSelected(true);
             }
         
         }
         if(pass==false)
          JOptionPane.showMessageDialog(this,"customer not found");   
    }
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server IS Closed");       
        }
    }//GEN-LAST:event_search_customer_idMouseClicked

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void search_coach_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_coach_idMouseClicked
  check_coach_id=Integer.parseInt(enter_id.getText());
        try {
            PreparedStatement stmt = con.prepareStatement("select coach_id,f_name,s_name,coach_password,gender,phone,email,working_hours from coach");
            ResultSet rs=stmt.executeQuery();
            boolean pass=false;
            while(rs.next()){
                if(rs.getInt(1)==check_coach_id){
                    pass=true;
                    txt_first_name_edc.setText( rs.getString(2 ));
                    txt_second_name_edc.setText( rs.getString(3 ));
                    txt_phone_edc.setText( rs.getString(6));
                    txt_pass_edc.setText( rs.getString(4 ));
                    txt_emil_edc.setText( rs.getString(7 ));
                    txt_working_hours_edc.setText(Integer.toString(rs.getInt(8)));
                    if(rs.getString(5).equals("male"))
                    rpt_male_edc.setSelected(true);
                    else

                        
                    rbt_female_edc.setSelected(true);
                }

            }
            if(pass==false)
            JOptionPane.showMessageDialog(this,"Coach not found");
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server IS Closed");
        }
    }//GEN-LAST:event_search_coach_idMouseClicked

    private void update_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_priceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_priceMouseClicked

    private void update_price_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_price_btnMouseClicked
       try{
       price_of_month=Double.parseDouble(txt_price.getText());
              
          PreparedStatement stmt = con.prepareStatement("update price set price_of_month=? ");
          stmt.setDouble(1,price_of_month);
          stmt.executeUpdate();
           show_price.setText((Double.toString(price_of_month)));
          JOptionPane.showMessageDialog(this, "update successful");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "server is closed");
          }

    }//GEN-LAST:event_update_price_btnMouseClicked

    private void Add_btn_acMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_btn_acMouseClicked
          if(!txt_first_name_ac.getText().isEmpty()&&!txt_second_name_ac.getText().isEmpty()&&!txt_phone_ac.getText().isEmpty()&&!txt_emil_ac.getText().isEmpty()&&!txt_pass_ac.getText().isEmpty()&&comb_coach_name_ac.getSelectedItem()!="None"&&!txt_age_ac.getText().isEmpty()&&comb_number_of_month_ac.getSelectedItem()!="None")
     {
          try{
          String first_name=txt_first_name_ac.getText();
          String second_name=txt_second_name_ac.getText();
          String phone=txt_phone_ac.getText();
          String E_mail=txt_emil_ac.getText();
          String password=txt_pass_ac.getText();
          String gender;
          if(rpt_male_ac.isSelected())
              gender="male";
          else
              gender="female";
          int coach_id=(comb_coach_name_ac.getSelectedIndex());
          int age=Integer.parseInt(txt_age_ac.getText());
          int number_of_month=Integer.parseInt(comb_number_of_month_ac.getSelectedItem().toString());
          LocalDate s_date=LocalDate.now();
          DateTimeFormatter form_of_date=DateTimeFormatter.ofPattern("yyyy-MM-dd");
          String start_date=s_date.format(form_of_date);
          LocalDate e_date=s_date.plusDays(number_of_month*30);
          String expired_date=e_date.format(form_of_date);
        // int coach_id=DataOfCoach.get_id_by_name(comb_coach_name.getSelectedItem().toString());
          //int customer_id=DataOfCustomer.add_customer();
          double price =number_of_month*price_of_month;
          if(number_of_month==3){
              price*=0.95;
          }
           if(number_of_month==6){
              price*=0.9;
          }
         if(number_of_month==12){
              price*=0.85;
          }
          
          PreparedStatement stmt = con.prepareStatement("insert into Customer(f_name,s_name,customer_password,gender,phone,email,coach_id,age)values(?,?,?,?,?,?,?,?)");
              stmt.setString(1,first_name );
              stmt.setString(2,second_name );
              stmt.setString(3,password );
              stmt.setString(4,gender );
              stmt.setString(5,phone );
               stmt.setString(6,E_mail );
              stmt.setInt(7,arr_coach.get(coach_id-1) ); 
              stmt.setInt(8,age );
            //  show.setText(Integer.toString(arr_coach.get(coach_id)));
              stmt.executeUpdate();    
            PreparedStatement stm = con.prepareStatement("insert into subscribtion(start_date,expired_date,price,monthly_plan,coach_id,customer_id,sub_id)values(?,?,?,?,?,?,?)"); 
            stm.setString(1, start_date);
            stm.setString(2, expired_date);
            stm.setDouble(3, price);
            stm.setInt(4,number_of_month );
             stm.setInt(5,arr_coach.get(coach_id-1));
             stm.setInt(6,Customer_id);
              stm.setInt(7,Customer_id);
             
             stm.executeUpdate();   
             Customer_id++;
             show_id.setText(Integer.toString(Customer_id));
             txt_first_name_ac.setText("");
             txt_second_name_ac.setText("");
             txt_phone_ac.setText("");
             txt_emil_ac.setText("");
             txt_pass_ac.setText("");
             txt_age_ac.setText("");
             comb_coach_name_ac.setSelectedIndex(0);
             comb_number_of_month_ac.setSelectedIndex(0);
             JOptionPane.showMessageDialog(this, "added successful");
          }catch(SQLException ex){
              JOptionPane.showMessageDialog(this, "serv*er is closed");
          }
          
      }
    }//GEN-LAST:event_Add_btn_acMouseClicked

    private void Reset_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reset_btnMouseClicked
      txt_first_name_ac.setText("");
          txt_second_name_ac.setText("");
          txt_phone_ac.setText("");
          txt_emil_ac.setText("");
          txt_pass_ac.setText("");
          comb_coach_name_ac.setSelectedIndex(0);
          comb_number_of_month_ac.setSelectedIndex(0);
          txt_age_ac.setText("");
          if(!rpt_male_ac.isSelected())
              rpt_male_ac.setSelected(true);
    }//GEN-LAST:event_Reset_btnMouseClicked

    private void txt_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_yearActionPerformed

    private void update_price_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_price_btn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_price_btn1MouseClicked

    private void update_price1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_price1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_update_price1MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        setVisible(false);
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
         setVisible(false);
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        setVisible(false);
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        setVisible(false);
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        setVisible(false);
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
         setVisible(false);
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
          setVisible(false);
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        setVisible(false);
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel62MouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
         System.exit(0);
    }//GEN-LAST:event_close1MouseClicked

    private void close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close2MouseClicked

    private void close3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close3MouseClicked

    private void close4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close4MouseClicked

    private void close5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close5MouseClicked
         System.exit(0);
    }//GEN-LAST:event_close5MouseClicked

    private void close6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close6MouseClicked
         System.exit(0);
    }//GEN-LAST:event_close6MouseClicked

    private void close7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close7MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewHome().setVisible(true);
            }
        });
    }
    private void turnoff(){
            List_of_member.setVisible(false);
            Add_Member.setVisible(false);
            Add_coach.setVisible(false);  
            Subscribtion.setVisible(false);
            Equipment.setVisible(false);
            Edit_delete_member.setVisible(false);
            Edit_delete_coach.setVisible(false);
            Income.setVisible(false);
    }
    private void filltable(){
    // dtm.setCount(0);
       try{
           PreparedStatement stmt = con.prepareStatement("select customer.customer_id,f_name,s_name,gender,phone,email,age,start_date,expired_date,price,monthly_plan ,Customer.coach_id from customer,subscribtion where customer.customer_id=subscribtion.customer_id");
           ResultSet rs = stmt.executeQuery();
           while(rs.next()){
               String FullName_of_customer=rs.getString(2)+" "+rs.getString(3);
              dtm.addRow(new Object[]{rs.getInt(1),FullName_of_customer,rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9),rs.getDouble(10),rs.getInt(11),name_and_id.get(rs.getInt(12))});
                 
           }
            
        tbl_show.setModel(dtm);
        // tbl_show.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS); 
       }
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server -*IS Closed");       
        }
       }
   
//   private void getname(){
//    try{
//      PreparedStatement stmt = con.prepareStatement("select f_name,s_name,coach_id from Coach");
//      ResultSet rs=stmt.executeQuery();
//      while(rs.next()){
//          String fullName=rs.getString(1)+rs.getString(2);
//         name_and_id.put(rs.getInt(3),fullName);
//      }
//      }catch(SQLException ex){
//          JOptionPane.showMessageDialog(this, "please add coach");
//      }
//   }
    private void fill_combobox_coach(){
     try{
      PreparedStatement stmt = con.prepareStatement("select f_name,s_name,coach_id from Coach");
      ResultSet rs=stmt.executeQuery();
      while(rs.next()){
           arr_coach.add(rs.getInt(3));
          String fullName=rs.getString(1)+" "+rs.getString(2);
          comb_coach_name_ac.addItem(fullName);
          combobox_coach_edm.addItem(fullName);
         name_and_id.put(rs.getInt(3),fullName);
      }
          
      }catch(SQLException ex){
          JOptionPane.showMessageDialog(this, "please add coach");
      }
     
 }
    private void get_id_customer(){
        try{
          Customer_id=1;
         show_id.setText(Integer.toString(Customer_id));
         PreparedStatement stmt = con.prepareStatement("select customer_id from customer");
         ResultSet rs=stmt.executeQuery();
         while(rs.next()){
            Customer_id=rs.getInt(1)+1;
            
         show_id.setText(Integer.toString(Customer_id));
         }
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server IS Closed");       
        }
    
    }
    private void get_id_coach(){
     try{
         Coach_id=1;
         show_id_aco.setText(Integer.toString(Coach_id));
         PreparedStatement stmt = con.prepareStatement("select coach_id from Coach");
         ResultSet rs=stmt.executeQuery();
         while(rs.next()){
             Coach_id++;
             show_id_aco.setText(Integer.toString(Coach_id));
         }
    }
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server IS Closed");       
        }
}
     private void filltable_equipment(){
       try{
           PreparedStatement stmt = con.prepareStatement("select equipment_code,quantity,name_of_equipment from equipment");
           ResultSet rs = stmt.executeQuery();
           while(rs.next()){
               code = rs.getInt(1);
              dtmeq.addRow(new Object[]{rs.getInt(1),rs.getInt(2),rs.getString(3)});
                 
           }
            
        tbl_machine.setModel(dtmeq);
       }
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Server IS Closed");       
        }
       }
     private void playSound() {
    try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\1214.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_Member;
    private javax.swing.JLabel Add_btn_ac;
    private javax.swing.JLabel Add_btn_aco;
    private javax.swing.JLabel Add_btn_aco4;
    private javax.swing.JPanel Add_coach;
    private javax.swing.JPanel Add_equipment;
    private javax.swing.JPanel Add_member;
    private javax.swing.JLabel Addeq;
    private javax.swing.JPanel Edit_delete_coach;
    private javax.swing.JPanel Edit_delete_member;
    private javax.swing.JPanel Equipment;
    private javax.swing.JPanel Income;
    private javax.swing.JPanel List_of_member;
    private javax.swing.JLabel Reset_btn;
    private javax.swing.JLabel Reset_btn_aco;
    private javax.swing.JPanel Reset_coach;
    private javax.swing.JPanel Reset_member;
    private javax.swing.JPanel Subscribtion;
    private javax.swing.JPanel add_coach;
    private javax.swing.JPanel add_coach_btn5;
    private javax.swing.JPanel button1;
    private javax.swing.JPanel button2;
    private javax.swing.JPanel button3;
    private javax.swing.JPanel button4;
    private javax.swing.JPanel button5;
    private javax.swing.JPanel button6;
    private javax.swing.JPanel button7;
    private javax.swing.JPanel button8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JLabel close3;
    private javax.swing.JLabel close4;
    private javax.swing.JLabel close5;
    private javax.swing.JLabel close6;
    private javax.swing.JLabel close7;
    private javax.swing.JComboBox<String> comb_coach_name_ac;
    private javax.swing.JComboBox<String> comb_number_of_month_ac;
    private javax.swing.JComboBox<String> combobox_coach_edm;
    private javax.swing.JLabel delete_coach_edc;
    private javax.swing.JPanel delete_equipment;
    private javax.swing.JPanel delete_in_edit_coach;
    private javax.swing.JPanel delete_in_edit_member;
    private javax.swing.JLabel delete_member;
    private javax.swing.JLabel deleteeq;
    private javax.swing.JTextField enter_id;
    private javax.swing.JTextField enter_id_edm;
    private javax.swing.JLabel income;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbt_female_ac;
    private javax.swing.JRadioButton rbt_female_aco;
    private javax.swing.JRadioButton rbt_female_edc;
    private javax.swing.JRadioButton rbt_female_edm;
    private javax.swing.JRadioButton rpt_male_ac;
    private javax.swing.JRadioButton rpt_male_aco;
    private javax.swing.JRadioButton rpt_male_edc;
    private javax.swing.JRadioButton rpt_male_edm;
    private javax.swing.JLabel search_coach_id;
    private javax.swing.JLabel search_customer_id;
    private javax.swing.JLabel show_id;
    private javax.swing.JLabel show_id_aco;
    private javax.swing.JLabel show_price;
    private javax.swing.JTable tbl_machine;
    private javax.swing.JTable tbl_show;
    private javax.swing.JTextField txt_age_ac;
    private javax.swing.JTextField txt_age_edm;
    private javax.swing.JTextField txt_emil_ac;
    private javax.swing.JTextField txt_emil_aco;
    private javax.swing.JTextField txt_emil_edc;
    private javax.swing.JTextField txt_emil_edm;
    private javax.swing.JTextField txt_first_name_ac;
    private javax.swing.JTextField txt_first_name_aco;
    private javax.swing.JTextField txt_first_name_edc;
    private javax.swing.JTextField txt_first_name_edm;
    private javax.swing.JTextField txt_machine_name;
    private javax.swing.JTextField txt_month;
    private javax.swing.JPasswordField txt_pass_ac;
    private javax.swing.JTextField txt_pass_edc;
    private javax.swing.JTextField txt_pass_edm;
    private javax.swing.JPasswordField txt_password_aco;
    private javax.swing.JTextField txt_phone_ac;
    private javax.swing.JTextField txt_phone_aco;
    private javax.swing.JTextField txt_phone_edc;
    private javax.swing.JTextField txt_phone_edm;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_quantiy;
    private javax.swing.JTextField txt_second_name_ac;
    private javax.swing.JTextField txt_second_name_aco;
    private javax.swing.JTextField txt_second_name_edc;
    private javax.swing.JTextField txt_second_name_edm;
    private javax.swing.JTextField txt_working_hours_edc;
    private javax.swing.JTextField txt_year;
    private javax.swing.JPanel update_coach;
    private javax.swing.JLabel update_coach_edc;
    private javax.swing.JPanel update_equipment;
    private javax.swing.JPanel update_in_edit_member;
    private javax.swing.JLabel update_member;
    private javax.swing.JPanel update_price;
    private javax.swing.JPanel update_price1;
    private javax.swing.JLabel update_price_btn;
    private javax.swing.JLabel update_price_btn1;
    private javax.swing.JLabel updateeq;
    private javax.swing.JTextField working_hours_aco;
    // End of variables declaration//GEN-END:variables
}
