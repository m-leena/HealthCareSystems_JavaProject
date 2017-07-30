/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Department.Department;

/**
 *
 * @author khushbu
 */
public class Person {
    private  String name;
    private String emailID;
    private int phoneNumber;
    private int id;
    private static int count=0;
//    
//        public enum PersonType{
//
//        Patient("Patient"), 
//        Employee("Employee");
//
//        private String value;
//        private PersonType(String value) {
//            this.value = value;
//        }
//        public String getValue() {
//            return value;
//        }
//    }
    
    public Person(String name,String emailID,int phoneNumber)
    {
       this.name=name;
       this.emailID=emailID;
       this.phoneNumber=phoneNumber;
       id=++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name;
    }
  
  
}
