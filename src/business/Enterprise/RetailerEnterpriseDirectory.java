/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organisation.ManufactureAdminOrganisation;
import business.Organisation.RetailerOrganisation;
import java.util.ArrayList;

/**
 *
 * @author eesitasen
 */
public class RetailerEnterpriseDirectory extends EnterpriseDirectory{

        public RetailerEnterprise createRetailerEnterprise(String name, String pswrd) {
//            RetailerEnterprise retailerEnterprise = new RetailerEnterprise();
//            retailerEnterprise.setName(name);
//            enterpriseList.add(retailerEnterprise);
//            return retailerEnterprise;
RetailerEnterprise retailerEnterprise = new RetailerEnterprise();
            RetailerOrganisation ra = (RetailerOrganisation)retailerEnterprise.getOrganisationDirectory().getOrganisationList().get(0);
            ra.addUserAccount(name, pswrd);
            enterpriseList.add(retailerEnterprise);
            return retailerEnterprise;
    }
}
