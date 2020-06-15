package com.ensas.miniprojet.demo.controller.prof;

import com.ensas.miniprojet.demo.dto.AbsenceData;
import com.ensas.miniprojet.demo.entity.Absence;
import com.ensas.miniprojet.demo.entity.Classe;
import com.ensas.miniprojet.demo.entity.Module;
import com.ensas.miniprojet.demo.entity.Student;
import com.ensas.miniprojet.demo.service.classe.ClasseService;
import com.ensas.miniprojet.demo.service.prof.ProfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/prof")
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = {"Authorization", "content-type"})
public class ProfController {

    @Autowired
    ProfService profService;

    @Autowired
    ClasseService classeService;

    @GetMapping("/classes")
    List<Classe> getClasses(HttpServletRequest request){
//        System.out.println("User Name " + request.getAttribute("userName"));
        return profService.getClassess(request.getAttribute("userName").toString());
    }

    @GetMapping("/classes/{classeId}/students")
    List<Student> getStudentOfClasse(@PathVariable Long classeId){
        return profService.getStudentOfClasse(classeId);
    }

    @GetMapping("/modules")
    List<Module> getModules(HttpServletRequest request){
//        System.out.println("User Name " + request.getAttribute("userName"));
        return profService.getModules(request.getAttribute("userName").toString());
    }

    @PostMapping("/absence")
    public void makAbsence(@RequestBody AbsenceData absenceData){
        profService.markAbsence(absenceData);
    }

    @GetMapping("/absence/student/{studentId}")
    public  List<Absence> getStudentAbsences(@PathVariable Long studentId){
        return  profService.getStudentAbsences(studentId);
    }

    @GetMapping("/absence/module/{moduleId}")
    public  List<Absence> getModuleAbsences(@PathVariable Long moduleId){
        return  profService.getModuleAbsences(moduleId);
    }
}
