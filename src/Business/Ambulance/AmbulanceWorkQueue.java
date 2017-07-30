/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class AmbulanceWorkQueue {
        private ArrayList<AmbulanceWorkrequest> ambulanceWorkRequestDir;

    public AmbulanceWorkQueue() {
        ambulanceWorkRequestDir = new ArrayList<AmbulanceWorkrequest>();
    }

    public ArrayList<AmbulanceWorkrequest> getAmbulanceWorkRequestDir() {
        return ambulanceWorkRequestDir;
    }

    public void setAmbulanceWorkRequestDir(ArrayList<AmbulanceWorkrequest> ambulanceWorkRequestDir) {
        this.ambulanceWorkRequestDir = ambulanceWorkRequestDir;
    }


}
