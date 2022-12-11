/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aniruddhasainkar
 */
public class House {
    private long HouseID;
    private String houseAddress;
    private long CommID;

    public long getHouseID() {
        return HouseID;
    }

    public void setHouseID(long HouseID) {
        this.HouseID = HouseID;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public long getCommID() {
        return CommID;
    }

    public void setCommID(long CommID) {
        this.CommID = CommID;
    }
     public House(long HouseID, String houseAddress, long CommunityID) {
        this.HouseID = HouseID;
        this.houseAddress = houseAddress;
        this.CommID = CommID;
    }
    public House(){
    
    }
}
