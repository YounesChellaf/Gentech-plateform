package com.project2cs.demo.model;

import javax.persistence.*;
import java.io.Serializable;




@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "designation")
    private String designation;


    protected Role() {
    }

    public Role(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public long getId() {
        return id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
