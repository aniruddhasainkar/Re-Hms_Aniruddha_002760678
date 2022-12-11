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
public class HospDirectory {
    public ArrayList<Hosp> collectionOfHosp;
     public HospDirectory(){
         collectionOfHosp=new ArrayList<Hosp>();
     }
      public ArrayList<Hosp> getInformation() {
        return collectionOfHosp;
    }


    public void setData(ArrayList<Hosp> collectionOfHosp) {
        this.collectionOfHosp = collectionOfHosp;
    }
    public Hosp addNewHospital(){
        Hosp newHos=new Hosp();
        collectionOfHosp.add(newHos);
        return newHos;
    }
    public void deleteHos(int ed){
       collectionOfHosp.remove(ed); 
    }
}
