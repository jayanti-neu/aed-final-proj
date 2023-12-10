/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;


import business.Business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author eesitasen
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    
    JPanel userProcessContainer;
    Business business;
    public AdminWorkAreaJPanel(Business business, JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        System.out.println("-----inside AdminWorkAreaJPanel-----");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageSupplierJButton = new javax.swing.JButton();
        manageManufacturerJButton = new javax.swing.JButton();
        manageRetailerJButton = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        ManageTransportationJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        ManageSupplierJButton.setText("Manage Supplier");
        ManageSupplierJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageSupplierJButtonActionPerformed(evt);
            }
        });

        manageManufacturerJButton.setText("Manage Manufacturer");
        manageManufacturerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageManufacturerJButtonActionPerformed(evt);
            }
        });

        manageRetailerJButton.setText("Manage Retailer");
        manageRetailerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRetailerJButtonActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTitle.setText("Administrative Work Area");

        ManageTransportationJButton.setText("Manage Transportation");
        ManageTransportationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageTransportationJButtonActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(ManageTransportationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageSupplierJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(manageRetailerJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageManufacturerJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGap(31, 31, 31)
                .addComponent(manageRetailerJButton)
                .addGap(18, 18, 18)
                .addComponent(manageManufacturerJButton)
                .addGap(18, 18, 18)
                .addComponent(ManageSupplierJButton)
                .addGap(18, 18, 18)
                .addComponent(ManageTransportationJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManageSupplierJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageSupplierJButtonActionPerformed
        // TODO add your handling code here:
        ManageSupplierJPanel manageSupplierJPanel = new ManageSupplierJPanel(business, userProcessContainer);
        userProcessContainer.add("ManageSupplierJPanel", manageSupplierJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageSupplierJButtonActionPerformed

    private void manageManufacturerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageManufacturerJButtonActionPerformed

        ManageManufacturerJPanel manageManufacturerJPanel = new ManageManufacturerJPanel(business, userProcessContainer);
        userProcessContainer.add("ManageManufacturerJPanel", manageManufacturerJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageManufacturerJButtonActionPerformed

    private void manageRetailerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRetailerJButtonActionPerformed

        ManageRetailerJPanel manageRetailerJPanel = new ManageRetailerJPanel(business, userProcessContainer);
        userProcessContainer.add("ManageRetailerJPanel", manageRetailerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageRetailerJButtonActionPerformed

    private void ManageTransportationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageTransportationJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageTransportationJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageSupplierJButton;
    private javax.swing.JButton ManageTransportationJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JButton manageManufacturerJButton;
    private javax.swing.JButton manageRetailerJButton;
    // End of variables declaration//GEN-END:variables
}
