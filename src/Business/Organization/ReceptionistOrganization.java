/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.ReceptionistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class ReceptionistOrganization extends NewOrganization{
           public ReceptionistOrganization() {
        super(NewOrganization.OrganizationType.Recptionist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ReceptionistRole());
        return roles;
    }
      
    
}
