/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organisation;

import business.Enterprise.Enterprise;
import business.Role.ManufactureAdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author jayanti
 */
public class ManufactureAdminOrganisation extends Organisation{
        public ManufactureAdminOrganisation(Enterprise enterprise){
            super(enterprise);
        addRoles();
//        addUserAccount();
    }
    public void addRoles(){
        getListOfRoles().add(new ManufactureAdminRole());
    }
    
    public void addUserAccount(String userName,String password){
        UserAccount user = this.getUserAccountDirectory().addUserAccount();
        user.setUsername(userName);
        user.setPassword(password);
        user.setOrganisation(this);
        user.setRole(getListOfRoles().get(0));
    }
}
