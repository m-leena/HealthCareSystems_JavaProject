///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Business.Person;
//
//
//import Business.Department.Department;
//import Business.Employee.Employee;
//import Business.Patient.Patient;
//import Business.Person.Person.PersonType;
//
//import java.util.ArrayList;
//import java.util.Date;
//
///**
// *
// * @author khushbu
// */
//public class PersonDirectory {
//
//    private ArrayList<Person> personDir;
//
//    public PersonDirectory() {
//        personDir = new ArrayList<>();
//    }
//
//    public ArrayList<Person> getPersonDir() {
//        return personDir;
//    }
//
//    public void setPersonDir(ArrayList<Person> personDir) {
//        this.personDir = personDir;
//    }
//
//    public Person createPerson(PersonType type,String name,String address,Date dateOfBirth,String emailId,int phoneNumber,String gender,Department department){
//        Person person = null;
//        if (type.getValue().equals(PersonType.Patient.getValue())){
//            person = new Patient(name,address,dateOfBirth,emailId,phoneNumber,gender);
//            personDir.add(person);
//        }
//        else if (type.getValue().equals(PersonType.Employee.getValue())){
//            person = new Employee(name,emailId,phoneNumber,department);
//            personDir.add(person);
//        }
//        return person;
//}
//}
