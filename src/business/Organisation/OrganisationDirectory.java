/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Organisation;

import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class OrganisationDirectory {
    ArrayList<Organisation> organisationList;
    
    public OrganisationDirectory(){
        organisationList = new ArrayList<>();
    }
    
    public void addOrganisation(Organisation org){
        organisationList.add(org);
    }

    public ArrayList<Organisation> getOrganisationList() {
        return organisationList;
    }

    public void setOrganisationList(ArrayList<Organisation> organisationList) {
        this.organisationList = organisationList;
    }
}
