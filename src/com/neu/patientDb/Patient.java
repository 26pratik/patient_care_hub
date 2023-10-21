/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.patientDb;

/**
 *
 * @author 18573
 */
public class Patient extends Person{
    
    Encounter encounter;
    EncounterHistory encounterHistory;
    Boolean isPatientNormal;
    
    VitalSigns getVitalSigns() {
        return this.getRecentEncounter().getVitalSigns();
    }

    public Encounter getRecentEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
        
        if(encounterHistory == null) 
            encounterHistory = new EncounterHistory();

        encounterHistory.getHistory().add(encounter);
        
    } 
    
    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter newEncounter(Patient patient){
//        
//        if (this.encounter != null)
//            this.encounterHistory.getHistory().add(this.encounter);
        this.encounter = new Encounter();
        this.isPatientNormal = this.isPatientNormal(patient);
        encounter.vitalSigns.setAreVitalSignsNormal(this.isPatientNormal);
        return this.encounter;
    }

    public Boolean isPatientNormal(Patient patient){
        System.out.println("Age group 111 : "+this.getAgeGroup());
        return encounter.getVitalSigns().areVitalSignsNormal(patient);
    }

    public Boolean getIsPatientNormal() {
        return isPatientNormal;
    }
    
    public void setIsPatientNormal(Boolean isPatientNormal) {
        this.isPatientNormal = isPatientNormal;
    }    

    void setVitalSigns(VitalSigns vitalSigns, Patient patient) {
        this.newEncounter(patient);
        this.encounter.setVitalSigns(vitalSigns);
    }    
}
