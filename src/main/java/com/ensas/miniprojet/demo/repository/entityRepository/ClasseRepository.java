package com.ensas.miniprojet.demo.repository.entityRepository;

import com.ensas.miniprojet.demo.entity.Classe;
import com.ensas.miniprojet.demo.entity.user.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long> {



}
