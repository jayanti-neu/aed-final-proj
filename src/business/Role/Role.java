/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.RetailerRole.RetailerOrderProductJPanel;

/**
 *
 * @author jayanti
 */
public class Role {
    public void openRolesWorkPage(JPanel workAreaPanel,UserAccount userAccount){
        if (this instanceof RetailerRole){
            RetailerOrderProductJPanel ropjp = new RetailerOrderProductJPanel(workAreaPanel, userAccount);
            CardLayout layout = (CardLayout) workAreaPanel.getLayout();
            workAreaPanel.add("RetailerOrderProductJPanel", ropjp);
            layout.next(workAreaPanel);
        }
    }
}
