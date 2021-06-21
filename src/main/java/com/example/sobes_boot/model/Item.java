package com.example.sobes_boot.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Item {
    @Id
    @GeneratedValue
    int id;
    @ManyToMany
    Set<Cart> carts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }
}
