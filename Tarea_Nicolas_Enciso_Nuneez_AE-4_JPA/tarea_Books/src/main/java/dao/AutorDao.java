package dao;

import database.HibernateUtil;
import model.Autor;
import model.Libro;
import org.hibernate.Session;

public class AutorDao {

    Session session;

    //Persist--Guarda
    //merge-- actualiza - inserta por (id)
    //list--select (id)
    //delete--(id)
    public void agregarAutor(Autor autor){ // Con Persist se crea el Autor, lo guarda

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(autor);//persist lo deja en intermediio
        session.merge(autor);// lo guarda sin pasar por una capa intermedia.
        session.getTransaction().commit();
        session.close();
    }
    //Mostrar todos los autores dados de alta, con sus libros asociados
   public Autor obtenerAutor(int id){ // Con get coje el autor con id la que le diga en session.get

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Autor autor = session.get(Autor.class, id, Libro.class);
        session.getTransaction().commit();
        session.close();
        return autor;

    }



}
