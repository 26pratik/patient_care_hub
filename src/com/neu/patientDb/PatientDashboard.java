/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.neu.patientDb;

import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author 18573
 */
public class PatientDashboard extends javax.swing.JPanel {

    /**
     * Creates new form PatientDashboard
     */
    PersonDirectorty personDirectorty;
    
    public PatientDashboard() {
        
    }

    PatientDashboard(PersonDirectorty personDirectorty) {
        this.personDirectorty = personDirectorty;
        initComponents();
        populateCbId(personDirectorty.getPersonMap());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVitalHeading = new javax.swing.JLabel();
        lblRespiratoryRate = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        lblSystolicBp = new javax.swing.JLabel();
        lblWeightInKilo = new javax.swing.JLabel();
        lblWeightInPound = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        cbId = new javax.swing.JComboBox<>();
        txtRespiratoryRate = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        txtSystolicBp = new javax.swing.JTextField();
        txtWeightInKilo = new javax.swing.JTextField();
        txtWeightInPound = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        lblVitalHeading.setText("Add Vitals");

        lblRespiratoryRate.setText("Respiratory Rate : ");

        lblHeartRate.setText("Heart Rate : ");

        lblSystolicBp.setText("Systolic BP : ");

        lblWeightInKilo.setText("Weight in Kilo : ");

        lblWeightInPound.setText("Weight in Pound : ");

        lblId.setText("ID : ");

        txtHeartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeartRateActionPerformed(evt);
            }
        });

        btnSave.setText("Save Vitals");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblWeightInPound, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblWeightInKilo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSystolicBp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHeartRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRespiratoryRate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSystolicBp)
                            .addComponent(txtWeightInKilo)
                            .addComponent(txtWeightInPound)
                            .addComponent(txtRespiratoryRate)
                            .addComponent(cbId, 0, 54, Short.MAX_VALUE)
                            .addComponent(txtHeartRate))
                        .addGap(77, 77, 77)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblVitalHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVitalHeading)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(cbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespiratoryRate)
                    .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeartRate)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSystolicBp)
                    .addComponent(txtSystolicBp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeightInKilo)
                    .addComponent(txtWeightInKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeightInPound)
                    .addComponent(txtWeightInPound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHeartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeartRateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if(txtRespiratoryRate.getText().equalsIgnoreCase("") || txtHeartRate.getText().equalsIgnoreCase("") ||
                txtSystolicBp.getText().equalsIgnoreCase("") || txtWeightInKilo.getText().equalsIgnoreCase("") ||
                txtWeightInPound.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty");
        }
        
        try {
            double resp = Double.parseDouble(txtRespiratoryRate.getText());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Respiratory rate must be numeric");
        }
        
        try {
            double heart = Double.parseDouble(txtHeartRate.getText());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Heart rate must be numeric");
        }  
        
        try {
            double sys = Double.parseDouble(txtSystolicBp.getText());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Systolic BP must be numeric");
        } 
        
        try {
            double kilo = Double.parseDouble(txtWeightInKilo.getText());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Weight in Kilo must be numeric");
        } 
        
        try {
            double pound = Double.parseDouble(txtWeightInPound.getText());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Weight in Pound must be numeric");
        }        
        
        Person person = personDirectorty.getPersonMap().get(Integer.parseInt(String.valueOf(cbId.getSelectedItem())));
        System.out.println("person "+ person + "Age group : "+ person.getAgeGroup());
        Patient patient = person.getPatient();
        
        patient.setId(person.getId());
        patient.setName(person.getName());
        patient.setAge(person.getAge());
        patient.setAgeGroup(person.getAgeGroup());
        patient.setGender(person.getGender());
        patient.setPhoneNumber(person.getPhoneNumber());
        patient.setHouseNum(person.getHouseNum());
        patient.setCommunityName(person.getCommunityName());
        patient.setCityName(person.getCityName());
        
        System.out.println("abcd : "+ patient.getAgeGroup());
        Encounter encounter = patient.newEncounter(patient);
        VitalSigns vitalSigns = encounter.getVitalSigns();
        
        vitalSigns.setHeartRate(Double.parseDouble(txtHeartRate.getText()));
        vitalSigns.setRespiratoryRate(Double.parseDouble(txtRespiratoryRate.getText()));
        vitalSigns.setSystolicBP(Double.parseDouble(txtSystolicBp.getText()));
        vitalSigns.setWeightInKilos(Double.parseDouble(txtWeightInKilo.getText()));
        vitalSigns.setWeightInPounds(Double.parseDouble(txtWeightInPound.getText()));
        
        encounter.setVitalSigns(vitalSigns);
        patient.setEncounter(encounter);
        person.setPatient(patient);
        
        patient.setIsPatientNormal(patient.isPatientNormal(patient));
        System.out.println("Hello"+person.patient.encounter.vitalSigns);
        
        if(patient.getEncounterHistory() == null) {
            
        }
        for(Encounter signs: person.getPatient().getEncounterHistory().getHistory()) {
            
            VitalSigns v = signs.getVitalSigns();
            System.out.print(v.getHeartRate()+"-");
        }
        
        JOptionPane.showMessageDialog(this, "Vitals Saved");
        
        txtRespiratoryRate.setText("");
        txtHeartRate.setText("");
        txtSystolicBp.setText("");
        txtWeightInKilo.setText("");
        txtWeightInPound.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbId;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblSystolicBp;
    private javax.swing.JLabel lblVitalHeading;
    private javax.swing.JLabel lblWeightInKilo;
    private javax.swing.JLabel lblWeightInPound;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtSystolicBp;
    private javax.swing.JTextField txtWeightInKilo;
    private javax.swing.JTextField txtWeightInPound;
    // End of variables declaration//GEN-END:variables

    private void populateCbId(Map<Integer, Person> personMap) {
        
        Iterator it = personMap.entrySet().iterator();
        
        while(it.hasNext()) {
            
            Map.Entry mapEl = (Map.Entry)it.next();           
            cbId.addItem(String.valueOf(mapEl.getKey()));
        }
    }
}