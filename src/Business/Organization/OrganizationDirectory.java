/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.NewOrganization.OrganizationType;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class OrganizationDirectory {

    private ArrayList<NewOrganization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<NewOrganization> getOrganizationList() {
        return organizationList;
    }

    public NewOrganization createOrganization(OrganizationType type) {
        NewOrganization organization = null;
        if (type.getValue().equals(OrganizationType.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Patient.getValue())) {
            organization = new PatientOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Recptionist.getValue())) {
            organization = new ReceptionistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Pharmacy.getValue())) {
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.Laboratory.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(OrganizationType.Ambulance.getValue())) {
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(OrganizationType.BloodBank.getValue())) {
            organization = new BloodBankOrganization();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(OrganizationType.Sensor.getValue())) {
//            organization = new SensorOrganization();
//            organizationList.add(organization);
//        }
        return organization;
    }

}
