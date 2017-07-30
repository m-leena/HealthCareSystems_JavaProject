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
import UserInterface.InsuranceCompany.InsuranceCompanyWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class InssuranceAdminRole extends Role{
         @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,EcoSystem system,Enterprise enterprise,Network network,NewOrganization organization,DB4OUtil dB4OUtil) {
        return new InsuranceCompanyWorkAreaJPanel(userProcessContainer,account,system,enterprise,network,organization,dB4OUtil);
    }
}
