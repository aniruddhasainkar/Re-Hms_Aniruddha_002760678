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
public class Doctordirect {
    public ArrayList collectionOfDoctor;
         public Doctordirect(){
         collectionOfDoctor=new ArrayList<Doctor>();
     }
       public ArrayList<Doctor> getInformation() {
        return collectionOfDoctor;
    }

    public void setData(ArrayList<Doctor> collectionOfDoctor) {
        this.collectionOfDoctor = collectionOfDoctor;
    }
    public Doctor addNewDoctor(){
        Doctor newDoctor =new Doctor();
        collectionOfDoctor .add(newDoctor);
        return newDoctor;
    }
    public void deleteDoctor(int ed){
       collectionOfDoctor .remove(ed); 
    }
      public void deleteDoctor(Doctor ed){
       collectionOfDoctor .remove(ed); 
    }
    
}
