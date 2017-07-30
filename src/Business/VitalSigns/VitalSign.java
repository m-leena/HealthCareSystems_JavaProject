/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class VitalSign {
    
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private int weight;
    private int bodyTemperature;
    private int bloodSugarLevel;
    private int rbcCount;
    private UserAccount checkedby;
    private Date createDttm;
    private Date updatedDttm;
    private int age;
    private String status;


    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }

    public Date getUpdatedDttm() {
        return updatedDttm;
    }

    public void setUpdatedDttm(Date updatedDttm) {
        this.updatedDttm = updatedDttm;
    }    

    public int getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(int bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public int getBloodSugarLevel() {
        return bloodSugarLevel;
    }

    public void setBloodSugarLevel(int bloodSugarLevel) {
        this.bloodSugarLevel = bloodSugarLevel;
    }  

    public UserAccount getCheckedby() {
        return checkedby;
    }

    public void setCheckedby(UserAccount checkedby) {
        this.checkedby = checkedby;
    }

    public int getRbcCount() {
        return rbcCount;
    }

    public void setRbcCount(int rbcCount) {
        this.rbcCount = rbcCount;
    }   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    } 

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
}
