package examen.Nicolas.examen.service;

import examen.Nicolas.examen.model.Alumno;
import examen.Nicolas.examen.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//anotacion de hibernate para que autocomplete
public class AlumnoServiceIMP implements AlumnoService{

    @Autowired//inicializa la definicion del jpa de los metodos
    private AlumnoRepository alumnoRepository;

    //- Agregar alumnos save es como persist
    @Override
    public Alumno agregarAlumno(Alumno alumno) {

        //alumnoRepository.findByNombre("Kernel");
        return alumnoRepository.save(alumno);
    }
}
