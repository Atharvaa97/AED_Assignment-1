/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;


import model.City;
import model.Community;

/**
 *
 * @author Atharva
 */
public class AdminDashboard extends javax.swing.JPanel {

    /**
     * Creates new form AdminDashboard
     *
     * @param jSplitPane
     */
    public AdminDashboard() {
        initComponents();
        getAllCommunities();
    }

    public void getAllCommunities() {
        int count = 0;
        for (int i = 0; i < City.allCities.size(); i++) {
            Community ongoing = City.allCities.get(i);
            count += 1;
        }
  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutJButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        logoutJButton2.setBackground(new java.awt.Color(0, 0, 0));
        logoutJButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logoutJButton2.setForeground(new java.awt.Color(255, 255, 255));
        logoutJButton2.setText("Logout");

        setBackground(new java.awt.Color(11, 48, 56));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Med.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(513, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutJButton2;
    // End of variables declaration//GEN-END:variables
}
