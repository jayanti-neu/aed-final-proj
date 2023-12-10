/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Organisation.Organisation;
import business.UserAccount.UserAccount;
import java.time.LocalDateTime;

/**
 *
 * @author jayanti
 */
public class WorkRequest {
    UserAccount sender; // ?
    UserAccount assigned;
    
    String status;
//    Enterprise forEnterprise;
//    EnterpriseDirectory fromEnterprise;
    
    int productId;
    int quantity;
    
    LocalDateTime dateOfRequest;
        static int count = 0;
    int id; 
    int waitingForId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWaitingForId() {
        return waitingForId;
    }

    public void setWaitingForId(int waitingForId) {
        this.waitingForId = waitingForId;
    }
    
    
    public WorkRequest(){
        count++;
        id = count;
        dateOfRequest = LocalDateTime.now();
        waitingForId = -1;
    }

    public LocalDateTime getDateOfRequest() {
        return dateOfRequest;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

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

//    public EnterpriseDirectory getForEnterprise() {
//        return forEnterprise;
//    }
//
//    public void setForEnterprise(EnterpriseDirectory forEnterprise) {
//        this.forEnterprise = forEnterprise;
//    }
//
//    public EnterpriseDirectory getFromEnterprise() {
//        return fromEnterprise;
//    }
//
//    public void setFromEnterprise(EnterpriseDirectory fromEnterprise) {
//        this.fromEnterprise = fromEnterprise;
//    }


    
}
