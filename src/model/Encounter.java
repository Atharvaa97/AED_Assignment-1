/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Atharva
 */
public class Encounter {

    public Date visitDate;
    public VitalSigns findings;

    public Encounter() {
        findings = new VitalSigns();
    }

    public String validateVisitDate(String date) {
        String isValid = "";
        DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormatter.setLenient(false);
            Date dob = dateFormatter.parse(date);
            if (dob.compareTo((new Date())) > 0) {
                isValid = "DOB cannot be more than today! \n";
            }
        } catch (ParseException e) {
            isValid = "Invalid DOB \n";
        }
        return isValid;
    }

    public String validate24HourTime(String fromValue, String type) {
        String isValid = "";
        if (fromValue.equals("")) {
            isValid = type + " time required!";
        } else if (!fromValue.matches("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$")) {
            isValid = "Invalid Visit time!";
        }
        return isValid;
    }
}

