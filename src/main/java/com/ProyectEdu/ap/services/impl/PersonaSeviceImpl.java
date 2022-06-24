package com.ProyectEdu.ap.services.impl;

import com.ProyectEdu.ap.dao.IPersonaDao;
import com.ProyectEdu.ap.entity.Persona;
import com.ProyectEdu.ap.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaSeviceImpl implements IPersonaService {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listaPersona() {
        return this.personaDao.findAll();
    }

    @Override
    public Persona GuerdarPersona(Persona persona) {
        return this.personaDao.save(persona);
    }

    @Override
    public Persona Delete(Long id) {
        return null;
    }
}
