/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManufacturingAdminRole;

import business.Business.Business;
import business.Enterprise.Enterprise;
import business.Enterprise.ManufacturingEnterprise;
import business.Organisation.Organisation;
import business.Product.FinalProduct;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkQueue;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jayanti
 */
public class AdminAssignWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminAssignWorkJPanel
     */
    JPanel workJPanel;
    UserAccount userAccount;
    Business business;
    WorkQueue wq;
    ManufacturingEnterprise enterprise;
//    ManufactureOrganisation organisation;
    
    public AdminAssignWorkJPanel(JPanel workJPanel, UserAccount userAccount) {
        initComponents();
        this.workJPanel = workJPanel;
        this.userAccount = userAccount;
        this.business = Business.getInstance();
        this.wq = this.business.getGlobalWorkQueue();
        this.enterprise = business.getManufacturingEnterprise();
        populateTable();
        addEventListener();
        jButton4.setVisible(false);
    }
    
    public void updateInventory(){
        
    }
    
    public void updateIncomingRequestTable(){
       DefaultTableModel requested = (DefaultTableModel) jTable2.getModel();
        requested.setRowCount(0);
        for (WorkRequest wr: wq.getListOfRequests()){
            if (wr.getFromEnterprise().equals(this.business.getRetailerEnterprise())){
                int waitingforid = wr.getWaitingForId();
                String status = this.business.getGlobalWorkQueue().findWorkRequest(waitingforid).getStatus(); 
                if ("Approved".equals(status)){
                    wr.setStatus(status);
                    int quantityInInventory = this.enterprise.getInventory().get(wr.getProductId());
                    this.enterprise.getInventory().put(wr.getProductId(),quantityInInventory + wr.getQuantity());
                    JOptionPane.showMessageDialog(null, "The product has been approved with more quantity");
                    populateTable();
                }
            }
        } 
    }
    public void populateTable(){
                jTable2.removeAll();
        DefaultTableModel requested = (DefaultTableModel) jTable2.getModel();
        for (WorkRequest wr: wq.getListOfRequests()){
            if (wr.getFromEnterprise().equals(this.business.getRetailerEnterprise())){
                Object[] row = new Object[6];
                row[0] = wr.getId();
                row[1] = this.enterprise.findProduct(wr.getProductId());
                row[2] = wr.getQuantity();
                row[3] = this.enterprise.getInventory().get(wr.getProductId());
                row[4] = wr.getDateOfRequest();
                row[5] = wr.getStatus();
                requested.addRow(row);
            }
        }
    }
    
    public void addEventListener(){
        ListSelectionModel selectionModel = jTable2.getSelectionModel();

            // Add a ListSelectionListener to the selection model
            selectionModel.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        int selectedRow = jTable2.getSelectedRow();
                        if (selectedRow != -1) {
                            jButton4.setVisible(true);
                            int requiredQuantity = (int)jTable2.getValueAt(selectedRow, 2);
                            int availableQuantity = (int)jTable2.getValueAt(selectedRow, 3);
                            if (requiredQuantity <= availableQuantity){
                                jButton4.setText("Complete Work Request");
                                JOptionPane.showMessageDialog(null, "Congratulations work request can be successfully completed");
                                
                            } else {
                                jButton4.setText("Send for processing more");
                            }
                        }
                    }
                }
            });
    }
    
    public int createNewWorkRequest(FinalProduct fp, int amt){
        
        WorkRequest wr = this.business.getGlobalWorkQueue().addWorkRequest();
        wr.setQuantity(amt);
        wr.setFromEnterprise(enterprise);
        wr.setForEnterprise(this.business.getSupplierEnterprise());
        wr.setStatus("From Supplier");
        wr.setProductId(fp.getId());
        return wr.getId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Incoming Requests");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WorkRequestId", "Requested Final Product", "Requested Quantity", "Date of Request", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton4.setText("Hidden Button");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("View Inventory Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WorkRequestId", "Requested Final Product", "Requested Quantity", "Avail Quantity", "Date of Request", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Outgoing requests");

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(415, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0){
            System.out.println("nothing is selected");
        } else {
            System.out.println(selectedRow);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable2.getSelectedRow();
        int workRequestId = (int)jTable2.getValueAt(selectedRow, 0);
        WorkRequest wr = this.business.getGlobalWorkQueue().findWorkRequest(workRequestId);
//        wr.getWaitingForId();
        int requiredQuantity = (int)jTable2.getValueAt(selectedRow, 2);
        int availableQuantity = (int)jTable2.getValueAt(selectedRow, 3);
        int amtSendForProcessing = requiredQuantity - availableQuantity;
        if (amtSendForProcessing < 0){
            wr.setWaitingForId(-1);
            wr.setStatus("Approved");
            int quantityInInventory = this.enterprise.getInventory().get(wr.getProductId());
            this.enterprise.getInventory().put(wr.getProductId(),quantityInInventory - wr.getQuantity());

        }

        JOptionPane.showMessageDialog(null, "Sending for processing amount: " + amtSendForProcessing);
        int waitingid = createNewWorkRequest((FinalProduct)jTable2.getValueAt(selectedRow, 1), amtSendForProcessing);
        wr.setWaitingForId(waitingid);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        updateIncomingRequestTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) this.workJPanel.getLayout();
        this.workJPanel.remove(this);
        layout.previous(this.workJPanel);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
