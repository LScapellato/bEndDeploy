
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.Persona;
import com.miportfolio.backend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
       List<Persona> listaPersonas = persoRepository.findAll();
       return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
     persoRepository.save(perso);   
    }
    @Override
    public void deletePersona(int id) {
       persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(int id) {
          Persona perso = persoRepository.findById(id).orElse(null);
    return perso;
    }

    @Override
    public Persona findByNombre(String nombre) {
        return persoRepository.findByNombre(nombre);
    }

    @Override
    public boolean existsByNombre(String nombre) {
        return persoRepository.existsByNombre(nombre);
    }

    @Override
    public boolean existsById(int id) {
        return persoRepository.existsById(id);
    }
    
}
