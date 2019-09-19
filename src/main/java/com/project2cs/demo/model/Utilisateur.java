package com.project2cs.demo.model;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "active")
    private int active;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public Utilisateur() {
    }

    public Utilisateur(Utilisateur users) {
        this.active = users.getActive();
        this.email = users.getEmail();
        this.roles = users.getRoles();
        this.name = users.getName();
        this.lastName =users.getLastName();
        this.id = users.getId();
        this.password = users.getPassword();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}


//
//@Entity
//@Table(name = "utilisateur" )
//public class Utilisateur implements Serializable {
//
//    private static final long serialVersionUID = -3009157732242241606L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    @Column(name = "userName")
//    private String userName;
//
//    @Column(name = "email")
//
//    private String email;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "isBlocked")
//    private boolean isBlocked = false;
//
//    protected Utilisateur() {
//    }
//
//    public Utilisateur(String userName, String email, String password,boolean block) {
//        this.userName = userName;
//        this.email = email;
//        this.password = password;
//        this.isBlocked = block;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public boolean getIsBlocked(){
//        return isBlocked;
//    }
//
//    public void Block(){
//       this.isBlocked = true;
//    }
//
//    public void UnBlock(){
//        this.isBlocked = false;
//    }
//
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}