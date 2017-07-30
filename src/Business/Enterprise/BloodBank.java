/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.BloodRequestQueue.BloodWorkQueue;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author khushbu
 */
public class BloodBank extends Enterprise{

    public BloodBank(String name) {
        super(name, EnterpriseType.BloodBank);
      
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    
}
