/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Business.Business;
import business.Organisation.SupplierOrganisation;
import business.Product.FinalProduct;
import business.Product.RawProduct;
import business.Product.Recipe;
import java.util.ArrayList;
import java.util.HashMap;
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
        setType("supplier");
        finalProductList = Business.getInstance().getListOfProductsThisBusinessSells();
        this.organisationDirectory.addOrganisation(new SupplierOrganisation(this));
        inventory = new HashMap<>();
    }

        public void createInventory(){
        for (FinalProduct fp : finalProductList){
            inventory.put(fp.getId(), 20); //Change inventory quantity rand 
        }
    }
    
    public FinalProduct findProduct(int id) {
        for (FinalProduct fp : finalProductList) {
            if (fp.getId() == id) {
                return fp;
            }
        }
        return null;
    }
        public void createFinalProductList(){
        FinalProduct fp1 = new FinalProduct();
        fp1.setName("fp1");
//        recipe 1
        Recipe r1 = new Recipe();
//        r1.setQuantity(5);
//        raw product 1
        RawProduct rp1 = new RawProduct();
        rp1.setName("rp1");
        
//        r1.setRawProductId(rp1.getId());
//        recipe 2
        Recipe r2 = new Recipe();
//        r2.setQuantity(14);
//        raw product 2
        RawProduct rp2 = new RawProduct();
        rp2.setName("rp2");
//        r2.setRawProductId(rp2.getId());
        
//        fp1.getRecipeList().add(r1);
//        fp1.getRecipeList().add(r2);
        finalProductList.add(fp1);
        inventory.put(fp1.getId(), 10);
//   -------------------------------------------
        FinalProduct fp2 = new FinalProduct();
        fp2.setName("fp2");
//        recipe 3
        Recipe r3 = new Recipe();
//        r3.setQuantity(10);
//        r3.setRawProductId(rp2.getId());
        
//        fp2.getRecipeList().add(r3);  
        finalProductList.add(fp2);
        inventory.put(fp2.getId(), 20);

//   ----------------------------------------------     
        FinalProduct fp3 = new FinalProduct();
        Recipe r4 = new Recipe();
//        r4.setRawProductId(rp1.getId());
//        r4.setQuantity(14);
//        fp3.getRecipeList().add(r4);
        fp3.setName("fp13");
        finalProductList.add(fp3);
        inventory.put(fp3.getId(), 30);
    }
    
    public ArrayList<FinalProduct> getFinalProductList() {
        return finalProductList;
    }

    public void setFinalProductList(ArrayList<FinalProduct> finalProductList) {
        this.finalProductList = finalProductList;
    }

    public Map<Integer, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(Map<Integer, Integer> inventory) {
        this.inventory = inventory;
    }
}