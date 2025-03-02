package Controlador;

import dao.AutorDao;
import dao.EditorialDao;
import dao.LibreriaDao;
import dao.LibroDao;
import model.Autor;
import model.Editorial;
import model.Libreria;
import model.Libro;

public class ControladorLibros {// aplica la logica de la construccion.


    private AutorDao autorDao;
    private EditorialDao  editorialDao;
    private LibroDao libroDao;
    private LibreriaDao libreriaDao;

    public ControladorLibros() { //inicializo
        autorDao = new AutorDao();
        editorialDao = new EditorialDao();
        libroDao = new LibroDao();
        libreriaDao = new LibreriaDao();

    }
       //operaciones
    public void agregarAutor(Autor autor) {
        autorDao.agregarAutor(autor);
    }

    public void agregarEditorial(Editorial editorial) {
        autorDao.agregarEditorial(editorial);
    }

    public void agregarLibro(Libro libro) {
        libroDao.agregarLibro(libro);
    }

    public void agregarLibreria(Libreria libreria) {
        libreriaDao.agregarLibreria(libreria);
    }

    /*public void selectAutor(int id) {
       Autor entrenador= autorDao.selectAutor(1);
    }*/

    // Mostrar

    public void obtenerAutor(int id) {
        Autor autor = autorDao.obtenerAutor(1);

    }
    public void obtenerEditorial(int id) {
        Editorial editorial = editorialDao.obtenerEditorial(2);
    }

    public void obtenerLibro(int id) {
        Libro libro = libroDao.obtenerlibro(5);
    }
    public void obtenerLibreria(int id) {
        Libreria libreria = libreriaDao.obtenerLibreria(1);

    }



}
