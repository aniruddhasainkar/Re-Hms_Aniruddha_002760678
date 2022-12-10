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
public class City {
    private long cityID;
    private String cityName;
    private String stateName;
    public ArrayList<Community> Communities;

    public long getCityID() {
        return cityID;
    }

    public void setCityID(long cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public ArrayList<Community> getCommunities() {
        return Communities;
    }

    public void setCommunities(ArrayList<Community> Communities) {
        this.Communities = Communities;
    }
    public City(long cityID, String cityName, String stateName) {
        Communities = new ArrayList<Community>();
        this.cityID = cityID;
        this.cityName = cityName;
        this.stateName = stateName;
    }

    public City() {
        Communities = new ArrayList<Community>();
    }
   
}
