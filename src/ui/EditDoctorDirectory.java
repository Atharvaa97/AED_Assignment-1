/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.City;
import model.Person;
import model.Person_Directory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Atharva
 */
public class EditDoctorDirectory extends javax.swing.JPanel {

    Person selectedProfile;
    int selectedIndex;
    public EditDoctorDirectory() {
        initComponents();
        jSplitPane1.setDividerLocation((int) (0.2 * (new Dimension(Toolkit.getDefaultToolkit().getScreenSize()).width - 300)));

        DefaultListModel model = new DefaultListModel();
        if (Person_Directory.allPeople.isEmpty()) {
            uploadedJList.setModel(model);
            JOptionPane.showMessageDialog(this, "No Doctor found!!", "Directory Details", ERROR_MESSAGE);
        } else {
            Person_Directory.allPeople.forEach(person -> {
                model.addElement(person.personId + " - " + person.name);
            });
            uploadedJList.setModel(model);
            uploadedJList.setSelectedIndex(0);
            generateDropdownCity();
            generateDropdownCommunity();
            openSelectedProfile();
        }
    }

    public void generateDropdownCity() {
        ArrayList<String> cityDropdown = new ArrayList<>();
        for (String cityValue : City.cityValues) {
            cityDropdown.add(String.valueOf(cityValue));
        }
        String[] citySDropdown = cityDropdown.toArray(new String[cityDropdown.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        cityJComboBox.setModel(yearsSDropdownModel);
    }

    public void generateDropdownCommunity() {
        ArrayList<String> communityDropdown = new ArrayList<>();
        City.allCities.stream().filter(communityValue -> (communityValue.city == null ? cityJComboBox.getSelectedItem().toString() == null : communityValue.city.equals(cityJComboBox.getSelectedItem().toString()))).forEachOrdered(communityValue -> {
            communityDropdown.add(String.valueOf(communityValue.communityName));
        });
        String[] citySDropdown = communityDropdown.toArray(new String[communityDropdown.size()]);
        DefaultComboBoxModel<String> yearsSDropdownModel = new DefaultComboBoxModel<>(citySDropdown);
        this.communityJComboBox.setModel(yearsSDropdownModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        nameJField = new javax.swing.JTextField();
        seatsJLabel = new javax.swing.JLabel();
        maintenanceExpiryJLabel = new javax.swing.JLabel();
        dobDayJField = new javax.swing.JTextField();
        dummyJField3 = new javax.swing.JTextField();
        dobMonthJField = new javax.swing.JTextField();
        dummyJField2 = new javax.swing.JTextField();
        dobYearJField = new javax.swing.JTextField();
        seatsJLabel1 = new javax.swing.JLabel();
        addressJField = new javax.swing.JTextField();
        seatsJLabel2 = new javax.swing.JLabel();
        zipJField = new javax.swing.JTextField();
        seatsJLabel3 = new javax.swing.JLabel();
        stateJField = new javax.swing.JTextField();
        seatsJLabel4 = new javax.swing.JLabel();
        cardentifierJLabel = new javax.swing.JLabel();
        personIdentifierJLabel = new javax.swing.JTextField();
        seatsJLabel5 = new javax.swing.JLabel();
        emailJField = new javax.swing.JTextField();
        dummyJField4 = new javax.swing.JTextField();
        dummyJField5 = new javax.swing.JTextField();
        phoneNoJField1 = new javax.swing.JTextField();
        dummyJField6 = new javax.swing.JTextField();
        phoneNoJField2 = new javax.swing.JTextField();
        dummyJField7 = new javax.swing.JTextField();
        phoneNoJField3 = new javax.swing.JTextField();
        seatsJLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        seatsJLabel7 = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        communityJComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uploadedJList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(11, 48, 56));

        nameJField.setBackground(new java.awt.Color(238, 238, 238));
        nameJField.setForeground(new java.awt.Color(0, 0, 0));
        nameJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameJField.setToolTipText("Click to enter your name.");
        nameJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        nameJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameJFieldnameChangeHandler(evt);
            }
        });
        nameJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJFieldActionPerformed(evt);
            }
        });

        seatsJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel.setText("Name :");

        maintenanceExpiryJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        maintenanceExpiryJLabel.setForeground(new java.awt.Color(255, 255, 255));
        maintenanceExpiryJLabel.setText("DOB :");

        dobDayJField.setBackground(new java.awt.Color(238, 238, 238));
        dobDayJField.setForeground(new java.awt.Color(0, 0, 0));
        dobDayJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dobDayJField.setText("DD");
        dobDayJField.setToolTipText("Enter date of birth here.");
        dobDayJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dobDayJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobDayJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobDayJFielddateOfBirthFocusLost(evt);
            }
        });
        dobDayJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobDayJFieldActionPerformed(evt);
            }
        });

        dummyJField3.setEditable(false);
        dummyJField3.setBackground(new java.awt.Color(238, 238, 238));
        dummyJField3.setForeground(new java.awt.Color(0, 0, 0));
        dummyJField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField3.setText("/");
        dummyJField3.setToolTipText("");
        dummyJField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField3ActionPerformed(evt);
            }
        });

        dobMonthJField.setBackground(new java.awt.Color(238, 238, 238));
        dobMonthJField.setForeground(new java.awt.Color(0, 0, 0));
        dobMonthJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dobMonthJField.setText("MM");
        dobMonthJField.setToolTipText("Enter date of birth here.");
        dobMonthJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dobMonthJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobMonthJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobMonthJFielddateOfBirthFocusLost(evt);
            }
        });
        dobMonthJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobMonthJFieldActionPerformed(evt);
            }
        });

        dummyJField2.setEditable(false);
        dummyJField2.setBackground(new java.awt.Color(238, 238, 238));
        dummyJField2.setForeground(new java.awt.Color(0, 0, 0));
        dummyJField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField2.setText("/");
        dummyJField2.setToolTipText("");
        dummyJField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField2ActionPerformed(evt);
            }
        });

        dobYearJField.setBackground(new java.awt.Color(238, 238, 238));
        dobYearJField.setForeground(new java.awt.Color(0, 0, 0));
        dobYearJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dobYearJField.setText("YYYY");
        dobYearJField.setToolTipText("Enter date of birth here.");
        dobYearJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dobYearJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dobYearJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dobYearJFielddateOfBirthFocusLost(evt);
            }
        });
        dobYearJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobYearJFieldActionPerformed(evt);
            }
        });

        seatsJLabel1.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel1.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel1.setText("Address:");

        addressJField.setBackground(new java.awt.Color(238, 238, 238));
        addressJField.setForeground(new java.awt.Color(0, 0, 0));
        addressJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addressJField.setToolTipText("Click to enter your name.");
        addressJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        addressJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressJFieldnameChangeHandler(evt);
            }
        });
        addressJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressJFieldActionPerformed(evt);
            }
        });

        seatsJLabel2.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel2.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel2.setText("ZipCode:");

        zipJField.setBackground(new java.awt.Color(238, 238, 238));
        zipJField.setForeground(new java.awt.Color(0, 0, 0));
        zipJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        zipJField.setToolTipText("Click to enter your name.");
        zipJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        zipJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zipJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipJFieldnameChangeHandler(evt);
            }
        });
        zipJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipJFieldActionPerformed(evt);
            }
        });

        seatsJLabel3.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel3.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel3.setText("State:");

        stateJField.setBackground(new java.awt.Color(238, 238, 238));
        stateJField.setForeground(new java.awt.Color(0, 0, 0));
        stateJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        stateJField.setToolTipText("Click to enter your name.");
        stateJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        stateJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stateJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                stateJFieldnameChangeHandler(evt);
            }
        });
        stateJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJFieldActionPerformed(evt);
            }
        });

        seatsJLabel4.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel4.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel4.setText("Community Name:");

        cardentifierJLabel.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        cardentifierJLabel.setForeground(new java.awt.Color(255, 255, 255));
        cardentifierJLabel.setText("Enrollment Number");

        personIdentifierJLabel.setEditable(false);
        personIdentifierJLabel.setBackground(new java.awt.Color(238, 238, 238));
        personIdentifierJLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        personIdentifierJLabel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        personIdentifierJLabel.setToolTipText("This is your identifier.");
        personIdentifierJLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        personIdentifierJLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personIdentifierJLabelActionPerformed(evt);
            }
        });

        seatsJLabel5.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel5.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel5.setText("Email ID:");

        emailJField.setBackground(new java.awt.Color(238, 238, 238));
        emailJField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailJField.setToolTipText("Click to enter your name.");
        emailJField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        emailJField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailJFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailJFieldnameChangeHandler(evt);
            }
        });
        emailJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailJFieldActionPerformed(evt);
            }
        });

        dummyJField4.setEditable(false);
        dummyJField4.setBackground(new java.awt.Color(238, 238, 238));
        dummyJField4.setForeground(new java.awt.Color(0, 0, 0));
        dummyJField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField4.setText("+1");
        dummyJField4.setToolTipText("");
        dummyJField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField4ActionPerformed(evt);
            }
        });

        dummyJField5.setEditable(false);
        dummyJField5.setBackground(new java.awt.Color(238, 238, 238));
        dummyJField5.setForeground(new java.awt.Color(0, 0, 0));
        dummyJField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField5.setText("(");
        dummyJField5.setToolTipText("");
        dummyJField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField5ActionPerformed(evt);
            }
        });

        phoneNoJField1.setBackground(new java.awt.Color(238, 238, 238));
        phoneNoJField1.setForeground(new java.awt.Color(0, 0, 0));
        phoneNoJField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNoJField1.setText("000");
        phoneNoJField1.setToolTipText("Enter phone no.");
        phoneNoJField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        phoneNoJField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNoJField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNoJField1phoneNoJField3FocusLost(evt);
            }
        });
        phoneNoJField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoJField1ActionPerformed(evt);
            }
        });

        dummyJField6.setEditable(false);
        dummyJField6.setBackground(new java.awt.Color(238, 238, 238));
        dummyJField6.setForeground(new java.awt.Color(0, 0, 0));
        dummyJField6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField6.setText(")");
        dummyJField6.setToolTipText("");
        dummyJField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField6ActionPerformed(evt);
            }
        });

        phoneNoJField2.setBackground(new java.awt.Color(238, 238, 238));
        phoneNoJField2.setForeground(new java.awt.Color(0, 0, 0));
        phoneNoJField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNoJField2.setText("000");
        phoneNoJField2.setToolTipText("Enter phone no.");
        phoneNoJField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        phoneNoJField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNoJField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNoJField2phoneNoJField3FocusLost(evt);
            }
        });
        phoneNoJField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoJField2ActionPerformed(evt);
            }
        });

        dummyJField7.setEditable(false);
        dummyJField7.setBackground(new java.awt.Color(238, 238, 238));
        dummyJField7.setForeground(new java.awt.Color(0, 0, 0));
        dummyJField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dummyJField7.setText("-");
        dummyJField7.setToolTipText("");
        dummyJField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        dummyJField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dummyJField7ActionPerformed(evt);
            }
        });

        phoneNoJField3.setBackground(new java.awt.Color(238, 238, 238));
        phoneNoJField3.setForeground(new java.awt.Color(0, 0, 0));
        phoneNoJField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNoJField3.setText("0000");
        phoneNoJField3.setToolTipText("Enter phone no.");
        phoneNoJField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        phoneNoJField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNoJField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNoJField3FocusLost(evt);
            }
        });
        phoneNoJField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoJField3ActionPerformed(evt);
            }
        });

        seatsJLabel6.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel6.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel6.setText("Mobile No:");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        seatsJLabel7.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        seatsJLabel7.setForeground(new java.awt.Color(255, 255, 255));
        seatsJLabel7.setText("City:");

        cityJComboBox.setBackground(new java.awt.Color(238, 238, 238));
        cityJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        cityJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cityJComboBoxItemStateChanged(evt);
            }
        });
        cityJComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityJComboBoxFocusGained(evt);
            }
        });
        cityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBoxActionPerformed(evt);
            }
        });
        cityJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cityJComboBoxPropertyChange(evt);
            }
        });

        communityJComboBox.setBackground(new java.awt.Color(238, 238, 238));
        communityJComboBox.setForeground(new java.awt.Color(0, 0, 0));
        communityJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                communityJComboBoxItemStateChanged(evt);
            }
        });
        communityJComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                communityJComboBoxFocusGained(evt);
            }
        });
        communityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityJComboBoxActionPerformed(evt);
            }
        });
        communityJComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                communityJComboBoxPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatsJLabel7)
                            .addComponent(cardentifierJLabel)
                            .addComponent(seatsJLabel6)
                            .addComponent(seatsJLabel5)
                            .addComponent(maintenanceExpiryJLabel)
                            .addComponent(seatsJLabel4)
                            .addComponent(seatsJLabel3)
                            .addComponent(seatsJLabel2)
                            .addComponent(seatsJLabel1)
                            .addComponent(seatsJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dobDayJField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dummyJField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobMonthJField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobYearJField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dummyJField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNoJField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNoJField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dummyJField7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNoJField3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(personIdentifierJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emailJField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(communityJComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 302, Short.MAX_VALUE)
                                .addComponent(stateJField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cityJComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(zipJField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addressJField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameJField, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(527, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameJField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatsJLabel1)
                    .addComponent(addressJField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatsJLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(zipJField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cityJComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(seatsJLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stateJField)
                    .addComponent(seatsJLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatsJLabel4)
                    .addComponent(communityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maintenanceExpiryJLabel)
                            .addComponent(dummyJField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobYearJField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(dummyJField2)
                        .addComponent(dobMonthJField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(dobDayJField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailJField, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dummyJField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoJField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoJField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoJField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyJField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatsJLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personIdentifierJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardentifierJLabel))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(11, 48, 56));

        uploadedJList.setBackground(new java.awt.Color(238, 238, 238));
        uploadedJList.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Directory");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameJFieldFocusGained
        if (nameJField.getText().equals("Enter here")) {
            nameJField.setText("");
        }
    }//GEN-LAST:event_nameJFieldFocusGained

    private void nameJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJFieldnameChangeHandler

    private void nameJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJFieldActionPerformed

    private void dobDayJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDayJFieldFocusGained
        if (dobDayJField.getText().equals("DD")) {
            dobDayJField.setText("");
        }
    }//GEN-LAST:event_dobDayJFieldFocusGained

    private void dobDayJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobDayJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dobDayJFielddateOfBirthFocusLost

    private void dobDayJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobDayJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobDayJFieldActionPerformed

    private void dummyJField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField3ActionPerformed

    private void dobMonthJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobMonthJFieldFocusGained
        if (dobMonthJField.getText().equals("MM")) {
            dobMonthJField.setText("");
        }
    }//GEN-LAST:event_dobMonthJFieldFocusGained

    private void dobMonthJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobMonthJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dobMonthJFielddateOfBirthFocusLost

    private void dobMonthJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobMonthJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobMonthJFieldActionPerformed

    private void dummyJField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField2ActionPerformed

    private void dobYearJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobYearJFieldFocusGained
        if (dobYearJField.getText().equals("YYYY")) {
            dobYearJField.setText("");
        }
    }//GEN-LAST:event_dobYearJFieldFocusGained

    private void dobYearJFielddateOfBirthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dobYearJFielddateOfBirthFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dobYearJFielddateOfBirthFocusLost

    private void dobYearJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobYearJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobYearJFieldActionPerformed

    private void addressJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressJFieldFocusGained
        if (addressJField.getText().equals("Enter here")) {
            addressJField.setText("");
        }
    }//GEN-LAST:event_addressJFieldFocusGained

    private void addressJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_addressJFieldnameChangeHandler

    private void addressJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressJFieldActionPerformed

    private void zipJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipJFieldFocusGained
        if (zipJField.getText().equals("Enter here")) {
            zipJField.setText("");
        }
    }//GEN-LAST:event_zipJFieldFocusGained

    private void zipJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_zipJFieldnameChangeHandler

    private void zipJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipJFieldActionPerformed

    private void stateJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateJFieldFocusGained
        if (stateJField.getText().equals("Enter here")) {
            stateJField.setText("");
        }
    }//GEN-LAST:event_stateJFieldFocusGained

    private void stateJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_stateJFieldnameChangeHandler

    private void stateJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateJFieldActionPerformed

    private void personIdentifierJLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personIdentifierJLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personIdentifierJLabelActionPerformed

    private void emailJFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJFieldFocusGained
        if (emailJField.getText().equals("Enter here")) {
            emailJField.setText("");
        }
    }//GEN-LAST:event_emailJFieldFocusGained

    private void emailJFieldnameChangeHandler(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailJFieldnameChangeHandler
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJFieldnameChangeHandler

    private void emailJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailJFieldActionPerformed

    private void dummyJField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField4ActionPerformed

    private void dummyJField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField5ActionPerformed

    private void phoneNoJField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField1FocusGained
        if (phoneNoJField1.getText().equals("000")) {
            phoneNoJField1.setText("");
        }
    }//GEN-LAST:event_phoneNoJField1FocusGained

    private void phoneNoJField1phoneNoJField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField1phoneNoJField3FocusLost
        //TODO
    }//GEN-LAST:event_phoneNoJField1phoneNoJField3FocusLost

    private void phoneNoJField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoJField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoJField1ActionPerformed

    private void dummyJField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField6ActionPerformed

    private void phoneNoJField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField2FocusGained
        if (phoneNoJField2.getText().equals("000")) {
            phoneNoJField2.setText("");
        }
    }//GEN-LAST:event_phoneNoJField2FocusGained

    private void phoneNoJField2phoneNoJField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField2phoneNoJField3FocusLost
        //TODO
    }//GEN-LAST:event_phoneNoJField2phoneNoJField3FocusLost

    private void phoneNoJField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoJField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoJField2ActionPerformed

    private void dummyJField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dummyJField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dummyJField7ActionPerformed

    private void phoneNoJField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField3FocusGained
        if (phoneNoJField3.getText().equals("0000")) {
            phoneNoJField3.setText("");
        }
    }//GEN-LAST:event_phoneNoJField3FocusGained

    private void phoneNoJField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNoJField3FocusLost
        //TODO
    }//GEN-LAST:event_phoneNoJField3FocusLost

    private void phoneNoJField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoJField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoJField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectedProfile == null) {
            JOptionPane.showMessageDialog(this, "Please select a profile to edit!", "Update Profile", ERROR_MESSAGE);
            return;
        }

        String errorMessage = "";
        String nameErrorMessage = selectedProfile.validateName(this.nameJField.getText());
        String addressErrorMessage = selectedProfile.address.validateAddress(this.addressJField.getText());
        String zipCodeErrorMessage = selectedProfile.address.validateZipCode(this.zipJField.getText());
        String cityErrorMessage = selectedProfile.city.validateCity(this.cityJComboBox.getSelectedItem().toString());
        String stateErrorMessage = selectedProfile.city.validateState(this.stateJField.getText());
        String communityNameErrorMessage = selectedProfile.community.validateCommunityName(this.communityJComboBox.getSelectedItem() != null ? this.communityJComboBox.getSelectedItem().toString() : "");

        String dobValue = dobDayJField.getText().trim() + "/" + dobMonthJField.getText().trim() + "/" + dobYearJField.getText().trim();
        String dobErrorMessage = selectedProfile.validateDOB(dobValue);

        String emailErrorMessage = selectedProfile.validateEmail(this.emailJField.getText());

        String phoneValue = phoneNoJField1.getText().trim() + "-" + phoneNoJField2.getText().trim() + "-" + phoneNoJField3.getText().trim();
        String phoneErrorMessage = selectedProfile.validateMobileNo(phoneValue);

        errorMessage += nameErrorMessage;
        errorMessage += addressErrorMessage;
        errorMessage += zipCodeErrorMessage;
        errorMessage += cityErrorMessage;
        errorMessage += stateErrorMessage;
        errorMessage += communityNameErrorMessage;
        errorMessage += dobErrorMessage;
        errorMessage += emailErrorMessage;
        errorMessage += phoneErrorMessage;

        if (!errorMessage.equals("")) {
            JOptionPane.showMessageDialog(this, errorMessage, "Create Person", ERROR_MESSAGE);
            return;
        }

        selectedProfile.name = this.nameJField.getText();
        selectedProfile.address.address = this.addressJField.getText();
        selectedProfile.address.zipcode = this.zipJField.getText();
        selectedProfile.city.city = this.cityJComboBox.getSelectedItem().toString();
        selectedProfile.city.state = this.stateJField.getText();
        selectedProfile.community.communityName = this.communityJComboBox.getSelectedItem().toString();
        selectedProfile.mobileNo = phoneNoJField1.getText().trim() + "-" + phoneNoJField2.getText().trim() + "-" + phoneNoJField3.getText().trim();
        selectedProfile.email = emailJField.getText();
        selectedProfile.type = 0;
        DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormatter.setLenient(false);
            selectedProfile.dob = (dateFormatter.parse(dobDayJField.getText().trim() + "/" + dobMonthJField.getText().trim() + "/" + dobYearJField.getText().trim()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        Person_Directory.allPeople.set(selectedIndex, selectedProfile);
        JOptionPane.showMessageDialog(this, "Updated successfully!", "Update Profile", INFORMATION_MESSAGE);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (selectedProfile == null) {
            JOptionPane.showMessageDialog(this, "Please select a person's profile to delete!", "Delete Profile", ERROR_MESSAGE);
            return;
        }
        Person_Directory.allPeople.remove(selectedIndex);
        JOptionPane.showMessageDialog(this, "Deleted successfully!!", "Delete profile", INFORMATION_MESSAGE);
        if (Person_Directory.allPeople.isEmpty()) {
            resetValues();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void resetValues() {
        nameJField.setText("Enter here");
        zipJField.setText("Enter here");
        addressJField.setText("Enter here");
        cityJComboBox.setSelectedItem("Enter here");
        stateJField.setText("Enter here");
        communityJComboBox.setSelectedItem("Enter here");
        emailJField.setText("Enter here");
        personIdentifierJLabel.setText("NA");
        phoneNoJField1.setText("000");
        phoneNoJField2.setText("000");
        phoneNoJField3.setText("0000");
        dobDayJField.setText("DD");
        dobMonthJField.setText("MM");
        dobYearJField.setText("YYYY");
    }

    public void openSelectedProfile() {
        selectedIndex = uploadedJList.getSelectedIndex();//get the index of the selection made in the left section.
        if (selectedIndex != -1) {
            selectedProfile = Person_Directory.allPeople.get(selectedIndex);
            nameJField.setText(String.valueOf(selectedProfile.name));
            zipJField.setText(String.valueOf(selectedProfile.address.zipcode));
            addressJField.setText(String.valueOf(selectedProfile.address.address));
            cityJComboBox.setSelectedItem(String.valueOf(selectedProfile.city.city));
            stateJField.setText(String.valueOf(selectedProfile.city.state));
            communityJComboBox.setSelectedItem(String.valueOf(selectedProfile.community.communityName));
            emailJField.setText(String.valueOf(selectedProfile.email));
            personIdentifierJLabel.setText(String.valueOf(selectedProfile.personId));
            phoneNoJField1.setText(String.valueOf(selectedProfile.mobileNo.split("-")[0]));
            phoneNoJField2.setText(String.valueOf(selectedProfile.mobileNo.split("-")[1]));
            phoneNoJField3.setText(String.valueOf(selectedProfile.mobileNo.split("-")[2]));

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String mec = formatter.format(selectedProfile.dob);
            dobDayJField.setText((String) mec.split("/")[0]);
            dobMonthJField.setText((String) mec.split("/")[1]);
            dobYearJField.setText((String) mec.split("/")[2]);
        }
    }
    private void uploadedJListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uploadedJListFocusGained
        openSelectedProfile();
    }//GEN-LAST:event_uploadedJListFocusGained

    private void uploadedJListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadedJListMouseClicked
        openSelectedProfile();
    }//GEN-LAST:event_uploadedJListMouseClicked

    private void cityJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cityJComboBoxItemStateChanged
        generateDropdownCommunity();
    }//GEN-LAST:event_cityJComboBoxItemStateChanged

    private void cityJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxFocusGained

    private void cityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxActionPerformed

    private void cityJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cityJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxPropertyChange

    private void communityJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_communityJComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxItemStateChanged

    private void communityJComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_communityJComboBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxFocusGained

    private void communityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxActionPerformed

    private void communityJComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_communityJComboBoxPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_communityJComboBoxPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJField;
    private javax.swing.JLabel cardentifierJLabel;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JComboBox<String> communityJComboBox;
    private javax.swing.JTextField dobDayJField;
    private javax.swing.JTextField dobMonthJField;
    private javax.swing.JTextField dobYearJField;
    private javax.swing.JTextField dummyJField2;
    private javax.swing.JTextField dummyJField3;
    private javax.swing.JTextField dummyJField4;
    private javax.swing.JTextField dummyJField5;
    private javax.swing.JTextField dummyJField6;
    private javax.swing.JTextField dummyJField7;
    private javax.swing.JTextField emailJField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel maintenanceExpiryJLabel;
    private javax.swing.JTextField nameJField;
    private javax.swing.JTextField personIdentifierJLabel;
    private javax.swing.JTextField phoneNoJField1;
    private javax.swing.JTextField phoneNoJField2;
    private javax.swing.JTextField phoneNoJField3;
    private javax.swing.JLabel seatsJLabel;
    private javax.swing.JLabel seatsJLabel1;
    private javax.swing.JLabel seatsJLabel2;
    private javax.swing.JLabel seatsJLabel3;
    private javax.swing.JLabel seatsJLabel4;
    private javax.swing.JLabel seatsJLabel5;
    private javax.swing.JLabel seatsJLabel6;
    private javax.swing.JLabel seatsJLabel7;
    private javax.swing.JTextField stateJField;
    private javax.swing.JList<String> uploadedJList;
    private javax.swing.JTextField zipJField;
    // End of variables declaration//GEN-END:variables
}
