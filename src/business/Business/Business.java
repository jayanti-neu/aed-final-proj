/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Business;

import business.Enterprise.Enterprise;
import business.Enterprise.RetailerEnterprise;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class Business {
    String name;
    static Business business;
//    ArrayList<GlobalWorkQueue> workRequestList; //productTrackList
    WorkQueue globalWorkQueue;
    ArrayList<Enterprise> enterprisesInvolved;
    
    public Business(){
//        workRequestList = new ArrayList<>();
        globalWorkQueue = new WorkQueue();
        enterprisesInvolved = new ArrayList<>();
    }
    
    public static Business getInstance(){
        if (business == null){
            business = new Business();
        }
        return business;
    }

    public WorkQueue getGlobalWorkQueue() {
        return globalWorkQueue;
    }

    public void setGlobalWorkQueue(WorkQueue globalWorkQueue) {
        this.globalWorkQueue = globalWorkQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Business getBusiness() {
        return business;
    }

    public static void setBusiness(Business business) {
        Business.business = business;
    }

    public ArrayList<Enterprise> getEnterprisesInvolved() {
        return enterprisesInvolved;
    }

    public void setEnterprisesInvolved(ArrayList<Enterprise> enterprisesInvolved) {
        this.enterprisesInvolved = enterprisesInvolved;
    }
    
    public RetailerEnterprise getRetailerEnterprise(){
        return new RetailerEnterprise();
    }
    
}
