package com.ensas.miniprojet.demo.dto.scholarityDto;

import com.ensas.miniprojet.demo.dto.User;
import com.ensas.miniprojet.demo.entity.Classe;

public class Student extends User {
    private String cne;
    private Classe classe;
    public String getCne() {
        return cne;
    }
    public void setCne(String cne) {
        this.cne = cne;
    }
}
