package com.ensas.miniprojet.demo.service.classe.impl;

import com.ensas.miniprojet.demo.entity.Classe;
import com.ensas.miniprojet.demo.entity.Classe;

import com.ensas.miniprojet.demo.repository.entityRepository.ClasseRepository;
import com.ensas.miniprojet.demo.service.classe.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClasseServiceImpl implements ClasseService {
    @Autowired
    ClasseRepository departmentRepository;




    @Override
    @Transactional
    public List<Classe> getClasses() {
        return departmentRepository.findAll();
    }

    @Override
    @Transactional
    public Classe getClasse(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    @Transactional
    public Classe addClassee(Classe department) {
        return departmentRepository.save(department);
    }

    @Override
    @Transactional
    public void delClasse(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    @Transactional
    public Classe updateClasse(Classe department) {
        return departmentRepository.save(department);
    }
}
