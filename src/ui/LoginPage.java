/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author Atharva
 */
public class LoginPage extends javax.swing.JPanel {

    public JSplitPane jSplitPane;
    public JPanel leftJPanel;
    public JPanel rightJPanel;
    public JButton logoutJButton;
    
    /**
     * Creates new form LoginPage
     */
    public LoginPage(JSplitPane jSplitPane, JPanel leftJPanel, JPanel rightJPanel, JButton logoutJButton) {
        initComponents();
        this.jSplitPane = jSplitPane;
        this.leftJPanel = leftJPanel;
        this.rightJPanel = rightJPanel;
        this.logoutJButton = logoutJButton;
        jSplitPane.setDividerLocation(0);
    }

    LoginPage() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordJField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(11, 48, 56));

        userJField.setBackground(new java.awt.Color(238, 238, 238));
        userJField.setForeground(new java.awt.Color(0, 0, 0));
        userJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        userJField.setToolTipText("Click to enter your Email ID.");
        userJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        userJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userJFieldFocusLost(evt);
            }
        });
        userJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login!");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Role:");

        comboRole.setForeground(new java.awt.Color(255, 255, 255));
        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Hospital Admin", "Community Admin", "Patient", "Doctor" }));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password:");

        passwordJField.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/recep.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userJField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(userJField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userJFieldFocusGained
        if (userJField.getText().equals("Enter email id")) {
            userJField.setText("");
        }
    }//GEN-LAST:event_userJFieldFocusGained

    private void userJFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userJFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_userJFieldFocusLost

    private void userJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userJFieldActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        String userName = userJField.getText();
        String userPassword = passwordJField.getText();
        Object userRole = comboRole.getSelectedItem();
        
        {
        if(userName.contains("Admin") && userPassword.contains("Admin123") && userRole.equals("System Admin")){
            JOptionPane.showMessageDialog(this,"Welcome System Admin");
            AdminDashboard adminDashboard = new AdminDashboard();
            AdminLeftSection adminOptions = new AdminLeftSection(jSplitPane, leftJPanel, rightJPanel);
            jSplitPane.setRightComponent(adminDashboard);
            jSplitPane.setLeftComponent(adminOptions);  
            logoutJButton.setVisible(true);
            userJField.setText("");
            passwordJField.setText("");
        }
        if(userName.contains("Com Admin") && userPassword.contains("CAdmin123") && userRole.equals("Community Admin")){
            JOptionPane.showMessageDialog(this,"Welcome Community Admin");
            AdminDashboard adminDashboard = new AdminDashboard();
            CAdminLeftSection adminOptions = new CAdminLeftSection(jSplitPane, leftJPanel, rightJPanel);
            jSplitPane.setRightComponent(adminDashboard);
            jSplitPane.setLeftComponent(adminOptions);
            logoutJButton.setVisible(true);
            userJField.setText("");
            passwordJField.setText("");
        }
        if(userName.contains("Atharva") && userPassword.contains("Atharva123") && userRole.equals("Patient")){
            JOptionPane.showMessageDialog(this,"Welcome");
            AdminDashboard adminDashboard = new AdminDashboard();
            PatientLeftSection adminOptions = new PatientLeftSection(jSplitPane, leftJPanel, rightJPanel);
            jSplitPane.setRightComponent(adminDashboard);
            jSplitPane.setLeftComponent(adminOptions);      
            logoutJButton.setVisible(true);
            userJField.setText("");
            passwordJField.setText("");
        }
         if(userName.contains("Doc John") && userPassword.contains("Doc123") && userRole.equals("Doctor")){
            JOptionPane.showMessageDialog(this,"Welcome Doctor");
            AdminDashboard adminDashboard = new AdminDashboard();
            DoctorLeftSection adminOptions = new DoctorLeftSection(jSplitPane, leftJPanel, rightJPanel);
            jSplitPane.setRightComponent(adminDashboard);
            jSplitPane.setLeftComponent(adminOptions);   
            logoutJButton.setVisible(true);
            userJField.setText("");
            passwordJField.setText("");
        }
        if(userName.contains("HAdmin") && userPassword.contains("HAdmin123") && userRole.equals("Hospital Admin")){
            JOptionPane.showMessageDialog(this,"Welcome Hospital Admin");
            AdminDashboard adminDashboard = new AdminDashboard();
            HospitalAdminLeftSection adminOptions = new HospitalAdminLeftSection(jSplitPane, leftJPanel, rightJPanel);
            jSplitPane.setRightComponent(adminDashboard);
            jSplitPane.setLeftComponent(adminOptions);   
            logoutJButton.setVisible(true);
            userJField.setText("");
            passwordJField.setText("");
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passwordJField;
    private javax.swing.JTextField userJField;
    // End of variables declaration//GEN-END:variables
}
