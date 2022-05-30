
package com.miportfolio.backend.controller;

import com.miportfolio.backend.model.Persona;
import com.miportfolio.backend.service.IPersonaService;
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

public class PersonaController {
    @Autowired
    private IPersonaService interPersona;

    @GetMapping("personas/traer")
    public List<Persona> getPersona() {
        return interPersona.getPersonas();
    }
     @GetMapping("personas/detalle/{id}")
    public Persona getByid(@PathVariable ("id") int id) {
     Persona perso  =  interPersona.findPersona(id);
     return perso;
    } 
    @GetMapping("personas/name/{nombre}")
    public Persona getByNombre(@PathVariable("nombre") String nombre) {
//        if(!interPersona.existsByNombre(nombre))
//            return interPersona.notify();

        Persona perso = interPersona.findByNombre(nombre);
        return perso;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("personas/crear")
    public void createPersona(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
        //devuelve string mensaje 
//        return "La persona fue creada";

    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("personas/borrar/{id}")
    public void deletePersona(@PathVariable int id) {
        interPersona.deletePersona(id);

    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("personas/editar/{id}")
    public Persona editPersona(@PathVariable("id") int id, @RequestBody Persona perso)
     
    { 
        Persona per = interPersona.findPersona(id);
        per.setId(id);
        per.setNombre(perso.getNombre());
        per.setApellido(perso.getApellido());
        per.setDescripcion(perso.getDescripcion());
        per.setEdad(perso.getEdad());
        per.setMail(perso.getMail());
        per.setGrado(perso.getGrado());
        per.setImagenurl(perso.getImagenurl());
        per.setFecha_nacimiento(perso.getFecha_nacimiento());
        per.setTelefono(perso.getTelefono());
     
        interPersona.savePersona(per);

        return perso;

    }

    
}
