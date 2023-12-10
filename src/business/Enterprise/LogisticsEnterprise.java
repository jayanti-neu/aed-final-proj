/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Logistics.Truck;
import business.Organisation.TruckerOrganisation;
import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class LogisticsEnterprise extends Enterprise{
    ArrayList<Truck> runningFleet;
    public LogisticsEnterprise(){
        this.organisationDirectory.addOrganisation(new TruckerOrganisation());
    }
    
    public Truck scheduleTruck(){
        Truck truck = new Truck();
        runningFleet.add(truck);
        return truck;
    }
}
