/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aniruddhasainkar
 */
public class Hospital {
    private long hospitalID;
    private String hospitalName;
    private long CommunityID;
    private String hospitalAddress;

    public long getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(long hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public long getCommunityID() {
        return CommunityID;
    }

    public void setCommunityID(long CommunityID) {
        this.CommunityID = CommunityID;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }
    public Hospital(long hospitalID, String hospitalName, long CommunityID, String hospitalAddress) {
        this.hospitalID = hospitalID;
        this.hospitalName = hospitalName;
        this.CommunityID = CommunityID;
        this.hospitalAddress = hospitalAddress;
    }

    @Override
    public String toString() {
        return "Hospital{" + "hospitalID=" + hospitalID + ", hospitalName=" + hospitalName + ", CommunityID=" + CommunityID + ", hospitalAddress=" + hospitalAddress + '}';
    }
    public Hospital() {
    }
}
