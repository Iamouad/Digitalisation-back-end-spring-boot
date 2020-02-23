package com.ensas.miniprojet.demo.repository.userRepository;

import com.ensas.miniprojet.demo.entity.user.scolartyAgent.ScolarityAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScholarityAgentRepository extends JpaRepository<ScolarityAgent,Long> {
}