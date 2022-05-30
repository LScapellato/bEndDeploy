
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.ExperienciaLaboral;
import com.miportfolio.backend.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    private ExperienciaLaboralRepository expRepository;

    @Override
    public List<ExperienciaLaboral> getExper() {
        List<ExperienciaLaboral> listaExperiencias = expRepository.findAll();
        return listaExperiencias;
    }

    @Override
    public void saveExperiencia(ExperienciaLaboral experiencia) {
        expRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(int id) {
        expRepository.deleteById(id);
    }

    @Override
    public ExperienciaLaboral findExperiencia(int id) {
        ExperienciaLaboral experiencia = expRepository.findById(id).orElse(null);
        return experiencia;
    }
    
}
