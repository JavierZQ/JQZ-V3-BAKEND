package com.ProyectEdu.ap.controller;

import com.ProyectEdu.ap.entity.Asignatura;
import com.ProyectEdu.ap.payload.RestResponse;
import com.ProyectEdu.ap.services.IAsiganturaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ControllerAsignatura {

    @Autowired
    private IAsiganturaService asiganturaServicea;
    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/lista")
    public RestResponse listaasig(){
        List<Asignatura> asignaturaList = this.asiganturaServicea.listarAsignatura();
        try{
            if (asignaturaList.isEmpty()){
                return new RestResponse(HttpStatus.NO_CONTENT.value(),"No se encontraron registros");
            }else {
                return new RestResponse(HttpStatus.OK.value(),"Registro de escuelas ubicadas",asignaturaList);
            }
        }catch (Exception e){
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),"Estamos trabajando en ello, vuelva mas tarde");
        }
    }


    @PostMapping("/registrar")
    public RestResponse registrar(@RequestBody String jsonAsignatura) throws JsonProcessingException {
        Asignatura asignatura = this.objectMapper.readValue(jsonAsignatura, Asignatura.class);
        try {
            this.asiganturaServicea.guardar(asignatura);
            return new RestResponse(HttpStatus.OK.value(), "Registro de Asignatura correcta");
        } catch (Exception e) {
            e.printStackTrace();
            return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Lamentamos el inconveniente, vuelva mas tarde");
        }
    }
}
