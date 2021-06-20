package com.example.sobes_boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User1 {

    @Id
    int id;

    String name;
}
