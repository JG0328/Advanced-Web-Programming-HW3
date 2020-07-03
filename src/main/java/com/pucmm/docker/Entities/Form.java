package com.pucmm.docker.Entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@EnableAutoConfiguration
public class Form implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // 3 questions with 1-5 value, last question is a comment
    private Integer first;
    private Integer second;
    private Integer third;
    private String comment;
    //

    public Form() {

    }

    public Form(Integer first, Integer second, Integer third, String comment) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getThird() {
        return third;
    }

    public void setThird(Integer third) {
        this.third = third;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
