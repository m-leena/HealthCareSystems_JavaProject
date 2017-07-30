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
import UserInterface.SystemAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class SystemAdminRole extends Role{
     
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,EcoSystem system,Enterprise enterprise,Network network,NewOrganization organization,DB4OUtil dB4OUtil) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer,account,system,dB4OUtil);
    }
    
}
