package com.ensas.miniprojet.demo.service.studentService;


import com.ensas.miniprojet.demo.entity.CertifRequest;
import com.ensas.miniprojet.demo.entity.user.prof.Prof;
import com.ensas.miniprojet.demo.entity.user.student.Student;

import java.util.List;

public interface StudentService {

    CertifRequest addNewCertifRequest(CertifRequest certifRequest);

    List<Student> getStudents();
    Student getStudent(Long studentId);
    Student addStudent(Student student);
    void delStudent(Long studentId);
    Student updateStudent(Student student);
}
