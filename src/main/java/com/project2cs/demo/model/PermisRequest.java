package com.project2cs.demo.model;

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

    @Column(name = "socialRaison")
    private String socialReason;

    @Column(name = "resource")
    private String resource;

    @Column(name = "description")
    private String description;


    protected PermisRequest() {
    }

    public PermisRequest(String firstName, String lastName,String email,String socialReason,String resource,String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.socialReason = socialReason;
        this.resource = resource;
        this.description = description;
    }

}
