/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.GovernmentAdminRole;
import Business.Role.Role;
import java.util.ArrayList;


public class GovernmentEnterprise extends Enterprise{
    
    public GovernmentEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.GovernmentEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovernmentAdminRole());
        return roles; 
    }
    
    
}
