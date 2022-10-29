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
public class City {
    public static String[] cityValues = {"Boston", "Washington DC", "Los Angeles", "Atlanta", "Chicago"};
    public static ArrayList<Community> allCities = new ArrayList<>();
    public String city;
    public String state;

    public String validateCity(String city) {
        String isValid = "";
        if (city.equals("")) {
            isValid = "City cannot be empty! \n";
        } else if (city.length() < 2 || city.length() > 30) {
            isValid = "City must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!city.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid City Field! \n";
        } else if (city.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }

    public String validateState(String state) {
        String isValid = "";
        if (state.equals("")) {
            isValid = "State cannot be empty! \n";
        } else if (state.length() < 2 || state.length() > 30) {
            isValid = "State must be atleast 2 characters and maximum 30 characters long! \n";
        } else if (!state.matches("[a-zA-Z ]{2,30}")) {
            isValid = "Invalid State Field! \n";
        } else if (state.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
}
