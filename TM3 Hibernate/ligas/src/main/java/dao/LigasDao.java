package dao;

import org.hibernate.Session;
import database.HibernateUtil;
import model.Liga;

public class LigasDao {

    Session session;

    // persist -- guarda
    // merge -- actualiza--inserta (id)
    // list  -- select (id)
    // delete -- (id)


    public void crearLiga(Liga liga){

        session = new HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction().begin();

        session.persist(liga);

        session.getTransaction().commit();
        session.close();
    }

    public Liga getLiga(int id){
        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Liga liga = session.get(liga.class.id);

        session.getTransaction().commit();
        session.close();
        return liga;

    }

}
