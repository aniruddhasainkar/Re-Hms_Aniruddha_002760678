/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aniruddhasainkar
 */
public class Patient {
    private long patientID;
     public Person person;

    public long getPatientID() {
        return patientID;
    }

    public void setPatientID(long patientID) {
        this.patientID = patientID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person Person) {
        this.person = Person;
    }

    public Patient(long patientID, Person Person) {
        this.patientID = patientID;
        this.person = Person;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientID=" + patientID + ", person=" + person + '}';
    }

    public Patient() {
    }
    
}
