/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Product.FinalProduct;
import business.Product.RawProduct;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author jayanti
 */
public class ManufacturingEnterprise extends Enterprise{
    ArrayList<FinalProduct> productListRetailerSells;
    Map<Integer, Integer> inventory; //productId, quantity
    Map<Integer, ArrayList<RawProduct>> recipe; //finalProductId, listOfRawProductsNeededToMakeRawProduct
    ArrayList<RawProduct> rawProductList;
    
    public ManufacturingEnterprise(){
        System.out.println("Yet to be made");
    }
    
}
