/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Objects;
/**
 *
 * @author aniruddhasainkar
 */
public class Person {
    private String personName;
    private String password;
    private String personType;
    private int age;
    private String sex;
    private House house;
    private long personID;
    @Override
    public String toString() {
        return "Person{" + "personID=" + personID + ", personName=" + personName + ", password=" + password + ", personType=" + personType + ", age=" + age + ", sex=" + sex + ", house=" + house + '}';
    }

    public long getPersonID() {
        return personID;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    public Person(long personID, String personName, String password, String personType, int age, String sex, House house) {
        this.personID = personID;
        this.personName = personName;
        this.password = password;
        this.personType = personType;
        this.age = age;
        this.sex = sex;
        this.house = house;
    }

   public Person(){
       
   }
//name
    
}
