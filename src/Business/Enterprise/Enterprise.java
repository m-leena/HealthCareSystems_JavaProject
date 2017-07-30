/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.BloodBankStores.BloodDirectory;
import Business.BloodRequestQueue.BloodWorkQueue;
import Business.Department.DepartmentDirectory;
import Business.Drugs.DrugDirectory;
import Business.LabTestList.LabTestDirectory;
import Business.Organization.NewOrganization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author khushbu
 */
public abstract class Enterprise extends NewOrganization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private DepartmentDirectory departmentDirectory;
    private DrugDirectory drugDirectory;
    private LabTestDirectory labTestDirectory;
    private BloodDirectory bloodDirectory;
    private BloodWorkQueue bloodWorkQueue;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        departmentDirectory = new DepartmentDirectory();
        drugDirectory = new DrugDirectory();
        labTestDirectory = new LabTestDirectory();
        bloodDirectory = new BloodDirectory();
        bloodWorkQueue = new BloodWorkQueue();
    }

    public enum EnterpriseType {

        Hospital("Hospital"),
        Pharmacy("Pharmacy"),
        Laboratory("Laboratory"),
        BloodBank("Blood Bank"),
        InsuranceCompany("Insurance Company");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public DepartmentDirectory getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(DepartmentDirectory departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }

    public DrugDirectory getDrugDirectory() {
        return drugDirectory;
    }

    public void setDrugDirectory(DrugDirectory drugDirectory) {
        this.drugDirectory = drugDirectory;
    }

    public LabTestDirectory getLabTestDirectory() {
        return labTestDirectory;
    }

    public void setLabTestDirectory(LabTestDirectory labTestDirectory) {
        this.labTestDirectory = labTestDirectory;
    }

    public BloodDirectory getBloodDirectory() {
        return bloodDirectory;
    }

    public void setBloodDirectory(BloodDirectory bloodDirectory) {
        this.bloodDirectory = bloodDirectory;
    }

    public BloodWorkQueue getBloodWorkQueue() {
        return bloodWorkQueue;
    }

    public void setBloodWorkQueue(BloodWorkQueue bloodWorkQueue) {
        this.bloodWorkQueue = bloodWorkQueue;
    }

}
