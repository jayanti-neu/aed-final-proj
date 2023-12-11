/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organisation.RetailerOrganisation;
import business.Product.FinalProduct;

/**
 *
 * @author jayanti
 */
public class RetailerEnterprise extends Enterprise{
//    String rid;
    private static int countR = 1;
    
    public RetailerEnterprise(){
        id = "R"+countR;
        countR++;
        setType("retailer");
        this.getOrganisationDirectory().addOrganisation(new RetailerOrganisation(this));
    }
}
