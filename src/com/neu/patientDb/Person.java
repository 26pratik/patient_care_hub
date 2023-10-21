/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.patientDb;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author 18573
 */
public class Person extends House{
    
    String name;
    int age;
    String gender;
    long phoneNumber;
    String ageGroup; 
    int id;
    Patient patient;
    
    public Patient getPatient() {
        
        if(patient == null) 
            patient = new Patient();
        
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        
       if(age == 0){
            this.setAgeGroup("Newborn");
        }
        else if(age <= 1){
            this.setAgeGroup("Infant");
        }
        else if(age <= 4) {
            this.setAgeGroup("Toddler");
        }
        else if(age <= 6) {
            this.setAgeGroup("Preschooler");
        }
        else if(age <= 13){
            this.setAgeGroup("SchoolAge");
        }
        else {
            this.setAgeGroup("Adolescent");
        }        
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }    
    
}
