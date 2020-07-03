package com.pucmm.docker.Entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@EnableAutoConfiguration
public class AppRole implements Serializable {
    @Id
    String role;

    public AppRole() {

    }

    public AppRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
