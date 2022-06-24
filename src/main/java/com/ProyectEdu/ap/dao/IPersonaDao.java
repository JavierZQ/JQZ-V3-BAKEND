package com.ProyectEdu.ap.dao;

import com.ProyectEdu.ap.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
}
