/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointments;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class Appointment {

    private Date startTime;
    private Date endTime;
    private UserAccount assignedTo;
    private UserAccount bookedBy;
    private Patient patient;
    private String status;
    private String vitalSignStatus;
    private String prescriptionStatus;
    private String labTestStatus;
    private int appointmentId;
    private static int count = 0;

    public Appointment() {
        appointmentId = ++count;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public UserAccount getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(UserAccount assignedTo) {
        this.assignedTo = assignedTo;
    }

    public UserAccount getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(UserAccount bookedBy) {
        this.bookedBy = bookedBy;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVitalSignStatus() {
        return vitalSignStatus;
    }

    public void setVitalSignStatus(String vitalSignStatus) {
        this.vitalSignStatus = vitalSignStatus;
    }

    public String getPrescriptionStatus() {
        return prescriptionStatus;
    }

    public void setPrescriptionStatus(String prescriptionStatus) {
        this.prescriptionStatus = prescriptionStatus;
    }

    public String getLabTestStatus() {
        return labTestStatus;
    }

    public void setLabTestStatus(String labTestStatus) {
        this.labTestStatus = labTestStatus;
    }

    @Override
    public String toString() {
        return String.valueOf(appointmentId);
    }

}
