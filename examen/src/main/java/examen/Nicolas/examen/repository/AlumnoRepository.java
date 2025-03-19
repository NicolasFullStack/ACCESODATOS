package examen.Nicolas.examen.repository;

import examen.Nicolas.examen.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    Alumno findByNombre(String nombre);
    Alumno findAllBy(String email);


}
