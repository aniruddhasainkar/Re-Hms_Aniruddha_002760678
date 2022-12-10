/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author aniruddhasainkar
 */
public class Community {
    private long commID;
    private long cityID;
    private String communityName;
    public ArrayList<House> housesInCommunity;

    public long getCommunityID() {
        return commID;
    }

    public void setCommunityID(long communityID) {
        this.commID = communityID;
    }

    public long getCityID() {
        return cityID;
    }

    public void setCityID(long cityID) {
        this.cityID = cityID;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHousesInCommunity() {
        return housesInCommunity;
    }

    public void setHousesInCommunity(ArrayList<House> housesInCommunity) {
        this.housesInCommunity = housesInCommunity;
    }
    public Community(long communityID, long cityID, String communityName) {
        this.commID = communityID;
        this.cityID = cityID;
        this.communityName = communityName;
        housesInCommunity = new ArrayList<House>();
    }

    public Community() {
        housesInCommunity = new ArrayList<House>();
    }
    
    
}
