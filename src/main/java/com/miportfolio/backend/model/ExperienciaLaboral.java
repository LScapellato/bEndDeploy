
package com.miportfolio.backend.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;





@Getter
@Setter
@Entity
public class ExperienciaLaboral implements Serializable{
    
      @Id
    @GeneratedValue
    private int id;
    
    @NotNull
    private String nombre_empresa;
    private String puesto;
    private boolean actual;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_inicio;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_fin;
    private String descripcion;
    private String tipoempleo;
    private String url_imagen;
    
    
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="persona_id")
    private Persona persona;

    public ExperienciaLaboral() { super();
    }

    public ExperienciaLaboral(String nombre_empresa, String puesto, boolean actual, Date fecha_inicio, Date fecha_fin, String descripcion, String tipoempleo, String url_imagen, Persona persona) {
        this.nombre_empresa = nombre_empresa;
        this.puesto = puesto;
        this.actual = actual;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
        this.tipoempleo = tipoempleo;
        this.url_imagen = url_imagen;
        this.persona = persona;
    }

    

   
    
    
}
