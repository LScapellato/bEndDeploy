
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLaboralService {
     public List <ExperienciaLaboral> getExper();
    public void saveExperiencia(ExperienciaLaboral experiencia);
    public void deleteExperiencia(int id);
    public ExperienciaLaboral findExperiencia (int id);
}
