
package com.miportfolio.backend.service;

import com.miportfolio.backend.model.Proyectos;
import com.miportfolio.backend.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectoService {
    
    @Autowired
    private ProyectosRepository proyRepo;
    
    @Override
    public List<Proyectos> getProyectos() {
       List <Proyectos> listaProyectos= proyRepo.findAll();
       return listaProyectos;
    }

    @Override
    public void saveProyectos(Proyectos proyectos) {
       proyRepo.save(proyectos);
    }

    @Override
    public void deleteProyectos(int id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(int id) {
            Proyectos proyecto = proyRepo.findById(id).orElse(null);
        return proyecto ;
    }
    
}
