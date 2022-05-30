
package com.miportfolio.backend.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;




@Entity
@Getter
@Setter

public class Proyectos implements Serializable {
    
   

    @Id
    @GeneratedValue 
    private int id;
    private String titulo ;
    
    private String url_muestra;
    
    private String descripcion;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="persona_id")
    private Persona persona;

    public Proyectos() {
    }

    public Proyectos(String titulo, String url_muestra, String descripcion, Persona persona) {
        this.titulo = titulo;
        this.url_muestra = url_muestra;
        this.descripcion = descripcion;
        this.persona = persona;
    }

    
    
}
