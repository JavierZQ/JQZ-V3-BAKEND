package com.ProyectEdu.ap.services.impl;

import com.ProyectEdu.ap.dao.IAsignaturaDao;
import com.ProyectEdu.ap.entity.Asignatura;
import com.ProyectEdu.ap.services.IAsiganturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaServiceImp implements IAsiganturaService {
    @Autowired
    private IAsignaturaDao asignaturaDao;
    @Override
    public List<Asignatura> listarAsignatura() {
        return this.asignaturaDao.findAll();
    }

    @Override
    public Asignatura guardar(Asignatura asignatura) {
        return this.asignaturaDao.save(asignatura);
    }
}
