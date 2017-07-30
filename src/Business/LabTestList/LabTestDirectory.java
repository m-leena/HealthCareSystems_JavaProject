/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTestList;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class LabTestDirectory {
    private ArrayList<LabTest> labTestDir;
    
    public LabTestDirectory()
    {
    labTestDir= new ArrayList<>();
    }

    public ArrayList<LabTest> getLabTestDir() {
        return labTestDir;
    }

    public void setLabTestDir(ArrayList<LabTest> labTestListDir) {
        this.labTestDir = labTestListDir;
    }
    public LabTest addLabTest() {
       LabTest test = new LabTest();
        labTestDir.add(test);
        return test;
    }
    
}
