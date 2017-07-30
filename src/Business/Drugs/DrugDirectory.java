/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Drugs;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author khushbu
 */
public class DrugDirectory {
    private ArrayList<Drug> drugList;

    public DrugDirectory() {
        drugList = new ArrayList<Drug>();
    }

    public Drug addDrug() {
       Drug e = new Drug();
        drugList.add(e);
        return e;
    }

    public ArrayList<Drug> getDrugList(String s) {
        return drugList;
    }
   public ArrayList<Drug> getDrugList() {
        return drugList;
    }
    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }
}
