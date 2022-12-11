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
    private long CommunityID;

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
        return CommunityID;
    }

    public void setCommID(long CommID) {
        this.CommunityID = CommID;
    }
    public Doctor(Person person, long HospitalID, long CommunityID) {
        this.person = person;
        this.HospitalID = HospitalID;
        this.CommunityID = CommunityID;
    }
    public Doctor(Person person, long HospitalID) {
        this.person = person;
        this.HospitalID = HospitalID;
    }
    
    
}
