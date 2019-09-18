package com.project2cs.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "reglement")
public class Reglement implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "description")
    private String description;

    @Column(name = "file")
    private String file;

    protected Reglement() {
    }

    public Reglement(String designation, String description, String file) {
        this.designation = designation;
        this.description = description;
        this.file = file;
    }

    public String getDescription() {
        return description;
    }

    public String getDesignation() {
        return designation;
    }

    public String getFile() {
        return file;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public long getId() {
        return id;
    }
}
