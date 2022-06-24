package com.ProyectEdu.ap.dao;

import com.ProyectEdu.ap.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAsignaturaDao extends JpaRepository<Asignatura,Long> {

   // @Query("SELECT * FRON asignatura")
    //List<Asignatura>listaASIG();

}
