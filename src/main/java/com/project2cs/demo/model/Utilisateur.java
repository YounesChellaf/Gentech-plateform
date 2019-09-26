package com.project2cs.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;




@Entity
@Table(name = "utilisateur" )
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "email")

    private String email;

    @Column(name = "password")
    public String password;

    @Column(name = "isBlocked")
    private boolean isBlocked = false;

    @ManyToOne(optional = false)
    @JoinColumn(name = "role_id")
    @JsonProperty("role")
    private Role role;

    protected Utilisateur() {
    }

    public Utilisateur(String userName, String email, String password,boolean block,Role role) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.isBlocked = block;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public long getId() {
        return id;
    }

    public boolean getIsBlocked(){
        return isBlocked;
    }

    public void Block(){
       this.isBlocked = true;
    }

    public void UnBlock(){
        this.isBlocked = false;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}