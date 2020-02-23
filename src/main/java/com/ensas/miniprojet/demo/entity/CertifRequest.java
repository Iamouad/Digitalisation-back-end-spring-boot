package com.ensas.miniprojet.demo.entity;


import com.ensas.miniprojet.demo.entity.user.student.Student;
import com.ensas.miniprojet.demo.model.TypeCertificat;

import javax.persistence.*;

@Entity
public class CertifRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private TypeCertificat typeCertificat;
    @OneToOne
    private Student student;

    public Long getId() {

        return id;
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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
