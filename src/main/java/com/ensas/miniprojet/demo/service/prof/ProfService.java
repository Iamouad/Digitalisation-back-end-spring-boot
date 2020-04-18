package com.ensas.miniprojet.demo.service.prof;

import com.ensas.miniprojet.demo.entity.Prof;

import java.util.List;

public interface ProfService {
    List<Prof> getProfs();
    Prof getProf(Long profId);
    Prof addProf(Prof prof);
    void delProf(Long profId);
    Prof updateProf(Prof prof);
}
