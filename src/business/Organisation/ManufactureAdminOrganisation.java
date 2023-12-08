/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organisation;

import business.Role.ManufactureAdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author jayanti
 */
public class ManufactureAdminOrganisation extends Organisation{
        public ManufactureAdminOrganisation(){
        addRoles();
        addUserAccount();
    }
    public void addRoles(){
        getListOfRoles().add(new ManufactureAdminRole());
    }
    public void addUserAccount(){
        UserAccount user = this.getUserAccountDirectory().addUserAccount();
        user.setUsername("MAdmin");
        user.setPassword("1234");
        user.setOrganisation(this);
        user.setRole(getListOfRoles().get(0));
    }
}
