/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Ambulance.AmbulanceWorkQueue;
import Business.Appointments.AppointmentDirectory;
import Business.Employee.EmployeeDirectory;
import Business.LabTestWorkRequest.LabTestWorkQueue;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public abstract class NewOrganization {

    private String name;
    private WorkQueue workQueue;
    private PatientDirectory patientDirectory;
    private EmployeeDirectory employeeDirectory;
    private LabTestWorkQueue labTestWorkQueue;
    private UserAccountDirectory userAccountDirectory;
    private AppointmentDirectory appointmentDirectory;
    private AmbulanceWorkQueue ambulanceWorkQueue;
    private int organizationID;
    private static int counter;

    public enum OrganizationType {

        Doctor("Doctor Organization"),
        Nurse("Nurse Organization"),
        Recptionist("Receptionist Organization"),
        Laboratory("Laboratory Organization"),
        BloodBank("Bloodbank Organization"),
        Admin("Admin Organization"),
        Patient("Patient Organization"),
        Pharmacy("Pharmacy Organization"),
        Ambulance("Ambulance Organization");
//        Sensor("Sensor");

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public NewOrganization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        patientDirectory = new PatientDirectory();
        employeeDirectory = new EmployeeDirectory();
        labTestWorkQueue = new LabTestWorkQueue();
        userAccountDirectory = new UserAccountDirectory();
        ambulanceWorkQueue=new AmbulanceWorkQueue();
        appointmentDirectory = new AppointmentDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }

    public void setAppointmentDirectory(AppointmentDirectory appointmentDirectory) {
        this.appointmentDirectory = appointmentDirectory;
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

    @Override
    public String toString() {
        return name;
    }

}
