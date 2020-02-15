package com.ensas.miniprojet.demo.entity;

import com.ensas.miniprojet.demo.entity.user.prof.Prof;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "departement")
    List<Filiere> filieres;

    @OneToMany(mappedBy = "departement")
    List<Prof> profs;




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
}

