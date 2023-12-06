/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organisation.RetailerOrganisation;

/**
 *
 * @author jayanti
 */
public class RetailerEnterprise extends Enterprise{
    
    public RetailerEnterprise(){
        this.getOrganisationDirectory().addOrganisation(new RetailerOrganisation());
    }
}
