package com.miportfolio.backend.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    @Email
    protected String mail;
    private String descripcion;
    private String imagenurl;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nacimiento;
    private String grado;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "persona", cascade = CascadeType.ALL)
    private Set<Educacion> educacion;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "persona", cascade = CascadeType.ALL)
    private Set<Skills> skills;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "persona", cascade = CascadeType.ALL)
    private Set<ExperienciaLaboral> experiencia;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "persona", cascade = CascadeType.ALL)
    private Set<Proyectos> proyectos;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String telefono, String mail, String descripcion, String imagenurl, Date fecha_nacimiento, String grado, Set<Educacion> educacion, Set<Skills> skills, Set<ExperienciaLaboral> experiencia, Set<Proyectos> proyecto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.mail = mail;
        this.descripcion = descripcion;
        this.imagenurl = imagenurl;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grado = grado;
        this.educacion = educacion;
        this.skills = skills;
        this.experiencia = experiencia;
        this.proyectos= proyecto;
    }

}
