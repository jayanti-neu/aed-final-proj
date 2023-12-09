/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Business;

import business.Enterprise.ManufacturingEnterprise;
import business.Enterprise.RetailerEnterprise;
import business.Enterprise.SupplierEnterprise;

/**
 *
 * @author jayanti
 */
public class ConfigueBusiness {
    
    public static Business configure(){
        Business business = Business.getInstance();
        RetailerEnterprise retailerEnterprise = new RetailerEnterprise();
        ManufacturingEnterprise manufacturingEnterprise = new ManufacturingEnterprise();
        SupplierEnterprise supplierEnterprise = new SupplierEnterprise();
        business.getEnterprisesInvolved().add(retailerEnterprise);
        business.getEnterprisesInvolved().add(manufacturingEnterprise);
        business.getEnterprisesInvolved().add(supplierEnterprise);
        return business;
    }
    

}
