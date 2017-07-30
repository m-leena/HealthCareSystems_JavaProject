/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Patient;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NewOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khushbu
 */
public class MyInsuranceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private Enterprise enterprise;
    private NewOrganization organization;
    private Network network;

    /**
     * Creates new form MyInsuranceJPanel
     */
    public MyInsuranceJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, NewOrganization organization, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        coveragejLabel.setVisible(false);
        populateTable();
        java.util.Date date = new java.util.Date();
        date = new Timestamp(date.getTime());
//        if (account.getPatient().getInsurance() == null) {
//            return;
//        } else {
//            if (account.getPatient().getInsurance().getExpiryDate().before(date) || account.getPatient().getInsurance().getCovrage() < 20) {
//                renewjButton.setEnabled(true);
//            }
//        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) insurancejTable.getModel();
        model.setRowCount(0);
        for (Patient p : enterprise.getPatientDirectory().getPatientDir()) {
            if (p.equals(account.getPatient())) {
                if (p.getInsurance() == null) {
                } else {
                    Object[] row = new Object[3];
                    row[0] = p.getInsurance().getInsuranceId();
                    row[1] = p.getInsurance().getCovrage();
                    row[2] = p.getInsurance().getExpiryDate();

                    model.addRow(row);
                }
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        insurancejTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        renewjButton = new javax.swing.JButton();
        coveragejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        coveragejLabel = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        insurancejTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        insurancejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Insurace ID", "Insurance Coverage", "Expiry Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(insurancejTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("My Insurace Details");

        renewjButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        renewjButton.setText("Renew");
        renewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewjButtonActionPerformed(evt);
            }
        });

        coveragejTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        coveragejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                coveragejTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Coverage");

        coveragejLabel.setForeground(new java.awt.Color(255, 51, 51));
        coveragejLabel.setText("*Numeri only");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coveragejLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(coveragejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(renewjButton)))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renewjButton)
                    .addComponent(coveragejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coveragejLabel)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void renewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewjButtonActionPerformed
        // TODO add your handling code here:
        if (coveragejTextField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide the Coverage", "Incomplete Form", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int coverage = Integer.parseInt(coveragejTextField.getText());
            Date today = new Date();
            Date current = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(current);
            cal.set(Calendar.MONTH, (cal.get(Calendar.MONTH) + 6));
            current = cal.getTime();
            account.getPatient().getInsurance().setExpiryDate(current);
            account.getPatient().getInsurance().setCovrage(coverage);
            account.getPatient().getInsurance().setLastModifiedby(account);
            account.getPatient().getInsurance().setLastModifiedDate(today);
            populateTable();
        }
    }//GEN-LAST:event_renewjButtonActionPerformed

    private void coveragejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coveragejTextFieldKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if (!(Character.isDigit(a) || a == KeyEvent.VK_DELETE || a == KeyEvent.VK_BACK_SPACE)) {
            coveragejLabel.setVisible(true);
            evt.consume();
        }
    }//GEN-LAST:event_coveragejTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coveragejLabel;
    private javax.swing.JTextField coveragejTextField;
    private javax.swing.JTable insurancejTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton renewjButton;
    // End of variables declaration//GEN-END:variables
}
