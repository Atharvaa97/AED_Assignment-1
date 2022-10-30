/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Atharva 
 */
public class DoctorDetails {
    
    public String hospitalName;
    public City city;
    public Community community;
    public String specialization;
    public Integer totalExperience;

    public String validateName(String hospitaName) {
        String isValid = "";
        if (hospitaName.equals("")) {
            isValid = "Name cannot be empty! \n";
        } else if (hospitaName.length() < 2 || hospitaName.length() > 20) {
            isValid = "Name must be atleast 2 characters and maximum 20 characters long! \n";
        } else if (!hospitaName.matches("[a-zA-Z ]{2,20}")) {
            isValid = "Invalid Name \n";
        } else if (hospitaName.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    
    public String validateSpecialization(String specialization) {
        String isValid = "";
        if (specialization.equals("")) {
            isValid = "Name cannot be empty! \n";
        } else if (specialization.length() < 2 || specialization.length() > 20) {
            isValid = "Name must be atleast 2 characters and maximum 20 characters long! \n";
        } else if (!specialization.matches("[a-zA-Z ]{2,20}")) {
            isValid = "Invalid Name \n";
        } else if (specialization.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }
    
    public String validateAge(String value) {
        String isValid = "";
        try {
            int val = Integer.valueOf(value);
            if (val == 0) {
                isValid = "Age cannot be 0! \n";
            }
            if (val < 1 || val > 180) {
                isValid = "Age cannot be less than 1 or more than 180 \n";
            }
        } catch (NumberFormatException e) {
            isValid = "Age should be a number \n";
        }
        return isValid;
    }
    
    public String validateTotalExperience(String value) {
        String isValid = "";
        try {
            int val = Integer.valueOf(value);
            if (val == 0) {
                isValid = "Experience cannot be 0! \n";
            }
            if (val < 1 || val > 50) {
                isValid = "Experience cannot be less than 1 or more than 50 \n";
            }
        } catch (NumberFormatException e) {
            isValid = "Experience should be a number \n";
        }
        return isValid;
    }
}
            
    

