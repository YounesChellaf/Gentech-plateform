package com.project2cs.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;



@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private long roleId;

    @Column(name = "role")
    private String role;

    public Role() {
    }

    public Role(String role) {
        this.role = role;
    }
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}


//@Entity
//@Table(name = "role")
//public class Role implements Serializable {
//
//    private static final long serialVersionUID = -3009157732242241606L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    @Column(name = "designation")
//    private String designation;
//
//
//    protected Role() {
//    }
//
//    public Role(String designation) {
//        this.designation = designation;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//}
