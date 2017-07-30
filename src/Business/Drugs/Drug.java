/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drugs;

import Business.LabTestList.LabTest;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class Drug implements Comparable<Drug> {
    private int drugId;
    private static int count=0;
    private String drugName;
    private String drugContents;
    private Date drugexpiryDate;
    private int drugCost;
    private int availableQuantity;
    private int getprescribedcount;
    
    public Drug()
    {
    drugId=++count;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDrugCost() {
        return drugCost;
    }

    public void setDrugCost(int drugCost) {
        this.drugCost = drugCost;
    }

    public String getDrugContents() {
        return drugContents;
    }

    public void setDrugContents(String drugContents) {
        this.drugContents = drugContents;
    }

    public Date getDrugexpiryDate() {
        return drugexpiryDate;
    }

    public void setDrugexpiryDate(Date drugexpiryDate) {
        this.drugexpiryDate = drugexpiryDate;
    }

    public int getGetprescribedcount() {
        return getprescribedcount;
    }

    public void setGetprescribedcount(int getprescribedcount) {
        this.getprescribedcount = getprescribedcount;
    }


    @Override
    public String toString() {
        return  drugName;
    }
    
    @Override
    public int compareTo(Drug o) {
        if(this.getGetprescribedcount()>o.getGetprescribedcount())
        {
            return -1;
        }
        else if(this.getGetprescribedcount()<o.getGetprescribedcount())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    } 
}
