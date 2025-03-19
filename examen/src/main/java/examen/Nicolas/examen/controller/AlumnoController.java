package examen.Nicolas.examen.controller;

import examen.Nicolas.examen.model.Alumno;
import examen.Nicolas.examen.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;


  @GetMapping("Prueba")
    public String getError(){
        return "Retorno de alumno ";
    }
    @PostMapping("add")
    public String addAlumno(){
        alumnoService.agregarAlumno(new Alumno("Nuevo1"));
        return "alumno agregado con exito";
    }

    @GetMapping("alumnos")//Obtener todos los alumnos de la base de datos
    public List<Alumno> getAlumnos(){
      return Alumno;
    }


    @GetMapping("alumnos")//- Obtener todos los alumnos de un curso indicado por parámetros
    public List<Alumno> getAlumnos(@RequestParam("nombre") String nombre){
      return getAlumnos();
    }
}
