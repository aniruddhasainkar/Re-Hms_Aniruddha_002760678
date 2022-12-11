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
public class CityDirectory {
   public ArrayList collectionOfCities;
     public CityDirectory(){
         collectionOfCities=new ArrayList<City>();
     }
       public ArrayList<City> getInformation() {
        return collectionOfCities;
    }

    public void setData(ArrayList<City> collectionOfCities) {
        this.collectionOfCities = collectionOfCities;
    }
    public City addNewCity(){
        City newCit=new City();
        collectionOfCities .add(newCit);
        return newCit;
    }
    public void deleteCity(int ed){
       collectionOfCities .remove(ed); 
    }
}
