/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neu.patientDb;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 18573
 */
public class PersonDirectorty {

    Map<Integer, Person> personMap;

    public Map<Integer, Person> getPersonMap() {
        return personMap;
    }

    public void setPersonMap(Map<Integer, Person> personMap) {
        this.personMap = personMap;
    }

    public PersonDirectorty() {
        personMap = new HashMap<Integer, Person>();
    }

}
