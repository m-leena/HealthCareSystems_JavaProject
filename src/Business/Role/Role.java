/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Db4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NewOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public abstract class Role {

    public enum RoleType {

        SysAdmin("SysAdmin"),
        Admin("Admin"),
        Receptionist("Receptionist"),
        Patient("Patient"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        Laboratory("Laboratory"),
        Pharmacist("Pharmacist"),
        pharmacy("pharmacy"),
        BloodBank("BloodBank");

        private String value;

        private RoleType(String value) {
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

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, Enterprise enterprise,Network network,NewOrganization organization, DB4OUtil dB4OUtil);

    @Override
    public String toString() {
        return this.getClass().getName().substring(14);
    }

}
