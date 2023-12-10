/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organisation;

import business.Enterprise.Enterprise;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class Organisation {
    String orgId;
    String name;
    ArrayList<Role> listOfRoles;
    Enterprise enterprise;
    UserAccountDirectory userAccountDirectory;
    
    private static int countOrg = 1;
    public Organisation(Enterprise enterprise){
        orgId = "Org"+countOrg;
        countOrg++;
        userAccountDirectory = new UserAccountDirectory();
        listOfRoles = new ArrayList<>();
        this.enterprise = enterprise;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String OrgId) {
        this.orgId = OrgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Role> getListOfRoles() {
        return listOfRoles;
    }

    public void setListOfRoles(ArrayList<Role> listOfRoles) {
        this.listOfRoles = listOfRoles;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    
}
