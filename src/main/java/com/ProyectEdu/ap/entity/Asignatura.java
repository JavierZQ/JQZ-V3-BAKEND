package com.ProyectEdu.ap.entity;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idasignatura;

    @Column(name = "sigla")
    private String sigla;
    @Column(name = "denominacion")
    private String denominacion;
    @Column(name = "creditos")
    private String creditos;

    public Asignatura() {
    }

    public Asignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Asignatura(Long idasignatura, String sigla, String denominacion, String creditos) {
        this.idasignatura = idasignatura;
        this.sigla = sigla;
        this.denominacion = denominacion;
        this.creditos = creditos;
    }

    public Long getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Long idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
}
