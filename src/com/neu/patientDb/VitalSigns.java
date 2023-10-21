/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.patientDb;

/**
 *
 * @author 18573
 */
public class VitalSigns {    
    
    double respiratoryRate;
    double heartRate;
    double systolicBP;
    double weightInKilos;
    double weightInPounds;
    Boolean areVitalSignsNormal;
    
   public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(double systolicBP) {
        this.systolicBP = systolicBP;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Boolean getAreVitalSignsNormal() {
        return areVitalSignsNormal;
    }

    public void setAreVitalSignsNormal(Boolean areVitalSignsNormal) {
        this.areVitalSignsNormal = areVitalSignsNormal;
    }

    Boolean areVitalSignsNormal(Patient patient) {
//        return compareVitalSigns(patient.getVitalSigns(),patient.getAgeGroup()) == 0;
        return isRespiratoryRateNormal(patient) && isHeartRateNormal(patient) && isSystolicBPNormal(patient) && isWeightNormal(patient);
    }

    Boolean isRespiratoryRateNormal(Patient patient){
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        System.out.println(ageGroup);
        return vitalSigns.respiratoryRate >= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("-")[0]) && 
                vitalSigns.respiratoryRate <= Double.parseDouble(vitalSignsNormal.respiratoryRate.get(ageGroup).split("-")[1]);
    }
    
    Boolean isHeartRateNormal(Patient patient){
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.heartRate >= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("-")[0]) && 
                vitalSigns.heartRate <= Double.parseDouble(vitalSignsNormal.heartRate.get(ageGroup).split("-")[1]);
    }
    
    Boolean isSystolicBPNormal(Patient patient){
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.systolicBP >= Double.parseDouble(vitalSignsNormal.systolicBP.get(ageGroup).split("-")[0]) && 
                vitalSigns.systolicBP <= Double.parseDouble(vitalSignsNormal.systolicBP.get(ageGroup).split("-")[1]);
    }
    
    Boolean isWeightNormal(Patient patient){
        
        VitalSignsNormal vitalSignsNormal = new VitalSignsNormal();
        VitalSigns vitalSigns = patient.getVitalSigns();
        String ageGroup = patient.getAgeGroup();
        
        return vitalSigns.weightInKilos >= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("-")[0]) && 
                vitalSigns.weightInKilos <= Double.parseDouble(vitalSignsNormal.weightInKilos.get(ageGroup).split("-")[1]);
    }
   
}
