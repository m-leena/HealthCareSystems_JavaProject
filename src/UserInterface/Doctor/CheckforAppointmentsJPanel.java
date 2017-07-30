/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.Appointments.Appointment;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NewOrganization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class CheckforAppointmentsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private Enterprise enterprise;
    private NewOrganization organization;
    private Network network;

    /**
     * Creates new form CheckforAppointments
     */
    public CheckforAppointmentsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, NewOrganization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) appiontmentsjTable.getModel();

        model.setRowCount(0);

        for (Appointment appointment : account.getAppointmentdir().getAppointmentdir()) {
            if (appointment.getAssignedTo().equals(account)) {
                Object[] row = new Object[5];
                row[0] = appointment;
                row[1] = appointment.getPatient().getName();
                row[2] = appointment.getStartTime();
                row[3] = appointment.getEndTime();
                row[4] = appointment.getStatus();

                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        appiontmentsjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        processjButton = new javax.swing.JButton();

        appiontmentsjTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        appiontmentsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment", "Patient", "Start time", "End Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appiontmentsjTable);
        if (appiontmentsjTable.getColumnModel().getColumnCount() > 0) {
            appiontmentsjTable.getColumnModel().getColumn(0).setResizable(false);
            appiontmentsjTable.getColumnModel().getColumn(1).setResizable(false);
            appiontmentsjTable.getColumnModel().getColumn(3).setResizable(false);
            appiontmentsjTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Appointment List");

        processjButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        processjButton.setText("Process");
        processjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(processjButton)
                        .addGap(0, 351, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(processjButton)
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processjButtonActionPerformed
        // TODO add your handling code here:

        int row = appiontmentsjTable.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Appointment appointment = (Appointment) appiontmentsjTable.getValueAt(row, 0);
        if (appointment.getStatus().equals("Completed")) {
           int result= JOptionPane.showConfirmDialog(null, "Already Processed!!still want to continue?", "Warning", JOptionPane.OK_CANCEL_OPTION);
           
           if (result==JOptionPane.OK_OPTION)
           {
           appointment.setStatus("Processing");
            UserAccount ua = appointment.getBookedBy();

            NewOrganization org = null;
            for (NewOrganization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof ReceptionistOrganization) {
                    org = organization;
                    break;
                }
            }
            processAppointmentJPanel processAppointmentJPanel = new processAppointmentJPanel(userProcessContainer, account, enterprise, network, organization, appointment);
            userProcessContainer.add("ManageDepartmentsJPanel", processAppointmentJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
           }else{}
            
        } else {
            appointment.setStatus("Processing");
            UserAccount ua = appointment.getBookedBy();

            NewOrganization org = null;
            for (NewOrganization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof ReceptionistOrganization) {
                    org = organization;
                    break;
                }
            }
            processAppointmentJPanel processAppointmentJPanel = new processAppointmentJPanel(userProcessContainer, account, enterprise, network, organization, appointment);
            userProcessContainer.add("ManageDepartmentsJPanel", processAppointmentJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_processjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appiontmentsjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processjButton;
    // End of variables declaration//GEN-END:variables
}
