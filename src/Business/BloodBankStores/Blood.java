/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBankStores;

import java.util.Date;

/**
 *
 * @author khushbu
 */
public class Blood {

    private int quantity;
    private Date CollectedOn;
    private BloodType bloodtype;

    public Blood(BloodType type) {
        this.bloodtype = type;
    }

    public enum BloodType {

        Apositive("A Positive"),
        Anegative("A Negative"),
        Bpositive("B Positive"),
        Bnegative("B Negative"),
        Opositive("O Positive"),
        Onegative("O Negative"),
        AB("AB");

        private String value;

        private BloodType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public BloodType getBloodtype() {
        return bloodtype;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCollectedOn() {
        return CollectedOn;
    }

    public void setCollectedOn(Date CollectedOn) {
        this.CollectedOn = CollectedOn;
    }

}
