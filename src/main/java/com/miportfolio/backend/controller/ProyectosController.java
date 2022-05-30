
package com.miportfolio.backend.controller;

import com.miportfolio.backend.model.Proyectos;
import com.miportfolio.backend.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectosController {
    
    @Autowired IProyectoService iprservice;
    
    @GetMapping ("proyectos/traer")
    public List<Proyectos> getProyectos(){
        return iprservice.getProyectos();
    }
    @GetMapping("proyectos/detalle/{id}")
    public Proyectos getProyectosDetalle(@PathVariable int id) {
     Proyectos proyecto = iprservice.findProyectos(id) ;
     return proyecto;
    } 

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("proyectos/borrar/{id}")
    public void deleteProyectos(@PathVariable int id) {
        iprservice.deleteProyectos(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("proyectos/editar/{id}")
    
    public  Proyectos editProyecto(@PathVariable("id") int id, @RequestBody Proyectos proyecto){
    
    Proyectos pr =iprservice.findProyectos(id);
    
    pr.setTitulo(proyecto.getTitulo());
    pr.setUrl_muestra(proyecto.getUrl_muestra());
    pr.setDescripcion(proyecto.getDescripcion());
    
    
    iprservice.saveProyectos(pr);
    return proyecto;
    
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("proyectos/crear")
    public void crearSkill(@RequestBody Proyectos proyecto) {
        iprservice.saveProyectos(proyecto);
    }

}

