/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.patientDb;

/**
 *
 * @author 18573
 */
public class Community extends City{
    
    String communityName;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    @Override
    public String toString(){
        return "\nCommunity : " + this.communityName + super.toString();
    }
    
}
