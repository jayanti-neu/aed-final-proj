/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organisation;

import business.Enterprise.Enterprise;
import business.Role.SupplierRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author jayanti
 */
public class SupplierOrganisation extends Organisation{
        public SupplierOrganisation(Enterprise enterprise){
                        super(enterprise);
        addRoles();
    }
    public void addRoles(){
        getListOfRoles().add(new SupplierRole());
    } 
    public void addUserAccount(String name, String password){
        UserAccount user = this.getUserAccountDirectory().addUserAccount();
        user.setUsername(name);
        user.setPassword(password);
        user.setOrganisation(this);
        user.setRole(getListOfRoles().get(0));
    }    
}
