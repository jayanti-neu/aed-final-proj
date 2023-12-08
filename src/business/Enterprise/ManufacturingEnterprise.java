/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import business.Organisation.ManufactureAdminOrganisation;
import business.Organisation.ManufacturePackerOrganisation;
import business.Organisation.ManufactureProcessorOrganisation;
import business.Product.FinalProduct;
import business.Product.RawProduct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jayanti
 */
public class ManufacturingEnterprise extends Enterprise{
    ArrayList<FinalProduct> finalProductList;
    Map<Integer, Integer> inventory; //productId, quantity
    Map<Integer, ArrayList<Integer>> recipe; //finalProductId, listOfRawProductsNeededToMakeRawProduct
    ArrayList<RawProduct> rawProductList;
    
    public ManufacturingEnterprise(){
        this.organisationDirectory.addOrganisation(new ManufactureAdminOrganisation());
        this.organisationDirectory.addOrganisation(new ManufactureProcessorOrganisation());
        this.organisationDirectory.addOrganisation(new ManufacturePackerOrganisation());
        finalProductList = new ArrayList<>();
        rawProductList = new ArrayList<>();
        inventory = new HashMap<>();
        recipe = new HashMap<>();
        createFinalProductList();
        createRawProductList();
        createRecipes();
    }
    
    public FinalProduct findProduct(int id){
        for (FinalProduct fp: finalProductList){
            System.out.println(fp);
            System.out.println(fp.getId());
            if (fp.getId() == id){
                return fp;
            }
        }
        return null;
    }
    
    public void createFinalProductList(){
        FinalProduct fp1 = new FinalProduct();
        fp1.setName("fp1");
        finalProductList.add(fp1);
        inventory.put(fp1.getId(), 10);
        FinalProduct fp2 = new FinalProduct();
        fp2.setName("fp2");
        finalProductList.add(fp2);
        inventory.put(fp2.getId(), 20);
        FinalProduct fp3 = new FinalProduct();
        fp3.setName("fp13");
        finalProductList.add(fp3);
        inventory.put(fp3.getId(), 30);
    }
    
    public void createRawProductList(){
        RawProduct rp1 = new RawProduct();
        rp1.setName("rp1");
        rawProductList.add(rp1);
        RawProduct rp2 = new RawProduct();
        rp2.setName("rp2");
        rawProductList.add(rp2);
        RawProduct rp3 = new RawProduct();
        rp3.setName("rp3");
        rawProductList.add(rp3);
    }
    
    public void createRecipes(){
        ArrayList<Integer> rawIngredients = new ArrayList<>();
        rawIngredients.add(1);
        rawIngredients.add(2);
        recipe.put(1, rawIngredients);
        
        ArrayList<Integer> rawIngredients2 = new ArrayList<>();
        rawIngredients2.add(2);
        rawIngredients2.add(3);
        recipe.put(2, rawIngredients2);
        
        ArrayList<Integer> rawIngredients3 = new ArrayList<>();
        rawIngredients3.add(1);
        rawIngredients3.add(3);
        recipe.put(3, rawIngredients3);
        
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

    public Map<Integer, ArrayList<Integer>> getRecipe() {
        return recipe;
    }

    public void setRecipe(Map<Integer, ArrayList<Integer>> recipe) {
        this.recipe = recipe;
    }

    public ArrayList<RawProduct> getRawProductList() {
        return rawProductList;
    }

    public void setRawProductList(ArrayList<RawProduct> rawProductList) {
        this.rawProductList = rawProductList;
    }
    
    
}
