/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTestWorkRequest;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class LabTestWorkQueue {

           private ArrayList<LabTestWorkRequest> workRequestList;

    public LabTestWorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<LabTestWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    

}
