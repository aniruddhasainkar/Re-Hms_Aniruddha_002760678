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
public class PersonDirect {
    private ArrayList collectionOfPerson;
            public PersonDirect(){
         collectionOfPerson=new ArrayList<Person>();
         collectionOfPerson.add(new Person(1111,"sysadmin","admin@123","sysadmin",23,"Male",null));
         collectionOfPerson.add(new Person(1112,"hospitaladmin","admin@123","hospitaladmin",23,"Male",null));
         collectionOfPerson.add(new Person(1113,"communityadmin","admin@123","communityadmin",23,"Male",null));
     }
       public ArrayList<Person> getInformation() {
        return collectionOfPerson;
    }

    public void setData(ArrayList<Person> collectionOfPerson) {
        this.collectionOfPerson = collectionOfPerson;
    }
    public Person addNewPerson(){
        Person newPerson =new Person();
        collectionOfPerson.add(newPerson);
        return newPerson;
    }
    public void deletePerson(int ed){
       collectionOfPerson .remove(ed); 
    }
    public void deletePerson(Person p){
        collectionOfPerson.remove(p);
    }
    
}
