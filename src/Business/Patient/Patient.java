/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.BloodBankStores.Blood.BloodType;
import Business.Insurance.Insurance;
import Business.Person.Person;
import Business.Prescription.PrescriptionDirectory;
import Business.Sensors.Sensor;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSignHistory;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class Patient extends Person implements Comparable<Patient>{
    
    private String address;
    private BloodType type;
    private Date dateOfBirth;
    private String gender;
    private char underObservation;
    private VitalSignHistory vitalSignHistory;
    private PrescriptionDirectory prescriptionDir;
    private Sensor sensor;
    private static int count=0;
    private Insurance insurance;
    private UserAccount sunderobservationby;
        private int normalCount;
    private int abnormalcount;
    
    public Patient(String name,String emailID,int phoneNumber,String address,Date dateOfBirth,String gender,BloodType type,char underObservation )
    {
    super(name,emailID,phoneNumber);
    this.address=address;
    this.dateOfBirth=dateOfBirth;
    this.gender=gender;
    vitalSignHistory=new VitalSignHistory();
    prescriptionDir=new PrescriptionDirectory();
//    sensor=new Sensor();
    this.underObservation=underObservation;
    this.type=type;
    this.insurance=new Insurance();
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public PrescriptionDirectory getPrescriptionDir() {
        return prescriptionDir;
    }

    public void setPrescriptionDir(PrescriptionDirectory prescriptionDir) {
        this.prescriptionDir = prescriptionDir;
    }

    public char getUnderObservation() {
        return underObservation;
    }

    public void setUnderObservation(char underObservation) {
        this.underObservation = underObservation;
    }

    public BloodType getType() {
        return type;
    }

//    public String getBloodGroup() {
//        return bloodGroup;
//    }
//
//    public void setBloodGroup(String bloodGroup) {
//        this.bloodGroup = bloodGroup;
    public void setType(BloodType type) {
        this.type = type;
    }

//    }
    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public UserAccount getSunderobservationby() {
        return sunderobservationby;
    }

    public void setSunderobservationby(UserAccount sunderobservationby) {
        this.sunderobservationby = sunderobservationby;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
        public int getNormalCount() {
        return normalCount;
    }

    public void setNormalCount(int normalCount) {
        this.normalCount = normalCount;
    }

    public int getAbnormalcount() {
        return abnormalcount;
    }

    public void setAbnormalcount(int abnormalcount) {
        this.abnormalcount = abnormalcount;
    }
    public int compareTo(Patient compareSalesPerson) {
	
		int compareQuantity = ((Patient) compareSalesPerson).getNormalCount(); 
		
		//ascending order
		return compareQuantity-this.getNormalCount();
 }
}
