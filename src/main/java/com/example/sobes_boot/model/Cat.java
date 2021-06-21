package com.example.sobes_boot.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("catter")
public class Cat extends Animal{
    String color;
}
