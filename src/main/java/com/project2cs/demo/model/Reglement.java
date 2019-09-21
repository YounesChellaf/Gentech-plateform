package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    @Column(name = "mot_cle")
    private String mot_cle;

    @Column(name = "date")
    private String date;

    @ManyToOne(optional = false)
    @JoinColumn(name = "file_id")
    @JsonProperty("file")
    private FileModel file;

    protected Reglement() {
    }

    public Reglement(String designation, String description,String mot_cle,String date, FileModel file) {
        this.designation = designation;
        this.description = description;
        this.file = file;
        this.mot_cle=mot_cle;
        this.date = date;
    }

    public FileModel getFile() {
        return file;
    }

    public String getMot_cle() {
        return mot_cle;
    }

    public void setMot_cle(String mot_cle) {
        this.mot_cle = mot_cle;
    }

    public void setFile(FileModel file) {
        this.file = file;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public String getDesignation() {
        return designation;
    }



    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public long getId() {
        return id;
    }
}
