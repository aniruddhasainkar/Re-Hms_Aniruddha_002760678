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
public class PatientDirect {
    public ArrayList collectionOfPatient;
            public PatientDirect(){
         collectionOfPatient=new ArrayList<Patient>();
     }
       public ArrayList<Patient> getInformation() {
        return collectionOfPatient;
    }

    public void setData(ArrayList<Patient> collectionOfPatient) {
        this.collectionOfPatient = collectionOfPatient;
    }
    public Patient addNewPatient(){
        Patient newPatient =new Patient();
        collectionOfPatient.add(newPatient);
        return newPatient;
    }
    public void deletePatient(int ed){
       collectionOfPatient .remove(ed); 
    }
}
