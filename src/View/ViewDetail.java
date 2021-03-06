/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Config.Connector;
import Control.BarangController;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author REPUBLIC OF GAMERS
 */
public class ViewDetail extends javax.swing.JFrame {
    Connector connection = new Connector();
    BarangController barangController = new BarangController();
    /**
     * Creates new form ViewDetail
     */
    public ViewDetail(String username) {
        initComponents();
        txtID.setEditable(false);
        getjLabel4().setText(username);
        tampil_data();
        
    }
   
    
   
    private DefaultTableModel tabmode;

    private void tampil_data() {
        DefaultTableModel tableModel = (DefaultTableModel)getTable().getModel();
        tableModel.setRowCount(0);
        barangController.showTable(this);
    }
    
    public JTable getTable() {
        return this.table;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btadminlayer1 = new javax.swing.JButton();
        btadminlayer2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtBBaik = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtSBarang = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtKategori1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(205, 163));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(205, 163));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);

        jLabel3.setBackground(new java.awt.Color(255, 204, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INVENTARIS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btadminlayer1.setBackground(new java.awt.Color(153, 102, 0));
        btadminlayer1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btadminlayer1.setForeground(new java.awt.Color(255, 255, 255));
        btadminlayer1.setText("LOGOUT");
        btadminlayer1.setBorder(null);
        btadminlayer1.setBorderPainted(false);
        btadminlayer1.setFocusPainted(false);
        btadminlayer1.setFocusable(false);
        btadminlayer1.setPreferredSize(new java.awt.Dimension(172, 21));
        btadminlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btadminlayer1MouseClicked(evt);
            }
        });
        btadminlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadminlayer1ActionPerformed(evt);
            }
        });

        btadminlayer2.setBackground(new java.awt.Color(153, 102, 0));
        btadminlayer2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btadminlayer2.setForeground(new java.awt.Color(255, 255, 255));
        btadminlayer2.setText("INSERT");
        btadminlayer2.setBorder(null);
        btadminlayer2.setBorderPainted(false);
        btadminlayer2.setFocusPainted(false);
        btadminlayer2.setFocusable(false);
        btadminlayer2.setPreferredSize(new java.awt.Dimension(172, 21));
        btadminlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btadminlayer2MouseClicked(evt);
            }
        });
        btadminlayer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadminlayer2ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 204, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Zaidan Noor Irfan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btadminlayer2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btadminlayer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btadminlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btadminlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setAlignmentX(0.0F);
        jPanel4.setAlignmentY(0.0F);

        jLabel2.setBackground(new java.awt.Color(204, 153, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DETAIL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        table.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(51, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Kategori", "Stok", "Barang Baik", "Barang Rusak", "Keterangan"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txtBBaik.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBBaik.setForeground(new java.awt.Color(85, 85, 85));
        txtBBaik.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBBaik.setText("Jumlah Barang Baik");
        txtBBaik.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBBaikFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBBaikFocusLost(evt);
            }
        });
        txtBBaik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBBaikActionPerformed(evt);
            }
        });
        txtBBaik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBBaikKeyReleased(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setText("ID");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtSBarang.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSBarang.setForeground(new java.awt.Color(85, 85, 85));
        txtSBarang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSBarang.setText("Edit Stok");
        txtSBarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSBarangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSBarangFocusLost(evt);
            }
        });
        txtSBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSBarangActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 153, 0));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(null);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtKategori1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtKategori1.setForeground(new java.awt.Color(85, 85, 85));
        txtKategori1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKategori1.setText("Edit Kategori");
        txtKategori1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtKategori1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKategori1FocusLost(evt);
            }
        });
        txtKategori1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKategori1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBBaik, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBBaik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btadminlayer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btadminlayer1MouseClicked
        ViewLogin vLogin = new ViewLogin();
        vLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btadminlayer1MouseClicked

    private void btadminlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadminlayer1ActionPerformed

    }//GEN-LAST:event_btadminlayer1ActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        //barangController.deleteBarang(this);
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        barangController.deleteForm(this);
        tampil_data();
        setTxtID("ID");
        setTxtKategori("Edit Kategori");
        setTxtBBaik("Jumlah Barang Baik");
        setTxtSBarang("Edit Stok");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        barangController.updateForm(this);
        tampil_data();
        setTxtID("ID");
        setTxtKategori("Edit Kategori");
        setTxtBBaik("Jumlah Barang Baik");
        setTxtSBarang("Edit Stok");
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btadminlayer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btadminlayer2MouseClicked
        ViewSave vSave = new ViewSave(getjLabel4().getText());
        vSave.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btadminlayer2MouseClicked

    private void btadminlayer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadminlayer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btadminlayer2ActionPerformed

    private void txtBBaikKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBBaikKeyReleased
        
    }//GEN-LAST:event_txtBBaikKeyReleased

    private void txtBBaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBBaikActionPerformed
        
    }//GEN-LAST:event_txtBBaikActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtKategori1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKategori1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKategori1ActionPerformed

    private void txtKategori1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKategori1FocusGained
        if(txtKategori1.getText().equals("Edit Kategori")){
            txtKategori1.setText("");
            txtKategori1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtKategori1FocusGained

    private void txtKategori1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKategori1FocusLost
        if(txtKategori1.getText().equals("")){
            txtKategori1.setText("Edit Kategori");
            txtKategori1.setForeground(new Color(85,85,85));
        }
    }//GEN-LAST:event_txtKategori1FocusLost

    private void txtSBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSBarangActionPerformed

    private void txtSBarangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSBarangFocusGained
        if(txtSBarang.getText().equals("Edit Stok")){
            txtSBarang.setText("");
            txtSBarang.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtSBarangFocusGained

    private void txtSBarangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSBarangFocusLost
        if(txtSBarang.getText().equals("")){
            txtSBarang.setText("Edit Stok");
            txtSBarang.setForeground(new Color(85,85,85));
        }
        
    }//GEN-LAST:event_txtSBarangFocusLost

    private void txtBBaikFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBBaikFocusGained
        if(txtBBaik.getText().equals("Jumlah Barang Baik")){
            txtBBaik.setText("");
            txtBBaik.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtBBaikFocusGained

    private void txtBBaikFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBBaikFocusLost
        if(txtBBaik.getText().equals("")){
            txtBBaik.setText("Jumlah Barang Baik");
            txtBBaik.setForeground(new Color(85,85,85));
        }
    }//GEN-LAST:event_txtBBaikFocusLost

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = getTable().getSelectedRow();
        System.out.println(row);
        String id = table.getValueAt(row,0).toString();
        String kategori = table.getValueAt(row,1).toString();
        String stok = table.getValueAt(row,2).toString();
        String bBaik = table.getValueAt(row,3).toString();
        
        setTxtID(id);
        setTxtKategori(kategori);
        setTxtBBaik(bBaik);
        setTxtSBarang(stok);
        
    }//GEN-LAST:event_tableMouseClicked

    public void setTxtBBaik(String txtBBaik) {
        this.txtBBaik.setText(txtBBaik);
    }
    
    public void setTxtID(String ID) {
        this.txtID.setText(ID);
    }
    
    public void setTxtKategori(String kategori) {
        this.txtKategori1.setText(kategori);
    }

    public void setTxtSBarang(String stok) {
        this.txtSBarang.setText(stok);
    }

    public JTextField getTxtBBaik() {
        return txtBBaik;
    }

    public JTextField getTxtKategori1() {
        return txtKategori1;
    }

    public JTextField getTxtSBarang() {
        return txtSBarang;
    }
    
    public JTextField getTxtID() {
        return txtID;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }
    
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadminlayer1;
    private javax.swing.JButton btadminlayer2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtBBaik;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtKategori1;
    private javax.swing.JTextField txtSBarang;
    // End of variables declaration//GEN-END:variables

//    public String getTxtKategori1() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    
}
