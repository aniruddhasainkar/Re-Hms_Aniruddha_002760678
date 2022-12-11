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
import model.DoctorDirectory;
import model.EncounterHistory;
import model.Hospital;
import model.HospitalDirectory;
import model.House;
import model.MyNumericVerifier;
import model.MyStringVerifier;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *

 */
public class PatientJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientJFrame
     */
      CityDirectory storageOfCities;
    PersonDirectory storageOfPersons;
    PatientDirectory storageOfPatients;
    DoctorDirectory storageOfDoctors;
    HospitalDirectory storageOfHospitals;
    EncounterHistory storageofEncounters;
    Person User;
    public PatientJFrame() {
        initComponents();
    }
     public PatientJFrame(CityDirectory storageOfCities,
    PersonDirectory storageOfPersons,
    PatientDirectory storageOfPatients,
    DoctorDirectory storageOfDoctors,
    HospitalDirectory storageOfHospitals,
    EncounterHistory storageofEncounters,Person User) {
        initComponents();
        this.storageOfCities=storageOfCities;
        this.storageOfPersons=storageOfPersons;
        this.storageOfPatients=storageOfPatients;
        this.storageOfDoctors=storageOfDoctors;
        this.storageOfHospitals=storageOfHospitals;
        this.storageofEncounters=storageofEncounters;
        this.User=User;
        addVerifiers();
        if(User.getPersonType()!="patient")populateTable();
        else if((User.getPersonType()=="patient"))populateTableForPatient();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
      private void addVerifiers() {
          InputVerifier integerVerifier = new MyNumericVerifier();
            InputVerifier stringVerifier = new MyStringVerifier();
    txtAge.setInputVerifier(integerVerifier);
    txtHouseID.setInputVerifier(integerVerifier);
txtPersonID.setInputVerifier(integerVerifier);
txtPersonName.setInputVerifier(stringVerifier);
txtSex.setInputVerifier(stringVerifier);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPersonID = new javax.swing.JTextField();
        txtPersonName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        txtHouseID = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnldUpdate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Person Name", "Password", "age", "sex", "houseID"
            }
        ));
        jScrollPane1.setViewportView(PatientTable);

        jLabel1.setText("Patient ID");

        jLabel2.setText("Password");

        jLabel3.setText("Person Name");

        jLabel4.setText("age");

        jLabel5.setText("sex");

        jLabel6.setText("houseID");

        txtPersonID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonIDActionPerformed(evt);
            }
        });

        txtPersonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonNameActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexActionPerformed(evt);
            }
        });

        txtHouseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseIDActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnldUpdate.setText("load to Update");
        btnldUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnldUpdateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnldUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSex, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(txtAge)
                            .addComponent(txtPassword)
                            .addComponent(txtPersonName)
                            .addComponent(txtPersonID)
                            .addComponent(txtHouseID))))
                .addContainerGap(627, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPersonID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHouseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnldUpdate)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexActionPerformed

    private void txtHouseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseIDActionPerformed
    int RowIndex=-1;
    private void btnldUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnldUpdateActionPerformed
        // TODO add your handling code here:
        if(User.getPersonType()=="patient"){
         txtHouseID.setText(String.valueOf(User.getHouse().getHouseID()));
        txtPersonID.setText(String.valueOf(User.getPersonID()));
        txtPassword.setText(User.getPassword());
        txtSex.setText(User.getSex());
        txtPersonName.setText(User.getPersonName());
        txtAge.setText(String.valueOf(User.getAge()));
        }
        else{
        RowIndex=PatientTable.getSelectedRow();
        System.out.println(RowIndex);
        if(RowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
         Patient viewableData=storageOfPatients.getInformation().get(RowIndex);
         txtHouseID.setText(String.valueOf(viewableData.person.getHouse().getHouseID()));
        txtPersonID.setText(String.valueOf(viewableData.person.getPersonID()));
        txtPassword.setText(viewableData.person.getPassword());
        txtSex.setText(viewableData.person.getSex());
        txtPersonName.setText(viewableData.person.getPersonName());
        txtAge.setText(String.valueOf(viewableData.person.getAge()));
        }
    }//GEN-LAST:event_btnldUpdateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
               if( txtAge.getText().equals("")||
    txtHouseID.getText().equals("")||
txtPersonID.getText().equals("")||
txtPersonName.getText().equals("")||
txtSex.getText().equals("")){
              JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
          } 
             if(User.getPersonType()=="patient"){
              long houseID=Long.valueOf(txtHouseID.getText());
        House house =null;
         for(City c : storageOfCities.getInformation()){
            for(Community com : c.getCommunities()){
                for(House h : com.getHousesInCommunity()){
                    if(houseID == h.getHouseID()){
                        house=h;
                    }
                }
            }
        }
        long personID=Long.valueOf(txtPersonID.getText());
        String password=txtPassword.getText();
        String sex=txtSex.getText();
        String personName=txtPersonName.getText();
        int age=Integer.parseInt(txtAge.getText());
        Person p=User;
        p.setAge(age);
        if(house!=null)p.setHouse(house);
        p.setPassword(password);
        p.setPersonName(personName);
        p.setSex(sex);
        p.setPersonType("patient");
        JOptionPane.showMessageDialog(this,"updated but the Person ID's are not changeable");
        populateTableForPatient();
        RowIndex=-1;
        }
             else{
        if(RowIndex<0){
            JOptionPane.showMessageDialog(this,"please load data to be updated");
            return;
        }
        long houseID=Long.valueOf(txtHouseID.getText());
        House house =null;
         for(City c : storageOfCities.getInformation()){
            for(Community com : c.getCommunities()){
                for(House h : com.getHousesInCommunity()){
                    if(houseID == h.getHouseID()){
                        house=h;
                    }
                }
            }
        }
        long personID=Long.valueOf(txtPersonID.getText());
        String password=txtPassword.getText();
        String sex=txtSex.getText();
        String personName=txtPersonName.getText();
        int age=Integer.parseInt(txtAge.getText());
        Patient p=storageOfPatients.getInformation().get(RowIndex);
        p.person.setAge(age);
        if(house!=null)p.person.setHouse(house);
        p.person.setPassword(password);
        p.person.setPersonName(personName);
        p.person.setSex(sex);
        p.person.setPersonType("patient");
        JOptionPane.showMessageDialog(this,"updated but the Person ID's are not changeable");
        populateTable();
        RowIndex=-1;
             }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(User.getPersonType()=="patient"){
           JOptionPane.showMessageDialog(this,"Patient cannot create"); 
           return; 
        }
        else{
          if( txtAge.getText().equals("")||
    txtHouseID.getText().equals("")||
txtPersonID.getText().equals("")||
txtPersonName.getText().equals("")||
txtSex.getText().equals("")){
              JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
          }  
        long houseID=Long.valueOf(txtHouseID.getText());
        long personID=Long.valueOf(txtPersonID.getText());
        String password=txtPassword.getText();
        String sex=txtSex.getText();
        String personName=txtPersonName.getText();
        int age=Integer.parseInt(txtAge.getText());
        boolean flag=false;
        for(Patient p : storageOfPatients.getInformation()){
            if(personID==p.person.getPersonID()){
                flag=true;
                JOptionPane.showMessageDialog(this,"PatientID is not unique");
                return;
            }
        }
        for(Person p : storageOfPersons.getInformation()){
            if(personID==p.getPersonID()){
                JOptionPane.showMessageDialog(this,"PatientID is not unique and might be matching with some other User type");
                return;
            }
        }
        boolean flag2=false;
        House house = null;
        for(City c : storageOfCities.getInformation()){
            for(Community com : c.getCommunities()){
                for(House h : com.getHousesInCommunity()){
                    if(houseID == h.getHouseID()){
                        flag2=true;
                        house=h;
                    }
                }
            }
        }
        if(flag2==false){
            JOptionPane.showMessageDialog(this,"HouseID is not existing now");
            return;
        }
        if(flag==false && flag2==true){
        Person p=storageOfPersons.addNewPerson();
        p.setAge(age);
        p.setHouse(house);
        p.setPassword(password);
        p.setPersonID(personID);
        p.setPersonName(personName);
        p.setSex(sex);
        p.setPersonType("patient");
        Patient p2=new Patient(personID,p);
        storageOfPatients.collectionOfPatient.add(p2);
        System.out.println(p2);
        JOptionPane.showMessageDialog(this,"new patient data added.");
        }
        populateTable();
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPersonIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonIDActionPerformed

    private void txtPersonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
           if(User.getPersonType()=="patient"){
         txtHouseID.setText(String.valueOf(User.getHouse().getHouseID()));
        txtPersonID.setText(String.valueOf(User.getPersonID()));
        txtPassword.setText(User.getPassword());
        txtSex.setText(User.getSex());
        txtPersonName.setText(User.getPersonName());
        txtAge.setText(String.valueOf(User.getAge()));
        }
           else{
         int selectedRowIndex=PatientTable.getSelectedRow();
        System.out.println(selectedRowIndex);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
         Patient viewableData=storageOfPatients.getInformation().get(selectedRowIndex);
         txtHouseID.setText(String.valueOf(viewableData.person.getHouse().getHouseID()));
        txtPersonID.setText(String.valueOf(viewableData.person.getPersonID()));
        txtPassword.setText(viewableData.person.getPassword());
        txtSex.setText(viewableData.person.getSex());
        txtPersonName.setText(viewableData.person.getPersonName());
        txtAge.setText(String.valueOf(viewableData.person.getAge()));
           }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(User.getPersonType()=="sysadmin"){
        int selectedRowIndex=PatientTable.getSelectedRow();
        System.out.println(selectedRowIndex);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to delete.");
            return;
        }
 Patient d= storageOfPatients.getInformation().get(selectedRowIndex);
         for(Person p: storageOfPersons.getInformation()){
            if(p.getPersonID()==d.person.getPersonID()){
                storageOfPersons.deletePerson(p);
            }
        }

         storageOfPatients.deletePatient(selectedRowIndex);
         JOptionPane.showMessageDialog(this,"Patient Deleted");
         populateTable();}
        else{
          JOptionPane.showMessageDialog(this,"you dont have access to this function");  
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

  private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) PatientTable.getModel();
        model.setRowCount(0);
        for(Patient ed : storageOfPatients.getInformation()){
            Object[] row = new Object[11];
            row[0]=ed.person.getPersonID();
            row[1]=ed.person.getPersonName();
            row[2]=ed.person.getPassword();
            row[3]=ed.person.getAge();
            
            row[4]=ed.person.getSex();
            row[5]=ed.person.getHouse().getHouseID();
            model.addRow(row);
        }
        
    }
  private void populateTableForPatient(){
        DefaultTableModel model=(DefaultTableModel) PatientTable.getModel();
        model.setRowCount(0);
            Object[] row = new Object[11];
            row[0]=User.getPersonID();
            row[1]=User.getPersonName();
            row[2]=User.getPassword();
            row[3]=User.getAge();
            
            row[4]=User.getSex();
            row[5]=User.getHouse().getHouseID();
            model.addRow(row);
        
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
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientTable;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnldUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHouseID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPersonID;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtSex;
    // End of variables declaration//GEN-END:variables
}
