/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class Insurance {
    
    private int insuranceId;
    private static int count=0;
    private int covrage;
    private Date expiryDate;
    private UserAccount lastModifiedby;
    private Date lastModifiedDate;
    private Date createdDate;
    private UserAccount company;
    
    
    public Insurance()
    {
    insuranceId=++count;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Insurance.count = count;
    }

    public int getCovrage() {
        return covrage;
    }

    public void setCovrage(int covrage) {
        this.covrage = covrage;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public UserAccount getLastModifiedby() {
        return lastModifiedby;
    }

    public void setLastModifiedby(UserAccount lastModifiedby) {
        this.lastModifiedby = lastModifiedby;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public UserAccount getCompany() {
        return company;
    }

    public void setCompany(UserAccount company) {
        this.company = company;
    }
    
    
}
