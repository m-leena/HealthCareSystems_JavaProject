/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Department.Department;
import Business.Person.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author khushbu
 */
public class Employee extends Person implements Comparable<Employee>{
    
    private Department department;
     private int appointmentcount;
     
    
    public Employee(String name,String emailID,int phoneNumber,Department department)
    {
    super(name,emailID,phoneNumber);
    this.department=department;
               
    }
    public Employee(String name,String emailID,int phoneNumber)
    {
    super(name,emailID,phoneNumber);            
    }
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    } 
     public int getAppointmentcount() {
        return appointmentcount;
    }

    public void setAppointmentcount(int appointmentcount) {
        this.appointmentcount = appointmentcount;
    }
  public int compareTo(Employee compareSalesPerson) {
	
		int compareQuantity = ((Employee) compareSalesPerson).getAppointmentcount(); 
		
		//ascending order
		return compareQuantity-this.getAppointmentcount();
 } 
}
