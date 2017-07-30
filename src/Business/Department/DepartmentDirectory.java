/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class DepartmentDirectory {
    private ArrayList <Department> departmentList;
    
    public DepartmentDirectory()
    {
    departmentList=new ArrayList<>();
    }

    public ArrayList<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Department> departmentList) {
        this.departmentList = departmentList;
    }
    
    public Department addDepartment(String name)
    {
    Department d=new Department();
    d.setDepartmentName(name);
    departmentList.add(d);
    return d;
    }
}
