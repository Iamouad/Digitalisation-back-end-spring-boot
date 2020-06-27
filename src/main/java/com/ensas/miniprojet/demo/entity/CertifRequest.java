package com.ensas.miniprojet.demo.entity;


import com.ensas.miniprojet.demo.model.TypeCertificat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CertifRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDeDemande;
    private TypeCertificat typeCertificat;
    private boolean isReady = false;

    @Transient
    private String jwt;


    @OneToOne
    private Student student;
    public Long getId() {
        return id;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public Date getDateDeDemande() {
        return dateDeDemande;
    }

    public void setDateDeDemande(Date dateDeDemande) {
        this.dateDeDemande = dateDeDemande;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeCertificat getTypeCertificat() {
        return typeCertificat;
    }

    public void setTypeCertificat(TypeCertificat typeCertificat) {
        this.typeCertificat = typeCertificat;
    }

    @JsonIgnore
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }


    @Override
    public String toString() {
        return "CertifRequest{" +
                "id=" + id +
                ", typeCertificat=" + typeCertificat +
                ", student=" + student +
                '}';
    }
}
