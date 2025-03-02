package dao;

import database.HibernateUtil;
import model.Autor;
import model.Editorial;
import model.Libro;
import org.hibernate.Session;

public class LibroDao {

    Session session;

    public void agregarLibro(Libro libro) {

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.persist(libro);
        session.getTransaction().commit();
        session.close();

    }
            //Mostrar todos los libros dados de alta, con su editorial y su autor
    public Libro obtenerlibro(int id){ // Con get coje el autor con id la que le diga en session.get

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Libro libro = session.get(Libro.class, Editorial.class, Autor.class);
        session.getTransaction().commit();
        session.close();
        return libro, editorial, autor;

    }

    // Mostrar todos los libros dados de alta, y en la librería en la que están.
    public Libro obtenerSololibro(int id){ // Con get coje el autor con id la que le diga en session.get

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Libro libro = session.get(Libro.class, id);
        session.getTransaction().commit();
        session.close();
        return libro;

    }
}
