/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.patientDb;

/**
 *
 * @author 18573
 */
public class House extends Community{
    
    String houseNum;
    
    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }
    
    @Override
    public String toString(){
        return "\nHouse Number : " + this.houseNum + super.toString();
    }
    
}
