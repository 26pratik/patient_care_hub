/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.patientDb;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 18573
 */
public class Encounter {
    
    VitalSigns vitalSigns;
    String encounterDatetime;

    public Encounter() {
        this.vitalSigns = new VitalSigns();
        this.encounterDatetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getEncounterDatetime() {
        return encounterDatetime;
    }

    public void setEncounterDatetime(String encounterDatetime) {
        this.encounterDatetime = encounterDatetime;
    }
    
    @Override
    public String toString(){
        return " Encounter Datetime: "+this.encounterDatetime +this.vitalSigns;
    }
    
}
