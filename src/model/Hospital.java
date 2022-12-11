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

    public long getHospID() {
        return hospitalID;
    }

    public void setHospID(long hospID) {
        this.hospitalID = hospID;
    }

    public String getHospName() {
        return hospitalName;
    }

    public void setHospName(String hospName) {
        this.hospitalName = hospName;
    }

    public long getCommID() {
        return CommunityID;
    }

    public void setCommID(long CommID) {
        this.CommunityID = CommID;
    }

    public String getHospAddress() {
        return hospitalAddress;
    }

    public void setHospAddress(String hospAddress) {
        this.hospitalAddress = hospAddress;
    }
    public Hospital(long hospID, String hospName, long CommID, String hospAddress) {
        this.hospitalID = hospID;
        this.hospitalName = hospName;
        this.CommunityID = CommID;
        this.hospitalAddress = hospAddress;
    }

    @Override
    public String toString() {
        return "Hosp{" + "hospID=" + hospitalID + ", hospName=" + hospitalName + ", CommID=" + CommunityID + ", hospAddress=" + hospitalAddress + '}';
    }
    
}
