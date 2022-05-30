
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.Proyectos;
import java.util.List;


public interface IProyectoService {
   public List <Proyectos> getProyectos();
    public void saveProyectos(Proyectos proyectos);
    public void deleteProyectos(int id);
    public Proyectos findProyectos (int id); 
}
