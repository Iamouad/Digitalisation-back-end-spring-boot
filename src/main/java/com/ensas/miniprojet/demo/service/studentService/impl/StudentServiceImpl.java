package com.ensas.miniprojet.demo.service.studentService.impl;

import com.ensas.miniprojet.demo.entity.CertifRequest;
import com.ensas.miniprojet.demo.repository.entityRepository.CertifRepository;
import com.ensas.miniprojet.demo.repository.userRepository.StudentRepository;
import com.ensas.miniprojet.demo.service.studentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    CertifRepository certifRepository;


    @Override
    @Transactional
    public CertifRequest addNewCertifRequest(CertifRequest certifRequest) {

        CertifRequest certifRequest1 = certifRepository.save(certifRequest);
        return certifRequest1;
    }
}

