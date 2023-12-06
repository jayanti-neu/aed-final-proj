/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Business.Business;
import business.Organisation.Organisation;
import business.Organisation.OrganisationDirectory;
import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class Enterprise {
    Business business;
    String name;
    int id;
    OrganisationDirectory organisationDirectory;
    
    public Enterprise(){
        organisationDirectory = new OrganisationDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    public void setOrganisationDirectory(OrganisationDirectory organisationDirectory) {
        this.organisationDirectory = organisationDirectory;
    }
    
    
    
}
