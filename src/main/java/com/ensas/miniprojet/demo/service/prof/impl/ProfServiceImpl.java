package com.ensas.miniprojet.demo.service.prof.impl;

import com.ensas.miniprojet.demo.entity.Prof;
import com.ensas.miniprojet.demo.repository.userRepository.ProfRepository;
import com.ensas.miniprojet.demo.service.prof.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfServiceImpl implements ProfService {


    @Autowired
    ProfRepository profRepository;

    @Override
    public List<Prof> getProfs() {
        return profRepository.findAll();
    }

    @Override
    public Prof getProf(Long profId) {
        return profRepository.findById(profId).get();
    }

    @Override
    public Prof addProf(Prof prof) {
        return profRepository.save(prof);
    }

    @Override
    public void delProf(Long profId) {
        profRepository.deleteById(profId);
    }

    @Override
    public Prof updateProf(Prof prof) {
        return profRepository.save(prof);
    }
}
