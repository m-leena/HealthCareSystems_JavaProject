/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class PrescriptionDirectory {
    private ArrayList<Prescription> prescriptionDir;
    
    public PrescriptionDirectory()
            {
            prescriptionDir=new ArrayList<Prescription>();
            }

    public ArrayList<Prescription> getPrescriptionDir() {
        return prescriptionDir;
    }

    public void setPrescriptionDir(ArrayList<Prescription> prescriptionDir) {
        this.prescriptionDir = prescriptionDir;
    }
    
    
    public Prescription addPrescription()
    {
    Prescription p= new Prescription();
    prescriptionDir.add(p);
    return p;       
    }
}
