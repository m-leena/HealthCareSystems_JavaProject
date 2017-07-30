/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin;


import Business.Department.Department;
import Business.Department.DepartmentDirectory;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author khushbu
 */
public class ManageNewDepartmentsJPanel extends javax.swing.JPanel {
    private DepartmentDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    /**
     * Creates new form ManageNewDepartmentsJPanel
     */
    public ManageNewDepartmentsJPanel(JPanel userProcessContainer,Enterprise enterprise) {
        initComponents();
        this.directory=directory;
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        headingjLabel.setText("Add Departments to "+enterprise.getName());
        populateTable();
        
    }
public void populateTable()
{
 DefaultTableModel model = (DefaultTableModel) depatmentsJTable.getModel();
        
        model.setRowCount(0);
        
        for (Department depatment : enterprise.getDepartmentDirectory().getDepartmentList()){
            Object[] row = new Object[2];
            row[0] = depatment.getDepartmentID();
            row[1] = depatment.getDepartmentName();
            
            model.addRow(row);
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

        namejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        depatmentsJTable = new javax.swing.JTable();
        headingjLabel = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        namejTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        depatmentsJTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        depatmentsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(depatmentsJTable);

        headingjLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        headingjLabel.setText("jLabel2");

        addJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addJButton.setText("Add Department");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(backJButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addJButton)
                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(headingjLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(headingjLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(addJButton))
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextFieldActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
       String name=namejTextField.getText();
       enterprise.getDepartmentDirectory().addDepartment(name);
       populateTable();
      
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable depatmentsJTable;
    private javax.swing.JLabel headingjLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namejTextField;
    // End of variables declaration//GEN-END:variables
}
