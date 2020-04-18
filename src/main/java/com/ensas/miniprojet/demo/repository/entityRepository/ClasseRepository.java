package com.ensas.miniprojet.demo.repository.entityRepository;

import com.ensas.miniprojet.demo.entity.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long> {



}
