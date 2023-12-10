/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author eesitasen
 */
public class SupplierEnterpriseDirectory extends EnterpriseDirectory{

        public SupplierEnterprise createSupplierEnterprise(String name) {
            SupplierEnterprise supplierEnterprise = new SupplierEnterprise();
            supplierEnterprise.setName(name);
            enterpriseList.add(supplierEnterprise);
            return supplierEnterprise;
        }
}
