/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

/**
 *
 * @author khushbu
 */
public class Department {

    private int departmentID;
    private static int count = 0;
    private String departmentName;

    public enum DepartmentType {

        WomenAndChildren ("Hospital"),
        Heart("Heart"),
        Diabetes("Laboratory"),
        Lungs("Blood Bank"),
        InsuranceCompany("Insurance Company");

        private String value;

        private DepartmentType(String value) {
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

    public Department() {
        departmentID = count++;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.departmentName = DepartmentName;
    }

    @Override
    public String toString() {
        return departmentName;
    }

}
