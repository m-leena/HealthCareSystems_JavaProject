/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodBankStores;

import Business.LabTestList.LabTest;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class BloodDirectory {
        private ArrayList<Blood> bloodDir;
    
    public BloodDirectory()
    {
    bloodDir= new ArrayList<>();
    }

    public ArrayList<Blood> getBloodDir() {
        return bloodDir;
    }

    public void setBloodDir(ArrayList<Blood> bloodDir) {
        this.bloodDir = bloodDir;
    }
    
    public Blood addBlood(Blood.BloodType type) {
       Blood blood = new Blood(type);
        bloodDir.add(blood);
        return blood;
    }
}
