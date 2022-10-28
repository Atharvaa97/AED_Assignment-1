/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Atharva
 */
public class Person {
    public String name;
    public long phoneNumber;
    public String gender;
    public int age;
    public String bloodgroup;
    public House address = new House();

    public Person() {
    }
    
    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person(String name, String phoneNumber, String gender, int age, String bloodgroup, int houseNumber, String community, String city, String state, int zip){
        this.name = name;
        this.phoneNumber = Long.parseLong(phoneNumber);
        this.gender = gender;
        this.age = age;
        this.bloodgroup = bloodgroup;
        this.address.houseNumber = houseNumber;
        this.address.communityName = community;
        this.address.cityName = city;
        this.address.state = state;
        this.address.zip = zip;
        
    }
    
}
