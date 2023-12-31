/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business.Business;
import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.ManufacturingAdminRole.AdminAssignWorkJPanel;
import ui.ManufacturingProcessorRole.ProcessorProcessProductJPanel;
import ui.RetailerRole.RetailerOrderProductJPanel;
import ui.SupplierRole.SupplierSupplyProductJPanel;

/**
 *
 * @author jayanti
 */
public class Role {
    public void openRolesWorkPage(JPanel workAreaPanel,UserAccount userAccount, Business business){
        if (this instanceof RetailerRole){
            RetailerOrderProductJPanel ropjp = new RetailerOrderProductJPanel(workAreaPanel, userAccount);
            CardLayout layout = (CardLayout) workAreaPanel.getLayout();
            workAreaPanel.add("RetailerOrderProductJPanel", ropjp);
            layout.next(workAreaPanel);
        } else if (this instanceof ManufactureProcessorRole){
            ProcessorProcessProductJPanel pppjp = new ProcessorProcessProductJPanel(workAreaPanel, userAccount);
            CardLayout layout = (CardLayout) workAreaPanel.getLayout();
            workAreaPanel.add("ProcessorProcessProductJPanel", pppjp);
            layout.next(workAreaPanel);
        } else if (this instanceof ManufactureAdminRole){
            AdminAssignWorkJPanel aawjp = new AdminAssignWorkJPanel(workAreaPanel, userAccount);
            CardLayout layout = (CardLayout) workAreaPanel.getLayout();
            workAreaPanel.add("AdminAssignWorkJPanel", aawjp);
            layout.next(workAreaPanel);
        } else if (this instanceof SupplierRole) {
            SupplierSupplyProductJPanel swjp = new SupplierSupplyProductJPanel(workAreaPanel, userAccount);
            CardLayout layout = (CardLayout) workAreaPanel.getLayout();
            workAreaPanel.add("SupplierSupplyProductJPanel", swjp);
            layout.next(workAreaPanel);
        }
    }
}
