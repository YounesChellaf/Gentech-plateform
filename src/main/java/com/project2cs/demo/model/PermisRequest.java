package com.project2cs.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "PermisRequest")
public class PermisRequest {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "raison")
    private String reason;

    @Column(name = "resource")
    private String resource;

    @Column(name = "description")
    private String description;

    @Column(name = "state")
    private String state;

    @ManyToOne(optional = false)
    @JoinColumn(name = "file_id")
    @JsonProperty("file")
    private FileModel file;


    protected PermisRequest() {
    }

    public PermisRequest(String firstName, String lastName,String email,String socialReason,String resource,String description,String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.reason = socialReason;
        this.resource = resource;
        this.description = description;
        this.state = state;
        //sthis.file = file;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String reason() {
        return reason;
    }

    public String getResource() {
        return resource;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
