package com.ProyectEdu.ap.services;

import com.ProyectEdu.ap.entity.Asignatura;

import java.util.List;

public interface IAsiganturaService {
List<Asignatura>listarAsignatura();

Asignatura guardar(Asignatura asignatura);
}
