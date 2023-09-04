package blood.bank.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class Stock extends javax.swing.JFrame {

    public Stock() {
        initComponents();
        showTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        hospital = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfWbc = new javax.swing.JTextField();
        tfDonorId = new javax.swing.JTextField();
        tfPlt = new javax.swing.JTextField();
        tfHb = new javax.swing.JTextField();
        tfRbc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tfExpiration = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("               Stock");

        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Donor Id", "Blood Type", "Quantity", "Expire Date", "Red Blood Cell", "White Blood Cell", "Platelet", "Heamoglobin"
            }
        ));
        tableStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStockMouseClicked(evt);
            }
        });
        tableStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableStockKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableStock);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 529, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(429, 429, 429))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1700, 351));

        hospital.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        hospital.setText("Donor Id");

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

        jLabel8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel8.setText("Red Blood Cells");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel9.setText("Expire Date");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel10.setText("Platelete");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel11.setText("Heamoglobin");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel12.setText("White Blood Cells");

        tfWbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWbcActionPerformed(evt);
            }
        });

        tfDonorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDonorIdActionPerformed(evt);
            }
        });

        tfPlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPltActionPerformed(evt);
            }
        });

        tfHb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHbActionPerformed(evt);
            }
        });

        tfRbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRbcActionPerformed(evt);
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
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDonorId, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfHb, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPlt, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfWbc, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRbc, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDonorId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfWbc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfRbc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        tfExpiration.setDateFormatString("dd-MM- yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(tfExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(tfExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 318, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStockMouseClicked
       int row = tableStock.getSelectedRow();
        String selection = tableStock.getModel().getValueAt(row, 0).toString();
        DefaultTableModel model = (DefaultTableModel)tableStock.getModel();
        Connection dbconn = DBConnection.connectDB();
        try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("Select * from stock where stock_id= "+selection);
            ResultSet res = st.executeQuery();

            if(res.next()){
            tfDonorId.setText(res.getString("donor_id"));
           
            tfExpiration.setDate(res.getDate("expire_date"));
            tfRbc.setText(res.getString("red_bloodcells"));
            tfWbc.setText(res.getString("white_bloodcells"));
            tfPlt.setText(res.getString("platelets"));
            tfHb.setText(res.getString("heamoglobin"));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableStockMouseClicked

    private void tableStockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableStockKeyReleased
       Connection dbconn = DBConnection.connectDB();
        int row = tableStock.getSelectedRow();
        String selection = tableStock.getModel().getValueAt(row, 0).toString();

        try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM equipment WHERE stock_id= "+selection);
            ResultSet res = st.executeQuery();

            if(res.next()){
           
            tfExpiration.setDate(res.getDate("expire_date"));
            tfRbc.setText(res.getString("red_bloodcells"));
            tfWbc.setText(res.getString("white_bloodcells"));
            tfPlt.setText(res.getString("platelets"));
            tfHb.setText(res.getString("heamoglobin"));
        }
        else System.out.println("sad");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableStockKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String donorId = tfDonorId.getText();
        
        java.util.Date exp = tfExpiration.getDate();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String expiration = Date_Format.format(exp);
        String rbc = tfRbc.getText();
        String wbc = tfWbc.getText();
        String plt = tfPlt.getText();
        String hb = tfHb.getText();
        
       
        if(donorId.isEmpty() ||expiration.isEmpty() || rbc.isEmpty()
                ||wbc.isEmpty()||plt.isEmpty() || hb.isEmpty() ){
            JOptionPane.showMessageDialog(this, "One or more required field is empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            UpdateStock(donorId,expiration,rbc,wbc,plt,hb);
        }
        showTableData();
        tfDonorId.setText(null);
        
        tfExpiration.setDate(null);
        tfRbc.setText(null);
        tfWbc.setText(null);
        tfPlt.setText(null);
        tfHb.setText(null);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       String donorId = tfDonorId.getText();
        
        java.util.Date exp = tfExpiration.getDate();
        SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        String expiration = Date_Format.format(exp);
        String rbc = tfRbc.getText();
        String wbc = tfWbc.getText();
        String plt = tfPlt.getText();
        String hb = tfHb.getText();
        
       
        if(donorId.isEmpty() ||expiration.isEmpty() || rbc.isEmpty()
                ||wbc.isEmpty()||plt.isEmpty() || hb.isEmpty() ){
            JOptionPane.showMessageDialog(this, "One or more required field is empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            DeleteStock(donorId,expiration,rbc,wbc,plt,hb);
        }
        showTableData();
        tfDonorId.setText(null);
        
        tfExpiration.setDate(null);
        tfRbc.setText(null);
        tfWbc.setText(null);
        tfPlt.setText(null);
        tfHb.setText(null);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        tfDonorId.setText(null);
        
        tfExpiration.setDate(null);
        tfRbc.setText(null);
        tfWbc.setText(null);
        tfPlt.setText(null);
        tfHb.setText(null);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String donorId = tfDonorId.getText();
       
        String rbc = tfRbc.getText();
        String wbc = tfWbc.getText();
        String plt = tfPlt.getText();
        String hb = tfHb.getText();
        
       
        if(donorId.isEmpty() || rbc.isEmpty()
                ||wbc.isEmpty()||plt.isEmpty() || hb.isEmpty() ){
            JOptionPane.showMessageDialog(this, "One or more required field is empty", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
            java.util.Date exp = tfExpiration.getDate();
            SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
             String expiration = Date_Format.format(exp);
            AddStock(donorId,expiration,rbc,wbc,plt,hb);
        }
        showTableData();
        tfDonorId.setText(null);
        
        tfExpiration.setDate(null);
        tfRbc.setText(null);
        tfWbc.setText(null);
        tfPlt.setText(null);
        tfHb.setText(null);
    }//GEN-LAST:event_btnAddActionPerformed

    private void tfWbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWbcActionPerformed

    private void tfDonorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDonorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDonorIdActionPerformed

    private void tfPltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPltActionPerformed

    private void tfHbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHbActionPerformed

    private void tfRbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRbcActionPerformed

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
        DefaultTableModel model = (DefaultTableModel) tableStock.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableStock.setRowSorter(trs);
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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel hospital;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableStock;
    private javax.swing.JTextField tfDonorId;
    private com.toedter.calendar.JDateChooser tfExpiration;
    private javax.swing.JTextField tfHb;
    private javax.swing.JTextField tfPlt;
    private javax.swing.JTextField tfRbc;
    private javax.swing.JTextField tfWbc;
    // End of variables declaration//GEN-END:variables

    private void showTableData() {
         Connection dbconn = DBConnection.connectDB();
     try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("SELECT * FROM stock ");
            ResultSet res = st.executeQuery();
            tableStock.setModel(DbUtils.resultSetToTableModel(res));
            
           
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }

    private void UpdateStock(String donorId  , String expiration, String rbc, String wbc, String plt, String hb) {
         Connection dbconn = DBConnection.connectDB();
        if(dbconn!=null){
            try{
                Statement st0 = dbconn.createStatement();
                         String sql ="select *from donor where donor_id='"+donorId+"'";
                ResultSet rs = st0.executeQuery(sql);
                if(rs.next())
                {
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("UPDATE stock SET "
                    + " blood_type=?, quantity=?, expire_date=? ,red_bloodcells=?,white_bloodcells=?,platelets=?,heamoglobin=?"
                    + "WHERE  donor_id=?");
           
            st.setString(1, rs.getString("donor_bloodGroup"));
            st.setString(2, rs.getString("donor_bloodQuantity"));
            st.setString(3, expiration);
            st.setString(4, rbc);
            st.setString(5, wbc);
            st.setString(6, plt);
            st.setString(7, hb);
            st.setString(8, donorId);
            
           
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    }

    

    private void DeleteStock(String donorId,  String expiration, String rbc, String wbc, String plt, String hb) {
         Connection dbconn = DBConnection.connectDB();
        
        if(dbconn!=null){
            try{
            PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("DELETE FROM stock WHERE  donor_id=?");
           
      
            st.setString(1, donorId);
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
           
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    }

    private void AddStock(String donorId, String expiration, String rbc, String wbc, String plt, String hb) {
        Connection dbconn = DBConnection.connectDB();
        
        if(dbconn!=null){
            try{
                 Statement st0 = dbconn.createStatement();
                         String sql ="select *from donor where donor_id='"+donorId+"'";
                ResultSet rs = st0.executeQuery(sql);
                if(rs.next())
                {
                    
                    PreparedStatement st = (PreparedStatement) dbconn.prepareStatement("INSERT INTO stock(donor_id,  blood_type, quantity, expire_date ,"
                    + "red_bloodcells,white_bloodcells,platelets,heamoglobin) "
                    + "VALUES (?,?,?,?,?,?,?,?)");
            st.setString(1, donorId);
            st.setString(2, rs.getString("donor_bloodGroup"));
            st.setString(3, rs.getString("donor_bloodQuantity"));	
            st.setString(4, expiration);
            st.setString(5, rbc);
            st.setString(6, wbc);
            st.setString(7, plt);
            st.setString(8, hb);
           
            
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Inserted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                  
                
                }
                else{
                      JOptionPane.showMessageDialog(this, "Donor doesnot exsist", "Error", JOptionPane.ERROR_MESSAGE);
                }
            
           
        }catch(SQLException ex){
            Logger.getLogger(Donor.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
    }

    
}
