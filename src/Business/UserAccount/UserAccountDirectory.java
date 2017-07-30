/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Patient.Patient;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountDir;

    public UserAccountDirectory() {
        userAccountDir = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountDir() {
        return userAccountDir;
    }

    public void setUserAccountDir(ArrayList<UserAccount> userAccountDir) {
        this.userAccountDir = userAccountDir;
    }

    public UserAccount createUserAccount(String userName, String password, Employee employee, Role role) {
        UserAccount ua = new UserAccount();
        ua.setUsername(userName);
        ua.setPassword(password);
        ua.setEmployee(employee);
        ua.setRole(role);
        userAccountDir.add(ua);
        return ua;
    }

    public UserAccount createUserAccountPatient(String userName, String password, Patient patient, Role role) {
        UserAccount ua = new UserAccount();
        ua.setUsername(userName);
        ua.setPassword(password);
        ua.setPatient(patient);
        ua.setRole(role);
        userAccountDir.add(ua);
        return ua;
    }

    public void removeUserAccount(String username) {
        userAccountDir.remove(username);
    }

    public boolean checkIfUserNameExists(String userName) {
        boolean uap = true;
        for (UserAccount ua : userAccountDir) {
            if (ua.getUsername().equals(userName)) {
                uap = false;
            }
            } 
       return uap;
    }

    public UserAccount authenticateUserAccount(String userName, String password) {
        for (UserAccount ua : userAccountDir) {
            if (ua.getUsername().equals(userName) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
}
