/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organisation;

import business.Role.RetailerRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author jayanti
 */
public class RetailerOrganisation extends Organisation{
    
    public RetailerOrganisation(){
        addRoles();
        addUserAccount();
    }
    public void addRoles(){
        getListOfRoles().add(new RetailerRole());
    }
    public void addUserAccount(){
        UserAccount user = this.getUserAccountDirectory().addUserAccount();
        user.setUsername("retailer");
        user.setPassword("1234");
        user.setOrganisation(this);
        user.setRole(getListOfRoles().get(0));
    }
}
