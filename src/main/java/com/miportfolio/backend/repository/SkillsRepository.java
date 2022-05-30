
package com.miportfolio.backend.repository;

import com.miportfolio.backend.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillsRepository extends JpaRepository <Skills, Integer> {
    
}
