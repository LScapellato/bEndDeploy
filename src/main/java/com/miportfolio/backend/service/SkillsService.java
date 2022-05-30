
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.Skills;
import com.miportfolio.backend.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService implements ISkillsService {
    
    @Autowired
    private SkillsRepository skillRepository;

    @Override
    public List<Skills> getSkills() {
        List<Skills> listaSkills = skillRepository.findAll();
        return listaSkills;
    }

    @Override
    public void saveSkills(Skills skills) {
      skillRepository.save(skills);
    }

    @Override
    public void deleteSkills(int id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skills findSkills(int id) {
        Skills skill = skillRepository.findById(id).orElse(null);
        return skill;
    }
    
}
