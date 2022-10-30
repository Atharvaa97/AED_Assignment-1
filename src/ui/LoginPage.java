/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.User;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
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

        loginJButton = new javax.swing.JButton();
        passwordJField = new javax.swing.JTextField();
        emailIDJField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        loginJButton1 = new javax.swing.JButton();
        loginJButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(11, 48, 56));

        loginJButton.setBackground(new java.awt.Color(200, 203, 178));
        loginJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(67, 100, 100));
        loginJButton.setText("System Admin Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        passwordJField.setBackground(new java.awt.Color(238, 238, 238));
        passwordJField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordJField.setText("Enter password");
        passwordJField.setToolTipText("Click to enter your Password.");
        passwordJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        passwordJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordJFieldFocusLost(evt);
            }
        });
        passwordJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJFieldActionPerformed(evt);
            }
        });

        emailIDJField.setBackground(new java.awt.Color(238, 238, 238));
        emailIDJField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailIDJField.setText("Enter email id");
        emailIDJField.setToolTipText("Click to enter your Email ID.");
        emailIDJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        emailIDJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailIDJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailIDJFieldFocusLost(evt);
            }
        });
        emailIDJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDJFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        loginJButton1.setBackground(new java.awt.Color(200, 203, 178));
        loginJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton1.setForeground(new java.awt.Color(67, 100, 100));
        loginJButton1.setText("Community Admin Login");
        loginJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButton1ActionPerformed(evt);
            }
        });

        loginJButton2.setBackground(new java.awt.Color(200, 203, 178));
        loginJButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton2.setForeground(new java.awt.Color(67, 100, 100));
        loginJButton2.setText("Doctor Login");
        loginJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailIDJField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(loginJButton)
                .addGap(33, 33, 33)
                .addComponent(loginJButton1)
                .addGap(34, 34, 34)
                .addComponent(loginJButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(174, 174, 174)
                .addComponent(emailIDJField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordJField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(232, 232, 232))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
                    AdminDashboard adminDashboard = new AdminDashboard();
                    AdminLeftSection adminOptions = new AdminLeftSection(jSplitPane, leftJPanel, rightJPanel);
                    jSplitPane.setRightComponent(adminDashboard);
                    jSplitPane.setLeftComponent(adminOptions);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void passwordJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJFieldFocusGained
        if (passwordJField.getText().equals("Enter password")) {
            passwordJField.setText("");
        }
    }//GEN-LAST:event_passwordJFieldFocusGained

    private void passwordJFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordJFieldFocusLost

    }//GEN-LAST:event_passwordJFieldFocusLost

    private void passwordJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJFieldActionPerformed

    private void emailIDJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIDJFieldFocusGained
        if (emailIDJField.getText().equals("Enter email id")) {
            emailIDJField.setText("");
        }
    }//GEN-LAST:event_emailIDJFieldFocusGained

    private void emailIDJFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIDJFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDJFieldFocusLost

    private void emailIDJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDJFieldActionPerformed

    private void loginJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButton1ActionPerformed
                    AdminDashboard adminDashboard = new AdminDashboard();
                    CAdminLeftSection adminOptions = new CAdminLeftSection(jSplitPane, leftJPanel, rightJPanel);
                    jSplitPane.setRightComponent(adminDashboard);
                    jSplitPane.setLeftComponent(adminOptions);       
    }//GEN-LAST:event_loginJButton1ActionPerformed

    private void loginJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButton2ActionPerformed
                    AdminDashboard adminDashboard = new AdminDashboard();
                    DoctorLeftSection adminOptions = new DoctorLeftSection(jSplitPane, leftJPanel, rightJPanel);
                    jSplitPane.setRightComponent(adminDashboard);
                    jSplitPane.setLeftComponent(adminOptions);    // TODO add your handling code here:
    }//GEN-LAST:event_loginJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailIDJField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton loginJButton1;
    private javax.swing.JButton loginJButton2;
    private javax.swing.JTextField passwordJField;
    // End of variables declaration//GEN-END:variables
}
