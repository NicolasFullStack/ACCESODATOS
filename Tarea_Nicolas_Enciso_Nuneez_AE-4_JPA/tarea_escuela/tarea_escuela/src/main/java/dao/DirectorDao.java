package dao;

import database.HibernateUtil;
import model.Alumno;
import model.Director;
import org.hibernate.Session;

public class DirectorDao {

    Session session;
    public void crearDirector(Director director) {

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(director);
        session.getTransaction().commit();
        session.close();
    }


}
