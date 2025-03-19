package database;

import com.mysql.cj.xdevapi.SessionFactory;
import lombok.Setter;

import javax.security.auth.login.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    // getSession
    public SessionFactory getSessionFactory() {
        if(sessionFactory == null) {
            createSessionFactory();

        }
        return sessionFactory;

    }

    // createSession

    private void createSessionFactory() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    // closeSession

    public void closeSessionFactory() {
        sessionFactory.close();
        sessionFactory = null;
    }
}
