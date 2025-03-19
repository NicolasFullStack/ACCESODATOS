package examen.Nicolas.examen.service;

import examen.Nicolas.examen.model.Alumno;

import java.util.List;

// Solo firma de metodos que no estan
public interface AlumnoService {
     Alumno agregarAlumno(Alumno alumno);


     List<Alumno> todosAlumnos();
     List<Alumno> alumnosCurso(int cursoId);
     String alumnoCurAul(int aulaId);
     List<String> obtenerAulasPorCapacidad();
}


}
