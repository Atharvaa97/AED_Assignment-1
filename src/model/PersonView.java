/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Atharva
 */
public class PersonView {
    private ArrayList<Person> register;
    public PersonView(){
       this.register= new ArrayList<Person>(); 
    }

    public ArrayList<Person> getRegister() {
        return  register;
    }

    public void setRegister(ArrayList<Person> register) {
        this.register = register;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        register.add(newPerson);
        return newPerson;
    }
    
    public void deleteRegister(Person person){
        register.remove(person);
    }
    
}
