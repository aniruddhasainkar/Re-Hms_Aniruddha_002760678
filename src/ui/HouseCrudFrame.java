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
import model.House;
import model.MyNumericVerifier;
import model.MyStringVerifier;

/**
 *
 
 */
public class HouseCrudFrame extends javax.swing.JFrame {

    /**
     * Creates new form HouseCrudFrame
     */
    CityDirectory storageOfCities;
    public HouseCrudFrame() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
     public HouseCrudFrame(CityDirectory storageOfCities) {
       initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.storageOfCities=storageOfCities;
        addVerifiers();
        populateTable();
    }
      private void addVerifiers() {
           InputVerifier integerVerifier = new MyNumericVerifier();

        InputVerifier stringVerifier = new MyStringVerifier();
    txtCommunityID.setInputVerifier(integerVerifier);
   txtHouseAddress.setInputVerifier(stringVerifier);
    txtHouseID.setInputVerifier(integerVerifier);
       
       
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
        HouseTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtHouseID = new javax.swing.JTextField();
        txtHouseAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCommunityID = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnLoadUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HouseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "HouseID", "HouseAddress", "CommunityID"
            }
        ));
        jScrollPane2.setViewportView(HouseTable);

        jLabel1.setText("HouseID");

        txtHouseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseIDActionPerformed(evt);
            }
        });

        txtHouseAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseAddressActionPerformed(evt);
            }
        });

        jLabel2.setText("HouseAddress");

        jLabel3.setText("CoummunityID");

        txtCommunityID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityIDActionPerformed(evt);
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

        btnLoadUpdate.setText("Load to Update");
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
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHouseID, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCreate)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnView)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoadUpdate))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(707, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHouseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnView)
                    .addComponent(btnUpdate)
                    .addComponent(btnLoadUpdate))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHouseAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseAddressActionPerformed

    private void txtCommunityIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityIDActionPerformed

    private void txtHouseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseIDActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(txtCommunityID.getText().equals("")||
   txtHouseAddress.getText().equals("")||
    txtHouseID.getText().equals("")){
             JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
           long houseID=Long.valueOf(txtHouseID.getText());
        long communityID=Long.valueOf(txtCommunityID.getText());
        String houseAddress=txtHouseAddress.getText();
        boolean flag=false;
         for(City ed :storageOfCities.getInformation()){
            for(Community com: ed.getCommunities()){
                for(House h: com.getHousesInCommunity()){
                    if(h.getHouseID()==houseID){
                    JOptionPane.showMessageDialog(this,"the house id is not unique");
                    return; 
                    }
                }  
            }
        }
        for(City ed : storageOfCities.getInformation()){
            for(Community com : ed.getCommunities()){
                if(com.getCommunityID()==communityID){
                    House newHouse=new House(houseID,houseAddress,communityID);
                    com.housesInCommunity.add(newHouse);
                    JOptionPane.showMessageDialog(this,"new house data added.");
                    flag=true;
                }
            }
        }
        if(flag==false){
           JOptionPane.showMessageDialog(this,"the communityID does not exist"); 
        }
        txtHouseID.setText("");
        txtCommunityID.setText("");
        txtHouseAddress.setText("");
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex=HouseTable.getSelectedRow();
        System.out.println(selectedRowIndex);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
        int counter=0;
          for (City ed : storageOfCities.getInformation()) {
             for (Community com : ed.getCommunities()) {
                 for(House h: com.getHousesInCommunity()){
                    if(counter==selectedRowIndex){
                        txtHouseID.setText(String.valueOf(h.getHouseID()));
                        txtCommunityID.setText(String.valueOf(h.getCommunityID()));
                        txtHouseAddress.setText(h.getHouseAddress());
                    }
                    counter++;
                 }
             }
         }
    }//GEN-LAST:event_btnViewActionPerformed
    public int RowIndex;
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            if(txtCommunityID.getText().equals("")||
   txtHouseAddress.getText().equals("")||
    txtHouseID.getText().equals("")){
             JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
                int counter=0;
   for (City ed : storageOfCities.getInformation()) {
             for (Community com : ed.getCommunities()) {
                 for(House h: com.getHousesInCommunity()){
                if(counter==RowIndex){
                  h.setHouseAddress(txtHouseAddress.getText());
                  System.out.println("updated");
                  JOptionPane.showMessageDialog(this,"update sucessful the ID's are not changeable");
                }
                counter++;
             }

         }
   }
         populateTable();
         RowIndex=0;
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLoadUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadUpdateActionPerformed
        // TODO add your handling code here:
            // TODO add your handling code here:
      RowIndex=HouseTable.getSelectedRow();
        System.out.println(RowIndex);
        if(RowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
        int counter=0;
          for (City ed : storageOfCities.getInformation()) {
             for (Community com : ed.getCommunities()) {
                 for(House h: com.getHousesInCommunity()){
                    if(counter==RowIndex){
                        txtHouseID.setText(String.valueOf(h.getHouseID()));
                        txtCommunityID.setText(String.valueOf(h.getCommunityID()));
                        txtHouseAddress.setText(h.getHouseAddress());
                    }
                    counter++;
                 }
             }
         }
    }//GEN-LAST:event_btnLoadUpdateActionPerformed

     private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) HouseTable.getModel();
        model.setRowCount(0);
        for(City ed : storageOfCities.getInformation()){
            for(Community com : ed.getCommunities()){
                for(House h: com.getHousesInCommunity()){
                    Object[] row = new Object[11];
            row[0]=h.getHouseID();
            row[1]=h.getHouseAddress();
            row[2]=h.getCommunityID();
            model.addRow(row);
                }
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
            java.util.logging.Logger.getLogger(HouseCrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HouseCrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HouseCrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HouseCrudFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HouseCrudFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HouseTable;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnLoadUpdate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCommunityID;
    private javax.swing.JTextField txtHouseAddress;
    private javax.swing.JTextField txtHouseID;
    // End of variables declaration//GEN-END:variables
}