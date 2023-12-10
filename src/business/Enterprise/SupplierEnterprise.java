/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organisation.SupplierOrganisation;
import business.Product.FinalProduct;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author jayanti
 */
public class SupplierEnterprise extends Enterprise {

//    String sid;
    private static int countS = 1;
    ArrayList<FinalProduct> finalProductList;
    Map<Integer, Integer> inventory; //productId, quantity

    public SupplierEnterprise() {
        id = "S" + countS;
        countS++;
        type = "supplier";
        this.organisationDirectory.addOrganisation(new SupplierOrganisation());
    }

}
