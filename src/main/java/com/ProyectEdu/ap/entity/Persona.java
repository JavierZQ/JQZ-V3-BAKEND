package com.ProyectEdu.ap.entity;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idperson",length = 10)
    private Long idpersona;
    @Column(name = "nombre",length = 100,nullable = false)
    private String nombre;
    private String telefono;
    private String email;

    public Persona() {
    }

    public Persona(Long idpersona, String nombre, String telefono, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
