/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author Atharva
 */
public class Doctor {
    public static int DOCTOR_ID = 0;
    public String name;
    public City city;
    public House address;
    public String hospitalname;
    public int doctorId;
    public String email;
    public int type;
    public String mobileNo;

    public Doctor() {
        city = new City();
    }

    public String validateName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "Name cannot be empty! \n";
        } else if (name.length() < 2 || name.length() > 20) {
            isValid = "Name must be atleast 2 characters and maximum 20 characters long! \n";
        } else if (!name.matches("[a-zA-Z ]{2,20}")) {
            isValid = "Invalid Name \n";
        } else if (name.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }

    public String validateHospitalName(String name) {
        String isValid = "";
        if (name.equals("")) {
            isValid = "Hospital Name cannot be empty! \n";
        } else if (name.length() < 5 || name.length() > 20) {
            isValid = "Hospital Name  must be atleast 5 characters and maximum 20 characters long! \n";
        } else if (!name.matches("[a-zA-Z0-9'\\.\\-\\s\\,]{10,100}")) {
            isValid = "Invalid Hospital Name Field! \n";
        } else if (name.equals("Enter here")) {
            isValid = "Invalid Hospital Name, please write again! \n";
        }
        return isValid;
    }
    
    public String validateEmail(String email) {
        String isValid = "";
        if (email.equals("")) {
            isValid = "Email cannot be empty! \n";
        } else if (!email.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")) {
            isValid = "Invalid Email ID! \n";
        } else if (email.equals("Enter here")) {
            isValid = "Invalid Name \n";
        }
        return isValid;
    }

    public String validateMobileNo(String value) {
        String isValid = "";
        String[] tempValue = value.split("-");
        System.out.println("tempValue" + tempValue);
        System.out.println("value" + value);
        String areaCode = null;
        String rand1 = null;
        String rand2 = null;
        try {
            areaCode = tempValue[0];
            rand1 = tempValue[1];
            rand2 = tempValue[2];
        } catch (Exception e) {
            isValid = "Invalid Mobile No. ! \n";
        }
        try {
            Integer.parseInt(areaCode);
            Integer.parseInt(rand1);
            Integer.parseInt(rand2);
            if (areaCode.length() != 3 || rand1.length() != 3 || rand2.length() != 4 || areaCode.equals("000") || rand1.equals("000")) {
                isValid = "Invalid Mobile No. ! \n";
            }
        } catch (NumberFormatException e) {
            isValid = "Invalid Mobile No. ! \n";
        }
        return isValid;
    }

}
