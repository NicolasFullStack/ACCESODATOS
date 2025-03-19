package examen.Nicolas.examen.service;

import examen.Nicolas.examen.model.Alumno;
import examen.Nicolas.examen.model.Profesor;
import examen.Nicolas.examen.repository.AlumnoRepository;
import examen.Nicolas.examen.repository.ProfesorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceIMP  implements ProfesorService{



       @Autowired
       private ProfesorRespository profesorRespository;

        @Override
        public Profesor agregarProfesor(Profesor profesor) {
            return profesorRespository.save(profesor);
        }
}
