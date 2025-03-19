package dao;

import com.mysql.cj.Session;
import database.HibernateUtil;
import model.Competicion;

public class CompeticionDao {
    private Session session;

    public Competicion getCompetiicion(int id){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Competicion competicion = session.get(Competicion.class.id);
        session.getTransaction().commit();
        session.close();
        return competicion.getEquipos();
    }

}
