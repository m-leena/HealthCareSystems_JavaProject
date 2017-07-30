/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensors;

import Business.Ambulance.AmbulanceWorkrequest;
import Business.BloodBankStores.Blood;
import Business.BloodRequestQueue.BloodWorkRequest;
import Business.EcoSystem;
import Business.Email.Email;
import Business.Enterprise.BloodBank;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.NewOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.VitalSigns.VitalSign;
import java.awt.Toolkit;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author khushbu
 */
public class Sensor {

    private int sensorId;
    private static int count = 0;

    public Sensor() {
        sensorId = ++count;
    }
//    private Network net;
    private EcoSystem sys;
//    private NewOrganization inOrganization;
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public void Sensor(EcoSystem system) {
//        this.net = network;
        this.sys = system;
        Timer timer = new Timer();
        TimerTask task;
        task = new TimerTask() {
            public void run() {
//                system = dB4OUtil.retrieveSystem();
                for (Network network : sys.getNetworkList()) {
                    //Step 2-a: Check against each enterprise
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        //Step3: Check against each organization inside that enterprise
                        for (Patient p : enterprise.getPatientDirectory().getPatientDir()) {
                            if (p.getUnderObservation() == 'Y' && !(p.getSensor().getSensorId() == 0)) {
                                Date today = new Date();
                                Calendar fromDate = Calendar.getInstance();
                                Calendar toDate = Calendar.getInstance();
                                fromDate.setTime(p.getDateOfBirth());
                                toDate.setTime(today);
                                int ageYear = toDate.get(Calendar.YEAR) - (fromDate.get(Calendar.YEAR));
                                java.util.Date date = new java.util.Date();
                                date = new Timestamp(date.getTime());
                                VitalSign vitalsign = p.getVitalSignHistory().addVitalSign();
                                vitalsign.setAge(ageYear);

                                int resRate = ((int) (Math.random() * 100));
                                int hr = ((int) (Math.random() * 100));
                                int sysBp = ((int) (Math.random() * 100));
                                int weight = ((int) (Math.random() * 100));
                                int bodyTemp = ((int) (Math.random() * 100));
                                int bloodSugar = ((int) (Math.random() * 100));
                                int rbcCount = ((int) (Math.random() * 100));
                                comparevalues(hr, resRate, resRate, sysBp, weight, bodyTemp, bloodSugar, rbcCount, p, vitalsign);
                                vitalsign.setRespiratoryRate(resRate);
                                vitalsign.setHeartRate(hr);
                                vitalsign.setBloodPressure(sysBp);
                                vitalsign.setWeight(weight);
                                vitalsign.setBodyTemperature(bodyTemp);
                                vitalsign.setBloodSugarLevel(bloodSugar);
                                vitalsign.setRbcCount((int) (Math.random() * 100));
                                vitalsign.setCreateDttm(date);
                                vitalsign.setUpdatedDttm(date);

                                if (rbcCount < 100) {
                                    Enterprise inEnterprise = null;
                                    for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                                        if (e instanceof BloodBank) {

                                            inEnterprise = e;
                                            break;

                                        }
                                    }

                                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountDir()) //                                    for (Enterprise e:net.getEnterpriseDirectory().getEnterpriseList()){
                                    {
                                        if (ua.getPatient() == p) {

                                            BloodWorkRequest br = new BloodWorkRequest();
                                            br.setPatient(p);
//                                            br.setSender(ua);
                                            br.setQuantity(100);
                                            br.setType(Blood.BloodType.AB);
                                            br.setRequestDate(date);
                                            br.setStatus("Request Sent");
                                            ua.getPatient().getSunderobservationby().getBloodWorkQueue().getWorkRequestList().add(br);
                                            inEnterprise.getBloodWorkQueue().getWorkRequestList().add(br);
                                            String emailId = "healthcare.aed@gmail.com";
                                            String password = "kitty@123";
                                            String message = "Patient " + br.getPatient().getName() + " blood count is low, a request has been sent to the blood bank to supply blood";
                                            Email.sendMail(emailId, password, message, br.getPatient().getSunderobservationby().getEmployee().getEmailID());
                                            break;

                                        }
                                    }
                                }
                                if (vitalsign.getStatus().equals("Abnormal")) {
                                    NewOrganization org = null;
                                    for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                                        if (ent instanceof HospitalEnterprise) {
                                            for (NewOrganization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                                                if (organization instanceof AmbulanceOrganization) {
                                                    org = organization;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    UserAccount uap = null;

                                    for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountDir()) //                                    for (Enterprise e:net.getEnterpriseDirectory().getEnterpriseList()){
                                    {
                                        if (ua.getPatient() == p) {
                                            uap = ua;
                                            AmbulanceWorkrequest wr = new AmbulanceWorkrequest();
                                            wr.setPatient(p);
                                            wr.setSender(uap);
                                            wr.setRequestDate(date);
                                            wr.setStatus("Request Sent");
                                            uap.getAmbulanceWorkQueue().getAmbulanceWorkRequestDir().add(wr);
                                            org.getAmbulanceWorkQueue().getAmbulanceWorkRequestDir().add(wr);
                                            String emailId = "healthcare.aed@gmail.com";
                                            String password = "kitty@123";
                                            String message = "Patient " + wr.getPatient().getName() + " vital signs are not normal, a request to the ambulance has been sent";
                                            Email.sendMail(emailId, password, message, wr.getPatient().getSunderobservationby().getEmployee().getEmailID());
                                            break;

                                        }
                                    }

//        dB4OUtil.storeSystem(system);
                                } else {

                                }

                            }
                        }
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(task,
                0, 100000);
    }

    public void delay() {
        long delay;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a delay in seconds: ");
        delay = scan.nextInt() * 1000;

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Toolkit.getDefaultToolkit().beep();
            }
        };

        timer.schedule(task, delay);
    }

    public void comparevalues(int age, int respRate, int heartRate, int sysBp, int weight, int bodytemp, int bloodsugar, int rbccount, Patient p, VitalSign vs) {
        if (age >= 1 && age <= 3) {
            if ((respRate >= 20 && respRate <= 30) && (heartRate >= 80 && heartRate <= 130) && (sysBp >= 80 && sysBp <= 110) && (weight >= 22 && weight <= 31) && (bodytemp >= 98 && bodytemp <= 100) && (bloodsugar >= 110 && bloodsugar <= 130) && (rbccount >= 100 && rbccount <= 120)) {
                vs.setStatus("Normal");
                p.setNormalCount(p.getNormalCount() + 1);

            } else {
                vs.setStatus("Abnormal");
                p.setAbnormalcount(p.getAbnormalcount() + 1);
            }
        } else if (age >= 4 && age <= 5) {
            if ((respRate >= 20 && respRate <= 30) && (heartRate >= 80 && heartRate <= 120) && (sysBp >= 80 && sysBp <= 110) && (weight >= 31 && weight <= 40) && (bodytemp >= 98 && bodytemp <= 100) && (bloodsugar >= 110 && bloodsugar <= 130) && (rbccount >= 100 && rbccount <= 120)) {
                vs.setStatus("Normal");
                p.setNormalCount(p.getNormalCount() + 1);
            } else {
                vs.setStatus("Abnormal");

                p.setAbnormalcount(p.getAbnormalcount() + 1);
            }
        } else if (age >= 6 && age <= 12) {
            if ((respRate >= 20 && respRate <= 30) && (heartRate >= 70 && heartRate <= 110) && (sysBp >= 80 && sysBp <= 120) && (weight >= 41 && weight <= 92) && (bodytemp >= 98 && bodytemp <= 100) && (bloodsugar >= 110 && bloodsugar <= 130) && (rbccount >= 100 && rbccount <= 120)) {
                vs.setStatus("Normal");
                p.setNormalCount(p.getNormalCount() + 1);
            } else {
                vs.setStatus("Abnormal");
                p.setAbnormalcount(p.getAbnormalcount() + 1);
            }
        } else if (age >= 13) {
            if ((respRate >= 12 && respRate <= 20) && (heartRate >= 55 && heartRate <= 105) && (sysBp >= 110 && sysBp <= 120) && (weight > 110) && (bodytemp >= 98 && bodytemp <= 100) && (bloodsugar >= 110 && bloodsugar <= 130) && (rbccount >= 100 && rbccount <= 120)) {
                vs.setStatus("Normal");
                p.setNormalCount(p.getNormalCount() + 1);
            } else {
                vs.setStatus("Abnormal");
                p.setAbnormalcount(p.getAbnormalcount() + 1);
            }
        } else {
            vs.setStatus("Abnormal");
            p.setAbnormalcount(p.getAbnormalcount() + 1);
        }

    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

}
