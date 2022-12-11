/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aniruddhasainkar
 */
public class Encounter {
    private VitalSigns VitalSigns;
    private long encounterID;
    private String diagnosis;
    private long PatientID;
    private long DoctorID;
    private String diagnosisStatus;

    public VitalSigns getVitalSigns() {
        return VitalSigns;
    }

    public void setVitalSigns(VitalSigns VitalSigns) {
        this.VitalSigns = VitalSigns;
    }

    public long getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(long encounterID) {
        this.encounterID = encounterID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public long getPatientID() {
        return PatientID;
    }

    public void setPatientID(long PatientID) {
        this.PatientID = PatientID;
    }

    public long getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(long DoctorID) {
        this.DoctorID = DoctorID;
    }

    public String getDiagnosisStatus() {
        return diagnosisStatus;
    }

    public void setDiagnosisStatus(String diagnosisStatus) {
        this.diagnosisStatus = diagnosisStatus;
    }
    public Encounter() {
    }
    public Encounter(VitalSigns VitalSigns, String diagnosis, long DoctorID, long PatientID) {
        this.VitalSigns = VitalSigns;
        this.diagnosis = diagnosis;
        this.DoctorID = DoctorID;
        this.PatientID = PatientID;
    }

    
}
