package com.ProyectEdu.ap.controller;

import com.ProyectEdu.ap.entity.Persona;
import com.ProyectEdu.ap.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class ControllerPersona {
    @Autowired
    private IPersonaService personaService;

    @GetMapping("/lista")
    private List<Persona>listarPer(){return this.personaService.listaPersona();}
}
