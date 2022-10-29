/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Atharva
 */
public class Patient {
  public static int PATIENT_ID = 1000;

    public Person personDetails;
    public EncounterHistory allVisitsHistory;
    public VitalSigns vitalSigns;
    public int patientIdentifier;
    
    public Patient() {
        allVisitsHistory = new EncounterHistory();
    }

}
