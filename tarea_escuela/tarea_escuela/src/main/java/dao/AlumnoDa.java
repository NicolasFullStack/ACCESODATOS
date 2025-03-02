package dao;

import database.HibernateUtil;
import model.Alumno;
import org.hibernate.Session;

public class AlumnoDa {

    Session session;

    public void crearAlumno(Alumno alumno) {

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(alumno);
        session.getTransaction().commit();
        session.close();
    }
}
