/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.Doctor;
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
public class DoctorFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorFrame
     */
          CityDirectory storageOfCities;
    PersonDirectory storageOfPersons;
    PatientDirectory storageOfPatients;
    DoctorDirectory storageOfDoctors;
    HospitalDirectory storageOfHospitals;
    EncounterHistory storageofEncounters;
    Person User;
    public DoctorFrame() {
        initComponents();
    }
      public DoctorFrame(CityDirectory storageOfCities,
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
        populateTable();
        addVerifiers();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
       private void addVerifiers() {
             InputVerifier integerVerifier = new MyNumericVerifier();
        InputVerifier stringVerifier = new MyStringVerifier();
  txtAge.setInputVerifier(integerVerifier);
    txtCommunityID.setInputVerifier(integerVerifier);
    txtDoctorID.setInputVerifier(integerVerifier);
    txtDoctorName.setInputVerifier(stringVerifier);
    txtHospitalID.setInputVerifier(integerVerifier);
    txtHouseID.setInputVerifier(integerVerifier);
     txtPassword.setInputVerifier(stringVerifier);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        txtHospitalID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHouseID = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnLoadUpdate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtSex = new javax.swing.JTextField();
        txtCommunityID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DoctorID", "Doctor Name", "Community ID", "HospitalID"
            }
        ));
        jScrollPane1.setViewportView(DoctorTable);

        jLabel1.setText("DoctorID");

        jLabel2.setText("DoctorName");

        jLabel3.setText("HospitalID");

        txtDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIDActionPerformed(evt);
            }
        });

        txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorNameActionPerformed(evt);
            }
        });

        txtHospitalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalIDActionPerformed(evt);
            }
        });

        jLabel4.setText("House ID");

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

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnLoadUpdate.setText("Load to update");
        btnLoadUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadUpdateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search by communityID");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setText("password");

        jLabel7.setText("Age");

        jLabel8.setText("Sex");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Community ID");

        jButton1.setText("End search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoadUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(521, 696, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHospitalID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHouseID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSex, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDoctorID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCommunityID)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)))
                    .addComponent(txtCommunityID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHouseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnView)
                    .addComponent(btnLoadUpdate)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(26, 26, 26))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIDActionPerformed

    private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorNameActionPerformed

    private void txtHospitalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalIDActionPerformed

    private void txtHouseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseIDActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        // TODO add your handling code here:
        //populateTable();
         if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"you do not have access to this");
            return;
        }
        int selectedRowIndex=DoctorTable.getSelectedRow();
        System.out.println(selectedRowIndex);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
         Doctor viewableData=storageOfDoctors.getInformation().get(selectedRowIndex);
         txtHouseID.setText(String.valueOf(viewableData.person.getHouse().getHouseID()));
        txtDoctorID.setText(String.valueOf(viewableData.person.getPersonID()));
        txtPassword.setText(viewableData.person.getPassword());
        txtSex.setText(viewableData.person.getSex());
        txtDoctorName.setText(viewableData.person.getPersonName());
        txtAge.setText(String.valueOf(viewableData.person.getAge()));
        txtHospitalID.setText(String.valueOf(viewableData.getHospitalID()));
        
    }//GEN-LAST:event_btnViewActionPerformed
        int RowIndex=-1;
    private void btnLoadUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadUpdateActionPerformed
        // TODO add your handling code here:
        //populateTable();
         if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"you do not have access to this");
            return;
        }
        RowIndex=DoctorTable.getSelectedRow();
        
        System.out.println(RowIndex);
        if(RowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
         Doctor viewableData=storageOfDoctors.getInformation().get(RowIndex);
         txtHouseID.setText(String.valueOf(viewableData.person.getHouse().getHouseID()));
        txtDoctorID.setText(String.valueOf(viewableData.person.getPersonID()));
        txtPassword.setText(viewableData.person.getPassword());
        txtSex.setText(viewableData.person.getSex());
        txtDoctorName.setText(viewableData.person.getPersonName());
        txtAge.setText(String.valueOf(viewableData.person.getAge()));
        txtHospitalID.setText(String.valueOf(viewableData.getHospitalID()));
    }//GEN-LAST:event_btnLoadUpdateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //populateTable();
        
         if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"you do not have access to this");
            return;
        }
     if(txtHouseID.getText().equals("")||txtHospitalID.getText().equals("")||txtDoctorID.getText().equals("")||txtPassword.getText().equals("")|| txtSex.getText().equals("")|| txtDoctorName.getText().equals("")|| txtAge.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
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
        long personID = Long.valueOf(txtDoctorID.getText());
        String password=txtPassword.getText();
        String sex=txtSex.getText();
        String doctorName=txtDoctorName.getText();
        int age=Integer.parseInt(txtAge.getText());
        Doctor d=storageOfDoctors.getInformation().get(RowIndex);
        d.person.setAge(age);
        if(house!=null)d.person.setHouse(house);
        d.person.setPassword(password);
        d.person.setPersonName(doctorName);
        d.person.setSex(sex);
        d.person.setPersonType("doctor");
        JOptionPane.showMessageDialog(this,"updated but the Doctor ID's are not changeable");
        populateTable();
        RowIndex=-1;
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //populateTable();
        if(User.getPersonType()=="sysadmin"){
        int selectedRowIndex=DoctorTable.getSelectedRow();
        System.out.println(selectedRowIndex);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to delete.");
            return;
        }
        Doctor d= storageOfDoctors.getInformation().get(selectedRowIndex);
        long doctorID=d.person.getPersonID();
        storageOfDoctors.deleteDoctor(selectedRowIndex);
        for(Person p: storageOfPersons.getInformation()){
            if(p.getPersonID()==doctorID){
                storageOfPersons.deletePerson(p);
            }
        }
         
         JOptionPane.showMessageDialog(this,"Doctor Deleted");
         populateTable();}
        else{
            JOptionPane.showMessageDialog(this,"you do not have access to this function");
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        //populateTable();
        if(User.getPersonType()=="patient"){
        DefaultTableModel model=(DefaultTableModel) DoctorTable.getModel();
        model.setRowCount(0);
        long CommunityID = Long.valueOf(txtCommunityID.getText());
        ArrayList<Doctor> doctorInCommunity=new ArrayList<>();
        for(Doctor d: storageOfDoctors.getInformation()){  
            
           if(d.getCommunityID()==CommunityID){ 
               
               doctorInCommunity.add(d);
               
           }
           
        }
        
         for(Doctor ed : doctorInCommunity){
             
            Object[] row = new Object[11];
            
            row[0]=ed.person.getPersonID();
            
            row[1]=ed.person.getPersonName();
            
            row[2]=ed.getCommunityID();
            
            row[3]=ed.getHospitalID(); 
            
            model.addRow(row);
            
        }
         
        }
        else{
             JOptionPane.showMessageDialog(this,"you do not have access to this");
            return;
        }
         
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //populateTable();
       
        if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"you do not have access to this");
            return;
        }
          if(txtHouseID.getText().equals("")||txtHospitalID.getText().equals("")||txtDoctorID.getText().equals("")||txtPassword.getText().equals("")|| txtSex.getText().equals("")|| txtDoctorName.getText().equals("")|| txtAge.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
        long houseID=Long.valueOf(txtHouseID.getText());
        long hospitalID=Long.valueOf(txtHospitalID.getText());
        long personID=Long.valueOf(txtDoctorID.getText());
        String password=txtPassword.getText();
        String sex=txtSex.getText();
        String personName=txtDoctorName.getText();
        int age=Integer.parseInt(txtAge.getText());
        
        boolean flag=false;
        for(Doctor p : storageOfDoctors.getInformation()){
            if(personID==p.person.getPersonID()){
                flag=true;
                JOptionPane.showMessageDialog(this,"DoctorID is not unique");
                return;
            }
        }
         for(Person p : storageOfPersons.getInformation()){
            if(personID==p.getPersonID()){
                JOptionPane.showMessageDialog(this,"DoctorID is not unique and might be matching with some other User type");
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
        boolean flag3=false;
        long CommunityID = 0;
        for(Hospital h: storageOfHospitals.getInformation()){
            if(h.getHospitalID()==hospitalID){
                flag3=true;
                CommunityID=h.getCommunityID();
            }
        }
        
        if(flag3==false){
             JOptionPane.showMessageDialog(this,"HospitalID is not existing rn");
            return;
        }
        if(flag2==false){
            JOptionPane.showMessageDialog(this,"HouseID is not existing rn");
            return;
        }
        if(flag==false && flag2==true && flag3==true){
        Person p=storageOfPersons.addNewPerson();
        p.setAge(age);
        p.setHouse(house);
        p.setPassword(password);
        p.setPersonID(personID);
        p.setPersonName(personName);
        p.setSex(sex);
        p.setPersonType("doctor");
        Doctor d=new Doctor(p,hospitalID,CommunityID);
        storageOfDoctors.collectionOfDoctor.add(d);
        System.out.println(d);
        JOptionPane.showMessageDialog(this,"new doctor data added.");
        }
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

      private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) DoctorTable.getModel();
        model.setRowCount(0);
        for(Doctor ed : storageOfDoctors.getInformation()){
            Object[] row = new Object[11];
            row[0]=ed.person.getPersonID();
            row[1]=ed.person.getPersonName();
            row[2]=ed.getCommunityID();
            row[3]=ed.getHospitalID();
            model.addRow(row);
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
            java.util.logging.Logger.getLogger(DoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoadUpdate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCommunityID;
    private javax.swing.JTextField txtDoctorID;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtHospitalID;
    private javax.swing.JTextField txtHouseID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSex;
    // End of variables declaration//GEN-END:variables
}
