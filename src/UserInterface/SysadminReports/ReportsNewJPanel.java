/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SysadminReports;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class ReportsNewJPanel extends javax.swing.JPanel {
    private JPanel sysAdminContainer;
    private EcoSystem system;
    /**
     * Creates new form ReportsNewJPanel
     */
    public ReportsNewJPanel(JPanel sysAdminContainer, EcoSystem system) {
        initComponents();
         this.sysAdminContainer = sysAdminContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        mostPopularMedicinejButton = new javax.swing.JButton();
        graphicalformVitalSignjButton = new javax.swing.JButton();
        bestPatientjButton = new javax.swing.JButton();
        MostPopularTestjButton = new javax.swing.JButton();

        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton10.setText("jButton1");

        mostPopularMedicinejButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mostPopularMedicinejButton.setText("Most Popular Medicine");
        mostPopularMedicinejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostPopularMedicinejButtonActionPerformed(evt);
            }
        });

        graphicalformVitalSignjButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        graphicalformVitalSignjButton.setText("Vital Sign in Graphical form");
        graphicalformVitalSignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphicalformVitalSignjButtonActionPerformed(evt);
            }
        });

        bestPatientjButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bestPatientjButton.setText("Best Patient");
        bestPatientjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestPatientjButtonActionPerformed(evt);
            }
        });

        MostPopularTestjButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MostPopularTestjButton.setText("Most Popular Test");
        MostPopularTestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostPopularTestjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(graphicalformVitalSignjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bestPatientjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostPopularMedicinejButton, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(MostPopularTestjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostPopularTestjButton)
                    .addComponent(graphicalformVitalSignjButton)
                    .addComponent(mostPopularMedicinejButton))
                .addGap(74, 74, 74)
                .addComponent(bestPatientjButton)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void graphicalformVitalSignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphicalformVitalSignjButtonActionPerformed
        // TODO add your handling code here:
         VitalSignGraphicalFormPanel vtalSignGraphicalFormPanel = new VitalSignGraphicalFormPanel(sysAdminContainer, system);
        sysAdminContainer.add("VitalSignGraphicalFormPanel", vtalSignGraphicalFormPanel);
        CardLayout layout = (CardLayout) sysAdminContainer.getLayout();
        layout.next(sysAdminContainer);
        
    }//GEN-LAST:event_graphicalformVitalSignjButtonActionPerformed

    private void mostPopularMedicinejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostPopularMedicinejButtonActionPerformed
        // TODO add your handling code here:
        MostPopularMedicineJPanel mostPopularMedicineJPanel = new MostPopularMedicineJPanel(sysAdminContainer, system);
        sysAdminContainer.add("MostPopularMedicineJPanel", mostPopularMedicineJPanel);
        CardLayout layout = (CardLayout) sysAdminContainer.getLayout();
        layout.next(sysAdminContainer);
    }//GEN-LAST:event_mostPopularMedicinejButtonActionPerformed

    private void MostPopularTestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostPopularTestjButtonActionPerformed
        // TODO add your handling code here:
         MostPopularTestJPanel mostPopularTestJPanel = new MostPopularTestJPanel(sysAdminContainer, system);
        sysAdminContainer.add("MostPopularTestJPanel", mostPopularTestJPanel);
        CardLayout layout = (CardLayout) sysAdminContainer.getLayout();
        layout.next(sysAdminContainer);
    }//GEN-LAST:event_MostPopularTestjButtonActionPerformed

    private void bestPatientjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestPatientjButtonActionPerformed
        // TODO add your handling code here:
        PatientRankingJPanel patientRankingJPanel = new PatientRankingJPanel(sysAdminContainer, system);
        sysAdminContainer.add("MostPopularTestJPanel", patientRankingJPanel);
        CardLayout layout = (CardLayout) sysAdminContainer.getLayout();
        layout.next(sysAdminContainer);
    }//GEN-LAST:event_bestPatientjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MostPopularTestjButton;
    private javax.swing.JButton bestPatientjButton;
    private javax.swing.JButton graphicalformVitalSignjButton;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton mostPopularMedicinejButton;
    // End of variables declaration//GEN-END:variables
}
