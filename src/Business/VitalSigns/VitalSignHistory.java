/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSigns;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignList;
    
    public VitalSignHistory()
    {
    vitalSignList =new ArrayList<>();
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
          public VitalSign addVitalSign()
    {
    VitalSign vitalsign=new VitalSign();
    vitalSignList.add(vitalsign);
    return vitalsign;
    } 
    
}
