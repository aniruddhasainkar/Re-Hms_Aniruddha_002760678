/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityDirectory;
import model.Community;
import model.Doctor;
import model.DoctorDirectory;
import model.Encounter;
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
import model.VitalSigns;

/**
 *

 */
public class EncounterFrame extends javax.swing.JFrame {

    /**
     * Creates new form EncounterFrame
     */
    CityDirectory storageOfCities;
    PersonDirectory storageOfPersons;
    PatientDirectory storageOfPatients;
    DoctorDirectory storageOfDoctors;
    HospitalDirectory storageOfHospitals;
    EncounterHistory storageofEncounters;
    Person User;
    public EncounterFrame() {
        initComponents();
    }
     public EncounterFrame(CityDirectory storageOfCities,
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
        if(User.getPersonType()=="patient"){
            populateTableForPatient();
        }
        else {populateTable();}
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
      private void addVerifiers() {
            InputVerifier integerVerifier = new MyNumericVerifier();
     
        InputVerifier stringVerifier = new MyStringVerifier();
    txtBloodPressure.setInputVerifier(integerVerifier);
     txtDiagnosis.setInputVerifier(stringVerifier);
   txtDoctorID.setInputVerifier(integerVerifier);
  txtEncounterID.setInputVerifier(integerVerifier);
   txtHeartRate.setInputVerifier(integerVerifier);
    txtPatientID.setInputVerifier(integerVerifier);
    txtResp.setInputVerifier(integerVerifier);
    txtStatus.setInputVerifier(stringVerifier);
    txtWeight.setInputVerifier(integerVerifier);
      
  
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
        EncounterTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        txtResp = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtDoctorID = new javax.swing.JTextField();
        txtDiagnosis = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnLoadUpdate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnBookApp = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEncounterID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EncounterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "VitalSigns", "Diagnosis", "PatientID", "DoctorID", "Diagnosis Status", "EncounterID"
            }
        ));
        jScrollPane1.setViewportView(EncounterTable);

        jLabel1.setText("respiratory Rate");

        jLabel2.setText("heart rate");

        jLabel3.setText("bloodpressure");

        jLabel4.setText("Weight");

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        jLabel5.setText("PatientID");

        jLabel6.setText("DoctorID");

        jLabel7.setText("Diagnosis");

        jLabel8.setText(" Status");

        txtDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIDActionPerformed(evt);
            }
        });

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnLoadUpdate.setText("Load to Update");
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

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnBookApp.setText("Book Appointment");
        btnBookApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel10.setText("EncounterID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(41, 41, 41)
                                .addComponent(txtDoctorID))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)
                                .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStatus)
                                    .addComponent(txtDiagnosis)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEncounterID)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtResp)
                            .addComponent(txtHeartRate)
                            .addComponent(txtBloodPressure)
                            .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoadUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBookApp)
                        .addGap(140, 140, 140))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8)
                                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEncounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnLoadUpdate)
                    .addComponent(btnUpdate)
                    .addComponent(btnView)
                    .addComponent(btnBookApp)
                    .addComponent(btnDelete))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIDActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"patient cannot access"); 
            return;
        }
        if(txtBloodPressure.getText().equals("")||
     txtDiagnosis.getText().equals("")||
   txtDoctorID.getText().equals("")||
  txtEncounterID.getText().equals("")||
   txtHeartRate.getText().equals("")||
    txtPatientID.getText().equals("")||
    txtResp.getText().equals("")||
    txtStatus.getText().equals("")||
    txtWeight.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
        long patientID=Long.valueOf(txtPatientID.getText());
        long doctorID=Long.valueOf(txtDoctorID.getText());
        long EncounterID=Long.valueOf(txtEncounterID.getText());
        int respiratoryRate=Integer.parseInt(txtResp.getText());
        int heartRate=Integer.parseInt(txtHeartRate.getText());
        int bloodPressure=Integer.parseInt(txtBloodPressure.getText());
        int weight=Integer.parseInt(txtWeight.getText());
        String Diagnosis=txtDiagnosis.getText();
        String DiosgnosisStatus=txtStatus.getText();
         boolean flag1=false;
        boolean flag2=false;
         for(Encounter g : storageofEncounters.getInformation()){
        
            if(g.getEncounterID()==EncounterID){
            
                JOptionPane.showMessageDialog(this,"EncounterID already exists");
                return;
            }
        }
        for(Patient p : storageOfPatients.getInformation()){
            if(p.getPatientID()==patientID){
                flag1=true;
            }
        }
        for(Doctor d : storageOfDoctors.getInformation()){
            if(d.person.getPersonID()==doctorID){
                flag2=true;
            }
        }
        
        if(flag1==false){
            JOptionPane.showMessageDialog(this,"patientID does not exist");
            return;
        }
        if(flag2==false){
            JOptionPane.showMessageDialog(this,"doctorID does not exist");
            return;
        }
        VitalSigns v=new VitalSigns();
        Encounter e =storageofEncounters.addNewEncounter();
       
        e.setVitalSigns(v);
        e.setEncounterID(EncounterID);
        e.setPatientID(patientID);
        e.setDoctorID(doctorID);
        e.setDiagnosis(Diagnosis);
        e.setDiagnosisStatus(DiosgnosisStatus);
        v.setBloodPressure(bloodPressure);
        v.setHeartRate(heartRate);
        v.setPatientID(patientID);
        v.setRespiratoryRate(respiratoryRate);
        v.setWeight(weight);
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed
int selectedRowIndex=0;
    private void btnLoadUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadUpdateActionPerformed
        // TODO add your handling code here:
        if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"patient cannot access"); 
            return;
        }
        selectedRowIndex=EncounterTable.getSelectedRow();
        System.out.println(selectedRowIndex);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
        Encounter viewableData=storageofEncounters.getInformation().get(selectedRowIndex);
        txtPatientID.setText(String.valueOf(viewableData.getPatientID()));
        txtDoctorID.setText(String.valueOf(viewableData.getDoctorID()));
        txtResp.setText(String.valueOf(viewableData.getVitalSigns().getRespiratoryRate()));
        txtHeartRate.setText(String.valueOf(viewableData.getVitalSigns().getHeartRate()));
        txtBloodPressure.setText(String.valueOf(viewableData.getVitalSigns().getBloodPressure()));
        txtWeight.setText(String.valueOf(viewableData.getVitalSigns().getWeight()));
        txtDiagnosis.setText(viewableData.getDiagnosis());
        txtStatus.setText(viewableData.getDiagnosisStatus());
        txtEncounterID.setText(String.valueOf(viewableData.getEncounterID()));

    }//GEN-LAST:event_btnLoadUpdateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"patient cannot access"); 
            return;
        }
        if(txtBloodPressure.getText().equals("")||
     txtDiagnosis.getText().equals("")||
   txtDoctorID.getText().equals("")||
  txtEncounterID.getText().equals("")||
   txtHeartRate.getText().equals("")||
    txtPatientID.getText().equals("")||
    txtResp.getText().equals("")||
    txtStatus.getText().equals("")||
    txtWeight.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
        populateTable();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please load data to be updated");
            return;
        }
        Encounter e=storageofEncounters.getInformation().get(selectedRowIndex);
        long patientID=Long.valueOf(txtPatientID.getText());
        long encounterID=Long.valueOf(txtEncounterID.getText());
        long doctorID=Long.valueOf(txtDoctorID.getText());
        int respiratoryRate=Integer.parseInt(txtResp.getText());
        int heartRate=Integer.parseInt(txtHeartRate.getText());
        int bloodPressure=Integer.parseInt(txtBloodPressure.getText());
        int weight=Integer.parseInt(txtWeight.getText());
        String Diagnosis=txtDiagnosis.getText();
        String DiagnosisStatus=txtStatus.getText();
        VitalSigns v=e.getVitalSigns();
        boolean flag1=false;
        boolean flag2=false;
  
        for(Patient p : storageOfPatients.getInformation()){
            if(p.getPatientID()==patientID){
                flag1=true;
            }
        }
        for(Doctor d : storageOfDoctors.getInformation()){
            if(d.person.getPersonID()==doctorID){
                flag2=true;
            }
        }
        
        if(flag1==false){
            JOptionPane.showMessageDialog(this,"patientID does not exist");
            return;
        }
        if(flag2==false){
            JOptionPane.showMessageDialog(this,"doctorID does not exist");
            return;
        }
        e.setPatientID(patientID);
        e.setDoctorID(doctorID);
        e.setDiagnosis(Diagnosis);
        e.setEncounterID(encounterID);
        e.setDiagnosisStatus(DiagnosisStatus);
        v.setBloodPressure(bloodPressure);
        v.setHeartRate(heartRate);
        v.setPatientID(patientID);
        v.setRespiratoryRate(respiratoryRate);
        v.setWeight(weight);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"this button is for different type of user you can view data in the table");
            return;
        }
        selectedRowIndex=EncounterTable.getSelectedRow();
        System.out.println(selectedRowIndex);
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to view.");
            return;
        }
        Encounter viewableData=storageofEncounters.getInformation().get(selectedRowIndex);
        txtPatientID.setText(String.valueOf(viewableData.getPatientID()));
        txtDoctorID.setText(String.valueOf(viewableData.getDoctorID()));
        txtResp.setText(String.valueOf(viewableData.getVitalSigns().getRespiratoryRate()));
        txtHeartRate.setText(String.valueOf(viewableData.getVitalSigns().getHeartRate()));
        txtBloodPressure.setText(String.valueOf(viewableData.getVitalSigns().getBloodPressure()));
        txtWeight.setText(String.valueOf(viewableData.getVitalSigns().getWeight()));
        txtDiagnosis.setText(viewableData.getDiagnosis());
        txtStatus.setText(viewableData.getDiagnosisStatus());
        txtEncounterID.setText(String.valueOf(viewableData.getEncounterID()));
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(User.getPersonType()=="patient"){
            JOptionPane.showMessageDialog(this,"you dont have access to this function");
            return;
        }
        if(User.getPersonType()=="sysadmin"){
        int RowIndex=EncounterTable.getSelectedRow();
        System.out.println(RowIndex);
        if(RowIndex<0){
            JOptionPane.showMessageDialog(this,"please select a row to delete.");
            return;
        }
         storageofEncounters.deleteEncounter(RowIndex);
         JOptionPane.showMessageDialog(this,"Encounter Deleted");
         populateTable();}
        else{
            JOptionPane.showMessageDialog(this,"you dont have access to this function");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBookAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppActionPerformed
        // TODO add your handling code here:
        if(User.getPersonType()=="patient"){
            if(txtBloodPressure.getText().equals("")||
   txtDoctorID.getText().equals("")||
  txtEncounterID.getText().equals("")||
   txtHeartRate.getText().equals("")||
    txtPatientID.getText().equals("")||
    txtResp.getText().equals("")||
    txtWeight.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Some the data provided is null"); 
           return;
        }
        txtPatientID.setText(String.valueOf(User.getPersonID()));
        long patientID=User.getPersonID();
        long doctorID=Long.valueOf(txtDoctorID.getText());
        int respiratoryRate=Integer.parseInt(txtResp.getText());
        int heartRate=Integer.parseInt(txtHeartRate.getText());
        int bloodPressure=Integer.parseInt(txtBloodPressure.getText());
        int weight=Integer.parseInt(txtWeight.getText());
        String Diagnosis=txtDiagnosis.getText();
        String DiagnosisStatus=txtStatus.getText();
        long encounterID=Long.valueOf(txtEncounterID.getText());

        boolean flag1=false;
        boolean flag2=false;
        for(Encounter g : storageofEncounters.getInformation()){
        
            if(g.getEncounterID()==encounterID){
            
                JOptionPane.showMessageDialog(this,"EncounterID already exists");
                return;
            }
        }
        for(Patient p : storageOfPatients.getInformation()){
            if(p.getPatientID()==patientID){
                flag1=true;
            }
        }
        for(Doctor d : storageOfDoctors.getInformation()){
            if(d.person.getPersonID()==doctorID){
                flag2=true;
            }
        }
        if(flag1==false){
            JOptionPane.showMessageDialog(this,"patientID does not exist");
            return;
        }
        if(flag2==false){
            JOptionPane.showMessageDialog(this,"doctorID does not exist");
            return;
        }
        VitalSigns v=new VitalSigns();
        Encounter e =storageofEncounters.addNewEncounter();
        e.setVitalSigns(v);
        e.setPatientID(patientID);
        e.setDoctorID(doctorID);
        e.setDiagnosis("");
        e.setDiagnosisStatus("");
        v.setBloodPressure(bloodPressure);
        v.setHeartRate(heartRate);
        v.setPatientID(patientID);
        v.setRespiratoryRate(respiratoryRate);
        v.setWeight(weight);
        populateTableForPatient();

        }
        else{
            JOptionPane.showMessageDialog(this,"you do not have access to this");
            return;
        }
    }//GEN-LAST:event_btnBookAppActionPerformed

     private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) EncounterTable.getModel();
        model.setRowCount(0);
        for(Encounter ed : storageofEncounters.getInformation()){
            Object[] row = new Object[11];
            row[0]=ed.getVitalSigns();
            row[1]=ed.getDiagnosis();
            row[2]=ed.getPatientID();
            row[3]=ed.getDoctorID();
            row[4]=ed.getDiagnosisStatus();
            row[5]=ed.getEncounterID();
            model.addRow(row);
        }
     }
          private void populateTableForPatient() {
        DefaultTableModel model=(DefaultTableModel) EncounterTable.getModel();
        model.setRowCount(0);
        ArrayList<Encounter> pe=new ArrayList<>();
        for(Encounter ed : storageofEncounters.getInformation()){
            if(ed.getPatientID()==User.getPersonID()){
                pe.add(ed);
            }
        }
        for(Encounter ed : pe){
            Object[] row = new Object[11];
            row[0]=ed.getVitalSigns();
            row[1]=ed.getDiagnosis();
            row[2]=ed.getPatientID();
            row[3]=ed.getDoctorID();
            row[4]=ed.getDiagnosisStatus();
            row[5]=ed.getEncounterID();
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
            java.util.logging.Logger.getLogger(EncounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncounterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncounterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EncounterTable;
    private javax.swing.JButton btnBookApp;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLoadUpdate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDiagnosis;
    private javax.swing.JTextField txtDoctorID;
    private javax.swing.JTextField txtEncounterID;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtResp;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
