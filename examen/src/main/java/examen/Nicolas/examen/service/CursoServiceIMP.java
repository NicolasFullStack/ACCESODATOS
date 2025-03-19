package examen.Nicolas.examen.service;

import examen.Nicolas.examen.model.Curso;
import examen.Nicolas.examen.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceIMP implements CursoService{

        @Autowired//inicializa la definicion del jpa de los metodos
        private CursoRepository cursoRepository;

        @Override
        public Curso agregarCurso(Curso curso) {
            return cursoRepository.save(curso);
        }

}
