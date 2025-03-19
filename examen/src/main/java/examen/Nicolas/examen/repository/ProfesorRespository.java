package examen.Nicolas.examen.repository;

import examen.Nicolas.examen.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//meto los que hay y los adicionales
public interface ProfesorRespository extends JpaRepository<Profesor, Long> {


}
