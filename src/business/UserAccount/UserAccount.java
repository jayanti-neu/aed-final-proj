/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.UserAccount;

import business.Organisation.Organisation;
import business.Role.Role;
import business.WorkQueue.WorkRequest;

/**
 *
 * @author jayanti
 */
public class UserAccount {
    String username;
    String password;
    Role role;
    Organisation organisation;
    WorkRequest assignedWorkRequest;

    public UserAccount(){
        
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public WorkRequest getAssignedWorkRequest() {
        return assignedWorkRequest;
    }

    public void setAssignedWorkRequest(WorkRequest assignedWorkRequest) {
        this.assignedWorkRequest = assignedWorkRequest;
    }
    
    
    
}
