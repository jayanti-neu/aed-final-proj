/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Logistics;

import business.UserAccount.UserAccount;

/**
 *
 * @author jayanti
 */
public class Truck {
    UserAccount Driver;
    String currentStatus;
    int startingLocation;
    int finalLocation;
    

    public UserAccount getDriver() {
        return Driver;
    }

    public void setDriver(UserAccount Driver) {
        this.Driver = Driver;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public int getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(int startingLocation) {
        this.startingLocation = startingLocation;
    }

    public int getFinalLocation() {
        return finalLocation;
    }

    public void setFinalLocation(int finalLocation) {
        this.finalLocation = finalLocation;
    }
    
    
}
