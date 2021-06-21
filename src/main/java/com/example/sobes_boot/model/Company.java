package com.example.sobes_boot.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
public class Company {
    @Id
    @GeneratedValue

    private Integer id;

   // @Column(name = "final")

    private final String name="6";

    private String address;

    @ElementCollection
    @AttributeOverrides({
            @AttributeOverride( name = "firstName", column = @Column(name = "contact_first_name")),
            @AttributeOverride( name = "lastName", column = @Column(name = "contact_last_name")),
            @AttributeOverride( name = "phone", column = @Column(name = "contact_phone"))
    })
    private List<ContactPerson> contact;

    @Enumerated(EnumType.STRING)
    Sex sex;

    public Sex getSex() {
        return sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "firstName", column = @Column(name = "contact_first_name")),
            @AttributeOverride( name = "lastName", column = @Column(name = "contact_last_name")),
            @AttributeOverride( name = "phone", column = @Column(name = "contact_phone"))
    })
    private ContactPerson contactPerson;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ContactPerson> getContact() {
        return contact;
    }

    public void setContact(List<ContactPerson> contact) {
        this.contact = contact;
    }

    public ContactPerson getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson) {
        this.contactPerson = contactPerson;
    }
// standard getters, setters
}