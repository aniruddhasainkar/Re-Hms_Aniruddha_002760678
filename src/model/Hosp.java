/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aniruddhasainkar
 */
public class Hosp {
    private long hospID;
    private String hospName;
    private long CommID;
    private String hospAddress;

    public long getHospID() {
        return hospID;
    }

    public void setHospID(long hospID) {
        this.hospID = hospID;
    }

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public long getCommID() {
        return CommID;
    }

    public void setCommID(long CommID) {
        this.CommID = CommID;
    }

    public String getHospAddress() {
        return hospAddress;
    }

    public void setHospAddress(String hospAddress) {
        this.hospAddress = hospAddress;
    }
    public Hosp(long hospID, String hospName, long CommID, String hospAddress) {
        this.hospID = hospID;
        this.hospName = hospName;
        this.CommID = CommID;
        this.hospAddress = hospAddress;
    }

    @Override
    public String toString() {
        return "Hosp{" + "hospID=" + hospID + ", hospName=" + hospName + ", CommID=" + CommID + ", hospAddress=" + hospAddress + '}';
    }
    
}
