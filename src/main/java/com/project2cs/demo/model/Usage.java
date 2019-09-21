package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Usage {
    @Id
    @GeneratedValue()
    @Column(name = "usage_id")
    private int id;

    @Column(name = "description")
    @JsonProperty("description")
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ressource_id")
    @JsonProperty("ressource")
    private Ressource ressource;

    public Usage() {
    }

    public Usage(String description,Ressource ressource) {

        this.description = description;
        this.ressource = ressource;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public Ressource getRessource() {
        return ressource;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setRessource(Ressource ressource) {
        this.ressource = ressource;
    }
}

