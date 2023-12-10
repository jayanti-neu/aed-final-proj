/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Business;

import business.Enterprise.ManufacturingEnterprise;
import business.Enterprise.ManufacturingEnterpriseDirectory;
import business.Enterprise.RetailerEnterprise;
import business.Enterprise.RetailerEnterpriseDirectory;
import business.Enterprise.SupplierEnterprise;
import business.Enterprise.SupplierEnterpriseDirectory;

/**
 *
 * @author jayanti
 */
public class ConfigueBusiness {
    
    public static Business configure(){
        Business business = Business.getInstance();
        
        ManufacturingEnterpriseDirectory manufacturingEnterpriseDirectory = new ManufacturingEnterpriseDirectory();
        RetailerEnterpriseDirectory retailerEnterpriseDirectory = new RetailerEnterpriseDirectory();
        SupplierEnterpriseDirectory SupplierEnterpriseDirectory = new SupplierEnterpriseDirectory();
//        RetailerEnterprise retailerEnterprise = new RetailerEnterprise();
//        ManufacturingEnterprise manufacturingEnterprise = new ManufacturingEnterprise();
//        SupplierEnterprise supplierEnterprise = new SupplierEnterprise();
        business.getEnterprisesInvolved().add(retailerEnterpriseDirectory);
        business.getEnterprisesInvolved().add(manufacturingEnterpriseDirectory);
        business.getEnterprisesInvolved().add(SupplierEnterpriseDirectory);
        return business;
    }
    

}
