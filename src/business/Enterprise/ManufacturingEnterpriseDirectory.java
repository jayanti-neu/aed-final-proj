/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Employee.Employee;
import business.Organisation.ManufactureAdminOrganisation;
import java.util.ArrayList;

/**
 *
 * @author eesitasen
 */
//public class ManufacturingEnterpriseDirectory extends EnterpriseDirectory{
//    
//    public ManufacturingEnterprise createManufacturingEnterprise(String name, String password) {
//        ManufacturingEnterprise manufacturingEnterprise = new ManufacturingEnterprise();
//        ManufactureAdminOrganisation ma = (ManufactureAdminOrganisation)manufacturingEnterprise.getOrganisationDirectory().getOrganisationList().get(0);
//        ma.addUserAccount(name, password);
//        enterpriseList.add(manufacturingEnterprise);
//        return manufacturingEnterprise;
//    }
//}

public class ManufacturingEnterpriseDirectory extends EnterpriseDirectory{
        public ManufacturingEnterprise createManufacturingEnterprise(String name, String pswrd) {
            ManufacturingEnterprise manufacturingEnterprise = new ManufacturingEnterprise();
            ManufactureAdminOrganisation ma = (ManufactureAdminOrganisation)manufacturingEnterprise.getOrganisationDirectory().getOrganisationList().get(0);
            ma.addUserAccount(name, pswrd);
            enterpriseList.add(manufacturingEnterprise);
            return manufacturingEnterprise;
    }
}
