/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organisation.ManufactureAdminOrganisation;
import business.Organisation.SupplierOrganisation;
import java.util.ArrayList;

/**
 *
 * @author eesitasen
 */
public class SupplierEnterpriseDirectory extends EnterpriseDirectory{

        public SupplierEnterprise createSupplierEnterprise(String name, String password) {
            SupplierEnterprise supplierEnterprise = new SupplierEnterprise();
            SupplierOrganisation ma = (SupplierOrganisation)supplierEnterprise.getOrganisationDirectory().getOrganisationList().get(0);
            ma.addUserAccount(name, password);
            enterpriseList.add(supplierEnterprise);
            return supplierEnterprise;
        }
}
