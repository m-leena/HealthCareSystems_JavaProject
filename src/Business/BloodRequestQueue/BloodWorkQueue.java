/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodRequestQueue;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class BloodWorkQueue {
      private ArrayList<BloodWorkRequest> workRequestList;

    public BloodWorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<BloodWorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<BloodWorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    
}
