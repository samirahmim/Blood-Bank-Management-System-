
package blood.bank.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


public class Patient extends javax.swing.JFrame {

   
    public Patient() {
        initComponents();
        showTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePatient = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfName = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        hospital = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        hospital1 = new javax.swing.JLabel();
        tfBloodGroup = new javax.swing.JTextField();
        hospital2 = new javax.swing.JLabel();
        tfGender = new javax.swing.JTextField();
        tfDate = new com.toedter.calendar.JDateChooser();
        hospital3 = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        hospital4 = new javax.swing.JLabel();
        hospital5 = new javax.swing.JLabel();
        hospital6 = new javax.swing.JLabel();
        hospital7 = new javax.swing.JLabel();
        tfHospital = new javax.swing.JTextField();
        tfCause = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfAcceptorId = new javax.swing.JTextField();
        hospital8 = new javax.swing.JLabel();
        tfUnit = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1400, 810));
        setResizable(false);

        tablePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Phone", "Bloodgroup", "Gender", "Address", "Hospital Name", "Receiving Cause", "Unit Received", "Receiviing Date", "Acceptor Id"
            }
        ));
        tablePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePatientMouseClicked(evt);
            }
        });
        tablePatient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablePatientKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablePatient);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patient ");

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(639, 639, 639)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(563, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1700, 351));

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        hospital.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital.setText("Name");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setText("Blood Group");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setText("Age");

        btnUpdate1.setBackground(new java.awt.Color(102, 0, 0));
        btnUpdate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("UPDATE");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(102, 0, 0));
        btnDelete1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("DELETE");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnRefresh1.setBackground(new java.awt.Color(102, 0, 0));
        btnRefresh1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setText("REFRESH");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        btnAdd1.setBackground(new java.awt.Color(102, 0, 0));
        btnAdd1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd1.setText("ADD");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        hospital1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital1.setText("Gender");

        tfBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBloodGroupActionPerformed(evt);
            }
        });

        hospital2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital2.setText("Unit Received");

        tfGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGenderActionPerformed(evt);
            }
        });

        tfDate.setDateFormatString("dd-MM- yyyy");

        hospital3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital3.setText("Address");

        tfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddressActionPerformed(evt);
            }
        });

        hospital4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital4.setText("Phone");

        hospital5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital5.setText("Receiving Date");

        hospital6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital6.setText("Recieving Cause");

        hospital7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital7.setText("Hospital Name");

        tfHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHospitalActionPerformed(evt);
            }
        });

        tfCause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCauseActionPerformed(evt);
            }
        });

        tfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneActionPerformed(evt);
            }
        });

        tfAcceptorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAcceptorIdActionPerformed(evt);
            }
        });

        hospital8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital8.setText("Acceptor Id");

        tfUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUnitActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel21.setText("Search from table");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(hospital4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospital1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospital3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(81, 81, 81))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(76, 76, 76)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(hospital6, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                                .addComponent(hospital2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hospital5, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(hospital7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(hospital8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(tfGender, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfDate, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                        .addComponent(tfHospital)
                                        .addComponent(tfCause))
                                    .addComponent(tfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAcceptorId, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hospital4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfBloodGroup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hospital1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAcceptorId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospital7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHospital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospital6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCause, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospital2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(hospital5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hospital8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hospital3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1528, 1528, 1528)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 138, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(291, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        
    }//GEN-LAST:event_tfAgeActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        String name = tfName.getText();
        String gender = tfGender.getText();
        String address = tfAddress.getText();
        String phone = tfPhone.getText();
        String age = tfAge.getText();
        String bloodgroup = tfBloodGroup.getText();
        String hospital = tfHospital.getText();
        String unit = tfUnit.getText();
        String cause = tfCause.getText();
        java.util.Date date = tfDate.getDate();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String receivingDate = Date_Format.format(date);
        String accId = tfAcceptorId.getText();

        if(name.isEmpty() || gender.isEmpty()||address.isEmpty()||phone.isEmpty() || age.isEmpty()||bloodgroup.isEmpty() || 
                hospital.isEmpty()||unit.isEmpty()||cause.isEmpty() || receivingDate.isEmpty()|| accId.isEmpty() ){
            JOptionPane.showMessageDialog(this, "One or more required field is empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            UpdatePatient(name,gender,address,phone,age,bloodgroup,hospital,unit,cause,receivingDate,accId);
        }
        showTableData();
        tfName.setText(null);
        tfGender.setText(null);
        tfAge.setText(null);
        tfBloodGroup.setText(null);
        tfAddress.setText(null);
        tfPhone.setText(null);
        tfHospital.setText(null);
        tfUnit.setText(null);
        tfCause.setText(null);
        tfAcceptorId.setText(null);
        tfDate.setDate(null);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        String name = tfName.getText();
        String gender = tfGender.getText();
        String address = tfAddress.getText();
        String phone = tfPhone.getText();
        String age = tfAge.getText();
        String bloodgroup = tfBloodGroup.getText();
        String hospital = tfHospital.getText();
        String unit = tfUnit.getText();
        String cause = tfCause.getText();
        java.util.Date date = tfDate.getDate();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String receivingDate = Date_Format.format(date);
        String accId = tfAcceptorId.getText();

        if(name.isEmpty() || gender.isEmpty()||address.isEmpty()||phone.isEmpty() || age.isEmpty()||bloodgroup.isEmpty() || 
                hospital.isEmpty()||unit.isEmpty()||cause.isEmpty() || receivingDate.isEmpty()|| accId.isEmpty() ){
            JOptionPane.showMessageDialog(this, "One or more required field is empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            DeletePatient(name,gender,address,phone,age,bloodgroup,hospital,unit,cause,receivingDate,accId);
        }
        showTableData();
        tfName.setText(null);
        tfGender.setText(null);
        tfAge.setText(null);
        tfBloodGroup.setText(null);
        tfAddress.setText(null);
        tfPhone.setText(null);
        tfHospital.setText(null);
        tfUnit.setText(null);
        tfCause.setText(null);
        tfAcceptorId.setText(null);
        tfDate.setDate(null);
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        tfName.setText(null);
        tfGender.setText(null);
        tfAge.setText(null);
        tfBloodGroup.setText(null);
        tfAddress.setText(null);
        tfPhone.setText(null);
        tfHospital.setText(null);
        tfUnit.setText(null);
        tfCause.setText(null);
        tfAcceptorId.setText(null);
        tfDate.setDate(null);
        
    }//GEN-LAST:event_btnRefresh1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        String name = tfName.getText();
        String gender = tfGender.getText();
        String address = tfAddress.getText();
        String phone = tfPhone.getText();
        String age = tfAge.getText();
        String bloodgroup = tfBloodGroup.getText();
        String hospital = tfHospital.getText();
        String unit = tfUnit.getText();
        String cause = tfCause.getText();
        java.util.Date date = tfDate.getDate();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String receivingDate = Date_Format.format(date);
        String accId = tfAcceptorId.getText();

        if(name.isEmpty() || gender.isEmpty()||address.isEmpty()||phone.isEmpty() || age.isEmpty()||bloodgroup.isEmpty() || 
                hospital.isEmpty()||unit.isEmpty()||cause.isEmpty() || receivingDate.isEmpty()|| accId.isEmpty() ){
            JOptionPane.showMessageDialog(this, "One or more required field is empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            AddPatient(name,gender,address,phone,age,bloodgroup,hospital,unit,cause,receivingDate,accId);
        }
        showTableData();
        tfName.setText(null);
        tfGender.setText(null);
        tfAge.setText(null);
        tfBloodGroup.setText(null);
        tfAddress.setText(null);
        tfPhone.setText(null);
        tfHospital.setText(null);
        tfUnit.setText(null);
        tfCause.setText(null);
        tfAcceptorId.setText(null);
        tfDate.setDate(null);
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void tfBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBloodGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBloodGroupActionPerformed

    private void tfGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGenderActionPerformed

    private void tfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddressActionPerformed

    private void tfHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHospitalActionPerformed

    private void tfCauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCauseActionPerformed

    private void tfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneActionPerformed

    private void tfAcceptorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAcceptorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAcceptorIdActionPerformed

    private void tablePatientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablePatientKeyReleased
        Connection dbconn = DBConnection.connectDB();
        int row = tablePatient.getSelectedRow();
        String selection = tablePatient.getModel().getValueAt(row, 0).toString();

        try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM patient WHERE patient_id= "+selection);
            ResultSet res = st.executeQuery();

            if(res.next()){
            tfName.setText(res.getString("patient_name"));
            tfGender.setText(res.getString("patient_gender"));
            tfAge.setText(res.getString("patient_age"));
            tfBloodGroup.setText(res.getString("patient_bloodGroup"));
            tfAddress.setText(res.getString("patient_address"));
            tfPhone.setText(res.getString("patient_phone"));
            tfHospital.setText(res.getString("hospital_name"));
            tfUnit.setText(res.getString("unit_received"));
            tfCause.setText(res.getString("receiving_cause"));
            tfDate.setDate(res.getDate("receiving_date"));
            tfAcceptorId.setText(res.getString("acceptor_id"));
        }
        else System.out.println("sad");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tablePatientKeyReleased

    private void tablePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePatientMouseClicked
        int row = tablePatient.getSelectedRow();
        String selection = tablePatient.getModel().getValueAt(row, 0).toString();
        DefaultTableModel model = (DefaultTableModel)tablePatient.getModel();
        Connection dbconn = DBConnection.connectDB();
        try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("Select * from patient where patient_id= "+selection);
            ResultSet res = st.executeQuery();       
        
            if(res.next()){
            tfName.setText(res.getString("patient_name"));
            tfGender.setText(res.getString("patient_gender"));
            tfAge.setText(res.getString("patient_age"));
            tfBloodGroup.setText(res.getString("patient_bloodGroup"));
            tfAddress.setText(res.getString("patient_address"));
            tfPhone.setText(res.getString("patient_phone"));
            tfHospital.setText(res.getString("hospital_name"));
            tfUnit.setText(res.getString("unit_received"));
            tfCause.setText(res.getString("receiving_cause"));
            tfDate.setDate(res.getDate("receiving_date"));
            tfAcceptorId.setText(res.getString("acceptor_id"));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tablePatientMouseClicked

    private void tfUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUnitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        Dashboard donor =new Dashboard();
        donor.show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String searchString = jTextField1.getText();
        search(searchString);
    }//GEN-LAST:event_jTextField1KeyReleased
    public void search(String str){
        DefaultTableModel model = (DefaultTableModel) tablePatient.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tablePatient.setRowSorter(trs);
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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JLabel hospital;
    private javax.swing.JLabel hospital1;
    private javax.swing.JLabel hospital2;
    private javax.swing.JLabel hospital3;
    private javax.swing.JLabel hospital4;
    private javax.swing.JLabel hospital5;
    private javax.swing.JLabel hospital6;
    private javax.swing.JLabel hospital7;
    private javax.swing.JLabel hospital8;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablePatient;
    private javax.swing.JTextField tfAcceptorId;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfBloodGroup;
    private javax.swing.JTextField tfCause;
    private com.toedter.calendar.JDateChooser tfDate;
    private javax.swing.JTextField tfGender;
    private javax.swing.JTextField tfHospital;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUnit;
    // End of variables declaration//GEN-END:variables

    private void showTableData() {
         Connection dbconn = DBConnection.connectDB();
     try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM patient ");
            ResultSet res = st.executeQuery();
            tablePatient.setModel(DbUtils.resultSetToTableModel(res));
            
           
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }

    private void UpdatePatient(String name, String gender, String address, String phone, String age, String bloodgroup, String hospital, 
            String unit, String cause, String receivingDate, String accId) {
        Connection dbconn = DBConnection.connectDB();

        if(dbconn!=null){
            try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("UPDATE patient SET patient_name=?,"
                    + " patient_gender=?, patient_age=?, patient_bloodGroup=?, patient_address=?,hospital_name=?,"
                    + "unit_received=?,receiving_cause=?,receiving_date=?,acceptor_id=?"
                    + "WHERE  patient_phone=?");
           
            st.setString(1, name);
            st.setString(2, gender);
            st.setString(3, age);
            st.setString(4, bloodgroup);
            st.setString(5, address);
            st.setString(6, hospital);
            st.setString(7, unit);
            st.setString(8, cause);
            st.setString(9, receivingDate);
            st.setString(10, accId);
            st.setString(11, phone);
           
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    }

    private void DeletePatient(String name, String gender, String address, String phone, String age, String bloodgroup, String hospital, String unit, String cause, String receivingDate, String accId) {
        Connection dbconn = DBConnection.connectDB();
        
        if(dbconn!=null){
            try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("DELETE FROM patient WHERE  patient_phone=?");
            st.setString(1, phone);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    }

    private void AddPatient(String name, String gender, String address, String phone, String age, String bloodgroup, String hospital, String unit, String cause, String receivingDate, String accId) {
        Connection dbconn = DBConnection.connectDB();
        
        if(dbconn!=null){
            try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("INSERT INTO patient(patient_name,patient_gender,patient_age,"
                    + "patient_bloodGroup, patient_address,hospital_name,unit_received,receiving_cause,receiving_date,acceptor_id,patient_phone)"
                    +"VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, name);
            st.setString(2, gender);
            st.setString(3, age);
            st.setString(4, bloodgroup);
            st.setString(5, address);
            st.setString(6, hospital);
            st.setString(7, unit);
            st.setString(8, cause);
            st.setString(9, receivingDate);
            st.setString(10, accId);
            st.setString(11, phone);
            
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Inserted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    }
}
