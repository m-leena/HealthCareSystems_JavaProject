/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointments;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class AppointmentDirectory {

    private ArrayList<Appointment> appointmentdir;

    public AppointmentDirectory() {
        appointmentdir = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppointmentdir() {
        return appointmentdir;
    }

    public void setAppointmentdir(ArrayList<Appointment> appointmentdir) {
        this.appointmentdir = appointmentdir;
    }

//    public Appointment addAppointment() {
//        Appointment appointment = new Appointment();
//        appointmentdir.add(appointment);
//        return appointment;
//    }
}
