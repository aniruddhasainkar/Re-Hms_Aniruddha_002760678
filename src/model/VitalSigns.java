/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author aniruddhasainkar
 */
public class VitalSigns {
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private int weight;
    private Date timestamp;
    private long PatientID;

    @Override
    public String toString() {
        return "VitalSigns{" + "respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", bloodPressure=" + bloodPressure + ", weight=" + weight + ", timestamp=" + timestamp + ", PatientID=" + PatientID + '}';
    }

    public VitalSigns(int respiratoryRate, int heartRate, int bloodPressure, int weight, Date timestamp, long PatientID) {
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weight = weight;
        this.timestamp = timestamp;
        this.PatientID = PatientID;
    }

    public VitalSigns() {
    }
    

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public long getPatientID() {
        return PatientID;
    }

    public void setPatientID(long PatientID) {
        this.PatientID = PatientID;
    }
    
}
