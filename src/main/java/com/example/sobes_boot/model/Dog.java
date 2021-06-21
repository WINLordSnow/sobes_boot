package com.example.sobes_boot.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("dogger")
public class Dog extends Animal{
    String dogger;

    public String getDogger() {
        return dogger;
    }

    public void setDogger(String dogger) {
        this.dogger = dogger;
    }
}
