package com.ensas.miniprojet.demo.controller;
import com.ensas.miniprojet.demo.entity.CertifRequest;
import com.ensas.miniprojet.demo.entity.Classe;
import com.ensas.miniprojet.demo.entity.user.student.Student;
import com.ensas.miniprojet.demo.service.scholarityService.ScholarityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/scholarity")
public class ScholarityController {

    @Autowired
    ScholarityService scholarityService;


    @GetMapping("/classes")
    List<Classe>  getClasses(){
        List<Classe> classes = scholarityService.getClasses();
        return classes;
    }

    @GetMapping("/classes/{classeId}")
    Classe getClasse(@PathVariable Long classeId){
        return scholarityService.getClasse(classeId);
    }

    @GetMapping("/classes/{classeId}/students")
    List<Student> getStudentOfClasse(@PathVariable Long classeId){
        return scholarityService.getStudentOfClasse(classeId);
    }

    @GetMapping("/certifsRequest")
    List<CertifRequest> getCertifRequest(){
        return scholarityService.getAllCertifRequest();
    }



}
