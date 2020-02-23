package com.ensas.miniprojet.demo.service.scholarityService;

import com.ensas.miniprojet.demo.entity.CertifRequest;
import com.ensas.miniprojet.demo.entity.Classe;
import com.ensas.miniprojet.demo.entity.user.student.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public interface ScholarityService {

    List<Classe> getClasses();

    Classe getClasse(Long classeId);

    List<Student> getStudentOfClasse(@RequestBody Long classeID);

    List<CertifRequest> getAllCertifRequest();


}
