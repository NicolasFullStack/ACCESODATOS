package examen.Nicolas.examen.controller;

import examen.Nicolas.examen.model.Alumno;
import examen.Nicolas.examen.model.Profesor;
import examen.Nicolas.examen.service.AlumnoService;
import examen.Nicolas.examen.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("profesor")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;



    @PostMapping("add")
    public String addProfesor(){
        Profesor profesor = profesorService.agregarProfesor(new Profesor(1L));
        return "profesor agregado con exito";
    }

}
