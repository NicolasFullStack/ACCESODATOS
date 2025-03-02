package dao;

import database.HibernateUtil;
import model.Libreria;
import model.Libro;
import org.hibernate.Session;

public class LibreriaDao {

  Session session;


    public void agregarLibreria(Libreria libreria) {

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.persist(libreria);
        session.getTransaction().commit();
        session.close();

    }


    //Mostrar todas las librerías, con solamente sus libros asociados
    public Libreria obtenerLibreria(int id){ // Con get coje el autor con id la que le diga en session.get

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Libreria libreria = session.get(Libreria.class, id, Libro.class);
        session.getTransaction().commit();
        session.close();
        return libreria, libro;

    }


}
