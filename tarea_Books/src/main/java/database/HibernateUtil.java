package database;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {//Nos permite sacar la sesion

    private static SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            createSessionFactoryu();
        }

        return sessionFactory;
    }

    private void createSessionFactoryu() {
       sessionFactory = new Configuration().buildSessionFactory();
    }

}
