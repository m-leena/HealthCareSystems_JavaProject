/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import Business.Drugs.Drug;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class Prescription {
    
    private Drug drug;
    private int dosage;
    private Date startDate;
    private Date endDate;
    private UserAccount prescribedBy; 


    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public UserAccount getPrescribedBy() {
        return prescribedBy;
    }

    public void setPrescribedBy(UserAccount prescribedBy) {
        this.prescribedBy = prescribedBy;
    }

    @Override
    public String toString() {
        return  drug.getDrugName();
    }


}
