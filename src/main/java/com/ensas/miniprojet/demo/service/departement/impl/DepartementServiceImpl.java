package com.ensas.miniprojet.demo.service.departement.impl;

import com.ensas.miniprojet.demo.entity.CertifRequest;
import com.ensas.miniprojet.demo.entity.Classe;
import com.ensas.miniprojet.demo.entity.Departement;
import com.ensas.miniprojet.demo.entity.user.student.Student;
import com.ensas.miniprojet.demo.repository.departementRepository.DepartementRepository;
import com.ensas.miniprojet.demo.repository.entityRepository.CertifRepository;
import com.ensas.miniprojet.demo.repository.entityRepository.ClasseRepository;
import com.ensas.miniprojet.demo.repository.userRepository.StudentRepository;
import com.ensas.miniprojet.demo.service.departement.DepartementService;
import com.ensas.miniprojet.demo.service.scholarityService.ScholarityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartementServiceImpl implements DepartementService {

    @Autowired
    DepartementRepository departementRepository;

    @Override
    @Transactional
    public List<Departement> getDepartements() {
        return departementRepository.findAll();
    }

    @Override
    @Transactional
    public Departement getDepartement(Long departementId) {
        return departementRepository.findById(departementId).get();
    }

    @Override
    @Transactional
    public Departement addDepartemente(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    @Transactional
    public void delDepartement(Long departementId) {
         departementRepository.deleteById(departementId);
    }

    @Override
    @Transactional
    public Departement updateDepartement(Departement departement) {
        return departementRepository.save(departement);
    }
}