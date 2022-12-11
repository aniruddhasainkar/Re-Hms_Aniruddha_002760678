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
    private long CommunityID;

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

    public long getCommunityID() {
        return CommunityID;
    }

    public void setCommunityID(long CommunityID) {
        this.CommunityID = CommunityID;
    }
     public House(long HouseID, String houseAddress, long CommunityID) {
        this.HouseID = HouseID;
        this.houseAddress = houseAddress;
        this.CommunityID = CommunityID;
    }
    public House(){
    
    }
}
