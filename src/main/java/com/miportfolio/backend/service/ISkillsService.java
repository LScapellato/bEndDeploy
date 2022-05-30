
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.Skills;
import java.util.List;


public interface ISkillsService {
    public List <Skills> getSkills();
    public void saveSkills(Skills skills);
    public void deleteSkills(int id);
    public Skills findSkills (int id);
}
