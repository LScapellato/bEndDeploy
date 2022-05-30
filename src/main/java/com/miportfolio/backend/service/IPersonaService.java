
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List <Persona> getPersonas();
    public void savePersona(Persona perso);
    public void deletePersona(int id);
    public Persona findPersona (int id);
    public Persona findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    public boolean existsById(int id);
    
}
