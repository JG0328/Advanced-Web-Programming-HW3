package com.pucmm.docker.Entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@EnableAutoConfiguration
public class AppUser implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String password;
    private Boolean active;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<AppRole> appRoles;

    public AppUser() {

    }

    public AppUser(String username, String password, Boolean active, Set<AppRole> appRoles) {
        this.username = username;
        this.password = password;
        this.active = active;
        this.appRoles = appRoles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<AppRole> getAppRoles() {
        return appRoles;
    }

    public void setAppRoles(Set<AppRole> appRoles) {
        this.appRoles = appRoles;
    }
}
