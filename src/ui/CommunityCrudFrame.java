/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.MyNumericVerifier;
import model.MyStringVerifier;

/**
 *

 */
public class CommunityCrudFrame extends javax.swing.JFrame {

    /**
     * Creates new form CommunityCrudFrame
     */
    CityDirectory storageOfCities;
    public CommunityCrudFrame(CityDirectory storageOfCities) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.storageOfCities=storageOfCities;
        addVerifiers();
        populateTable();
    }
     public CommunityCrudFrame() {
        initComponents();
        addVerifiers();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
       
    }
      private void addVerifiers() {
           InputVerifier integerVerifier = new MyNumericVerifier();
 
        InputVerifier stringVerifier = new MyStringVerifier();
    txtCityID.setInputVerifier(integerVerifier);
    txtCommunityID.setInputVerifier(integerVerifier);
    txtCommunityName.setInputVerifier(stringVerifier);
       

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
        jScrollPane2 = new javax.swing.JScrollPane();
        communityTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCommunityID = new javax.swing.JTextField();
        txtCommunityName = new javax.swing.JTextField();
        txtCityID = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnLoadUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        communityTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CommunityID", "CommunityName", "CityID"
            }
        ));
        jScrollPane2.setViewportView(communityTable);

        jLabel1.setText("CommunityID");

        jLabel2.setText("CommunityName");

        jLabel3.setText("CityID");

        txtCommunityID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityIDActionPerformed(evt);
            }
        });

        txtCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityNameActionPerformed(evt);
            }
        });

        txtCityID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityIDActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnLoadUpdate.setText("Load Data to be Updated");
        btnLoadUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCreate)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCityID)
                                            .addComponent(txtCommunityName)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnView)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLoadUpdate)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 660, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnView)
                    .addComponent(btnUpdate)
                    .addComponent(btnLoadUpdate))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityNameActionPerformed

    private void txtCityIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityIDActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         if(txtCityID.getText().equals("")||txtCommunityID.getText().equals("")||txtCommunityName.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
        long cityID=Long.valueOf(txtCityID.getText());
        long communityID=Long.valueOf(txtCommunityID.getText());
        String communityName=txtCommunityName.getText();
        boolean flag=false;
        for(City ed :storageOfCities.getInformation()){
            for(Community com: ed.getCommunities()){
                if(com.getCommunityID()==communityID){
                    JOptionPane.showMessageDialog(this,"the community id is not unique");
                    return;
                }
                
            }
        }
        for(City ed : storageOfCities.getInformation()){
           if(ed.getCityID()==cityID){
             Community newCommunity=new Community(communityID,cityID,communityName);
             ed.Communities.add(newCommunity);
             flag=true;
             JOptionPane.showMessageDialog(this,"new community data added.");
           } 
        }
        if(flag==false){
           JOptionPane.showMessageDialog(this,"the city ID does not exist"); 
        }
        txtCityID.setText("");
        txtCommunityID.setText("");
        txtCommunityName.setText("");
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtCommunityIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityIDActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex=communityTable.getSelectedRow();
        System.out.println(selectedRowIndex);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
        int counter=0;
          for (City ed : storageOfCities.getInformation()) {
             for (Community com : ed.getCommunities()) {
                if(counter==selectedRowIndex){
                  txtCityID.setText(String.valueOf(com.getCityID()));
        txtCommunityID.setText(String.valueOf(com.getCommunityID()));
        txtCommunityName.setText(com.getCommunityName());
         return;
                }
                counter++;
             }

         }
    }//GEN-LAST:event_btnViewActionPerformed
    public int RowIndex;
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         if(txtCityID.getText().equals("")||txtCommunityID.getText().equals("")||txtCommunityName.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
        int counter=0;
          for (City ed : storageOfCities.getInformation()) {
             for (Community com : ed.getCommunities()) {
                if(counter==RowIndex){
                  Community nd=com;
                  nd.setCommunityName(txtCommunityName.getText());
                  System.out.println("updated sucessful, id's are not updateable");
                }
                counter++;
             }

         }
         populateTable();
         RowIndex=0;
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLoadUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadUpdateActionPerformed
        // TODO add your handling code here:
                  RowIndex=communityTable.getSelectedRow();
        System.out.println(RowIndex);
        if(RowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to update.");
            return;
        }
        int counter=0;
          for (City ed : storageOfCities.getInformation()) {
             for (Community com : ed.getCommunities()) {
                if(counter==RowIndex){
                  txtCityID.setText(String.valueOf(com.getCityID()));
        txtCommunityID.setText(String.valueOf(com.getCommunityID()));
        txtCommunityName.setText(com.getCommunityName());
         return;
                }
                counter++;
             }

         }
    }//GEN-LAST:event_btnLoadUpdateActionPerformed
     private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) communityTable.getModel();
        model.setRowCount(0);
         for (City ed : storageOfCities.getInformation()) {
             for (Community com : ed.getCommunities()) {
                 Object[] row = new Object[11];
                 row[0] = com.getCommunityID();
                 row[1] = com.getCommunityName();
                 row[2] = com.getCityID();
                 model.addRow(row);
             }

         }
        
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
            java.util.logging.Logger.getLogger(CommunityCrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityCrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityCrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityCrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityCrudFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnLoadUpdate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JTable communityTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCityID;
    private javax.swing.JTextField txtCommunityID;
    private javax.swing.JTextField txtCommunityName;
    // End of variables declaration//GEN-END:variables
}
