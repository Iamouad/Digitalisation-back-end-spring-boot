package com.ensas.miniprojet.demo.repository.entityRepository;

import com.ensas.miniprojet.demo.entity.CertifRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertifRepository extends JpaRepository<CertifRequest, Long> {
}
