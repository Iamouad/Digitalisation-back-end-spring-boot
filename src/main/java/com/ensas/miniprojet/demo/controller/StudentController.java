package com.ensas.miniprojet.demo.controller;
import com.ensas.miniprojet.demo.entity.CertifRequest;
import com.ensas.miniprojet.demo.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/newCertifRequest")
    String newCertifRequest(@RequestBody CertifRequest certifRequest){
        System.out.println(certifRequest);
        CertifRequest certifRequest1 =  studentService.addNewCertifRequest(certifRequest);
        System.out.println(certifRequest1);
        return "200";
    }
}
