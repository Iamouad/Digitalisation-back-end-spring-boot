package com.ensas.miniprojet.demo.entity.user.student;

import com.ensas.miniprojet.demo.entity.Classe;
import com.ensas.miniprojet.demo.entity.User;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student extends User implements Serializable {

    private String cne;

    @ManyToOne
    private Classe classe;


    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    @Override
    public String toString() {

        return "Student{" +
                "cne='" + cne + '\'' +
                ", classe=" + classe +
                '}' +  super.toString();
    }
}
