/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Business;

import business.Enterprise.EnterpriseDirectory;
import business.Enterprise.ManufacturingEnterpriseDirectory;
import business.Enterprise.RetailerEnterpriseDirectory;
import business.Enterprise.SupplierEnterpriseDirectory;
import business.Product.FinalProduct;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class Business {
    String name;
    static Business business;
    WorkQueue globalWorkQueue;
    ArrayList<FinalProduct> productsSoldByBusiness;
    ArrayList<EnterpriseDirectory> enterprisesInvolved;
//    ArrayLi
    ArrayList<FinalProduct> listOfProductsThisBusinessSells;
    public Business(){
        globalWorkQueue = new WorkQueue();
        enterprisesInvolved = new ArrayList<>();
        listOfProductsThisBusinessSells = new ArrayList<>();
        createListOfFinalProducts();
    }
    
    private void createListOfFinalProducts(){
        FinalProduct fp1 = new FinalProduct();
        fp1.setName("fp1");
        listOfProductsThisBusinessSells.add(fp1);
        FinalProduct fp2 = new FinalProduct();
        fp2.setName("fp2"); 
        listOfProductsThisBusinessSells.add(fp2);
        FinalProduct fp3 = new FinalProduct();      
        fp3.setName("fp13");
        listOfProductsThisBusinessSells.add(fp3);
    }

    public ArrayList<FinalProduct> getListOfProductsThisBusinessSells() {
        return listOfProductsThisBusinessSells;
    }

    public void setListOfProductsThisBusinessSells(ArrayList<FinalProduct> listOfProductsThisBusinessSells) {
        this.listOfProductsThisBusinessSells = listOfProductsThisBusinessSells;
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

    public ArrayList<EnterpriseDirectory> getEnterprisesInvolved() {
        return enterprisesInvolved;
    }

    public void setEnterprisesInvolved(ArrayList<EnterpriseDirectory> enterprisesInvolved) {
        this.enterprisesInvolved = enterprisesInvolved;
    }
    
    public RetailerEnterpriseDirectory getRetailerEnterprise(){
//        return (RetailerEnterprise)this.enterprisesInvolved.get();
        return (RetailerEnterpriseDirectory)this.enterprisesInvolved.get(0);
    }
    
    public ManufacturingEnterpriseDirectory getManufacturingEnterprise(){
        return (ManufacturingEnterpriseDirectory)this.enterprisesInvolved.get(1);

    }
    
    public SupplierEnterpriseDirectory getSupplierEnterprise(int id){
        return (SupplierEnterpriseDirectory) this.enterprisesInvolved.get(2);
    }
}
