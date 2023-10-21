/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.patientDb;

import java.util.ArrayList;

/**
 *
 * @author 18573
 */
public class EncounterHistory {
    
    ArrayList<Encounter> history;
    
    public EncounterHistory() {
        history = new ArrayList<Encounter>();
    } 

    public ArrayList<Encounter> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Encounter> history) {
        this.history = history;
    }
}
