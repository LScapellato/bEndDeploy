
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.Educacion;
import com.miportfolio.backend.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    private EducacionRepository eduRepository;

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = eduRepository.findAll();
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
       eduRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(int id) {
        eduRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(int id) {
        Educacion educacion = eduRepository.findById(id).orElse(null);
        return educacion;
    }
    
}
