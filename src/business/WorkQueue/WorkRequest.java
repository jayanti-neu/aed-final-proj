/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Enterprise.Enterprise;
import business.Organisation.Organisation;
import business.UserAccount.UserAccount;

/**
 *
 * @author jayanti
 */
public class WorkRequest {
    UserAccount sender; // ?
    UserAccount assigned;
    
    String status;
    String message;
    Enterprise forEnterprise;
    Enterprise fromEnterprise;

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getAssigned() {
        return assigned;
    }

    public void setAssigned(UserAccount assigned) {
        this.assigned = assigned;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Enterprise getForEnterprise() {
        return forEnterprise;
    }

    public void setForEnterprise(Enterprise forEnterprise) {
        this.forEnterprise = forEnterprise;
    }

    public Enterprise getFromEnterprise() {
        return fromEnterprise;
    }

    public void setFromEnterprise(Enterprise fromEnterprise) {
        this.fromEnterprise = fromEnterprise;
    }


    
}
