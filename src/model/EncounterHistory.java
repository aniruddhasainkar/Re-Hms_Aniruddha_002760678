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
public class EncounterHistory {
    ArrayList collectionOfEncounter=new ArrayList<Encounter>();
     public EncounterHistory(){
         collectionOfEncounter=new ArrayList<Encounter>();
     }
       public ArrayList<Encounter> getInformation() {
        return collectionOfEncounter;
    }

    public void setData(ArrayList<Encounter> collectionOfEncounter) {
        this.collectionOfEncounter = collectionOfEncounter;
    }
    public Encounter addNewEncounter(){
        Encounter newEncounter =new Encounter();
        collectionOfEncounter .add(newEncounter);
        return newEncounter;
    }
    public void deleteEncounter(int ed){
       collectionOfEncounter .remove(ed); 
    }
    
}
