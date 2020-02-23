package com.ensas.miniprojet.demo.entity;


import com.ensas.miniprojet.demo.entity.user.prof.Prof;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @ManyToMany
    private List<Classe> classes;

    @ManyToOne
    private Prof prof;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    @JsonIgnore
    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }
}
