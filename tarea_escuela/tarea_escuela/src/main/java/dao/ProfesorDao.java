package dao;

import database.HibernateUtil;
import model.Alumno;
import model.Profesor;
import org.hibernate.Session;

public class ProfesorDao {

    Session session;
    public void CrearProfesor(Profesor profesor) {

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(profesor);
        session.getTransaction().commit();
        session.close();
    }
}
