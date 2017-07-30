/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Department.Department;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class EmployeeDirectory {
     private ArrayList<Employee> employeeList;
private Person person;
    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name,String emailID,int phoneNumber,Department deartment){
        Employee e = new Employee( name, emailID, phoneNumber, deartment);
        employeeList.add(e);
        return e;
    }
        public Employee createEmployee(String name,String emailID,int phoneNumber){
        Employee e = new Employee( name, emailID, phoneNumber);
        employeeList.add(e);
        return e;
    }
}
