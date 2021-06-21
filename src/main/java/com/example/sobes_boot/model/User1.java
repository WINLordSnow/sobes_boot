package com.example.sobes_boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class User1 {

    @Id
    int id;

    String name;
    Sex sex;
}
