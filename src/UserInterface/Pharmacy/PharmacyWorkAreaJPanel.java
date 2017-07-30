/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Pharmacy;

import Business.Db4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NewOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Admin.ManageEmployeeJPanel;
import UserInterface.Admin.ManageNewDepartmentsJPanel;
import UserInterface.Admin.ManageOrganizationJPanel;
import UserInterface.Admin.ManageUserJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class PharmacyWorkAreaJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private DB4OUtil dB4OUtil;
    private Enterprise enterprise;
    private NewOrganization organization;
    private Network network;
    /**
     * Creates new form PharmacyWorkAreaJPanel
     */
    public PharmacyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system,Enterprise enterprise,Network network,NewOrganization organization,DB4OUtil dB4OUtil) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.enterprise=enterprise;
        this.organization=organization;
        this.network=network;
        welcomejLabel.setText("Welcome " + account.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoutjButton = new javax.swing.JButton();
        welcomejLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        manageOrganizationjButton = new javax.swing.JButton();
        manageEmployeejButton = new javax.swing.JButton();
        manageEnterpriseAccessjButton1 = new javax.swing.JButton();
        AddDrugjButton = new javax.swing.JButton();
        pharmaContainer = new javax.swing.JPanel();

        logoutjButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logoutjButton.setText("Logout");
        logoutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutjButtonActionPerformed(evt);
            }
        });

        welcomejLabel.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        welcomejLabel.setForeground(new java.awt.Color(0, 0, 255));
        welcomejLabel.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Pharmacy/Pharmacy.jpg"))); // NOI18N

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        manageOrganizationjButton.setText("Manage Organization");
        manageOrganizationjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationjButtonActionPerformed(evt);
            }
        });

        manageEmployeejButton.setText("Manage Employee");
        manageEmployeejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeejButtonActionPerformed(evt);
            }
        });

        manageEnterpriseAccessjButton1.setText("Manage User");
        manageEnterpriseAccessjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAccessjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageEmployeejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(manageOrganizationjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(manageEnterpriseAccessjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(manageOrganizationjButton)
                .addGap(29, 29, 29)
                .addComponent(manageEmployeejButton)
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addComponent(manageEnterpriseAccessjButton1)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );

        AddDrugjButton.setText("Add Drug");
        AddDrugjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrugjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddDrugjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(AddDrugjButton)
                .addGap(122, 122, 122))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jSplitPane1.setLeftComponent(jPanel3);

        pharmaContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(pharmaContainer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(759, Short.MAX_VALUE)
                .addComponent(welcomejLabel)
                .addGap(152, 152, 152)
                .addComponent(logoutjButton)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(410, 410, 410)
                            .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutjButton)
                    .addComponent(welcomejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 320, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(233, 233, 233)
                            .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 14, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1117, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutjButtonActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_logoutjButtonActionPerformed

    private void manageOrganizationjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationjButtonActionPerformed
        // TODO add your handling code here:        ManagePharmacyOrganizationJPanel manageOrganizationJPanel = new ManagePharmacyOrganizationJPanel(adminContainer,system);
        ManageOrganizationPharmaJPanel manageorganizationJPanel = new ManageOrganizationPharmaJPanel(pharmaContainer,enterprise.getOrganizationDirectory());
        pharmaContainer.add("ManageOrganizationPharmaJPanel", manageorganizationJPanel);
        CardLayout layout = (CardLayout) pharmaContainer.getLayout();
        layout.next(pharmaContainer);
        
    }//GEN-LAST:event_manageOrganizationjButtonActionPerformed

    private void manageEmployeejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeejButtonActionPerformed
        // TODO add your handling code here:
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(pharmaContainer, enterprise);
        pharmaContainer.add("manageNetworkJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) pharmaContainer.getLayout();
        layout.next(pharmaContainer);
    }//GEN-LAST:event_manageEmployeejButtonActionPerformed

    private void manageEnterpriseAccessjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAccessjButton1ActionPerformed
        // TODO add your handling code here:
        ManageUserJPanel manageUserJPanel = new ManageUserJPanel(pharmaContainer, enterprise);
        pharmaContainer.add("ManageUserJPanel", manageUserJPanel);
        CardLayout layout = (CardLayout) pharmaContainer.getLayout();
        layout.next(pharmaContainer);
    }//GEN-LAST:event_manageEnterpriseAccessjButton1ActionPerformed

    private void AddDrugjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrugjButtonActionPerformed
        // TODO add your handling code here:
        ManageDrugInventoryJPanel manageDrugInventoryJPanel = new ManageDrugInventoryJPanel(pharmaContainer, enterprise,system);
        pharmaContainer.add("ManageDrugInventoryJPanel", manageDrugInventoryJPanel);
        CardLayout layout = (CardLayout) pharmaContainer.getLayout();
        layout.next(pharmaContainer);
    }//GEN-LAST:event_AddDrugjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDrugjButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutjButton;
    private javax.swing.JButton manageEmployeejButton;
    private javax.swing.JButton manageEnterpriseAccessjButton1;
    private javax.swing.JButton manageOrganizationjButton;
    private javax.swing.JPanel pharmaContainer;
    private javax.swing.JLabel welcomejLabel;
    // End of variables declaration//GEN-END:variables
}
