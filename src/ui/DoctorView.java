/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.Doctor;
import model.DoctorDirectory;
import model.Person;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Atharva
 */

public class DoctorView extends javax.swing.JPanel {

    Doctor selectedPerson;
    
public DoctorView() {
        
            initComponents();

        for (int i = 0; i < DoctorDirectory.doctorDirectory.size(); i++) {
            Person sel = DoctorDirectory.doctorDirectory.get(i);
            System.out.println("Person directory" + sel.personId + "-" + sel.name);
        }

        jSplitPane1.setDividerLocation((int) (0.35 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));
        DefaultListModel model = new DefaultListModel();
        if (DoctorDirectory.doctorDirectory.isEmpty()) {
            uploadedJList.setModel(model);
            JOptionPane.showMessageDialog(this, "Doctor Directory Empty!", "View Details", ERROR_MESSAGE);
        }      
}
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        detailsJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identifierJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        zipCodeJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stateJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dobJLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emailJLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        mobileNoJLabel = new javax.swing.JLabel();
        jLabel_Hospital_Name = new javax.swing.JLabel();
        jLabel_Specialization = new javax.swing.JLabel();
        jLabel_Total_Experience = new javax.swing.JLabel();
        respiratoryRateJLabel = new javax.swing.JLabel();
        heartRateJLabel = new javax.swing.JLabel();
        ageJLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uploadedJList = new javax.swing.JList<>();

        setBackground(new java.awt.Color(11, 48, 56));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Directory");

        jPanel1.setBackground(new java.awt.Color(11, 48, 56));

        detailsJPanel.setBackground(new java.awt.Color(11, 48, 56));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        nameJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        nameJLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameJLabel.setText("Select Person to see details!");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hospital Name:");

        addressJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addressJLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressJLabel.setText("Select Person to see details!");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctor Identifier:");

        identifierJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        identifierJLabel.setForeground(new java.awt.Color(255, 255, 255));
        identifierJLabel.setText("Select Person to see details!");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Zip Code:");

        zipCodeJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        zipCodeJLabel.setForeground(new java.awt.Color(255, 255, 255));
        zipCodeJLabel.setText("Select Person to see details!");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City:");

        cityJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cityJLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityJLabel.setText("Select Person to see details!");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("State:");

        stateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        stateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        stateJLabel.setText("Select Person to see details!");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOB:");

        dobJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        dobJLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobJLabel.setText("Select Person to see details!");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email ID:");

        emailJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        emailJLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailJLabel.setText("Select Person to see details!");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Mobile No.:");

        mobileNoJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        mobileNoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobileNoJLabel.setText("Select Person to see details!");

        jLabel_Hospital_Name.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel_Hospital_Name.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Hospital_Name.setText("Hospital Name");

        jLabel_Specialization.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel_Specialization.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Specialization.setText("Specialization");

        jLabel_Total_Experience.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel_Total_Experience.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Total_Experience.setText("Total Experience");

        respiratoryRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        respiratoryRateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        respiratoryRateJLabel.setText("Select Person to see details!");

        heartRateJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        heartRateJLabel.setForeground(new java.awt.Color(255, 255, 255));
        heartRateJLabel.setText("Select Person to see details!");

        ageJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ageJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageJLabel.setText("Select Person to see details!");

        javax.swing.GroupLayout detailsJPanelLayout = new javax.swing.GroupLayout(detailsJPanel);
        detailsJPanel.setLayout(detailsJPanelLayout);
        detailsJPanelLayout.setHorizontalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailJLabel)
                            .addComponent(dobJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileNoJLabel)))
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Hospital_Name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Specialization, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Total_Experience, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respiratoryRateJLabel)
                            .addComponent(heartRateJLabel)
                            .addComponent(ageJLabel))
                        .addGap(6, 6, 6)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailsJPanelLayout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameJLabel)
                        .addComponent(addressJLabel)
                        .addComponent(identifierJLabel)
                        .addComponent(zipCodeJLabel)
                        .addComponent(cityJLabel)
                        .addComponent(stateJLabel))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        detailsJPanelLayout.setVerticalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dobJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(mobileNoJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Hospital_Name)
                    .addComponent(respiratoryRateJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Specialization)
                    .addComponent(heartRateJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Total_Experience)
                    .addComponent(ageJLabel))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(detailsJPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(identifierJLabel))
                    .addGap(18, 18, 18)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nameJLabel))
                    .addGap(18, 18, 18)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(addressJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(zipCodeJLabel))
                    .addGap(18, 18, 18)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cityJLabel))
                    .addGap(18, 18, 18)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(stateJLabel))
                    .addContainerGap(315, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(11, 48, 56));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Directory:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(512, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        uploadedJList.setBackground(new java.awt.Color(255, 255, 255));
        uploadedJList.setForeground(new java.awt.Color(51, 51, 55));
        uploadedJList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uploadedJListFocusGained(evt);
            }
        });
        uploadedJList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadedJListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uploadedJList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSplitPane1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jSplitPane1)
                    .addGap(22, 22, 22)))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void uploadedJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uploadedJListFocusGained
        try {
            openSelectedProfile();
        } catch (ParseException ex) {
            Logger.getLogger(DoctorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadedJListFocusGained

    private void uploadedJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadedJListMouseClicked
        try {
            openSelectedProfile();
        } catch (ParseException ex) {
            Logger.getLogger(DoctorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uploadedJListMouseClicked

    private void openSelectedProfile() throws ParseException {
               int seletedPersonIndex = uploadedJList.getSelectedIndex();
        if (seletedPersonIndex != -1) {
            selectedPerson = (Doctor) DoctorDirectory.doctorDirectory.get(seletedPersonIndex);
            identifierJLabel.setText(String.valueOf(selectedPerson.personDetails.personId));
            nameJLabel.setText(String.valueOf(selectedPerson.personDetails.name));
            addressJLabel.setText(String.valueOf(selectedPerson.personDetails.address));
            zipCodeJLabel.setText(String.valueOf(selectedPerson.personDetails.address.zipcode));
            cityJLabel.setText(String.valueOf(selectedPerson.personDetails.city.city));
            stateJLabel.setText(String.valueOf(selectedPerson.personDetails.city.state));
            dobJLabel.setText((String.valueOf((new SimpleDateFormat("MM/dd/yyyy", Locale.US)).format(selectedPerson.personDetails.dob))));
            emailJLabel.setText(String.valueOf(selectedPerson.personDetails.email));
            mobileNoJLabel.setText(String.valueOf(selectedPerson.personDetails.mobileNo));

            DefaultListModel model = new DefaultListModel();
            selectedPerson.allAppointmentsHistory.AppointmentHistory.forEach(doctor -> {
                model.addElement(doctor.visitDate);
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JPanel detailsJPanel;
    private javax.swing.JLabel dobJLabel;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JLabel heartRateJLabel;
    private javax.swing.JLabel identifierJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Hospital_Name;
    private javax.swing.JLabel jLabel_Specialization;
    private javax.swing.JLabel jLabel_Total_Experience;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel mobileNoJLabel;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel respiratoryRateJLabel;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JList<String> uploadedJList;
    private javax.swing.JLabel zipCodeJLabel;
    // End of variables declaration//GEN-END:variables
}
