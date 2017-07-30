/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.BloodBankStores.Blood;
import Business.BloodBankStores.Blood.BloodType;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class PatientDirectory {
      private ArrayList<Patient> patientDir;
            
    public PatientDirectory()
    {
    patientDir=new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(ArrayList<Patient> patientDir) {
        this.patientDir = patientDir;
    }
    
    public Patient AddPatient (String name,String emailID,int phoneNumber,String address,Date dateOfBirth,String gender,Blood.BloodType type,char underObservation)
    {
    Patient patient = new Patient(name,emailID,phoneNumber,address,dateOfBirth,gender,type,underObservation);
        patientDir.add(patient);
        return patient;
    }
    public void updatePatient(int id,char underObservation){
        for (Patient patient : patientDir) {
            if(patient.getId()==id){
               patient.setUnderObservation(underObservation);
            }
        }
    }
}
