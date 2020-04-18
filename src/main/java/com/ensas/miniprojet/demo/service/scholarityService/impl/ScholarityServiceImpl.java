package com.ensas.miniprojet.demo.service.scholarityService.impl;

import com.ensas.miniprojet.demo.entity.CertifRequest;
import com.ensas.miniprojet.demo.entity.Student;
import com.ensas.miniprojet.demo.repository.entityRepository.CertifRepository;
import com.ensas.miniprojet.demo.repository.entityRepository.ClasseRepository;
import com.ensas.miniprojet.demo.repository.userRepository.StudentRepository;
import com.ensas.miniprojet.demo.service.scholarityService.ScholarityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ScholarityServiceImpl implements ScholarityService {

    @Autowired
    ClasseRepository classeRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CertifRepository certifRepository;
    
    @Override
    @Transactional
    public List<Student> getStudentOfClasse(Long classeID) {
        List<Student> students = studentRepository.findByClasse_Id(classeID);
        return students;
    }

    @Override
    @Transactional
    public List<CertifRequest> getAllCertifRequest(){

        List<CertifRequest> certifRequests = certifRepository.findAll();

        return  certifRequests;
    }

}
