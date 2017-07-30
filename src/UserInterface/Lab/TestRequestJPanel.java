/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Business.EcoSystem;
import Business.Email.Email;
import Business.Enterprise.Enterprise;
import Business.LabTestWorkRequest.LabTestWorkRequest;
import Business.Network.Network;
import Business.Organization.NewOrganization;
import Business.UserAccount.UserAccount;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class TestRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private Enterprise enterprise;
    private NewOrganization organization;
    private Network network;

    /**
     * Creates new form TestRequestJPanel
     */
    public TestRequestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, NewOrganization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        testResultjLabel.setVisible(false);
        testDescjLabel.setVisible(false);
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) LabTestworkRequestjTable.getModel();

        model.setRowCount(0);

        for (LabTestWorkRequest request : organization.getLabTestWorkQueue().getWorkRequestList()) {

            Object row[] = new Object[9];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = request.getPatient();
            row[4] = request.getStatus();
            row[5] = request.getResult();
            row[6] = request.getResultDesc();
            row[7] = request.getRequestDate();
            row[8] = request.getDeliveredDate();
            if (!request.getStatus().equals("Completed")) {
                ((DefaultTableModel) LabTestworkRequestjTable.getModel()).addRow(row);
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

        processOrderjButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        testResultjTextField = new javax.swing.JTextField();
        testDescjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LabTestworkRequestjTable = new javax.swing.JTable();
        testDescjLabel = new javax.swing.JLabel();
        testResultjLabel = new javax.swing.JLabel();

        processOrderjButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        processOrderjButton.setText("Process Order");
        processOrderjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processOrderjButtonActionPerformed(evt);
            }
        });

        assignJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        testResultjTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        testResultjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                testResultjTextFieldKeyTyped(evt);
            }
        });

        testDescjTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        testDescjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                testDescjTextFieldKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Test Result");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Desc");

        LabTestworkRequestjTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LabTestworkRequestjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Name", "Sender", "Receiver", "Patient", "Status", "Result", "ResultDesc", "Request Sent Date", "Completed Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(LabTestworkRequestjTable);

        testDescjLabel.setForeground(new java.awt.Color(255, 51, 51));
        testDescjLabel.setText("*Alphanumeric only");

        testResultjLabel.setForeground(new java.awt.Color(255, 51, 51));
        testResultjLabel.setText("*Alphanumeric only");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testDescjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testResultjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testResultjLabel)
                            .addComponent(testDescjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(processOrderjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(assignJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assignJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(testResultjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testResultjLabel))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processOrderjButton)
                    .addComponent(jLabel2)
                    .addComponent(testDescjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testDescjLabel))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processOrderjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processOrderjButtonActionPerformed
        // TODO add your handling code here:
        int row = LabTestworkRequestjTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        LabTestWorkRequest wr = (LabTestWorkRequest) LabTestworkRequestjTable.getValueAt(row, 0);
        java.util.Date date = new java.util.Date();
        date = new Timestamp(date.getTime());
        int coverage = wr.getPatient().getInsurance().getCovrage();
        int amt = coverage - wr.getLabTest().getPrice();
        
            if (testResultjTextField.getText().trim().isEmpty() || testDescjTextField.getText().trim().isEmpty()) {
              JOptionPane.showMessageDialog(null, "Please provide input for all fields", "Incomplete Form", JOptionPane.INFORMATION_MESSAGE);  
            }
        else {
        wr.getPatient().getInsurance().setCovrage(amt);
        wr.setDeliveredDate(date);
        wr.setStatus("Completed");
        wr.setReceiver(account);
        wr.setResult(testResultjTextField.getText());
        wr.setResultDesc(testDescjTextField.getText());
        populateTable();
            }
    }//GEN-LAST:event_processOrderjButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = LabTestworkRequestjTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        } else {
            LabTestWorkRequest request = (LabTestWorkRequest) LabTestworkRequestjTable.getValueAt(selectedRow, 0);

            if (request.getReceiver() == null || request.getReceiver().equals(account)) {
                if (request.getPatient().getInsurance().getCovrage() < request.getLabTest().getPrice()) {
                    String emailId = "healthcare.aed@gmail.com";
                    String password = "kitty@123";
                    String message = "Kindly renew Your Insurance as your tset bill is" + request.getLabTest().getPrice() + "and your insurance amount is" + request.getPatient().getInsurance().getCovrage() + " and its expirydate is " + request.getSender().getPatient().getInsurance().getExpiryDate();;
                    Email.sendMail(emailId, password, message, request.getSender().getPatient().getEmailID());
                    JOptionPane.showMessageDialog(null, "Insufficient Coverage", "Information", JOptionPane.WARNING_MESSAGE);

                } else {
                    request.setReceiver(account);
                    request.setStatus("Pending");
                    populateTable();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Already Assigned", "Information", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void testDescjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_testDescjTextFieldKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
//
        char a = evt.getKeyChar();
        if (!(Character.isAlphabetic(a) || Character.isDigit(a) || a == KeyEvent.VK_DELETE || a == KeyEvent.VK_BACK_SPACE)) {
            testDescjLabel.setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_testDescjTextFieldKeyTyped

    private void testResultjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_testResultjTextFieldKeyTyped
        // TODO add your handling code here:
        //
        char a = evt.getKeyChar();
        if (!(Character.isAlphabetic(a) || Character.isDigit(a) || a == KeyEvent.VK_DELETE || a == KeyEvent.VK_BACK_SPACE)) {
            testResultjLabel.setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_testResultjTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LabTestworkRequestjTable;
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processOrderjButton;
    private javax.swing.JLabel testDescjLabel;
    private javax.swing.JTextField testDescjTextField;
    private javax.swing.JLabel testResultjLabel;
    private javax.swing.JTextField testResultjTextField;
    // End of variables declaration//GEN-END:variables
}
