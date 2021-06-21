package com.example.sobes_boot.model;


import javax.persistence.*;

@Entity
public class Role1 {
    @Id
    int id;
    @ManyToOne
    User1 user1;
}
