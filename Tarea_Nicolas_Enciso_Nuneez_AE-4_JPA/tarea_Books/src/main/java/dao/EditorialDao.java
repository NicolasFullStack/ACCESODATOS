package dao;

import database.HibernateUtil;
import model.Editorial;
import org.hibernate.Session;

public class EditorialDao {

    Session session;

    public void agregarEditorial(Editorial editorial){

        session  = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(editorial);
        session.getTransaction().commit();
        session.close();

    }

    public Editorial obtenerEditorial(int id) { // Con get coje el autor con id la que le diga en session.get

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Editorial editorial = session.get(Editorial.class, id);
        session.getTransaction().commit();
        session.close();
        return editorial;

    }
}
