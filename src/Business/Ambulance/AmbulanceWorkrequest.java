/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class AmbulanceWorkrequest {
     private Patient patient;
     private UserAccount sender;
     private UserAccount receiver;
     private String Status;
     private Date RequestDate;
     private Date ResolveDate;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(Date RequestDate) {
        this.RequestDate = RequestDate;
    }

    public Date getResolveDate() {
        return ResolveDate;
    }

    public void setResolveDate(Date ResolveDate) {
        this.ResolveDate = ResolveDate;
    }    

    @Override
    public String toString() {
        return  patient.getName();
    }
    
    
}
