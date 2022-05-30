
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List <Educacion> getEducacion();
    public void saveEducacion(Educacion educacion);
    public void deleteEducacion(int id);
    public Educacion findEducacion (int id);
}
