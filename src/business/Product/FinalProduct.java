/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Product;

import java.util.ArrayList;

/**
 *
 * @author jayanti
 */
public class FinalProduct {
    int id;
    String name;
    static int count = 0;
    Recipe recipeForProduct;
    
    
    public FinalProduct(){
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return name;
    }
    
}
