/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.WorkQueue;

import business.Enterprise.Enterprise;
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
    Enterprise forEnterprise;
    Enterprise fromEnterprise;
    
    int productId;
    int quantity;
    
    LocalDateTime dateOfRequest;

    public LocalDateTime getDateOfRequest() {
        return dateOfRequest;
    }
    
    public WorkRequest(){
        dateOfRequest = LocalDateTime.now();
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
