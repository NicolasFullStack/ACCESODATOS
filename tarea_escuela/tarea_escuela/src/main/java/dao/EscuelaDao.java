package dao;

import database.HibernateUtil;
import model.Escuela;
import org.hibernate.Session;

public class EscuelaDao {

    Session session;
    public void creareEscuela(Escuela escuela) {

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(escuela);
        session.getTransaction().commit();
        session.close();
    }
}
