package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Rh {
    @Id
    @GeneratedValue
    @Column(name = "rh_id")
    private int id;

    @Column(name = "nom")
    @JsonProperty("nom")
    private String nom;

    @Column(name = "description")
    @JsonProperty("description")
    private String description;

    @Column(name = "contact")
    @JsonProperty("contact")
    private String contact;

    @ManyToOne(optional = false)
    @JoinColumn(name = "institution_id")
    @JsonProperty("type")
    private Institution institution;


    @Column(name = "date")
    @JsonProperty("date")
    private String date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Institution getInstitution() {
        return institution;
    }

    public String getContact() {
        return contact;
    }

    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public Rh(String nom,String description,String contact, String date,Institution institution) {
        this.nom = nom;
        this.contact = contact;
        this.institution = institution;
        this.date = date;
        this.description = description;
    }

    protected Rh() {
    };
}

