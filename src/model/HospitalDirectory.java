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
    public ArrayList<Hospital> collectionOfHospital;
     public HospitalDirectory(){
         collectionOfHospital=new ArrayList<Hospital>();
     }
      public ArrayList<Hospital> getInformation() {
        return collectionOfHospital;
    }


    public void setData(ArrayList<Hospital> collectionOfHosp) {
        this.collectionOfHospital = collectionOfHosp;
    }
    public Hospital addNewHospital(){
        Hospital newHos=new Hospital();
        collectionOfHospital.add(newHos);
        return newHos;
    }
    public void deleteHos(int ed){
       collectionOfHospital.remove(ed); 
    }
}
