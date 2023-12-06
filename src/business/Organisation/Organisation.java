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
    int id;
    String name;
    ArrayList<Role> listOfRoles;
    Enterprise enterprise;
    UserAccountDirectory userAccountDirectory;
    
    public Organisation(){
        userAccountDirectory = new UserAccountDirectory();
        listOfRoles = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
