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
public class HospitalDirectory {
    public ArrayList<Hospital> collectionOfHospitals;
     public HospitalDirectory(){
         collectionOfHospitals=new ArrayList<Hospital>();
     }
      public ArrayList<Hospital> getInformation() {
        return collectionOfHospitals;
    }


    public void setData(ArrayList<Hospital> collectionOfHospitals) {
        this.collectionOfHospitals = collectionOfHospitals;
    }
    public Hospital addNewHospital(){
        Hospital newHos=new Hospital();
        collectionOfHospitals.add(newHos);
        return newHos;
    }
    public void deleteHos(int ed){
       collectionOfHospitals.remove(ed); 
    }
    }
