package com.project2cs.demo.model;

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

    @Column(name = "location")
    private String location;

    protected Institution() {
    }

    public Institution(String name, String location) {
        this.name = name;
        this.location = location;
    }

}
