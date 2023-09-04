package blood.bank.management;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class Donor extends javax.swing.JFrame {

    
    public Donor() {
        initComponents();
        showTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfAddress = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfBloodGroup = new javax.swing.JTextField();
        tfNid = new javax.swing.JTextField();
        tfWeight = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        tfBloodQuantity = new javax.swing.JTextField();
        tfGender = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        tfCholesterol = new javax.swing.JTextField();
        tfBloodPressure = new javax.swing.JTextField();
        tfPulserate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        tfDonationDate = new com.toedter.calendar.JDateChooser();
        tfBirthdate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDonor = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1700, 746));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Donor");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/bank/management/icons/icons8_back_32px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(670, 670, 670))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1700, 351));

        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        tfBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBloodGroupActionPerformed(evt);
            }
        });

        tfNid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNidActionPerformed(evt);
            }
        });

        tfWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWeightActionPerformed(evt);
            }
        });

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        tfBloodQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBloodQuantityActionPerformed(evt);
            }
        });

        tfGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGenderActionPerformed(evt);
            }
        });

        tfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setText("Age:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Phone No:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setText("NID No:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setText("Birthdate:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel8.setText("Gender:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setText("Address:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setText("Weight:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        jLabel11.setText("Last Donation Date:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        jLabel12.setText("Blood Pressure:");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        jLabel13.setText("Blood Group:");

        tfStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStatusActionPerformed(evt);
            }
        });

        tfCholesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCholesterolActionPerformed(evt);
            }
        });

        tfBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBloodPressureActionPerformed(evt);
            }
        });

        tfPulserate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPulserateActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        jLabel14.setText("Blood Quantity:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel15.setText("Status:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel16.setText("Pulse Rate:");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel17.setText("Cholesterol:");

        btnUpdate.setBackground(new java.awt.Color(102, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 0, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(102, 0, 0));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 0, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tfDonationDate.setDateFormatString("dd-MM-yyyy");

        tfBirthdate.setDateFormatString("dd-MM- yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tfBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNid, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPulserate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfGender, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfAge)
                            .addComponent(tfWeight)
                            .addComponent(tfCholesterol)))
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(29, 29, 29)
                                    .addComponent(tfBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfBloodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDonationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfDonationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBloodQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPulserate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCholesterol, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        tableDonor.setBackground(new java.awt.Color(255, 153, 153));
        tableDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Email", "Phone No", "Status", "Address", "NID NO", "Birthdate", "Pulse Rate", "Age", "Weight", "Gender", "Cholesterol", "Last Donation Date", "Blood Group", "Total Donated", "Blood Pressure"
            }
        ));
        tableDonor.setGridColor(new java.awt.Color(255, 255, 255));
        tableDonor.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tableDonor.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tableDonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDonorMouseClicked(evt);
            }
        });
        tableDonor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableDonorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableDonor);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel18.setText("Search from table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel18)
                .addGap(44, 44, 44)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBloodGroupActionPerformed

    private void tfNidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNidActionPerformed

    private void tfWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWeightActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeActionPerformed

    private void tfBloodQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBloodQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBloodQuantityActionPerformed

    private void tfGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGenderActionPerformed

    private void tfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneActionPerformed

    private void tfStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStatusActionPerformed

    private void tfCholesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCholesterolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCholesterolActionPerformed

    private void tfBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBloodPressureActionPerformed

    private void tfPulserateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPulserateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPulserateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       String pattern = "^[a-zA-Z]{0,15}$";
       String pattern1 = "^[A-Z]{0,2}[+-]$";
        Pattern pattText = Pattern.compile(pattern);
        Matcher matchName = pattText.matcher(tfName.getText());
         Matcher mStatus = pattText.matcher(tfStatus.getText());
        String pattern2 = "^[a-zA-Z0-9]{0,20}[@][a-zA-Z]{0,10}[.][a-zA-Z]{0,10}$";
        Pattern pattEmail = Pattern.compile(pattern2);
        Matcher match2 = pattEmail.matcher(tfEmail.getText());
         String pattern3 = "^[0-9]{0,20}$";
         String pattern4 = "^[0-9]{0,2}[/]{0}[0-9]{0,2}$";
         String pattern5 = "^[0][1][0-9]{0,10}$";
         String pattern6 = "^[0-9]{0,2}[/][0-9]{0,3}$";
         String pattern7 = "^[0-9]{1,4}(\\\\.[0-9]{0,2})?$";
         Pattern patInt = Pattern.compile(pattern3);
         Pattern patPhone = Pattern.compile(pattern5);
         Pattern patBP = Pattern.compile(pattern6);
         Pattern pattR = Pattern.compile(pattern7);
        Matcher Phone = patPhone.matcher(tfPhone.getText());
        Matcher NID = patInt.matcher(tfNid.getText());
        Matcher PulseRate = patInt.matcher(tfPulserate.getText());
        Matcher Age = patInt.matcher(tfAge.getText());
        Matcher Weight = patInt.matcher(tfWeight.getText());
        Matcher Cholesterol = patInt.matcher(tfCholesterol.getText());
         Matcher Quantity = patInt.matcher(tfBloodQuantity.getText());
        Matcher BloodPressure = patBP.matcher(tfBloodPressure.getText());
          Pattern patBlood = Pattern.compile(pattern1);
        Matcher BloodGROUP = patBlood.matcher(tfBloodGroup.getText());
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String status = tfStatus.getText();
        String address = tfAddress.getText();
        String nid = tfNid.getText();
        String pulseRate = tfPulserate.getText();
        String age = tfAge.getText();
        String weight = tfWeight.getText();
        String gender = tfGender.getText();
        String cholesterol = tfCholesterol.getText();
        String bloodGroup = tfBloodGroup.getText();
        String quantity = tfBloodQuantity.getText();
        String bloodPressure = tfBloodPressure.getText();
        
        
                //String.valueOf(tfregpass.getPassword());
        if(name.isEmpty() || email.isEmpty()||phone.isEmpty()||status.isEmpty() || address.isEmpty() || nid.isEmpty()||
                pulseRate.isEmpty() ||age.isEmpty() || weight.isEmpty()||gender.isEmpty()||cholesterol.isEmpty() ||  
                bloodGroup.isEmpty()||quantity.isEmpty()||bloodPressure.isEmpty()){
            JOptionPane.showMessageDialog(this, "One or more required field is empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else if(!matchName.matches())
        {
            
            JOptionPane.showMessageDialog(this, "Name format is incorrect!", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!match2.matches())
        {
            JOptionPane.showMessageDialog(this, "Email format is incorrect!", "Error",JOptionPane.ERROR_MESSAGE);
        }
                else if (phone.length() !=11 || !Phone.matches() ) {
            JOptionPane.showMessageDialog(this, "Please enter a correct phone number", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (nid.length() < 10 || nid.length() > 17 || !NID.matches() ) {
            JOptionPane.showMessageDialog(this, "Please enter a valid NID number", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!PulseRate.matches()|| pulseRate.length()> 3)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid PulseRate", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Age.matches() || age.length()> 3)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid Age", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Weight.matches() || weight.length()> 3)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid Weight", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Cholesterol.matches())
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid Cholesterol", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Quantity.matches())
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid Quantity", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!BloodPressure.matches())
        {
            JOptionPane.showMessageDialog(this, "Blood pressure format wrong", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            java.util.Date birthDate = tfBirthdate.getDate();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String birthdate = Date_Format.format(birthDate);
        java.util.Date DonatedDate = tfDonationDate.getDate();
        String lastDonatedDate = Date_Format.format(DonatedDate);
            UpdateDonor(name,email,phone,status,address,nid,birthdate,pulseRate,age,weight,gender,cholesterol,lastDonatedDate,bloodGroup,quantity,
                    bloodPressure);
            
        }
        showTableData();
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String status = tfStatus.getText();
        String address = tfAddress.getText();
        String nid = tfNid.getText();
        java.util.Date birthDate = tfBirthdate.getDate();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String birthdate = Date_Format.format(birthDate);
        
        String pulseRate = tfPulserate.getText();
        String age = tfAge.getText();
        String weight = tfWeight.getText();
        String gender = tfGender.getText();
        String cholesterol = tfCholesterol.getText();
        java.util.Date DonatedDate = tfDonationDate.getDate();
        String lastDonatedDate = Date_Format.format(DonatedDate);
        
        String bloodGroup = tfBloodGroup.getText();
        String quantity = tfBloodQuantity.getText();
        String bloodPressure = tfBloodPressure.getText();
                //String.valueOf(tfregpass.getPassword());
        if(name.isEmpty() || email.isEmpty()||phone.isEmpty()||status.isEmpty() || address.isEmpty() || nid.isEmpty()||
                pulseRate.isEmpty() ||age.isEmpty() || weight.isEmpty()||gender.isEmpty()||cholesterol.isEmpty() || lastDonatedDate.isEmpty() || 
                bloodGroup.isEmpty()||quantity.isEmpty()||bloodPressure.isEmpty()){
            JOptionPane.showMessageDialog(this, "One or more required field is empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            DeleteDonor(name,email,phone,status,address,nid,birthdate,pulseRate,age,weight,gender,cholesterol,lastDonatedDate,bloodGroup,quantity,
                    bloodPressure);
        }
        showTableData();
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        tfName.setText(null);
        tfEmail.setText(null);
        tfPhone.setText(null);
        tfStatus.setText(null);
        tfAddress.setText(null);
        tfNid.setText(null);
        tfBirthdate.setDate(null);
        tfPulserate.setText(null);
        tfAge.setText(null);
        tfWeight.setText(null);
        tfGender.setText(null);
        tfCholesterol.setText(null);
        tfDonationDate.setDate(null);
        tfBloodGroup.setText(null);
        tfBloodQuantity.setText(null);
        tfBloodPressure.setText(null);
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String pattern = "^[a-zA-Z]{0,15}$";
        String pattern1 = "^[A-Z]{0,2}[+-]$";
        Pattern pattText = Pattern.compile(pattern);
        Matcher matchName = pattText.matcher(tfName.getText());
         Matcher mStatus = pattText.matcher(tfStatus.getText());
        String pattern2 = "^[a-zA-Z0-9]{0,20}[@][a-zA-Z]{0,10}[.][a-zA-Z]{0,10}$";
        Pattern pattEmail = Pattern.compile(pattern2);
        Matcher match2 = pattEmail.matcher(tfEmail.getText());
         String pattern3 = "^[0-9]{0,20}$";
         String pattern4 = "^[0-9]{0,2}[/]{0}[0-9]{0,2}$";
         String pattern5 = "^[0][1][0-9]{0,10}$";
         String pattern6 = "^[0-9]{0,2}[/][0-9]{0,3}$";
          String pattern7 = "^[0-9]{0,10}$";
        Pattern patInt = Pattern.compile(pattern3);
         Pattern patPhone = Pattern.compile(pattern5);
         Pattern patBP = Pattern.compile(pattern6);
        Pattern patBlood = Pattern.compile(pattern1);
        Pattern patNID = Pattern.compile(pattern7);
         
        Matcher Phone = patPhone.matcher(tfPhone.getText());
        Matcher NID = patNID.matcher(tfNid.getText());
        Matcher PulseRate = patInt.matcher(tfPulserate.getText());
        Matcher Age = patInt.matcher(tfAge.getText());
        Matcher Weight = patInt.matcher(tfWeight.getText());
        Matcher Cholesterol = patInt.matcher(tfCholesterol.getText());
         Matcher Quantity = patInt.matcher(tfBloodQuantity.getText());
      Matcher BloodPressure = patBP.matcher(tfBloodPressure.getText());
      Matcher BloodGROUP = patBlood.matcher(tfBloodGroup.getText());
      
      
      
        
       
        String name = tfName.getText();
        String email = tfEmail.getText();
        String phone = tfPhone.getText();
        String status = tfStatus.getText();
        String address = tfAddress.getText();
        String nid = tfNid.getText();
        
        
        String pulseRate = tfPulserate.getText();
        String age = tfAge.getText();
        String weight = tfWeight.getText();
        String gender = tfGender.getText();
        String cholesterol = tfCholesterol.getText();
        
        
        String bloodGroup = tfBloodGroup.getText();
        String quantity = tfBloodQuantity.getText();
        String bloodPressure = tfBloodPressure.getText();
                //String.valueOf(tfregpass.getPassword());
        if(tfName.getText().isEmpty() || email.isEmpty()||phone.isEmpty()||status.isEmpty() || address.isEmpty() || nid.isEmpty()||
                pulseRate.isEmpty() ||age.isEmpty() || weight.isEmpty()||gender.isEmpty()||cholesterol.isEmpty() || 
                bloodGroup.isEmpty()||quantity.isEmpty()||bloodPressure.isEmpty()){
            JOptionPane.showMessageDialog(this, "One or more field is empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!matchName.matches())
        {
            
            JOptionPane.showMessageDialog(this, "Name format is incorrect!", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!match2.matches())
        {
            JOptionPane.showMessageDialog(this, "Email format is incorrect!", "Error",JOptionPane.ERROR_MESSAGE);
        }
                else if (phone.length() !=11 || !Phone.matches() ) {
            JOptionPane.showMessageDialog(this, "Please enter a correct phone number", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (nid.length() < 10 || nid.length() > 17 || !NID.matches() ) {
            JOptionPane.showMessageDialog(this, "Please enter a valid NID number", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!PulseRate.matches()|| pulseRate.length()> 3)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid PulseRate", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Age.matches() || age.length()> 3)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid Age", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Weight.matches() || weight.length()> 3)
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid Weight", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Cholesterol.matches())
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid Cholesterol", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!Quantity.matches())
        {
            JOptionPane.showMessageDialog(this, "Please enter a valid Quantity", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!BloodPressure.matches())
        {
            JOptionPane.showMessageDialog(this, "Blood pressure format wrong", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!BloodGROUP.matches())
        {
            JOptionPane.showMessageDialog(this, "Blood type format wrong", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
             java.util.Date birthDate = tfBirthdate.getDate();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String birthdate = Date_Format.format(birthDate);
        
        java.util.Date DonatedDate = tfDonationDate.getDate();
        String lastDonatedDate = Date_Format.format(DonatedDate);
            AddDonor(name,email,phone,status,address,nid,birthdate,pulseRate,age,weight,gender,cholesterol,lastDonatedDate,bloodGroup,quantity,
                    bloodPressure);
            showTableData();
           
             
        }
        
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void tableDonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDonorMouseClicked
       int row = tableDonor.getSelectedRow();
       String selection = tableDonor.getModel().getValueAt(row, 0).toString();
       DefaultTableModel model = (DefaultTableModel)tableDonor.getModel();
       Connection dbconn = DBConnection.connectDB();
      try{
           PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("Select * from Donor where donor_id= "+selection);
           ResultSet res = st.executeQuery();
          
           if(res.next()){
        tfName.setText(res.getString("donor_name"));//res.getString("donor_name"));
        tfEmail.setText(res.getString("donor_email"));
        tfPhone.setText(res.getString("donor_phone"));
        tfStatus.setText(res.getString("donor_status"));
        tfAddress.setText(res.getString("donor_address"));
        tfNid.setText(res.getString("donor_NID"));
        tfBirthdate.setDate(res.getDate("donor_birthdate"));
        tfPulserate.setText(res.getString("donor_pulseRate"));
        tfAge.setText(res.getString("donor_age"));
        tfWeight.setText(res.getString("donor_weight"));
        tfGender.setText(res.getString("donor_gender"));
        tfCholesterol.setText(res.getString("donor_cholesterol"));
        tfDonationDate.setDate(res.getDate("donationDate"));
        tfBloodGroup.setText(res.getString("donor_bloodGroup"));
        tfBloodQuantity.setText(res.getString("donor_bloodQuantity"));
        tfBloodPressure.setText(res.getString("donor_pressure"));
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
        
    }//GEN-LAST:event_tableDonorMouseClicked

    private void tableDonorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDonorKeyReleased
        Connection dbconn = DBConnection.connectDB();
        int row = tableDonor.getSelectedRow();
       String selection = tableDonor.getModel().getValueAt(row, 0).toString();
       
       try{
           PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM donor WHERE donor_id= "+selection);
           ResultSet res = st.executeQuery();
          
           if(res.next()){
        tfName.setText(res.getString("donor_name"));
        tfEmail.setText(res.getString("donor_email"));
        tfPhone.setText(res.getString("donor_phone"));
        tfStatus.setText(res.getString("donor_status"));
        tfAddress.setText(res.getString("donor_address"));
        tfNid.setText(res.getString("donor_NID"));
        tfBirthdate.setDate(res.getDate("donor_birthdate"));
        tfPulserate.setText(res.getString("donor_pulseRate"));
        tfAge.setText(res.getString("donor_age"));
        tfWeight.setText(res.getString("donor_weight"));
        tfGender.setText(res.getString("donor_gender"));
        tfCholesterol.setText(res.getString("donor_cholesterol"));
        tfDonationDate.setDate(res.getDate("donationDate"));
        tfBloodGroup.setText(res.getString("donor_bloodGroup"));
        tfBloodQuantity.setText(res.getString("donor_bloodQuantity"));
        tfBloodPressure.setText(res.getString("donor_pressure"));
           }
           else System.out.println("sad");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_tableDonorKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        Dashboard donor =new Dashboard();
        donor.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String searchString = jTextField1.getText();
        search(searchString);
    }//GEN-LAST:event_jTextField1KeyReleased
    public void search(String str){
        DefaultTableModel model = (DefaultTableModel) tableDonor.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableDonor.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
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
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableDonor;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAge;
    private com.toedter.calendar.JDateChooser tfBirthdate;
    private javax.swing.JTextField tfBloodGroup;
    private javax.swing.JTextField tfBloodPressure;
    private javax.swing.JTextField tfBloodQuantity;
    private javax.swing.JTextField tfCholesterol;
    private com.toedter.calendar.JDateChooser tfDonationDate;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfGender;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNid;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfPulserate;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables

    private void AddDonor(String name,String email,String phone,String status,String address,String nid,String birthdate,String pulseRate,
            String age,String weight,String gender,String cholesterol,String lastDonatedDate,String bloodGroup,String quantity, String bloodPressure) {
        Connection dbconn = DBConnection.connectDB();
        
        if(dbconn!=null){
            try{
                 Statement st0 = dbconn.createStatement();
                         String sql ="select *from donor where donor_email='"+email+"' or donor_NID ='"+nid+"' or donor_phone ='"+phone+"'";
                ResultSet rs = st0.executeQuery(sql);
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(this, "Donor already exsist", "Error", JOptionPane.ERROR_MESSAGE);
                
                }
                else{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("INSERT INTO donor( donor_NID, donor_name, "
                    + "donor_email, donor_birthdate, donor_age, donor_gender, donor_address, donor_phone, donor_weight, donor_bloodGroup, "
                    + "donor_bloodQuantity, donor_status, donationDate, donor_cholesterol, donor_pressure, donor_pulseRate) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, nid);
            st.setString(2, name);
            st.setString(3, email);
            st.setString(4, birthdate);
            st.setString(5, age);
            st.setString(6, gender);
            st.setString(7, address);
            st.setString(8, phone);
            st.setString(9, weight);
            st.setString(10, bloodGroup);
            st.setString(11, quantity);
            st.setString(12, status);
            st.setString(13, lastDonatedDate);
            st.setString(14, cholesterol);
            st.setString(15, bloodPressure);
            st.setString(16, pulseRate);
            
            int res = st.executeUpdate();
            
            
            JOptionPane.showMessageDialog(this, "Inserted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                 tfName.setText(null);
        tfEmail.setText(null);
        tfPhone.setText(null);
        tfStatus.setText(null);
        tfAddress.setText(null);
        tfNid.setText(null);
        tfBirthdate.setDate(null);
        tfPulserate.setText(null);
        tfAge.setText(null);
        tfWeight.setText(null);
        tfGender.setText(null);
        tfCholesterol.setText(null);
        tfDonationDate.setDate(null);
        tfBloodGroup.setText(null);
        tfBloodQuantity.setText(null);
        tfBloodPressure.setText(null);
                }
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
}
    
    private void UpdateDonor(String name,String email,String phone,String status,String address,String nid,String birthdate,String pulseRate,
            String age,String weight,String gender,String cholesterol,String lastDonatedDate,String bloodGroup,String quantity, String bloodPressure) {
        Connection dbconn = DBConnection.connectDB();
        
        if(dbconn!=null){
            try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("UPDATE donor SET donor_name=?,"
                    + " donor_email=?, donor_birthdate=?, donor_age=?, donor_gender=?, donor_address=?, donor_phone=?, donor_weight=?, donor_bloodGroup=?, "
                    + "donor_bloodQuantity=?, donor_status=?, donationDate=?, donor_cholesterol=?, donor_pressure=?, donor_pulseRate=? "
                    + "WHERE  donor_NID=?");
           
            st.setString(1, name);
            st.setString(2, email);
            st.setString(3, birthdate);
            st.setString(4, age);
            st.setString(5, gender);
            st.setString(6, address);
            st.setString(7, phone);
            st.setString(8, weight);
            st.setString(9, bloodGroup);
            st.setString(10, quantity);
            st.setString(11, status);
            st.setString(12, lastDonatedDate);
            st.setString(13, cholesterol);
            st.setString(14, bloodPressure);
            st.setString(15, pulseRate);
            st.setString(16, nid);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
           tfName.setText(null);
        tfEmail.setText(null);
        tfPhone.setText(null);
        tfStatus.setText(null);
        tfAddress.setText(null);
        tfNid.setText(null);
        tfBirthdate.setDate(null);
        tfPulserate.setText(null);
        tfAge.setText(null);
        tfWeight.setText(null);
        tfGender.setText(null);
        tfCholesterol.setText(null);
        tfDonationDate.setDate(null);
        tfBloodGroup.setText(null);
        tfBloodQuantity.setText(null);
        tfBloodPressure.setText(null);
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
}
     private void DeleteDonor(String name, String email, String phone, String status, String address, String nid, String birthdate, String pulseRate, String age, String weight, String gender, String cholesterol, String lastDonatedDate, String bloodGroup, String quantity, String bloodPressure) {
       Connection dbconn = DBConnection.connectDB();
        
        if(dbconn!=null){
            try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("DELETE FROM donor WHERE  donor_NID=?");
           
      
            st.setString(1, nid);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
           tfName.setText(null);
        tfEmail.setText(null);
        tfPhone.setText(null);
        tfStatus.setText(null);
        tfAddress.setText(null);
        tfNid.setText(null);
        tfBirthdate.setDate(null);
        tfPulserate.setText(null);
        tfAge.setText(null);
        tfWeight.setText(null);
        tfGender.setText(null);
        tfCholesterol.setText(null);
        tfDonationDate.setDate(null);
        tfBloodGroup.setText(null);
        tfBloodQuantity.setText(null);
        tfBloodPressure.setText(null);
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    }
     public void showTableData(){
    Connection dbconn = DBConnection.connectDB();
     try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM donor ");
            ResultSet res = st.executeQuery();
            tableDonor.setModel(DbUtils.resultSetToTableModel(res));
            
           
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
            
        }
}
     

   
}
