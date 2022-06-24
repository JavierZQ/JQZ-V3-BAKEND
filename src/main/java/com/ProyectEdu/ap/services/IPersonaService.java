package com.ProyectEdu.ap.services;

import com.ProyectEdu.ap.entity.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona>listaPersona();

    Persona GuerdarPersona(Persona persona);

    Persona Delete(Long id);
}
