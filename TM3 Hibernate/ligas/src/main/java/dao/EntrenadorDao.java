package dao;

import com.mysql.cj.Session;
import database.HibernateUtil;
import model.Entrenador;

public class EntrenadorDao {
    private Session session;

    public void agregarEntrenador(Entrenador entrenador){

            session = new HibernateUtil().getSessionFactory().getCurrentSession(); // 1-Abro
            session.beginTransaction(); // 2- INICIO

            sesion.persist(entrenador);

            session.getTransaction().commit(); // 3- Garantizo, Confirmo
            session.close(); // 4- Cierro
    }

    public void obtenerEntrenador(int id){
        session= new  HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction(); // 2- INICIO

        Entrenador entrenador= session.get(Entrenador.class,1);

        session.getTransaction().commit(); // 3- Garantizo, Confirmo
        session.close(); // 4- Cierro
        return Entrenador;
    }
}
