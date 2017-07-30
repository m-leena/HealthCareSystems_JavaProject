/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Ambulance.AmbulanceWorkQueue;
import Business.Appointments.AppointmentDirectory;
import Business.BloodRequestQueue.BloodWorkQueue;
import Business.Employee.Employee;
import Business.LabTestWorkRequest.LabTestWorkQueue;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author khushbu
 */
public class UserAccount  {
    
    private String username;
    private String password;
    private Employee employee;
    private Patient patient;
    private Person person;
    private Role role;
   
    private AppointmentDirectory appointmentdir;
    private WorkQueue workQueue;
    private LabTestWorkQueue labTestWorkQueue;
    private AmbulanceWorkQueue ambulanceWorkQueue;
    private BloodWorkQueue bloodWorkQueue;
    public UserAccount()
          
    {
    appointmentdir=new AppointmentDirectory();
    workQueue=new WorkQueue();
    labTestWorkQueue=new LabTestWorkQueue();
    ambulanceWorkQueue=new AmbulanceWorkQueue();
    bloodWorkQueue=new BloodWorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public AppointmentDirectory getAppointmentdir() {
        return appointmentdir;
    }

    public void setAppointmentdir(AppointmentDirectory appointmentdir) {
        this.appointmentdir = appointmentdir;
    }
      

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public LabTestWorkQueue getLabTestWorkQueue() {
        return labTestWorkQueue;
    }

    public void setLabTestWorkQueue(LabTestWorkQueue labTestWorkQueue) {
        this.labTestWorkQueue = labTestWorkQueue;
    }

    public AmbulanceWorkQueue getAmbulanceWorkQueue() {
        return ambulanceWorkQueue;
    }

    public void setAmbulanceWorkQueue(AmbulanceWorkQueue ambulanceWorkQueue) {
        this.ambulanceWorkQueue = ambulanceWorkQueue;
    }

    public BloodWorkQueue getBloodWorkQueue() {
        return bloodWorkQueue;
    }

    public void setBloodWorkQueue(BloodWorkQueue bloodWorkQueue) {
        this.bloodWorkQueue = bloodWorkQueue;
    }  

   
    
    @Override
    public String toString() {
        return  username;
    }
    
     
}
