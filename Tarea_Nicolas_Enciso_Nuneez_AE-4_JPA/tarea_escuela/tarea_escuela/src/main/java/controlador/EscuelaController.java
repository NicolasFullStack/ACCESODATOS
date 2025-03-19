package controlador;

import dao.AlumnoDa;
import dao.EscuelaDao;
import dao.ProfesorDao;
import model.Alumno;
import model.Director;

public class EscuelaController {

    private AlumnoDa alumnoDao;
    private Director directorDao;
    private EscuelaDao escuelaDao;
    private ProfesorDao profesorDao;

    public EscuelaController() {//Inicializacion de los metodos, no inicia sesion

        alumnoDao = new AlumnoDa();
        directorDao = new Director();
        escuelaDao = new EscuelaDao();
        profesorDao = new ProfesorDao();

    }

    public static void crearAlumno(Alumno alumno) {

    }

    public void agregarAlumno(Alumno alumno) {
        alumnoDao.crearAlumno(alumno);

    }

}
