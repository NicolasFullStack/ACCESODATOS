package database;

import com.mysql.cj.xdevapi.SessionFactory;

import java.lang.module.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            createSessionFactory();
        }
        return sessionFactory;
    }

    private static void createSessionFactory() {
       sessionFactory = new Configuration().buildSessionFactory();

    }
}
