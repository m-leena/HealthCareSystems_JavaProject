/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTestList;

/**
 *
 * @author khushbu
 */
public class LabTest implements Comparable<LabTest>{
    private String Name;
    private String Description;
    private int price;
    private int testcount;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTestcount() {
        return testcount;
    }

    public void setTestcount(int testcount) {
        this.testcount = testcount;
    }

    @Override
    public String toString() {
        return  Name;
    }
    
   @Override
    public int compareTo(LabTest o) {
        if(this.getTestcount()>o.getTestcount())
        {
            return -1;
        }
        else if(this.getTestcount()<o.getTestcount())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    } 
}
