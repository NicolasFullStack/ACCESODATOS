package examen.Nicolas.examen.service;

import examen.Nicolas.examen.model.Alumno;
import examen.Nicolas.examen.model.Aula;
import examen.Nicolas.examen.repository.AlumnoRepository;
import examen.Nicolas.examen.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AulaServiceIMP implements AulaService {

    @Autowired//inicializa la definicion del jpa de los metodos
    private AulaRepository aulaRepository;

    @Override
    public Aula agregarAula(Aula aula) {
        return aulaRepository.save(aula);
    }
}
