package dao;

import com.mysql.cj.Session;
import com.mysql.cj.WarningListener;
import database.HibernateUtil;
import model.Equipo;
import model.Liga;

public class EquipoDao {
    Session session;

    public Equipo getEquipo(int id){
        session = new HibernateUtil().getSessionFactory().getCurrentSession(); // 1-Abro
        session.beginTransaction(); // 2- INICIO

        Equipo equipo = session.get(Equipo.class, id);

        sesion.persist(getEquipo());

        session.getTransaction().commit(); // 3- Garantizo, Confirmo
        session.close(); // 4- Cierro
        return equipo;
    }

    public void actualizarEquipo(Equipo equipo){
        session= new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(equipo);
        session.getTransaction().commit();
        session.close();
    }

    public List<Jugador> obtenerPlantilla(int id){
        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Equipo equipo = session.get(Equipo.class, id);
        session.getTransaction().commit();
        session.close();
        return equipo.getJugadores();

    }


}



