/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Atharva
 */
public class User {
    public int uniqueIdentifier;
    public String type;
    public String name;
    public String email;
    private String password;

    /**
     * @return the uniqueIdentifier
     */
    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }


    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}