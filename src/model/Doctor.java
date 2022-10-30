/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Atharva
 */
public class Doctor extends Person {
    
    public static int DOCTOR_ID = 5000;
    
    public Person personDetails;
     public AppointmentHistory allAppointmentsHistory;
     public DoctorDetails doctorDetails;
     public int doctorIdentifier;
     
     public Doctor() {
         allAppointmentsHistory = new AppointmentHistory();
     
     
     }                  
              
}