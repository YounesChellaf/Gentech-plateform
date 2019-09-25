package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "institution")
public class Institution implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;

    @Column(name = "region")
    private String region;

    @ManyToOne(optional = false)
    @JoinColumn(name = "file_id")
    @JsonProperty("file")
    private FileModel file;

    protected Institution() {
    }

    public Institution(String name, String location,String description,String region,FileModel file) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.region = region;
        this.file = file;
    }

    public FileModel getFile() {
        return file;
    }

    public void setFile(FileModel file) {
        this.file = file;
    }

    public String getDescription() {
        return description;
    }

    public long getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }
}
