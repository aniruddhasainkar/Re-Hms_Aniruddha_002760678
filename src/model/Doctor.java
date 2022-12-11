/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aniruddhasainkar
 */
public class Doctor {
    public Person person;
    private long HospitalID;
    private long CommID;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getHospitalID() {
        return HospitalID;
    }

    public void setHospitalID(long HospitalID) {
        this.HospitalID = HospitalID;
    }

    public long getCommID() {
        return CommID;
    }

    public void setCommID(long CommID) {
        this.CommID = CommID;
    }
    public Doctor(Person person, long HospitalID, long CommID) {
        this.person = person;
        this.HospitalID = HospitalID;
        this.CommID = CommID;
    }
    public Doctor(Person person, long HospitalID) {
        this.person = person;
        this.HospitalID = HospitalID;
    }
    
    
}
